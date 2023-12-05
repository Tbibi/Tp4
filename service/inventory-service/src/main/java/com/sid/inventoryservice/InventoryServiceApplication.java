package com.sid.inventoryservice;

import com.sid.inventoryservice.entities.Product;
import com.sid.inventoryservice.repo.ProductRepository;
import jakarta.persistence.Entity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Random;

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ProductRepository productRepository){
		return args -> {
			Random random=new Random();
			for (int i=1;i<10;i++){
				productRepository.saveAll(List.of(
						Product.builder()
								.name("PC"+i).
								price(2334+Math.random()*1000)
								.quantity(1+ random.nextInt(200)).build()
				));
			}

		};
	}

}
