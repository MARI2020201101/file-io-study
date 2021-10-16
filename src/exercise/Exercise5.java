package exercise;

import java.io.*;

public class Exercise5 {
    public static void main(String[] args) throws IOException {

        if(args.length!=2){
            System.exit(0);
        }
        String inputFile = args[0];
        String outputFile = args[1];

        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        HtmlTagFilterWriter bw = new HtmlTagFilterWriter(new FileWriter(outputFile));
        int ch =0;

        while((ch=br.read())!=-1){
            bw.write(ch);
        }
        br.close();
        bw.close();
    }
    static class HtmlTagFilterWriter extends FilterWriter{

        StringWriter tmp = new StringWriter();
        boolean inTag = false;

        public void write(int c) throws IOException{
            if(c=='<'){
                inTag=true;
            }else if(c=='>'){
                inTag=false;
                tmp = new StringWriter();
            }
            if(inTag){
                tmp.write(c);
            }else{
                this.write(c);
            }
        }

        @Override
        public void close() throws IOException {
            this.write(tmp.toString());
            super.close();
        }

        protected HtmlTagFilterWriter(Writer out) {
            super(out);
        }

    }
}
