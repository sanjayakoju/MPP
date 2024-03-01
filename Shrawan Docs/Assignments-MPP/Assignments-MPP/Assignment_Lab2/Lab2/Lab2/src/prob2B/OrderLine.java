package prob2B;

import java.util.ArrayList;
import java.util.List;

public class OrderLine {
	
	private Order order;
	private List<Object> itemList;
	
	OrderLine(Order order) {
		this.order = order;
		this.itemList = new ArrayList<Object>();
	}

	public Order getOrder() {
		return order;
	}

	public List<Object> getItemList() {
		return itemList;
	}
	
	public void addItem(Object item) {
		this.itemList.add(item);
	}


}
