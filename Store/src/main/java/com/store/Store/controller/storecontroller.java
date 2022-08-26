package com.store.Store.controller;
import java.util.List;
import com.store.Store.model.userpersonaldetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.store.Store.repository.MySqlrepository;

@RestController
public class storecontroller {
    
    @Autowired
    MySqlrepository mySqlRepository;

    @GetMapping("/get-all-details")
    public List<userpersonaldetails> getalldetails(){
        return mySqlRepository.findAll();
    }

    
    @GetMapping("/get-details/{identity}")
    public userpersonaldetails getSingleAddress(@PathVariable("identity") Integer id){
        return mySqlRepository.findById(id).get();
    
    }
}
