package com.busproject.bus_registration.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "customer")
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cus_id;

    private String cus_Name;

    private String cus_Email;

    public String getCus_Name() {
        return cus_Name;
    }

    public void setCus_Name(String cus_Name) {
        this.cus_Name = cus_Name;
    }

    public long getCus_id() {
        return cus_id;
    }

    public void setCus_id(long cus_id) {
        this.cus_id = cus_id;
    }

    public String getCus_Email() {
        return cus_Email;
    }

    public void setCus_Email(String cus_Email) {
        this.cus_Email = cus_Email;
    }

    public String getCus_Mobile() {
        return cus_Mobile;
    }

    public void setCus_Mobile(String cus_Mobile) {
        this.cus_Mobile = cus_Mobile;
    }

    private String cus_Mobile;

//    public CustomerEntity(){
//    }

//    public CustomerEntity(long cus_id, String cus_Name, String cus_Email, String cus_Mobile) {
//        this.cus_id = cus_id;
//        this.cus_Name = cus_Name;
//        this.cus_Email = cus_Email;
//        this.cus_Mobile = cus_Mobile;
//    }
}
