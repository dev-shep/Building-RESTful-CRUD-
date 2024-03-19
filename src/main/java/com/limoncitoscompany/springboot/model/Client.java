package com.limoncitoscompany.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity(name="client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String paternal_surname;
    private String maternal_surname;
    private int level;   
    private int pago;  
    private Date joining_date; 



    
    public Client(String name, String paternal_surname, String maternal_surname, int level, int pago,
            Date joining_date) {
        this.name = name;
        this.paternal_surname = paternal_surname;
        this.maternal_surname = maternal_surname;
        this.level = level;
        this.pago = pago;
        this.joining_date = joining_date;
    }


    public Client() {
    }


    public String getMaternal_surname() {
        return maternal_surname;
    }


    public void setMaternal_surname(String maternal_surname) {
        this.maternal_surname = maternal_surname;
    }


    public Date getJoining_date() {
        return joining_date;
    }


    public void setJoining_date(Date joining_date) {
        this.joining_date = joining_date;
    }
 
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPaternal_surname() {
        return paternal_surname;
    }
    public void setPaternal_surname(String paternal_surname) {
        this.paternal_surname = paternal_surname;
    }
   

    
}
