import java.util.ArrayList;
import java.util.List;

public class BinaryStrings {

    public static void main(String[] args) {
        List<String> binaryStrings = generateBinaryStrings(3);
        for (String str : binaryStrings) {
            System.out.println(str);
        }
    }

    public static List<String> generateBinaryStrings(int n) {
        // terminating condition (base case)
        if (n == 1) {
            List<String> baseCase = new ArrayList<>();
            baseCase.add("0");
            baseCase.add("1");
            return baseCase;
        }
        
        // pass along a smaller version of the same problem
        List<String> smallerStrings = generateBinaryStrings(n - 1);
        List<String> result = new ArrayList<>();

        for (String str : smallerStrings) {
            result.add(str + "0");
            result.add(str + "1");
        }

        return result;
    }
}
