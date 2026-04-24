package hib.beans;

public class CanteenOperatorLogin 
{
    private String cId;
    private String cPass;

    public CanteenOperatorLogin(String cId, String cPass) {
        this.cId = cId;
        this.cPass = cPass;
    }

    public CanteenOperatorLogin() {
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcPass() {
        return cPass;
    }

    public void setcPass(String cPass) {
        this.cPass = cPass;
    }

   
}