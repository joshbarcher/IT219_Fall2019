package file_class;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Practice
{
    public static void main(String[] args)
    {
        //loop over the contents of a file or folder
        File directory = new File(
            "/Users/josharcher/documents/video lectures");
        File[] contents = directory.listFiles();
        for (int i = 0; i < contents.length; i++)
        {
            File content = contents[i];
            if (content.isFile())
            {
                System.out.println("File: " + content.getAbsolutePath());
            }
            else if (content.isDirectory())
            {
                System.out.println("Directory: " + content.getAbsolutePath());
            }
        }

        //move "files/output.txt" to files/output/output.txt
        File newDirectory = new File("files/output");
        newDirectory.mkdir();

        File from = new File("files/output.txt");
        File to = new File("files/output/output.txt");

        from.renameTo(to);

        //write to a file called output.txt
        try
        {
            ensureFileExists("files/output/output.txt");

            //send a message out to the file that we just created
            PrintWriter writer = new PrintWriter(
                    new FileOutputStream("files/output/output.txt"));

            writer.println("Hello, file!");
            writer.close();
        }
        catch (IOException e)
        {
            System.out.println("Error creating new file: " + e.getMessage());
        }
    }

    public static void ensureFileExists(String path) throws IOException
    {
        File file = new File(path);
        if (!file.exists())
        {
            file.createNewFile();
        }
    }
}
