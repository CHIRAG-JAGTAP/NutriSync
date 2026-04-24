package hib.beans;

public class DigitalCanteen 
{
    private int orderId;
    private String foodName;
    private int quantity;
    private String fullName;
    private String userId;
    private String ward;
    private String status;

    public DigitalCanteen() {
    }

    public DigitalCanteen(String foodName, int quantity, String fullName, String userId, String ward, String status) {
        this.foodName = foodName;
        this.quantity = quantity;
        this.fullName = fullName;
        this.userId = userId;
        this.ward = ward;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
