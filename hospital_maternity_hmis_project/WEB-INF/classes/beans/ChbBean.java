/*
 * JavaBean that calls the data access object class functions
 */
package beans;

import dao.ChbDAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;
import model.Village;
import model.Parish;
import model.Subcounty;
import model.Vht;
import model.Maternity;


@ManagedBean(name = "chbBean")
@SessionScoped
public class ChbBean
            implements Serializable {

    private static final long serialVersionUID = 1L;
//    private TabView tabView;
    private Vht new_vht,existing_vht;
    private List<Vht> vht_list;
    private List<Vht> filteredVht_list;
    private List<Vht> village_vht_list;

    private Maternity new_maternity, existing_maternity;
    private List<Maternity> maternity_list;
    private List<Maternity> filteredMaternity_list;
    private List<Maternity> village_maternity_list;

    public ChbBean() {
        new_vht = new Vht();
        existing_vht = new Vht();
        vht_list = new ArrayList <Vht>();
        village_vht_list = new ArrayList <Vht>();

        new_maternity = new Maternity();
        existing_maternity = new Maternity();
        maternity_list = new ArrayList <Maternity>();
        village_maternity_list = new ArrayList <Maternity>();
    }

    public Vht getNew_vht() {
        return new_vht;
    }

    public void setNew_vht(final Vht new_vht) {
        this.new_vht = new_vht;
    }

    public Vht getExisting_vht() {
        return existing_vht;
    }

    public void setExisting_vht(final Vht existing_vht) {
        this.existing_vht = existing_vht;
    }

    public List<Vht> getVht_list() {
        return vht_list;
    }

    public void setVht_list(final List<Vht> vht_list) {
        this.vht_list = vht_list;
    }

    public List<Vht> getFilteredVht_list() {
        return filteredVht_list;
    }

    public void setFilteredVht_list(final List<Vht> filteredVht_list) {
        this.filteredVht_list = filteredVht_list;
    }

    public List<Vht> getVillage_vht_list() {
        return village_vht_list;
    }

    public void setVillage_vht_list(final List<Vht> village_vht_list) {
        this.village_vht_list = village_vht_list;
    }

    public Maternity getNew_maternity() {
        return new_maternity;
    }

    public void setNew_maternity(final Maternity new_maternity) {
        this.new_maternity = new_maternity;
    }

    public Maternity getExisting_maternity() {
        return existing_maternity;
    }

    public void setExisting_maternity(final Maternity existing_maternity) {
        this.existing_maternity = existing_maternity;
    }

    public List<Maternity> getMaternity_list() {
        return maternity_list;
    }

    public void setMaternity_list(final List<Maternity> maternity_list) {
        this.maternity_list = maternity_list;
    }

    public List<Maternity> getFilteredMaternity_list() {
        return filteredMaternity_list;
    }

    public void setFilteredMaternity_list(final List<Maternity> filteredMaternity_list) {
        this.filteredMaternity_list = filteredMaternity_list;
    }

    public List<Maternity> getVillage_maternity_list() {
        return village_maternity_list;
    }

    public void setVillage_maternity_list(final List<Maternity> village_maternity_list) {
        this.village_maternity_list = village_maternity_list;
    }

    public List<Village> get_villages() {
        try {
            return ChbDAO.Get_Villages();
        } catch (final Exception ex) {
            System.err.println("ChbBean Error: Method: get_villages " + ex.getMessage());
        }
        return null;
    }

    public List<Parish> get_parishes() {
        try {
            return ChbDAO.Get_Parishes();
        } catch (final Exception e) {
            System.err.println("ChbBean Error: Method: get_parishes " + e.getMessage());
        }
        return null;
    }

    public List<Subcounty> get_subcounties() {
        try {
            return ChbDAO.Get_Subcounties();
        } catch (final Exception e) {
            System.err.println("ChbBean Error: Method: get_subcounties" + e.getMessage());
        }
        return null;
    }

    public List<Vht> get_vht_list() {
        try {
            return ChbDAO.Get_Vht_List();
        } catch (final Exception ex) {
            System.err.println("ChbBean Error: Method: get_vht_list" + ex.getMessage());
        }
        return null;
    }

    public List<Maternity> get_maternity_list() {
        try {
            System.out.println("MaternityList:"+ChbDAO.Get_Maternity_List());
            return ChbDAO.Get_Maternity_List();
        } catch (final Exception ex) {
            System.err.println("ChbBean Error: Method: get_maternity_list" + ex.getMessage());
        }
        return null;
    }

    public void get_village_vht_list() {
        try {
            village_vht_list = ChbDAO.Get_Village_Vht_List(existing_vht.getVillageId());
            existing_vht.setVhtPhoneNumber(null);
            existing_vht.setAge(null);
            existing_vht.setSex(null);
            existing_vht.setIsCBD(null);
        } catch (final Exception ex) {
            System.err.println("ChbBean Error: Method: get_village_vht_list" + ex.getMessage());
        }
    }

    public void get_village_maternity_list() {
        try {
            System.out.println("get_village_maternity_list");
            village_maternity_list = ChbDAO.Get_Village_Maternity_List(existing_maternity.getVillageId());
            existing_maternity.setDateOfAdmission(null);
            existing_maternity.setTimeOfAdmission(null);
            existing_maternity.setAdmissionNo(null);
            existing_maternity.setAncNo(null);
            existing_maternity.setIpdNo(null);
            existing_maternity.setNin(null);
            existing_maternity.setClientSurname(null);
            existing_maternity.setClientGivenName(null);
            existing_maternity.setAge(null);
            existing_maternity.setClientCategory(null);
            existing_maternity.setVillageId(null);
            existing_maternity.setPhoneNumber(null);
            existing_maternity.setGravidity(null);
            existing_maternity.setParity(null);
            existing_maternity.setGestationAge(null);
            existing_maternity.setTerm(null);
            existing_maternity.setReasonForAdmission(null);
            existing_maternity.setRevisit(null);
            existing_maternity.setWhoClinicalStage(null);
            existing_maternity.setCd4Date(null);
            existing_maternity.setCd4Date(null);
            existing_maternity.setViralLoadResults(null);
            existing_maternity.setViralLoadDate(null);
            existing_maternity.setwInitialResult(null);
            existing_maternity.setwTfv(null);
            existing_maternity.setpInitialResult(null);
            existing_maternity.setpTfv(null);
            existing_maternity.setpArtCode(null);
            existing_maternity.setArtCode(null);
            existing_maternity.setArtNo(null);
            existing_maternity.setCtxCode(null);
            existing_maternity.setwSyphilis(null);
            existing_maternity.setwHepatitisB(null);
            existing_maternity.setpSyphilis(null);
            existing_maternity.setpHepatitisB(null);
            existing_maternity.setMuac(null);
            existing_maternity.setInrNo(null);
            existing_maternity.setModeOfDelivery(null);
            existing_maternity.setDateOfDelivery(null);
            existing_maternity.setTimeOfDelivery(null);
            existing_maternity.setOxytocin(null);
            existing_maternity.setMisoprostol(null);
            existing_maternity.setErgometrine(null);
            existing_maternity.setManagementProcedure(null);
            existing_maternity.setOtherTreatment(null);
            existing_maternity.setApgarScore(null);
            existing_maternity.setSexOfBaby(null);
            existing_maternity.setNotBreathing(null);
            existing_maternity.setImmediateSkinToSkin(null);
            existing_maternity.setSourceOfWarmth(null);
            existing_maternity.setBreastFed(null);
            existing_maternity.setTeo(null);
            existing_maternity.setVitK(null);
            existing_maternity.setChlorhexidine(null);
            existing_maternity.setWeight(null);
            existing_maternity.setRiskStatus(null);
            existing_maternity.setArvsAdministered(null);
            existing_maternity.setSyrupDuration(null);
            existing_maternity.setBcgImmunization(null);
            existing_maternity.setPolioImmunization(null);
            existing_maternity.setFamilyPlanningDate(null);
            existing_maternity.setTreatmentOffered(null);
            existing_maternity.setBabyFinalDiagnosis(null);
            existing_maternity.setDeliveredByName(null);
            existing_maternity.setDeliveredByCadre(null);
            existing_maternity.setTransferredByName(null);
            existing_maternity.setTransferredByWhere(null);
            existing_maternity.setMotherBleeding6(null);
            existing_maternity.setMotherBp6(null);
            existing_maternity.setBabyCheckedCord6(null);
            existing_maternity.setBabyBreastFeeding6(null);
            existing_maternity.setBabyBreathing6(null);
            existing_maternity.setLlinsGiven(null);
            existing_maternity.setBabyCondition(null);
            existing_maternity.setMotherFinalDiagnosis(null);
            existing_maternity.setMotherBleeding24(null);
            existing_maternity.setMotherBp24(null);
            existing_maternity.setBabyCheckedCord24(null);
            existing_maternity.setBabyBreastFeeding24(null);
            existing_maternity.setBabyBreathing24(null);
            existing_maternity.setIycf(null);
            existing_maternity.setIycfOption(null);
            existing_maternity.setCounselingDischarged(null);
            existing_maternity.setMaterNutrCouns(null);
            existing_maternity.setConditionOfMotherAtDischarge(null);
            existing_maternity.setNameOfPersonDischarging(null);
            existing_maternity.setCadreOfPersonDischarging(null);
            existing_maternity.setDateOfDischarge(null);
            existing_maternity.setTimeOfDischarge(null);
        } catch (final Exception var2) {
            System.err.println("ChbBean Error: Method: get_village_maternity_list" + var2.getMessage());
        }

    }

    public void save_new_vht(final Integer userId, final String Action) {
        try {
//            System.out.println("ChbBean.save_new_vht" + userId);
            if(Action.equals("Save")) {
                if(ChbDAO.Save_New_Vht(new_vht,userId)) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "VHT Details Saved Successfully", "Success"));
                } else {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Transaction Error. Contact System Administrator If Error Persists", "Failure"));
                }
            }
            new_vht = new Vht();
