package com.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.dao.ProductDao;

@ExtendWith(MockitoExtension.class)		// Enable mocking features 
class ProductServiceMockTest {

	@Mock
	ProductDao productDao;
	
	@InjectMocks
	ProductService productService;
	
	@Test
	void testGetProductInfo() {
		
		// Fake or MOck or Proxy data provide 
		Mockito.when(productDao.getProductInfo()).thenReturn("Fake Product Info");
		//Mockito.when(productDao.getProductInfo()).thenCallRealMethod();		// it will call real or actual method 
		
		String result = productService.getProductInfo();
		assertEquals("Fake Product Info", result);
		//assertEquals(null, result);
	}

}
