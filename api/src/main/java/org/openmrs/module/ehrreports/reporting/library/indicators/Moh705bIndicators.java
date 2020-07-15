/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.ehrreports.reporting.library.indicators;

import org.openmrs.module.ehrreports.metadata.DiagnosisMetadata;
import org.openmrs.module.ehrreports.reporting.library.cohorts.Moh705bCohortQueries;
import org.openmrs.module.ehrreports.reporting.utils.EhrReportConstants;
import org.openmrs.module.ehrreports.reporting.utils.EhrReportUtils;
import org.openmrs.module.reporting.indicator.CohortIndicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Moh705bIndicators {
  @Autowired private Moh705bCohortQueries moh705bCohortQueries;

  @Autowired private EhrGeneralIndicator ehrGeneralIndicator;

  @Autowired private DiagnosisMetadata diagnosisMetadata;

  /**
   * Get patients who are adults and have diagnosis other than the ones listed and classified
   *
   * @return CohortIndicator
   */
  public CohortIndicator getAdultsOtherDiseasesThatAreNotClassified() {
    return ehrGeneralIndicator.getIndicator(
        "MOH705B - OTHER",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsOtherIllinessThatAreNotClassified(),
            "startDate=${startDate},endDate=${endDate}"));
  }
  /** Diah */
  public CohortIndicator getAdultsWithDiarrhoea() {
    return ehrGeneralIndicator.getIndicator(
        "Diah",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getDiarrhoeaConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** */
  /** TB */
  public CohortIndicator getAdultsWithTuberclosis() {
    return ehrGeneralIndicator.getIndicator(
        "TB",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getTuberculosisConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }
  /** DY */
  public CohortIndicator getAdultsWithDysentery() {
    return ehrGeneralIndicator.getIndicator(
        "Dysentery",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getDysenteryList()),
            "startDate=${startDate},endDate=${endDate}"));
  }
  /** DY */
  public CohortIndicator getAdultsWithCholera() {
    return ehrGeneralIndicator.getIndicator(
        "Dysentery",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getCholeraList()),
            "startDate=${startDate},endDate=${endDate}"));
  }
  /** MenongococcalInfectionsList */
  public CohortIndicator getAdultsWithMenongococcalInfectionsList() {
    return ehrGeneralIndicator.getIndicator(
        "MenongococcalInfectionsList",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getMenongococcalInfectionsList()),
            "startDate=${startDate},endDate=${endDate}"));
  }
  /** OtherMeningitis */
  public CohortIndicator getAdultsWithOtherMeningitis() {
    return ehrGeneralIndicator.getIndicator(
        "OtherMeningitis",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getOtherMeningitisConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }
  /** Tetanus */
  public CohortIndicator getAdultsWithTetanus() {
    return ehrGeneralIndicator.getIndicator(
        "Tetanus",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getTetanusConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }
  /** Poliomyelitis */
  public CohortIndicator getAdultsWithPoliomyelitis() {
    return ehrGeneralIndicator.getIndicator(
        "Poliomyelitis",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getAcutePoliomyelitisConceptList()), // TO DO REFACTOR TO POLIO
            "startDate=${startDate},endDate=${endDate}"));
  }
  /** ChickenPox */
  public CohortIndicator getAdultsWithChickenPox() {
    return ehrGeneralIndicator.getIndicator(
        "ChickenPox",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getChickenPoxConceptList()), // TO DO REFACTOR TO POLIO
            "startDate=${startDate},endDate=${endDate}"));
  }
  /** Measles */
  public CohortIndicator getAdultsWithMeasles() {
    return ehrGeneralIndicator.getIndicator(
        "Measles",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getMeaslesConceptList()), // TO DO REFACTOR TO POLIO
            "startDate=${startDate},endDate=${endDate}"));
  }

  /**
   * Get patients who are adults and have new/revisit
   *
   * @return CohortIndicator
   */
  public CohortIndicator getNewAndRevisitPatients(EhrReportConstants.OccurenceStates state) {
    return ehrGeneralIndicator.getIndicator(
        "New or revisit patients adults",
        EhrReportUtils.map(
            moh705bCohortQueries.getNewAndRevisitsOfAdults(state), "endDate=${endDate}"));
  }
}
