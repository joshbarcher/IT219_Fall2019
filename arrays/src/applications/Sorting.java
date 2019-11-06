package applications;

public class Sorting
{
    public static void main(String[] args)
    {
        //create a test array and sort it
        int[] input = {7, 3, 1, 9, 5, 4, 1};
        bubbleSort(input);

        //print out all elements and see if they are sorted!
        for (int i = 0; i < input.length; i++)
        {
            System.out.println(input[i]);
        }
    }

    public static void bubbleSort(int[] array)
    {
        //bubble the highest element to the highest index
        for (int j = 0; j < 4; j++) // we need to update the number of iterations in this loop
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
}
