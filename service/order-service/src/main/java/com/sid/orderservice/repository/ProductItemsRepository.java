package com.sid.orderservice.repository;

import com.sid.orderservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface ProductItemsRepository extends JpaRepository<ProductItem,Long> {
}
