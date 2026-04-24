package hib.beans;


public class DigitalPharmacy 
{
    private int medId;
    private String medicineDescription;
    private String fullName;
    private String ward;
    private String status;

    public DigitalPharmacy() {
    }

    public DigitalPharmacy(String medicineDescription, String fullName, String ward, String status) {
        this.medicineDescription = medicineDescription;
        this.fullName = fullName;
        this.ward = ward;
        this.status = status;
    }

    public int getMedId() {
        return medId;
    }

    public void setMedId(int medId) {
        this.medId = medId;
    }

    public String getMedicineDescription() {
        return medicineDescription;
    }

    public void setMedicineDescription(String medicineDescription) {
        this.medicineDescription = medicineDescription;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}