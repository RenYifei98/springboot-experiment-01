package com.expreiment.springbootexperiment01.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity @Getter @Setter
public class Address {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String detail;
   @ManyToOne
   private User user;
   @Column(columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP",
           updatable = false,insertable = false)
   private LocalDateTime insertTime;

   public Address(String detail){
      this.detail = detail;
   }

}
