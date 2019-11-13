package com.model;

import java.util.Arrays;

public class Z_B2B_COLLECTION_LISTWrapper {
private String status = "";
private ListItems[] items=null;
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public ListItems[] getItems() {
	return items;
}
public void setItems(ListItems[] items) {
	this.items = items;
}
@Override
public String toString() {
	return "Z_B2B_COLLECTION_LISTWrapper [status=" + status + ", items=" + Arrays.toString(items) + "]";
}

}
