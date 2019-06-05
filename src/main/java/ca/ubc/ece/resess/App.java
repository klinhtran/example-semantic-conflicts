package ca.ubc.ece.resess;

import java.util.List;
import java.util.stream.Collectors;

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
        if(items==null)
            return "";   
        return String.join (" + ", items);
        
    }

    public static Integer getAvg(List<Integer> nums){   
        int sum = 0; 
        if(nums.size() == 0)
            return 0;
            
        for (Integer n : nums) {
            sum += n;
        }
        return sum / nums.size();
    }

    public static String whatIsYourFavouriteColour() {
        return "Blue";
    }

    public static Integer getLifeMeaning() {
        return 42;
        
    }

    public static String whatIsYourFavouriteDay() {
        return "Saturday";
    }
        
}
