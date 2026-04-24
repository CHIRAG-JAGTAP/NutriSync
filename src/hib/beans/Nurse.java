
package hib.beans;

public class Nurse 
{
    private String nurseId;
    private String password;
    private String fullName;
    private String emailId;
    private String address;
    private String qualification;
    private String experience;
    private String gender;
    private String dOB;
    private int contact;

    public Nurse() {
    }

    public Nurse(String nurseId,String password, String fullName, String emailId, String address, String qualification, String experience, String gender, String dOB, int contact) {
        this.nurseId=nurseId;
        this.password = password;
        this.fullName = fullName;
        this.emailId = emailId;
        this.address = address;
        this.qualification = qualification;
        this.experience = experience;
        this.gender = gender;
        this.dOB = dOB;
        this.contact = contact;
    }

    public String getNurseId() {
        return nurseId;
    }

    public void setNurseId(String nurseId) {
        this.nurseId = nurseId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
    
}
