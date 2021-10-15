package exercise;

import javax.print.attribute.standard.PrinterState;
import java.io.*;
import java.nio.charset.Charset;

public class Exercise2 {
    public static void main(String[] args) throws Exception {

    String inputFile = args[0];

    FileInputStream fis = new FileInputStream(inputFile);
    PrintStream ps = new PrintStream(System.out);

    int data =0;
    int i=0;
    while((data=fis.read())!=-1){
        ps.printf("%02X",data);
    }

    ps.close();
    fis.close();
    }
}
