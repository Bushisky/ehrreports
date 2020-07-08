/*
 * The contents of this file are subject to the OpenMRS Public License Version
 * 1.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 * the specific language governing rights and limitations under the License.
 *
 * Copyright (C) OpenMRS, LLC. All Rights Reserved.
 */

package org.openmrs.module.ehrreports.reporting.utils;

import java.util.ArrayList;
import java.util.List;
import org.openmrs.Program;
import org.openmrs.ProgramWorkflowState;

public final class EhrReportConstants {

  public static final String ADULTINITIAL_OUTPATIENT = "8d5b27bc-c2cc-11de-8d13-0010c6dffd0f"; // 1

  public static final String ADULTRETURN_OUTPATIENT = "8d5b2be0-c2cc-11de-8d13-0010c6dffd0f"; // 2

  public static final String PEDSINITIAL_OUTPATIENT = "8d5b2dde-c2cc-11de-8d13-0010c6dffd0f"; // 3

  public static final String PEDSRETURN_OUTPATIENT = "8d5b3108-c2cc-11de-8d13-0010c6dffd0f"; // 4

  public static final String REGINITIAL_OUTPATIENT = "e9ab67ae-9210-4147-96ae-fb61f4d917ff"; // 5

  public static final String REGREVISIT_OUTPATIENT = "5f5f2540-2de0-478d-abf6-842281aae102"; // 6

  public static final String OPDENCOUNTER_OUTPATIENT = "0498d578-d228-4864-9178-14f367f42160"; // 9

  public static final String CHECKIN_ENCOUNTER = "ca3aed11-1aa4-42a1-b85c-8332fc8001fc"; // 12

  public static final String ANC_ENCOUNTER = "40629059-f621-42bd-a7c4-bd22e2636e47"; // 19

  // Concepts
  public static final String SPECIAL_CLINIC = "8548ca32-ac74-4aa8-b97b-138bd745df0a"; // 5082

  public static final String ENT_CLINIC = "47f855a5-0957-4cbc-8098-b577021150f8"; // 5119

  public static final String EYE_CLINIC = "dcd6db77-47a3-4b45-aa5e-fdb169055feb"; // 5118

  public static final String TB_LEPROSY_CLINIC = "d3c75c8d-f57c-48d1-974c-a9eb5961d553"; // 5698

  public static final String STI_CLINIC = "4c9b4d7d-7cb0-4d49-a833-2a13490b4632"; // 1073

  public static final String PSYCHIATRIC_CLINIC = "f3c0474d-1308-4160-a862-94939a97330e"; // 5700

  public static final String ORTHOPAEDIC_CLINIC = "89282a1f-fc28-4adc-80dd-0e64d947ec55"; // 5121

  public static final String MOPC_MEDICAL_CLINIC = "f857450b-133d-4d6b-bf09-e9297ccd1848"; // 5120

  public static final String POPC_PAEDIATRICS_CLINIC =
      "da4903d2-7ae3-4c52-929a-ae7273b9e68e"; // 5122

  public static final String CCC_CLINIC = "e0620e9e-be40-43b1-b18d-b4ed2498b13c"; // 5699

  public static final String MOPC_DM_DIABETIC_CLINIC =
      "b1801fa9-7a27-450f-ae06-04333287ffb1"; // 5701

  public static final String FNA_CLINIC = "f3fa2644-76f0-4bd5-b2d6-ec84bd396562"; // 5702

  public static final String GOPC_CLINIC = "b758a5ec-e601-4f12-996f-314153c74ab9"; // 5703

  public static final String MCH_CLINIC = "11303942-75cd-442a-aead-ae1d2ea9b3eb"; // 5704

  public static final String MOPC_MEDICAL_CLINIC_2 = "75e2f59c-b7fa-4778-964a-4f7f541e864d"; // 5705

  public static final String PALLIATIVE_CARE_CLINIC =
      "8c4f488d-0d85-4782-b82c-59f454299f01"; // 5706

  public static final String SURGICAL_CLINIC = "0aa9c676-f10d-4c22-b113-100acfbd165f"; // 5707

  public static final String CHEST_AND_SKIN_CLINIC = "9b235c9c-d098-4e9c-9e9a-a49a2916c0b5"; // 5708

  public static final String DENTAL_CLINIC = "0b58e72e-c34d-437d-9563-939a066efe58"; // 5696

