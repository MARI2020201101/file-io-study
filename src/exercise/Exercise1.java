package exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exercise1 {
    public static void main(String[] args) throws Exception {
        int line = Integer.parseInt(args[0]);
        FileReader fr = new FileReader(args[1]);
        BufferedReader br = new BufferedReader(fr);

        String tmp;
        while((tmp=br.readLine())!=null){
            System.out.println(tmp);
        }
    }
}