//            tabView.setActiveIndex(0);
        } catch (final Exception ex) {
            System.err.println("ChbBean Error: Method: save_new_vht " + ex.getMessage());
        }
    }

    public void save_new_maternity(final Integer userId, final String Action) {
        try {
            System.out.println("ChbBean.save_new_maternity " + userId);
            if(Action.equals("Save")) {
                if(ChbDAO.Save_New_Maternity(new_maternity,userId)) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Maternity Details Saved Successfully", "Success"));
                } else {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Transaction Error. Contact System Administrator If Error Persists", "Failure"));
                }
            }
            new_maternity = new Maternity();
//            tabView.setActiveIndex(0);
        } catch (final Exception ex) {
            System.err.println("ChbBean Error: Method: save_new_maternity " + ex.getMessage());
        }
    }

    public String get_existing_vht(final Integer vhtId, final String destination) {
        try {
//            existing_vht = ChbDAO.Get_Existing_Vht(existing_vht.getVhtId());
            existing_vht = ChbDAO.Get_Existing_Vht(vhtId);
            return destination;
        } catch (final Exception ex) {
            System.err.println("ChbBean Error: Method: get_existing_vht" + ex.getMessage());
            return null;
        }
    }

    public String get_existing_maternity(final Integer matId, final String destination) {
        try {
            existing_maternity = ChbDAO.Get_Existing_Maternity(matId);
            return destination;
        } catch (final Exception ex) {
            System.err.println("ChbBean Error: Method: get_existing_maternity" + ex.getMessage());
            return null;
        }
    }

    public String update_existing_vht(final String Action) {
        try {
            System.out.println("ChbBean.update_existing_vht");
            if(Action.equals("Update")) {
                if(ChbDAO.Update_Existing_Vht(existing_vht)) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "VHT Details Updated Successfully", "Success"));
                } else {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Transaction Error. Contact System Administrator If Error Persists", "Failure"));
                }
            }
