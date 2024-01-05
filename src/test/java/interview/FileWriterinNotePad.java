package interview;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterinNotePad {
    public static void main(String[] args) throws IOException {

        FileWriter fw= new FileWriter("E:\\21-22\\SampleFileTest\\Sample1.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("new line \n");
        bw.write("Another new line");
        bw.close();

    }
}
