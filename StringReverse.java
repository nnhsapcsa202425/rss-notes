
/**
 * Write a description of class StringReverse here.
 *
 * @author mrcallaghan
 * @version 19mar2025
 */
public class StringReverse
{
    public static String reverse(String str)
    {
        // must have a terminating (base) case (i.e., the empty loaf)   
        if(str.equals(""))
        {
            return str;
        }
        
        // take a small step towards a solution
        String firstChar = str.substring(0,1);
        String restOfString = str.substring(1);
        
        // recurse - call this method with a simpler version of the problem
        String restOfStringReversed = reverse(restOfString);
        
        String strReversed = restOfStringReversed + firstChar;
        return strReversed;
    }
}
