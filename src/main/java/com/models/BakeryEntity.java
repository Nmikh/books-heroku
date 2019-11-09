package com.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "bakery")
@Data
public class BakeryEntity {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private int id;

    @Basic
    @Column(name = "BAKERY_TYPE")
    private String bakeryType;

    @Basic
    @Column(name = "PRICE")
    private Double price;

    @Basic
    @Column(name = "DATE_START")
    private Date dateStart;

    @Basic
    @Column(name = "DATE_END")
    private Date dateEnd;
}
