package prog11;
import java.util.*;
import java.io.File;
public class FileP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Give File: ");
        String fname = in.next();
        File f1 = new File(fname);
        System.out.println("File Name: " + f1.getName());
        f1.setWritable(false);
        System.out.println(f1.exists()? "File exists": "File does not exit");
        System.out.println(f1.canWrite()? "File is writable" : "File is not writeable");
        System.out.println(f1.canRead() ? "File is readable": "File is not readable");

        String fileName = f1.toString();
        int index = fileName.lastIndexOf('.');

        if(index > 0){
            String type = fileName.substring(index + 1);
            System.out.println("File type is " + type);
        }
        else {
            System.out.println("File does't have type");
        }
        System.out.println("File size: " + f1.length() + "Bytes");
    }

}
