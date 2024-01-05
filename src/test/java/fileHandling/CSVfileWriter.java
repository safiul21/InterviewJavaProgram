package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVfileWriter {
    public static void main(String[] args) throws IOException {
        String filePath= System.getProperty("user.dir")+"\\data\\sample.csv";
        File file= new File(filePath);
        FileWriter fw= new FileWriter(file);
        fw.append("Name, Age, City \n");
        fw.append("Safiul, 32, Kolkata \n");
        fw.append("Imaad, 1, Delhi \n");
        fw.append("Reshma, 30, Mumbai \n");

        System.out.println("File has created:" +filePath);
        fw.close();

    }

}
