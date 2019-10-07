/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umons.money;

import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import umons.money2.Money;

/**
 *
 * @author NOFFABEL
 */
public class MoneyTest extends TestCase {
    protected Money money_1;
    protected Money money_2;
    protected Money money_3;
    protected Money money_4;
    protected Money money_5;
    protected Money money_6;
    
    public MoneyTest(String name){
        super(name);
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass");
    }
    
    @Before
    public void setUp() {
        money_1 = new Money(20, "EUR");
        money_2 = new Money(14, "EUR");
        money_3 = new Money(17, "DLR");
        money_4 = new Money(26, "CHF");
        money_5 = new Money(-4, "EUR");
        money_6 = new Money(27, "DLR");
    }
    
    @After
    public void tearDown() { 
    
    }

    /**
     * Test of amount method, of class Money.
     */
    @Test
    public void testAmount() {
        System.out.println("amount");
        Money instance = new Money(23, "Euro");
        int expResult = 23;
        int result = instance.amount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of currency method, of class Money.
     */
    @Test
    public void testCurrency() {
        System.out.println("currency");
        Money instance = new Money(23, "Euro");
        String expResult = "Euro";
        String result = instance.currency();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Money.
     * @throws java.lang.Exception
     */
    @Test
    public void testAdd_Money() throws Exception {
        System.out.println("add");
        Money m = new Money(23, "Euro");
        Money instance = new Money(10, "Euro");
        Money expResult = new Money(33, "Euro");
        Money result = instance.add(m);
        assertTrue("There are Equals", expResult.amount()==result.amount() && expResult.currency().equals(result.currency()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Money.
     * @throws java.lang.Exception
     */
    @Test
    public void testAdd_int_String() throws Exception {
        System.out.println("add");
        int namount = 10;
        String currency = "Euro";
        Money instance = new Money(23, "Euro");
        Money expResult = new Money(33, "Dolar");
        Money result = instance.add(namount, currency);
        assertFalse("There are not Equals", expResult.amount()==result.amount() && expResult.currency().equals(result.currency()));
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
