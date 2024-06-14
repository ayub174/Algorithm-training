import java.util.Random;

public class Sorting {



    //Populate an array with random values.
    public static void populateArr(int[] arr){
        Random random = new Random();
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = random.nextInt(1, 10);
        }
    }


    public static void selectionSort(int[] arr){
        for(int i = 0; i< arr.length-1; i++)
        {
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++)
           {
               if(arr[j] < arr[minIndex])
               {
                   minIndex = j;
               }
           }
            //Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    } //End method




    }