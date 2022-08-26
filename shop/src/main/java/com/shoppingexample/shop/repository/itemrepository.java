package com.shoppingexample.shop.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.shoppingexample.shop.model.groceryitem;

public interface itemrepository extends MongoRepository<groceryitem, String> {
    @Query("{name:'?0'}")
    groceryitem findItemByName(String name);
    
    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<groceryitem> findAll(String category);
    
    public long count();
}
