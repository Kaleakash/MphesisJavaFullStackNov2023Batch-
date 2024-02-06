package com.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.entity.Product;
import com.service.ProductService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class ProductControllerMockTest {

	@Mock
	ProductService productService;
	
	@InjectMocks
	ProductController productController;
	
	@Test
	void testFindAllProducts() {
		// Fake List Of Products 
		Product p1 = new Product();
		p1.setPid(1);
		p1.setPname("TV");
		p1.setPrice(45000);
		p1.setUrl("www.product.com");
		
		Product p2 = new Product();
		p2.setPid(2);
		p2.setPname("Computer");
		p2.setPrice(32000);
		p1.setUrl("www.computer.com");
		List<Product> listOfFakeProduct = new ArrayList<>();
		listOfFakeProduct.add(p1);
		listOfFakeProduct.add(p2);
		Mockito.when(productService.findAllProduct()).thenReturn(listOfFakeProduct);
		
		List<Product> listOfProduct = productController.findAllProducts();
		assertEquals(2, listOfProduct.size());
	}

	@Test
	@Disabled
	void testFindProduct() {
		fail("Not yet implemented");
	}

}
