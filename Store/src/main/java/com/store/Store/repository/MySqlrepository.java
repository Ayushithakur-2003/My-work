package com.store.Store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.Store.model.userpersonaldetails;

public interface MySqlrepository extends JpaRepository <userpersonaldetails,Integer>{
    
}
