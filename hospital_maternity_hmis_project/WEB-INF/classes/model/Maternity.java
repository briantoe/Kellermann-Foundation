/*
 * Model for maternity form
 */

package model;

import dao.ChbDAO;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Maternity implements Serializable {
    private static final long serialVersionUID = 1L;
    private String matId;
    private LocalDate dateOfAdmission;
    private LocalTime timeOfAdmission;
    private String admissionNo;
    private String ancNo;
    private String ipdNo;
    private boolean hasNin;
    private String nin;
    private String clientSurname;
    private String clientGivenName;
    private String age;
    private String clientCategory;
    private String villageId;
    private String villageName;
    private String parishId;
    private String parishName;
    private String subcountyId;
    private String subcountyName;
    private String districtId;
    private String districtName;
    private String phoneNumber;
    private String gravidity;
    private String parity;
    private String gestationAge;
    private String term;
    private String reasonForAdmission;
    private Boolean revisit;
    private String whoClinicalStage;
    private String cd4Results;
    private LocalDate cd4Date;
    private String viralLoadResults;
    private LocalDate viralLoadDate;
    private String wInitialResult;
    private String wTfv;
    private String pInitialResult;
    private String pTfv;
    private String pArtCode;
    private String artCode;
    private String artNo;
    private String ctxCode;
    private String wSyphilis;
    private String wHepatitisB;
    private String pSyphilis;
    private String pHepatitisB;
    private String muac;
    private String inrNo;
    private String modeOfDelivery;
    private LocalDate dateOfDelivery;
    private LocalTime timeOfDelivery;
    private String liveBirths;
    private Boolean oxytocin;
    private Boolean misoprostol;
    private Boolean ergometrine;
    private String managementProcedure;
    private String otherTreatment;
    private String apgarScore;
    private String sexOfBaby;
    private String notBreathing;
    private String immediateSkinToSkin;
    private String sourceOfWarmth;
    private String breastFed;
    private Boolean teo;
    private Boolean vitK;
    private Boolean chlorhexidine;
    private String weight;
    private String riskStatus;
    private String arvsAdministered;
    private String syrupDuration;
    private String bcgImmunization;
    private String polioImmunization;
    private String familyPlanningMethod;
    private LocalDate familyPlanningDate;
    private String treatmentOffered;
    private String babyFinalDiagnosis;
    private String deliveredByName;
    private String deliveredByCadre;
    private String transferredByName;
    private String transferredByWhere;
    private String motherBleeding6;
    private String motherSyst6;
    private String motherDias6;
    private String babyCheckedCord6;
    private String babyBreastFeeding6;
    private String babyBreathing6;
    private String llinsGiven;
    private String babyCondition;
    private String motherFinalDiagnosis;
    private String motherBleeding24;
    private String motherSyst24;
    private String motherDias24;
    private String babyCheckedCord24;
    private String babyBreastFeeding24;
    private String babyBreathing24;
    private String iycf;
    private String iycfOption;
    private String counselingDischarged;
    private String materNutrCouns;
    private String conditionOfMotherAtDischarge;
    private String motherTransferredWhere;
    private String nameOfPersonDischarging;
    private String cadreOfPersonDischarging;
    private LocalDate dateOfDischarge;
    private LocalTime timeOfDischarge;
    private LocalDateTime recordDate;
    private String userId;

    public boolean getHasNin() {
        return hasNin;
    }

    public void setHasNin(boolean hasNin) {
        this.hasNin = hasNin;
    }

    public String getMatId() {
        if(this.matId == null) setMatId();
        return this.matId;
    }

    public void setMatId(String matId) {
        this.matId = matId;
    }

    // Give the form a random ID instead of some specified one.
    public void setMatId() {
        this.matId = Misc.genFormID();

        // Check if the id is already being used. If so, then get a new one and check again. Repeat until
        // a unique ID is found. Given that there are 62^10 (or ~10^18) possible IDs, this is not likely to cost
        // much time to compute.
        while (ChbDAO.Get_Existing_Maternity(this.matId) != null) {
            this.matId = Misc.genFormID();
        }
    }

    public String getIpdNo() {
        return ipdNo;
    }

    public void setIpdNo(String ipdNo) {
        this.ipdNo = ipdNo;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public LocalTime getTimeOfAdmission() {
        return timeOfAdmission;
    }

    public void setTimeOfAdmission(LocalTime timeOfAdmission) {
        this.timeOfAdmission = timeOfAdmission;
    }

    public String getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(String admissionNo) {
        this.admissionNo = admissionNo;
    }

    public String getAncNo() {
        return ancNo;
    }

    public void setAncNo(String ancNo) {
        this.ancNo = ancNo;
    }

    public String getNin() {
        return nin;
    }

    public void setNin(String nin) {
        this.nin = nin;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getClientGivenName() {
        return clientGivenName;
    }

    public void setClientGivenName(String clientGivenName) {
        this.clientGivenName = clientGivenName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getClientCategory() {
        return clientCategory;
    }

    public void setClientCategory(String clientCategory) {
        this.clientCategory = clientCategory;
    }

    public String getVillageId() {
        return villageId;
    }

    public void setVillageId(String villageId) {
        this.villageId = villageId;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getParishId() {
        return parishId;
    }

    public void setParishId(String parishId) {
        this.parishId = parishId;
    }

    public String getParishName() {
        return parishName;
    }

    public void setParishName(String parishName) {
        this.parishName = parishName;
    }

    public String getSubcountyId() {
        return subcountyId;
    }

    public void setSubcountyId(String subcountyId) {
        this.subcountyId = subcountyId;
    }

    public String getSubcountyName() {
        return subcountyName;
    }

    public void setSubcountyName(String subcountyName) {
        this.subcountyName = subcountyName;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGravidity() {
        return gravidity;
    }

    public void setGravidity(String gravidity) {
        this.gravidity = gravidity;
    }

    public String getParity() {
        return parity;
    }

    public void setParity(String parity) {
        this.parity = parity;
    }

    public String getGestationAge() {
        return gestationAge;
    }

    public void setGestationAge(String gestationAge) {
        this.gestationAge = gestationAge;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getReasonForAdmission() {
        return reasonForAdmission;
    }

    public void setReasonForAdmission(String reasonForAdmission) {
        this.reasonForAdmission = reasonForAdmission;
    }

    public Boolean getRevisit() {
        return revisit;
    }

    public void setRevisit(Boolean revisit) {
        this.revisit = revisit;
    }

    public String getWhoClinicalStage() {
        return whoClinicalStage;
    }

    public void setWhoClinicalStage(String whoClinicalStage) {
        this.whoClinicalStage = whoClinicalStage;
    }

    public String getCd4Results() {
        return cd4Results;
    }

    public void setCd4Results(String cd4Results) {
        this.cd4Results = cd4Results;
    }

    public LocalDate getCd4Date() {
        return cd4Date;
    }

    public void setCd4Date(LocalDate cd4Date) {
        this.cd4Date = cd4Date;
    }

    public String getViralLoadResults() {
        return viralLoadResults;
    }

    public void setViralLoadResults(String viralLoadResults) {
        this.viralLoadResults = viralLoadResults;
    }

    public LocalDate getViralLoadDate() {
        return viralLoadDate;
    }

    public void setViralLoadDate(LocalDate viralLoadDate) {
        this.viralLoadDate = viralLoadDate;
    }

    public String getwInitialResult() {
        return wInitialResult;
    }

    public void setwInitialResult(String wInitialResult) {
        this.wInitialResult = wInitialResult;
    }

    public String getwTfv() {
        return wTfv;
    }

    public void setwTfv(String wTfv) {
        this.wTfv = wTfv;
    }

    public String getpInitialResult() {
        return pInitialResult;
    }

    public void setpInitialResult(String pInitialResult) {
        this.pInitialResult = pInitialResult;
    }

    public String getpTfv() {
        return pTfv;
    }

    public void setpTfv(String pTfv) {
        this.pTfv = pTfv;
    }

    public String getpArtCode() {
        return pArtCode;
    }

    public void setpArtCode(String pArtCode) {
        this.pArtCode = pArtCode;
    }

    public String getArtCode() {
        return artCode;
    }

    public void setArtCode(String artCode) {
        this.artCode = artCode;
    }

    public String getArtNo() {
        return artNo;
    }

    public void setArtNo(String artNo) {
        this.artNo = artNo;
    }

    public String getCtxCode() {
        return ctxCode;
    }

    public void setCtxCode(String ctxCode) {
        this.ctxCode = ctxCode;
    }

    public String getwSyphilis() {
        return wSyphilis;
    }

    public void setwSyphilis(String wSyphilis) {
        this.wSyphilis = wSyphilis;
    }

    public String getwHepatitisB() {
        return wHepatitisB;
    }

    public void setwHepatitisB(String wHepatitisB) {
        this.wHepatitisB = wHepatitisB;
    }

    public String getpSyphilis() {
        return pSyphilis;
    }

    public void setpSyphilis(String pSyphilis) {
        this.pSyphilis = pSyphilis;
    }

    public String getpHepatitisB() {
        return pHepatitisB;
    }

    public void setpHepatitisB(String pHepatitisB) {
        this.pHepatitisB = pHepatitisB;
    }

    public String getMuac() {
        return muac;
    }

    public void setMuac(String muac) {
        this.muac = muac;
    }

    public String getInrNo() {
        return inrNo;
    }

    public void setInrNo(String inrNo) {
        this.inrNo = inrNo;
    }

    public String getModeOfDelivery() {
        return modeOfDelivery;
    }

    public void setModeOfDelivery(String modeOfDelivery) {
        this.modeOfDelivery = modeOfDelivery;
    }

    public LocalDate getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(LocalDate dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public LocalTime getTimeOfDelivery() {
        return timeOfDelivery;
    }

    public void setTimeOfDelivery(LocalTime timeOfDelivery) {
        this.timeOfDelivery = timeOfDelivery;
    }

    public String getLiveBirths() {
        return liveBirths;
    }

    public void setLiveBirths(String liveBirths) {
        this.liveBirths = liveBirths;
    }

    public Boolean getOxytocin() {
        return oxytocin;
    }

    public void setOxytocin(Boolean oxytocin) {
        this.oxytocin = oxytocin;
    }

    public Boolean getMisoprostol() {
        return misoprostol;
    }

    public void setMisoprostol(Boolean misoprostol) {
        this.misoprostol = misoprostol;
    }

    public Boolean getErgometrine() {
        return ergometrine;
    }

    public void setErgometrine(Boolean ergometrine) {
        this.ergometrine = ergometrine;
    }

    public String getManagementProcedure() {
        return managementProcedure;
    }

    public void setManagementProcedure(String managementProcedure) {
        this.managementProcedure = managementProcedure;
    }

    public String getOtherTreatment() {
        return otherTreatment;
    }

    public void setOtherTreatment(String otherTreatment) {
        this.otherTreatment = otherTreatment;
    }

    public String getApgarScore() {
        return apgarScore;
    }

    public void setApgarScore(String apgarScore) {
        this.apgarScore = apgarScore;
    }

    public String getSexOfBaby() {
        return sexOfBaby;
    }

    public void setSexOfBaby(String sexOfBaby) {
        this.sexOfBaby = sexOfBaby;
    }

    public String getNotBreathing() {
        return notBreathing;
    }

    public void setNotBreathing(String notBreathing) {
        this.notBreathing = notBreathing;
    }

    public String getImmediateSkinToSkin() {
        return immediateSkinToSkin;
    }

    public void setImmediateSkinToSkin(String immediateSkinToSkin) {
        this.immediateSkinToSkin = immediateSkinToSkin;
    }

    public String getSourceOfWarmth() {
        return sourceOfWarmth;
    }

    public void setSourceOfWarmth(String sourceOfWarmth) {
        this.sourceOfWarmth = sourceOfWarmth;
    }

    public String getBreastFed() {
        return breastFed;
    }

    public void setBreastFed(String breastFed) {
        this.breastFed = breastFed;
    }

    public Boolean getTeo() {
        return teo;
    }

    public void setTeo(Boolean teo) {
        this.teo = teo;
    }

    public Boolean getVitK() {
        return vitK;
    }

    public void setVitK(Boolean vitK) {
        this.vitK = vitK;
    }

    public Boolean getChlorhexidine() {
        return chlorhexidine;
    }

    public void setChlorhexidine(Boolean chlorhexidine) {
        this.chlorhexidine = chlorhexidine;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getRiskStatus() {
        return riskStatus;
    }

    public void setRiskStatus(String riskStatus) {
        this.riskStatus = riskStatus;
    }

    public String getArvsAdministered() {
        return arvsAdministered;
    }

    public void setArvsAdministered(String arvsAdministered) {
        this.arvsAdministered = arvsAdministered;
    }

    public String getSyrupDuration() {
        return syrupDuration;
    }

    public void setSyrupDuration(String syrupDuration) {
        this.syrupDuration = syrupDuration;
    }

    public String getBcgImmunization() {
        return bcgImmunization;
    }

    public void setBcgImmunization(String bcgImmunization) {
        this.bcgImmunization = bcgImmunization;
    }

    public String getPolioImmunization() {
        return polioImmunization;
    }

    public void setPolioImmunization(String polioImmunization) {
        this.polioImmunization = polioImmunization;
    }

    public String getFamilyPlanningMethod() {
        return familyPlanningMethod;
    }

    public void setFamilyPlanningMethod(String familyPlanningMethod) {
        this.familyPlanningMethod = familyPlanningMethod;
    }

    public LocalDate getFamilyPlanningDate() {
        return familyPlanningDate;
    }

    public void setFamilyPlanningDate(LocalDate familyPlanningDate) {
        this.familyPlanningDate = familyPlanningDate;
    }

    public String getTreatmentOffered() {
        return treatmentOffered;
    }

    public void setTreatmentOffered(String treatmentOffered) {
        this.treatmentOffered = treatmentOffered;
    }

    public String getBabyFinalDiagnosis() {
        return babyFinalDiagnosis;
    }

    public void setBabyFinalDiagnosis(String babyFinalDiagnosis) {
        this.babyFinalDiagnosis = babyFinalDiagnosis;
    }

    public String getDeliveredByName() {
        return deliveredByName;
    }

    public void setDeliveredByName(String deliveredByName) {
        this.deliveredByName = deliveredByName;
    }

    public String getDeliveredByCadre() {
        return deliveredByCadre;
    }

    public void setDeliveredByCadre(String deliveredByCadre) {
        this.deliveredByCadre = deliveredByCadre;
    }

    public String getTransferredByName() {
        return transferredByName;
    }

    public void setTransferredByName(String transferredByName) {
        this.transferredByName = transferredByName;
    }

    public String getTransferredByWhere() {
        return transferredByWhere;
    }

    public void setTransferredByWhere(String transferredByWhere) {
        this.transferredByWhere = transferredByWhere;
    }

    public String getMotherBleeding6() {
        return motherBleeding6;
    }

    public void setMotherBleeding6(String motherBleeding6) {
        this.motherBleeding6 = motherBleeding6;
    }


    public String getMotherDias6() {
        return motherDias6;
    }

    public void setMotherDias6(String motherDias6) {
        this.motherDias6 = motherDias6;
    }

    public String getMotherSyst6() {
        return motherSyst6;
    }

    public void setMotherSyst6(String motherSyst6) {
        this.motherSyst6 = motherSyst6;
    }

    public String getBabyCheckedCord6() {
        return babyCheckedCord6;
    }

    public void setBabyCheckedCord6(String babyCheckedCord6) {
        this.babyCheckedCord6 = babyCheckedCord6;
    }

    public String getBabyBreastFeeding6() {
        return babyBreastFeeding6;
    }

    public void setBabyBreastFeeding6(String babyBreastFeeding6) {
        this.babyBreastFeeding6 = babyBreastFeeding6;
    }

    public String getBabyBreathing6() {
        return babyBreathing6;
    }

    public void setBabyBreathing6(String babyBreathing6) {
        this.babyBreathing6 = babyBreathing6;
    }

    public String getLlinsGiven() {
        return llinsGiven;
    }

    public void setLlinsGiven(String llinsGiven) {
        this.llinsGiven = llinsGiven;
    }

    public String getBabyCondition() {
        return babyCondition;
    }

    public void setBabyCondition(String babyCondition) {
        this.babyCondition = babyCondition;
    }

    public String getMotherFinalDiagnosis() {
        return motherFinalDiagnosis;
    }

    public void setMotherFinalDiagnosis(String motherFinalDiagnosis) {
        this.motherFinalDiagnosis = motherFinalDiagnosis;
    }

    public String getMotherBleeding24() {
        return motherBleeding24;
    }

    public void setMotherBleeding24(String motherBleeding24) {
        this.motherBleeding24 = motherBleeding24;
    }

    public String getMotherDias24() {
        return motherDias24;
    }

    public void setMotherDias24(String motherDias24) {
        this.motherDias24 = motherDias24;
    }

    public String getMotherSyst24() {
        return motherSyst24;
    }

    public void setMotherSyst24(String motherSyst24) {
        this.motherSyst24 = motherSyst24;
    }

    public String getBabyCheckedCord24() {
        return babyCheckedCord24;
    }

    public void setBabyCheckedCord24(String babyCheckedCord24) {
        this.babyCheckedCord24 = babyCheckedCord24;
    }

    public String getBabyBreastFeeding24() {
        return babyBreastFeeding24;
    }

    public void setBabyBreastFeeding24(String babyBreastFeeding24) {
        this.babyBreastFeeding24 = babyBreastFeeding24;
    }

    public String getBabyBreathing24() {
        return babyBreathing24;
    }

    public void setBabyBreathing24(String babyBreathing24) {
        this.babyBreathing24 = babyBreathing24;
    }

    public String getIycf() {
        return iycf;
    }

    public void setIycf(String iycf) {
        this.iycf = iycf;
    }

    public String getIycfOption() {
        return iycfOption;
    }

    public void setIycfOption(String iycfOption) {
        this.iycfOption = iycfOption;
    }

    public String getCounselingDischarged() {
        return counselingDischarged;
    }

    public void setCounselingDischarged(String counselingDischarged) {
        this.counselingDischarged = counselingDischarged;
    }

    public String getMaterNutrCouns() {
        return materNutrCouns;
    }

    public void setMaterNutrCouns(String materNutrCouns) {
        this.materNutrCouns = materNutrCouns;
    }

    public String getConditionOfMotherAtDischarge() {
        return conditionOfMotherAtDischarge;
    }

    public void setConditionOfMotherAtDischarge(String conditionOfMotherAtDischarge) {
        this.conditionOfMotherAtDischarge = conditionOfMotherAtDischarge;
    }

    public String getMotherTransferredWhere() {
        return motherTransferredWhere;
    }

    public void setMotherTransferredWhere(String motherTransferredWhere) {
        this.motherTransferredWhere = motherTransferredWhere;
    }

    public String getNameOfPersonDischarging() {
        return nameOfPersonDischarging;
    }

    public void setNameOfPersonDischarging(String nameOfPersonDischarging) {
        this.nameOfPersonDischarging = nameOfPersonDischarging;
    }

    public String getCadreOfPersonDischarging() {
        return cadreOfPersonDischarging;
    }

    public void setCadreOfPersonDischarging(String cadreOfPersonDischarging) {
        this.cadreOfPersonDischarging = cadreOfPersonDischarging;
    }

    public LocalDate getDateOfDischarge() {
        return dateOfDischarge;
    }

    public void setDateOfDischarge(LocalDate dateOfDischarge) {
        this.dateOfDischarge = dateOfDischarge;
    }

    public LocalTime getTimeOfDischarge() {
        return timeOfDischarge;
    }

    public void setTimeOfDischarge(LocalTime timeOfDischarge) {
        this.timeOfDischarge = timeOfDischarge;
    }

    public LocalDateTime getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDateTime recordDate) {
        this.recordDate = recordDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
