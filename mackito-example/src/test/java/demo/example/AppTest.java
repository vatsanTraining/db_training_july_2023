package demo.example;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.training.model.Book;
import com.training.services.BookServiceImpl;

import demo.example.ifaces.BookRepository;

/**
 * Unit test for simple App.
 */

@RunWith(MockitoJUnitRunner.class)
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	
	@Mock
	BookRepository mockRepo;
	
	@InjectMocks 
	BookServiceImpl service;
	
    @Test
    public void shouldAnswerWithTrue()
    {
    	Book java =  new Book(101,"Head First Java",450);

		Book spring =  new Book(102,"Effective Spring",750);
		
		Book javascript =  new Book(103,"Javascript in Action",950);

		List<Book> bookList = new ArrayList<>();
		 bookList.add(java);
		 bookList.add(spring);
		 bookList.add(javascript);
		 
		
        when(mockRepo.getAllBooks()).thenReturn(bookList);
        assertEquals(950, service.findMaximumPrice());
        
    }
}
