package partB.file;

import java.io.*;

public class FileOperation {
    public static void main(String[] args) {
        try {
            // Creating a new file
            File file1 = new File("file1.txt");
//            file1.createNewFile();

            FileWriter fileWriters = new FileWriter(file1, true);
            fileWriters.write("This is old content\n");
            fileWriters.close();

            // Copying the contents of file1 to file2
            File file2 = new File("file2.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file1));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();

            // Appending data to file1
            FileWriter fileWriter = new FileWriter(file1, true);
            fileWriter.write("This is new content");
            fileWriter.close();

            // Printing the contents of file1
            BufferedReader fileReader = new BufferedReader(new FileReader(file1));
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();

//             Deleting file1 and file2
            file1.delete();
            file2.delete();
        } catch (IOException e) {
            System.out.println("An error occurred." + e);
//            e.printStackTrace();


        }
    }
}
