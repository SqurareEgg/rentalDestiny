package com.square.rentalDestiny.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "item_table")
public class ItemEntity {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    @Column
    private String name;

    @Column
    private int price;

    @Column
    private int stock;

}
