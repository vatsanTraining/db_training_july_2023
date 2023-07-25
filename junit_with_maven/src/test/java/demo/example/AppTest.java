package demo.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    NameList obj;
    
    @BeforeEach
    void setUp() {
    	
    	obj = new NameList();
    }
    
    @Test
    @DisplayName(value = "Test getName method returns a List of size 8")
    void testGetNameSize() {
    	
    	int actual = obj.getNames().size();
    	
    	assertEquals(8, actual);
    	
    }
    
    @ParameterizedTest
    @ValueSource(ints = {0,2,4,6})
    @DisplayName(value = "Test getName method returns list with Even postions with  null values")
    void testGetNameForNull(int idx) {
    	
    	assertNull(obj.getNames().get(idx));
    	
    	
    }
}
