package com.example.CatalogServer.repository;

import com.example.CatalogServer.entity.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends  JpaRepository<Catalog, Integer> {

}
