package demo.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TestDiscountService {

	@Mock
	ProductRepo repo;
	
	@InjectMocks 
	DiscountService service;
	
	@BeforeEach
	void init() throws Exception {
		

		when(repo.getDiscount()).thenReturn(0.10);
	}
	
	@Test
	void test() {

		 assertEquals(service.getPrice(), 45000.00);
	}

}
