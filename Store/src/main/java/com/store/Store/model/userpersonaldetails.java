package com.store.Store.model;
import javax.persistence.*;


@Entity
@Table(name = "userpersonaldetails")
public class userpersonaldetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     
    @Column(name = "username")
    private String username;

    @Column(name = "userage")
    private Integer userage;


    public userpersonaldetails(String username, Integer userage) {
        this.username = username;
        this.userage = userage;
    }


    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public Integer getUserage() {
        return userage;
    }


    public void setUserage(Integer userage) {
        this.userage = userage;
    }



 


  

    


}
