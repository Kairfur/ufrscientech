package ufrscientech.panier;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;

/**
 *
 * @author vj243775
 */
public class OrangeTest extends TestCase {
    
    public OrangeTest(String testName) {
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
     * Test of getPrix method, of class Orange.
     */
    public void testGetPrix() {
        System.out.println("getPrix");
        Orange instance = new Orange();
        double expResult = 0.5;
        double result = instance.getPrix();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPrix method, of class Orange.
     */
    public void testSetPrix() {
        System.out.println("setPrix");
        double Prix = 0.5;
        Orange instance = new Orange();
        instance.setPrix(Prix);
        assertEquals(instance.getPrix(),Prix);
        
    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Orange instance = new Orange();
        String expResult = "France";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setOrigine method, of class Orange.
     */
    public void testSetOrigine() {
        System.out.println("setOrigine");
        String Origine = "France";
        Orange instance = new Orange();
        instance.setOrigine(Origine);
        assertEquals(instance.getOrigine(),"France");
        
    }
    public void testNewOrange(){
        Orange instance = new Orange(0.5,"France");
        Orange O = new Orange();
        boolean b=false;
        if (instance.getPrix()==O.getPrix())
        {
            if (instance.getOrigine()==O.getOrigine())
            {
                b=true;
            }
        }
        assertTrue(b);  
        
    }
    
}
