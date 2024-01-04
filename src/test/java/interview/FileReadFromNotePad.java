package interview;

import java.io.*;
import java.util.Scanner;

public class FileReadFromNotePad {
    public static void main(String[] args) throws IOException {
        //Approach-1

        FileReader fr= new FileReader("E:\\21-22\\SampleFileTest\\Sample.txt");
        BufferedReader br= new BufferedReader(fr);
        String str;
        while (( str=br.readLine() )!=null){
            System.out.println(str);

        }

        File file = new File("E:\\21-22\\SampleFileTest\\Sample.txt");
        Scanner sc= new Scanner(file);
        while (sc.hasNext()){

        String s=    sc.nextLine();
            System.out.println(s);
            System.out.println("Sample print here");

        }

    }
}
