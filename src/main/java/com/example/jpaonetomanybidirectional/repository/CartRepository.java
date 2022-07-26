package com.example.jpaonetomanybidirectional.repository;

import com.example.jpaonetomanybidirectional.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {
}
