package hib.beans;

public class Admin 
{
    private String aId;
    private String aPass;

    public Admin(String aId, String aPass) {
        this.aId = aId;
        this.aPass = aPass;
    }

    public Admin() {
    }

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    public String getaPass() {
        return aPass;
    }

    public void setaPass(String aPass) {
        this.aPass = aPass;
    }
    
   
}