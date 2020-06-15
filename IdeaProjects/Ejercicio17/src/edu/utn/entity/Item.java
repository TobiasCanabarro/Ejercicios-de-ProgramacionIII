package edu.utn.entity;

public class Item {

    private String material;
    private int volume;
    private boolean hasContent;
    private boolean hasObj;
    private Item itemContents;

    public void createItem (String matter, int volume){
        setVolume(volume);
        setMaterial(matter);
    }

    public boolean isHasObj() {
        return hasObj;
    }

    public void setHasObj(boolean hasObj) {
        this.hasObj = hasObj;
    }

    public boolean isHasContent() {
        return hasContent;
    }

    public void setHasContent(boolean hasContent) {
        this.hasContent = hasContent;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Item getItemContents() {
        return itemContents;
    }

    public void setItemContents(Item itemContents) {
        this.itemContents = itemContents;
    }
}
