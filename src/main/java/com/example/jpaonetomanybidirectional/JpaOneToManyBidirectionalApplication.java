package com.example.jpaonetomanybidirectional;

import com.example.jpaonetomanybidirectional.model.Cart;
import com.example.jpaonetomanybidirectional.model.Item;
import com.example.jpaonetomanybidirectional.repository.CartRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class JpaOneToManyBidirectionalApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(JpaOneToManyBidirectionalApplication.class, args);

		CartRepository cartRepository = configurableApplicationContext
				.getBean(CartRepository.class);

		Cart cart = new Cart("C999");

		Item chocolate = new Item("S123", cart);
		Item shampoo = new Item("S321", cart);

		List<Item> items = Arrays.asList(chocolate, shampoo);

		cart.setItems(items);

		cartRepository.save(cart);
		cartRepository.delete(cart);
	}
}
