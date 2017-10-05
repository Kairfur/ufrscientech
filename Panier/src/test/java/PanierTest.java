/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author vj243775
 */
public class PanierTest extends TestCase {
    
    public PanierTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getPanier method, of class Panier.
     */
    public void testGetPanier() {
        System.out.println("getPanier");
        Panier instance = new Panier();
        ArrayList expResult = new java.util.ArrayList<Orange>();
        ArrayList result = instance.getPanier();
        assertEquals(expResult, result);
        
    
    }

    /**
     * Test of setPanier method, of class Panier.
     */
    public void testSetPanier() {
        System.out.println("setPanier");
        ArrayList panier = new java.util.ArrayList<Orange>();
        Panier instance = new Panier();
        instance.setPanier(panier);
        assertEquals(instance.getPanier(),panier);
       
    }

    /**
     * Test of getMax method, of class Panier.
     */
    public void testGetMax() {
        System.out.println("getMax");
        Panier instance = new Panier();
        int expResult = 4;
        int result = instance.getMax();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setMax method, of class Panier.
     */
    public void testSetMax() {
        System.out.println("setMax");
        int Max = 0;
        Panier instance = new Panier();
        instance.setMax(Max);
        assertEquals(instance.getMax(),Max);
        
        
    }

    /**
     * Test of AjoutOrange method, of class Panier.
     */
    public void testAjoutOrange() {
        System.out.println("AjoutOrange");
        Orange a = new Orange();
        Panier instance = new Panier();
        instance.AjoutOrange(a);
        assertEquals(instance.getPanier().size(),1);
        
       
    }

    /**
     * Test of remove method, of class Panier.
     */
    public void testRemove() {
        System.out.println("remove");
        Orange a = new Orange();
        Panier instance = new Panier();
        instance.AjoutOrange(a);
        instance.remove(a);
        assertEquals(instance.getPanier().size(),0);
        
        
    }
    
    
}
