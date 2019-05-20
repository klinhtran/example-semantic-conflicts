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
}
