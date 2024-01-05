package fileHandling;

import java.io.*;

public class CSVFILEReader {
    public static void main(String[] args) throws IOException {
        File file = new File(System.getProperty("user.dir")+"\\data\\sample.csv");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line=br.readLine())!=null){

          //  System.out.println(line+  "\t");

            String [] data= line.split(",");

            for (String value:data
                 ) {
                System.out.println(value+ "\t");

            }
            System.out.println();


        }

    }
}
