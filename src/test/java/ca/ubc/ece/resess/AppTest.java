package ca.ubc.ece.resess;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testMakeVerbalListNoItem(){
        assertEquals("", App.makeVerbalList(new ArrayList<String>()));
    }

    public void testMakeVerbalListOneItem(){
        assertEquals("apple", App.makeVerbalList(Arrays.asList("apple")));
    }

    public void testMakeVerbalListTwoItems(){
        assertEquals("apple, pie", App.makeVerbalList(Arrays.asList("apple", "pie")));
    }

    public void testMakeVerbalListThreeItems(){
        assertEquals("apple, pie, ice", App.makeVerbalList(Arrays.asList("apple", "pie", "ice")));
    }

    public void testMakeVerbalListNull(){
        assertEquals("", App.makeVerbalList(null));
    }

    public void testOxfordList1() {
        assertEquals("apple", App.makeVerbalListOxford(Arrays.asList("apple")));        
    }

    public void testOxfordList2() {
        assertEquals("apple and pie", App.makeVerbalListOxford(Arrays.asList("apple", "pie")));
    }

    public void testOxfordList3() {
        assertEquals("apple, pie and dog", App.makeVerbalListOxford(Arrays.asList("apple", "pie", "dog")));
    }

    public void testPlus1(){
        assertEquals("a", App.makeVerbalListPlus(Arrays.asList("a")));
    }

    public void testPlus2(){
        assertEquals("a + b", App.makeVerbalListPlus(Arrays.asList("a", "b")));
    }

    public void testPlusNull(){
        assertEquals("", App.makeVerbalListPlus(null));
    }

    public void testGetAvgOne(){
        Integer n = 3;
        assertEquals(n, App.getAvg(Arrays.asList(n)));
    }

    public void testGetAvgTwo(){
        assertEquals(new Integer(3), App.getAvg(Arrays.asList(2, 4)));
    }

    public void testGetAvgWhenNull(){
        try {
            App.getAvg(null);
            assertTrue(false);
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    public void testColorBlue() {   
        assertEquals("Blue", App.whatIsYourFavouriteColour());
    }

    public void testMeaning42(){
        assertSame(42, App.getLifeMeaning());
    }

    public void testFavoriteDay(){
        assertEquals("Saturday", App.whatIsYourFavouriteDay());
    }
}
