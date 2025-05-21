package Models;

public class Item {
    private String itemName;
    private String description;
    private String location;
    private String Status = "Reported";

    public Item(String itemName, String description, String location){
        this.itemName = itemName;
        this.description = description;
        this.location = location;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getStatus(){
        return Status;
    }

    public void setStatus(String status){
        this.Status = Status;
    }

    public String toString() {
        return String.format("| %-15s | %-25s | %-15s | %-10s |",
                itemName, description, location, Status);
    }
}
