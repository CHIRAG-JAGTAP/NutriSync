
package hib.beans;


public class Doctor 
{
   private String doctorId;
    private String fullName;
    private String password;
    private String emailId;
    private String address;
    private String qualification;
    private String experience;
    private String achievements;
    private String post;
    private String gender;
    private String dOB;
    private int contact;

    public Doctor() {
    }

    /**
     * @return the doctorId
     */
    public String getDoctorId() {
        return doctorId;
    }

    public Doctor(String doctorId,String fullName, String password, String emailId, String address, String qualification, String experience, String achievements, String post, String gender, String dOB, int contact) {
        this.doctorId=doctorId;
        this.fullName = fullName;
        this.password = password;
        this.emailId = emailId;
        this.address = address;
        this.qualification = qualification;
        this.experience = experience;
        this.achievements = achievements;
        this.post = post;
        this.gender = gender;
        this.dOB = dOB;
        this.contact = contact;
    }

    /**
     * @param doctorId the doctorId to set
     */
    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the emailId
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * @param emailId the emailId to set
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the qualification
     */
    public String getQualification() {
        return qualification;
    }

    /**
     * @param qualification the qualification to set
     */
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    /**
     * @return the experience
     */
    public String getExperience() {
        return experience;
    }

    /**
     * @param experience the experience to set
     */
    public void setExperience(String experience) {
        this.experience = experience;
    }

    /**
     * @return the achievements
     */
    public String getAchievements() {
        return achievements;
    }

    /**
     * @param achievements the achievements to set
     */
    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    /**
     * @return the post
     */
    public String getPost() {
        return post;
    }

    /**
     * @param post the post to set
     */
    public void setPost(String post) {
        this.post = post;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the dOB
     */
    public String getdOB() {
        return dOB;
    }

    /**
     * @param dOB the dOB to set
     */
    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    /**
     * @return the contact
     */
    public int getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(int contact) {
        this.contact = contact;
    }
    
    
}
