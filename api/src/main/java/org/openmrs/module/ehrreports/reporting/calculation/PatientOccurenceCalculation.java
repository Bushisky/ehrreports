package org.openmrs.module.ehrreports.reporting.calculation;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.openmrs.Encounter;
import org.openmrs.EncounterType;
import org.openmrs.api.context.Context;
import org.openmrs.calculation.patient.PatientCalculationContext;
import org.openmrs.calculation.result.CalculationResultMap;
import org.openmrs.calculation.result.ListResult;
import org.openmrs.module.ehrreports.metadata.OutpatientMetadata;
import org.openmrs.module.ehrreports.reporting.utils.EhrCalculationUtils;
import org.openmrs.module.ehrreports.reporting.utils.EhrReportConstants;
import org.springframework.stereotype.Component;

@Component
public class PatientOccurenceCalculation extends AbstractPatientCalculation {

  @Override
  public CalculationResultMap evaluate(
      Collection<Integer> cohort,
      Map<String, Object> parameterValues,
      PatientCalculationContext context) {
    EhrCalculationService ePTSCalculationService =
        Context.getRegisteredComponents(EhrCalculationService.class).get(0);
    // External dependencies
    OutpatientMetadata outpatientMetadata =
        Context.getRegisteredComponents(OutpatientMetadata.class).get(0);
    EncounterType regReturn = outpatientMetadata.getRegReturnEncounterType();
    EncounterType adultReturn = outpatientMetadata.getAdultReturnEncounterType();
    EncounterType pedReturn = outpatientMetadata.getPedsReturnEncounterType();
    CalculationResultMap resultMap = new CalculationResultMap();
    EhrReportConstants.OccurenceStates state =
        (EhrReportConstants.OccurenceStates) parameterValues.get("state");

    CalculationResultMap allEncounters =
        ePTSCalculationService.allEncounters(
            Arrays.asList(regReturn, adultReturn, pedReturn),
            cohort,
            null,
            context.getNow(),
            context);
    for (Integer pId : cohort) {
      boolean isCandidate = false;
      ListResult pregnantResult = (ListResult) allEncounters.get(pId);
      List<Encounter> encounterList = EhrCalculationUtils.extractResultValues(pregnantResult);
      if (encounterList.size() > 0 && (state.equals(EhrReportConstants.OccurenceStates.REVISIT))) {
        isCandidate = true;
      }
      if (encounterList.size() == 0 && (state.equals(EhrReportConstants.OccurenceStates.NEW))) {
        isCandidate = true;
      }
      resultMap.put(pId, new BooleanResult(isCandidate, this));
    }
    return resultMap;
  }
}
