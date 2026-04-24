package hib.beans;

public class CanteenOperator 
{
    private int itemNo;
   private String itemName;
   private int price;

    public CanteenOperator() {
    }

    public CanteenOperator(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
    }

    public int getItemNo() {
        return itemNo;
    }

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
