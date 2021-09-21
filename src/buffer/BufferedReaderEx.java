package buffer;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("C:\\study\\file-io-study\\src\\buffer\\BufferedReaderEx.java");
            BufferedReader br = new BufferedReader(fr);

            String line ="";
            for(int i=1;(line=br.readLine())!=null;i++){
                if(line.indexOf(";")!=-1){
                    System.out.println(i + ": "+line);
                }
            }
            br.close();
        }catch (Exception e){}
    }
}
