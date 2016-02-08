/**
 * With Buggy3 you can, again, name your buggy 
 * @param args
 */
public class Buggy
{
    //Buggies have names
    String name;                             
    
    /**
     * ElementInArray returns the asked element in the array, if that element exists
     *
     * @param  StringArray An array
     * @param  Index       An existing or non-existing index in that array
     * @return             The specific element in the array or an empty string
     */
    public static String ElementInArray(String[] StringArray, int Index) 
    {
        //We start with an empty returnstring
        String ReturnString = "";
        if(StringArray.length > Index)
        {       
           //The index exists
           ReturnString = StringArray[Index];
        }                                    
        return ReturnString;
    }

    /**
     * NullValue returns the second value if the first value is null 
     *
     * @param  FirstValue  A first value
     * @param  SecondValue A second value
     * @return             If not empty, the first value, else the second value
     */
    public static String NullValue(String FirstValue, String SecondValue) 
    {
        //We start with the first value
        String ReturnString = FirstValue;
        if(FirstValue=="")
        {       
           //The first value is empty
           ReturnString = SecondValue;
        }                                    
        return ReturnString;
    }

    /**
     * Here's where the buggy starts. It prints the given name of the buggy. 
     *
     * @param  args        An array of strings
     */
    /**  */
    public static void main(String[] args) 
    {
        //Instantiates the buggy             
        Buggy MyBuggy = new Buggy();             
        //Provides a name for the buggy
        MyBuggy.name = ElementInArray(args,0);
        //Reports the name, if that name exists
        System.out.println("And the name of the buggy is "+NullValue(MyBuggy.name,"unknown. Please provide a name")+".");
    }
}