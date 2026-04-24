package hib.beans;

public class PharmacyOperatorLogin 
{
    private String pId;
    private String pPass;

    public PharmacyOperatorLogin(String pId, String pPass) {
        this.pId = pId;
        this.pPass = pPass;
    }

    public PharmacyOperatorLogin() {
    }

    /**
     * @return the pId
     */
    public String getpId() {
        return pId;
    }

    /**
     * @param pId the pId to set
     */
    public void setpId(String pId) {
        this.pId = pId;
    }

    /**
     * @return the pPass
     */
    public String getpPass() {
        return pPass;
    }

    /**
     * @param pPass the pPass to set
     */
    public void setpPass(String pPass) {
        this.pPass = pPass;
    }

    
   
}