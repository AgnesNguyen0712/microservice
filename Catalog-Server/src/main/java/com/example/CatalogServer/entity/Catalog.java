package com.example.CatalogServer.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Catalog {
    @Id
    private int catalogId;
    private String catalogName;
    private String price;

    public Catalog(int catalogId, String catalogName, String price) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.price = price;
    }
}
