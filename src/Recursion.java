import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Recursion {



    //This method should take in a positive number, and count it down
    // all the way to 0 with recursion.
    public static void addRecursion(int x)
    {
        if(x>0)
        {
            System.out.println(x--);
            addRecursion(x);
        }
    }


    //1. Skapa File object
    public static long directorySizeCalc(String path)
    {
        long totalSize = 0;

        File f = new File(path);
        if(f.isFile())
            totalSize = f.length();

        if(f.isDirectory())
        {
            File[] items = f.listFiles();
            for(File item : items)
            {
                if(item.isFile())
                {
                    totalSize += item.length();
                }

                if(item.isDirectory())
                {
                    //Recursive part
                  totalSize += directorySizeCalc(item.getPath());
                }
            }
        }

        return totalSize;

    }



    //This method should return the factorial of n
    public static int factorial(int n){
        int total = 1;
        if(n < 0)
        {
          throw new IllegalArgumentException("Please enter a non negative int number");
        }
        if (n == 0)
        {
           return total;
        }
        else
        {
          return n* factorial(n-1);
        }

    }


    //Find all permutations for a given string
    public static List<String> permutation(String s)
    {
        //base case
        if(s.isEmpty())
        {
            List<String> empty = new ArrayList<>();
            empty.add("");
            return  empty;
        }

        List<String> permutations = new ArrayList<>();

        for(int i = 0; i < s.length(); i++)
        {
            char fixed = s.charAt(i);
            String remainingChar = s.substring(0,i) + s.substring(i+1);

            List<String> subPermutations = permutation(remainingChar);


            for(String p : subPermutations)
            {
                permutations.add(fixed+ p);
            }
        }

        return permutations;
    }






    //rekusivt räkna ut summan av alla talen i en Array.

    public static int recursiveSumFunction(int[] numbers)
    {
        //Hålla värdet av summan
        int sum = 0;

        //base case
        if(numbers.length < 1)
        {
            return 0;
        } else {
            sum += recursiveSumFunction(numbers);
        }

            return sum;
    }



}
