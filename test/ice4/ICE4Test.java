/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolas
 */
public class ICE4Test {
    
    public ICE4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    /**
     * Test of numOccurence method, of class ICE4.
     */

    //GOOD
       @Test
    public void testNumOccurence() {
        System.out.println("numOccurence");
        String word = "book";
        char char1 = 'o';
        int expResult = 2;
        int result = ICE4.numOccurence(word, char1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    //BAD
          @Test
    public void testNumOccurence() {
        System.out.println("numOccurence");
        String word = "book";
        char char1 = 'z';
        int expResult = 0;
        int result = ICE4.numOccurence(word, char1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
    
    /**
     * Test of maxChar method, of class ICE4.
     */
    //GOOD
    @Test 
    public void testMaxChar() {
        System.out.println("maxChar");
        String word = "vayt";
        char expResult = 'y';
        char result = ICE4.maxChar(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }
    //BAD
 @Test 
    public void testMaxChar() {
        System.out.println("maxChar");
        String word = "vayt";
        char expResult = 'y';
        char result = ICE4.maxChar(word);
        assertEquals(expResult, result);
    }
    /**
     * Test of charExist method, of class ICE4.
     */
    //GOOD
   @Test
    public void testCharExist() {
        System.out.println("charExist");
        String word = "dog";
        char char1 = 'g';
        boolean expResult = true;
        boolean result = ICE4.charExist(word, char1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
   //BAD
       @Test
    public void testCharExist() {
        System.out.println("charExist");
        String word = "dog";
        char char1 = 'r';
        boolean expResult = false;
        boolean result = ICE4.charExist(word, char1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }
}
