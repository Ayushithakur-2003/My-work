package com.shoppingexample.shop;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.shoppingexample.shop.model.groceryitem;
import com.shoppingexample.shop.repository.customitemrepository;
import com.shoppingexample.shop.repository.customitemrepositoryimpl;
import com.shoppingexample.shop.repository.itemrepository;

@SpringBootApplication
@EnableMongoRepositories
public class mdbspringbootapp implements CommandLineRunner{
    
    
    static
    itemrepository groceryItemRepo;

    @Configuration
public class AppConfig {
    @Bean
    public customitemrepository cusrep() {
        return new customitemrepositoryimpl();
    }
}
    
    @Autowired
    customitemrepository customRepo;
    public static void createGroceryItems() {
        System.out.println("Data creation started...");
         groceryItemRepo.save(new groceryitem("Whole Wheat Biscuit", "Whole Wheat Biscuit", 5, "snacks"));
         groceryItemRepo.save(new groceryitem("Kodo Millet", "XYZ Kodo Millet healthy", 2, "millets"));
         groceryItemRepo.save(new groceryitem("Dried Red Chilli", "Dried Whole Red Chilli", 2, "spices"));
         groceryItemRepo.save(new groceryitem("Pearl Millet", "Healthy Pearl Millet", 1, "millets"));
         groceryItemRepo.save(new groceryitem("Cheese Crackers", "Bonny Cheese Crackers Plain", 6, "snacks"));
         System.out.println("Data creation complete...");
         }

         public static void showAllGroceryItems() {
         
            groceryItemRepo.findAll().forEach(item -> System.out.println(getItemDetails(item)));
        }
        
        // 2. Get item by name
        public void getGroceryItemByName(String name) {
            System.out.println("Getting item by name: " + name);
            groceryitem item = groceryItemRepo.findItemByName(name);
            System.out.println(getItemDetails(item));
        }
        
        private static char[] getItemDetails(groceryitem item) {
            return null;
        }

        // 3. Get name and quantity of a all items of a particular category
        public static void getItemsByCategory(String category) {
            System.out.println("Getting items for the category " + category);
            List<groceryitem> list = groceryItemRepo.findAll(category);
            
            list.forEach(item -> System.out.println("Name: " + item.getName() + ", Quantity: " + item.getQuantity()));
        }
        
        // 4. Get count of documents in the collection
        public static void findCountOfGroceryItems() {
            long count = groceryItemRepo.count();
            System.out.println("Number of documents in the collection: " + count);
        }

        public static String getItemDetailshere(groceryitem item) {

            System.out.println(
            "Item Name: " + item.getName() + 
            ", \nQuantity: " + item.getQuantity() +
            ", \nItem Category: " + item.getCategory()
            );
            
            return "";
        }

        public static void updateCategoryName(String category) {

            
         
            // Change to this new value
            String newCategory = "munchies";
            
            // Find all the items with the category snacks
            List<groceryitem> list = groceryItemRepo.findAll(category);
            
            list.forEach(item -> {
                // Update the category in each document
                item.setCategory(newCategory);
            });
            
            // Save all the items in database
            List<groceryitem> itemsUpdated = groceryItemRepo.saveAll(list);
            
            if(itemsUpdated != null)
                System.out.println("Successfully updated " + itemsUpdated.size() + " items.");         
        }

        public static void deleteGroceryItem(String id) {
            groceryItemRepo.deleteById(id);
            System.out.println("Item with id " + id + " deleted...");
        }

        public void updateItemQuantity(String name, float newQuantity) {
            System.out.println("Updating quantity for " + name);
            customRepo.updateItemQuantity(name, newQuantity);
        }

    @Override
    public void run(String... args) throws Exception {
        SpringApplication.run(mdbspringbootapp.class, args);
        
        System.out.println("-------------CREATE GROCERY ITEMS-------------------------------\n");
        
        createGroceryItems();
        
        System.out.println("\n----------------SHOW ALL GROCERY ITEMS---------------------------\n");
        
        showAllGroceryItems();

        deleteGroceryItem("Kodo Millet");

         updateItemQuantity("Bonny Cheese Crackers Plain", 10);
        
    }
}