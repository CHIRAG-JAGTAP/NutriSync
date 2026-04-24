package hib.beans;

public class Patient 
{
    private String patientId;
    private String fullName;
    private String password;
    private String emailId;
    private String address;
    private String ailment;
    private String description;
    private String dOB;
    private String gender;
    private int contact;
    private String nationality;
    
    @Override
    public String toString(){
    return patientId+" "+fullName+" "+emailId+" "+address+" "+ailment+" "+description+" "+dOB+" "+gender+" "+contact+" "+nationality;
    }

    public Patient() {
    }

    public Patient(String patientId,String fullName, String password, String emailId, String address, String ailment, String description, String dOB, String gender, int contact, String nationality) {
        this.patientId=patientId;
        this.fullName = fullName;
        this.password = password;
        this.emailId = emailId;
        this.address = address;
        this.ailment = ailment;
        this.description = description;
        this.dOB = dOB;
        this.gender = gender;
        this.contact = contact;
        this.nationality = nationality;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}