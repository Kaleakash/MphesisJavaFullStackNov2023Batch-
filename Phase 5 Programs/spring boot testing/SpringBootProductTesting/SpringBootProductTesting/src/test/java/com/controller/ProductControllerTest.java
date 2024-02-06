package com.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.entity.Product;

@ExtendWith(SpringExtension.class)
@SpringBootTest						
class ProductControllerTest {

	@Autowired
	ProductController productController;
	
	@Test
	@Timeout(value = 10,unit = TimeUnit.SECONDS)
	void testFindAllProducts() {
	//	fail("Not yet implemented");
		List<Product> listOfProduct = productController.findAllProducts();
		assertEquals(3, listOfProduct.size());
	}

	@Test
	void testFindProduct() {
		//fail("Not yet implemented");
		Product p1 = productController.findProduct(1);
		assertNotNull(p1);
		Product p2 = productController.findProduct(3);
		assertNull(p2);
		
	}

}
