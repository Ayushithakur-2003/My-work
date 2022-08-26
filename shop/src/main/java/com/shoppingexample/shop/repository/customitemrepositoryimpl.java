package com.shoppingexample.shop.repository;



import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.mongodb.client.result.UpdateResult;
import com.shoppingexample.shop.model.groceryitem;


@Component
public class customitemrepositoryimpl implements customitemrepository{
    
    private MongoTemplate mongoTemplate;

  
 
   
    public void updateItemQuantity(String name, float newQuantity) {
        Query query = new Query(Criteria.where("name").is(name));
        Update update = new Update();
        update.set("quantity", newQuantity);
        
        UpdateResult result = mongoTemplate.updateFirst(query, update, groceryitem.class);
        
        if(result == null)
            System.out.println("No documents updated");
        else
            System.out.println(result.getModifiedCount() + " document(s) updated..");

            

    }

    







  
    
}