  public static final String FAMILY_PLANNING_CLINIC =
      "68f095fb-1701-42b1-bd30-46d5f0473ae6"; // 100126248

  public static final String TRIAGE = "af17c916-449e-4721-a555-81d8032c8f41"; // 3999

  public static final String OPD_WARD = "482f0492-aeef-404e-a820-c34cf61db616"; // 3

  public static final String CASUALTY_OPD = "ec1aae69-52e8-49db-87f2-ec71d98ee601"; // 5114

  public static final String CASUALTY_TRIAGE = "68ff7941-a57c-42f5-aa56-75913ce8b34d"; // 4000

  public static final String DENTAL_OPD = "18bfc9f3-22ba-4673-907c-9651895465e3"; // 5709

  public static final String PROVISIONAL_DIAGNOSIS = "b8bc4c9f-7ccb-4435-bc4e-646d4cf83f0a"; // 2304
  public static final String FINAL_DIAGNOSIS = "7033ef37-461c-4953-a757-34722b6d9e38"; // 5109
  public static final String REGISTRATION_FEE = "999a80f4-d93d-4e35-9c91-0a52d6d8bfbf"; // 3950
  public static final String NEW_PATIENT = "1ecd0a60-498c-41b1-a836-6e154322be5a"; // 009
  public static final String REVISIT = "51d88fa3-b475-4713-8db8-58b63b0f3739"; // 945

  // Diarrhoea
  public static final String ACUTE_DIARRHEA = "48ec899e-8f8f-4816-8d76-b98026b7d04f";
  public static final String DIARRHEA_UNSPECIFIED = "91e4a7f4-f3d1-455e-991e-eb64a4df415b";

  // tuberulosis

  //Dysentery (Blood Bloody diarrhoea)
  public static final String DYSENTERY = "9004c4f1-687e-4ec9-8eaf-9bd8192d3427";//2450
  public static final String AMOEBIC_DYSENTERY = "435c8290-ad16-47c6-b282-0c3d9d1e6cd1";//1003
  public static final String SHIGELLA_DYSENTERY= "91934386-461e-4a0d-856a-ac86543b2894";//1668
  public static final String BACILLARY_DYSENTERY= "b9c47e34-7014-4e6e-b113-383b115d9ef6";//3667

  //Meningococcal
  public static final String MENINGOCOCCAL_MENINGITIS = "ade7a86f-9520-40e7-b89c-1179bca59784";//100001518
  public static final String MENINGOCOCCAL_INFECTIONS = "ddd803b4-b581-4642-9eaa-053b3a40bb53";//1714

  //Tetanus
  public static final String TETANUS = "8e87b1e0-3d56-4135-be89-6ef6f8e9f368";//1521
  public static final String TETANUS_NEONATORUM = "5e87fc96-95e2-48c7-bdff-7d9202715f1d";//1519
  public static final String OBSTETRICAL_TETANUS= "ea889e1d-ba0a-473f-90cc-bf6eae356638";//1712




  // program
  public static final String ANC_Program = "d83b74b7-f5ea-46fc-acc5-71e892ee1e68";
  public static final String PNC_Program = "a15f2617-9f5d-4022-8de3-181b2e286a28";
  public static final String CWC_Program = "34680469-1b6b-4ca3-b3f7-347463013dbd";

  // classes
  public static final String DIAGNOSIS_CLASS = "8d4918b0-c2cc-11de-8d13-0010c6dffd0f"; // 4
  public static final String FINDING_CLASS = "8d491a9a-c2cc-11de-8d13-0010c6dffd0f"; // 5
  public static final String SYMPTOMS_CLASS = "8d492954-c2cc-11de-8d13-0010c6dffd0f"; // 12
  public static final String SYMPTOMS_FINDING_CLASS = "8d492b2a-c2cc-11de-8d13-0010c6dffd0f"; // 13

  public enum OccurenceStates {
    NEW,
    REVISIT
  }

  public static List<Integer> getProgramWorkflowStateIds(Program program) {
    List<Integer> defaultStateIds = new ArrayList<>();
    for (ProgramWorkflowState p : program.getAllWorkflows().iterator().next().getStates()) {
      defaultStateIds.add(p.getProgramWorkflowStateId());
    }
    return defaultStateIds;
  }
}
