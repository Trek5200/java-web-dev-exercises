package org.launchcode.java.studios.restaurantmenu;


import java.util.Date;

public class MenuItem {

    private int itemNum;
    private String description;
    private ItemCategory category;
    private float price;
    private Date dateAdded;
    private boolean isNew;

    public MenuItem(int itemNum, String description, ItemCategory category, float price, Date dateAdded, boolean isNew ){
        this.itemNum = itemNum;
        this.description = description;
        this.category = category;
        this.price = price;
        this.dateAdded = dateAdded;
        this.isNew = isNew;
    }
    // getters and setters
    public int getItemNum() {
        return itemNum;
    }
    public void setItemNum(int aItemNum) {
        itemNum = aItemNum;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String aDescription) {
        description = aDescription;
    }
    public ItemCategory getCategory() {
        return category;
    }
    public void setCategory(ItemCategory aCategory) {
        category = aCategory;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(int aPrice) {
        price = aPrice;
    }
    public Date getDateAdded() {
        return dateAdded;
    }
    public void setDateAdded(Date aDateAdded) {
        dateAdded = aDateAdded;
    }
    public boolean getIsNew() {
        return isNew;
    }
    public void setIsNew(boolean aIsNew) {
        isNew = aIsNew;
    }
}