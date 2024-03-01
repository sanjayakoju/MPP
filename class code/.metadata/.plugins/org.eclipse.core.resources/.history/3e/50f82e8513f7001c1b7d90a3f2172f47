package Lab6.problem1;

public class ListItem {

    private String itemName;
    private boolean highlight;

    ListItem(String item, boolean highlight) {
        this.itemName = item;
        this.highlight = highlight;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String item) {
        this.itemName = item;
    }

    public boolean isHighlight() {
        return highlight;
    }

    public void setHighlight(boolean highlight) {
        this.highlight = highlight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != ListItem.class) return false;
        ListItem item = (ListItem)obj;
        return itemName.equals(item.itemName);
    }
}
