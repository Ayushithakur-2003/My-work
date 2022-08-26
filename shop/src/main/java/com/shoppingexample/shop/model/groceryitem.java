package com.shoppingexample.shop.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("groceryitems")
public class groceryitem {
    @Id
    private String id;

    private String name;
    private int quantity;
    private String category;
    
    public groceryitem(String id, String name, int quantity, String category) {
        super();
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }

	public String getName() {
		return null;
	}

    public String getQuantity() {
        return null;
    }

    public String getCategory() {
        return null;
    }

    public void setCategory(String newCategory) {
    }
    
}
