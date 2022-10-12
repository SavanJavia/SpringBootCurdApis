package com.interview.interview.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Inventory {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int stock;

    private String status;

    private boolean flag;

    @Override
    public String toString() {
        return "Inventory{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", stock=" + stock + '\''+
                ", status="+ status + '\''+
                ", flag=" + flag+
                '}';
    }
}
