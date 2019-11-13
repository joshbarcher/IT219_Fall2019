package applications;

import java.util.Random;

public class Sorting
{
    public static void main(String[] args)
    {
        //create a test array and sort it
        //int[] input = {7, 3, 1, 9, 5, 4, 1, 7, -10, 22, 11, 3};

        int[] array = createRandomArray(1000000);
        bubbleSort(array);

        //print out all elements and see if they are sorted!
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

    public static void bubbleSort(int[] array)
    {
        //bubble the highest element to the highest index
        for (int j = 1; j <= array.length - 1; j++) // we need to update the number of iterations in this loop
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if (array[i] > array[i + 1])
                {
                    //the switcheroo
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    public static int[] createRandomArray(int size)
    {
        //create the array
        Random random = new Random();
        int[] randomArray = new int[size];

        //assign random numbers to the array
        for (int i = 0; i < randomArray.length; i++)
        {
            randomArray[i] = random.nextInt(size);
        }

        return randomArray;
    }
}


