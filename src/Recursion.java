import java.io.File;

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







}
