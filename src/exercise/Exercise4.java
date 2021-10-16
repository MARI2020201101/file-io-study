package exercise;

import java.io.*;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        if(args.length==0){
            System.exit(0);
        }
        String mergeFile = args[0];


        for (int i =1;i<args.length;i++) {
            File fileName= new File(args[i]);
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            BufferedWriter bw = new BufferedWriter(new FileWriter(mergeFile,true));
            String line;
            while((line=br.readLine())!=null){
                bw.write(line);
            }
        }
        BufferedReader br = new BufferedReader(new FileReader(mergeFile));
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(br);
    }
}