//            tabView.setActiveIndex(0);
            existing_vht = new Vht();
            existing_vht.setVillageId(null);
            existing_vht.setVhtId(null);
            existing_vht.setSex(null);
            existing_vht.setAge(null);
            existing_vht.setVhtPhoneNumber(null);
            existing_vht.setIsCBD(null);
            return "vht";
        } catch (final Exception ex) {
            System.err.println("ChbBean Error: Method: update_existing_vht " + ex.getMessage());
            return null;
        }
    }

    public String update_existing_maternity(final String Action) {
        try {
            System.out.println("ChbBean.update_existing_maternity");
            if (Action.equals("Update")) {
                if (ChbDAO.Update_Existing_Maternity(existing_maternity)) {
                    FacesContext.getCurrentInstance().addMessage((String)null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Maternity Details Updated Successfully", "Success"));
                } else {
                    FacesContext.getCurrentInstance().addMessage((String)null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Transaction Error. Contact System Administrator If Error Persists", "Failure"));
                }
            }

            existing_maternity = new Maternity();
            existing_maternity.setMatId(null);
            existing_maternity.setVillageId(null);
            existing_maternity.setParishId(null);
            existing_maternity.setSubcountyId(null);
            existing_maternity.setDistrictId(null);
            existing_maternity.setDateOfAdmission(null);
            existing_maternity.setTimeOfAdmission(null);
            existing_maternity.setAdmissionNo(null);
            existing_maternity.setAncNo(null);
            existing_maternity.setIpdNo(null);
            existing_maternity.setNin(null);
            existing_maternity.setClientSurname(null);
            existing_maternity.setClientGivenName(null);
            existing_maternity.setAge(null);
            existing_maternity.setClientCategory(null);
            existing_maternity.setVillageId(null);
            existing_maternity.setPhoneNumber(null);
            existing_maternity.setGravidity(null);
            existing_maternity.setParity(null);
            existing_maternity.setGestationAge(null);
            existing_maternity.setTerm(null);
            existing_maternity.setReasonForAdmission(null);
            existing_maternity.setRevisit(null);
            existing_maternity.setWhoClinicalStage(null);
            existing_maternity.setCd4Date(null);
            existing_maternity.setCd4Date(null);
            existing_maternity.setViralLoadResults(null);
            existing_maternity.setViralLoadDate(null);
            existing_maternity.setwInitialResult(null);
            existing_maternity.setwTfv(null);
            existing_maternity.setpInitialResult(null);
            existing_maternity.setpTfv(null);
            existing_maternity.setpArtCode(null);
            existing_maternity.setArtCode(null);
            existing_maternity.setArtNo(null);
            existing_maternity.setCtxCode(null);
            existing_maternity.setwSyphilis(null);
            existing_maternity.setwHepatitisB(null);
            existing_maternity.setpSyphilis(null);
            existing_maternity.setpHepatitisB(null);
            existing_maternity.setMuac(null);
            existing_maternity.setInrNo(null);
            existing_maternity.setModeOfDelivery(null);
            existing_maternity.setDateOfDelivery(null);
            existing_maternity.setTimeOfDelivery(null);
            existing_maternity.setOxytocin(null);
            existing_maternity.setMisoprostol(null);
            existing_maternity.setErgometrine(null);
            existing_maternity.setManagementProcedure(null);
            existing_maternity.setOtherTreatment(null);
            existing_maternity.setApgarScore(null);
            existing_maternity.setSexOfBaby(null);
            existing_maternity.setNotBreathing(null);
            existing_maternity.setImmediateSkinToSkin(null);
            existing_maternity.setSourceOfWarmth(null);
            existing_maternity.setBreastFed(null);
            existing_maternity.setTeo(null);
            existing_maternity.setVitK(null);
            existing_maternity.setChlorhexidine(null);
            existing_maternity.setWeight(null);
            existing_maternity.setRiskStatus(null);
            existing_maternity.setArvsAdministered(null);
            existing_maternity.setSyrupDuration(null);
            existing_maternity.setBcgImmunization(null);
            existing_maternity.setPolioImmunization(null);
            existing_maternity.setFamilyPlanningDate(null);
            existing_maternity.setTreatmentOffered(null);
            existing_maternity.setBabyFinalDiagnosis(null);
            existing_maternity.setDeliveredByName(null);
            existing_maternity.setDeliveredByCadre(null);
            existing_maternity.setTransferredByName(null);
            existing_maternity.setTransferredByWhere(null);
            existing_maternity.setMotherBleeding6(null);
            existing_maternity.setMotherBp6(null);
            existing_maternity.setBabyCheckedCord6(null);
            existing_maternity.setBabyBreastFeeding6(null);
            existing_maternity.setBabyBreathing6(null);
            existing_maternity.setLlinsGiven(null);
            existing_maternity.setBabyCondition(null);
            existing_maternity.setMotherFinalDiagnosis(null);
            existing_maternity.setMotherBleeding24(null);
            existing_maternity.setMotherBp24(null);
            existing_maternity.setBabyCheckedCord24(null);
            existing_maternity.setBabyBreastFeeding24(null);
            existing_maternity.setBabyBreathing24(null);
            existing_maternity.setIycf(null);
            existing_maternity.setIycfOption(null);
            existing_maternity.setCounselingDischarged(null);
            existing_maternity.setMaterNutrCouns(null);
            existing_maternity.setConditionOfMotherAtDischarge(null);
            existing_maternity.setNameOfPersonDischarging(null);
            existing_maternity.setCadreOfPersonDischarging(null);
            existing_maternity.setDateOfDischarge(null);
            existing_maternity.setTimeOfDischarge(null);
            return "maternity";
        } catch (final Exception var3) {
            System.err.println("ChbBean Error: Method: update_existing_maternity " + var3.getMessage());
            return null;
        }
    }

}
