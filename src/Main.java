import java.lang.*;

public class Main {




    public static void main(String[] args) {




        int[] arr = new int[10];
        Sorting.populateArr(arr);

        System.out.println("Unsorted Array: ");
        for(int i : arr)
        {
            System.out.print(i + " , ");
        }


        System.out.println(" ");

        Sorting.selectionSort(arr);
        System.out.println("Sorted Array: ");

        for(int i : arr)
        {
            System.out.print(i + " , ");
        }


    }





}