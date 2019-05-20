package ca.ubc.ece.resess;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static String makeVerbalList(List<String> items){
        if(items == null)
            return "";
        return String.join(", ", items);
    }
}
