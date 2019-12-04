package practice;

import java.io.File;
import java.util.Scanner;

public class ReadingDirectories
{
    public static void main(String[] args)
    {
        Scanner consoleScanner = new Scanner(System.in);
        System.out.print("Enter a directory: ");
        String directory = consoleScanner.nextLine();

        //convert path to File object
        File dirFile = new File(directory);
        if (dirFile.exists())
        {
            //loop over all of the contents
            File[] contents = dirFile.listFiles();
            for (int i = 0; i < contents.length; i++)
            {
                if (contents[i].isDirectory())
                {
                    //print out the subdirectory files
                    File[] subDirContents = contents[i].listFiles();
                    if (subDirContents != null)
                    {
                        for (int j = 0; j < subDirContents.length; j++)
                        {
                            if (subDirContents[j].isFile())
                            {
                                System.out.println(
                                        subDirContents[j].getAbsolutePath());
                            }
                        }
                    }
                }
            }
        }
    }
}
