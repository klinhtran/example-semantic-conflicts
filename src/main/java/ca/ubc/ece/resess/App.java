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

    public static String makeVerbalListOxford(List<String> items){
        if(items == null)
            return "";
        if(items.size() == 1)
            return items.get(0);
            
        return String.join (" and ", String.join(", ", items.subList(0, items.size()-1)), items.get(items.size()-1));
    }

    public static String makeVerbalListPlus(List<String> items){   
        return String.join (" + ", items);
    }
}
