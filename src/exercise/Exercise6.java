package exercise;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {
    static String[] argAr;
    static File curDir;

    static {
        try {
            curDir = new File(System.getProperty("user.dir"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner s= new Scanner(System.in);
        while(true){
            String prompt = curDir.getCanonicalPath() + ">>";
            System.out.println(prompt);

            String input = s.nextLine();
            input = input.trim();
            argAr = input.split(" +");
            String command = argAr[0].trim();
            if("".equals(command)) continue;
            command = command.toLowerCase();

            if(command.equals("q")){
                System.exit(0);
            }else if(command.equals("cd")){
                cd();
            }else{
                for (int i = 0; i < argAr.length; i++) {
                    System.out.println(argAr[i]);
                }
            }
        }
    }

    private static void cd() throws IOException {
        if(argAr.length==1){
            System.out.println(curDir);
            System.exit(0);
        }else if(argAr.length>2){
            System.exit(0);
        }
        String subDir = argAr[1];
    if(subDir.equals("..")){
        File dir = new File(subDir);
        curDir = dir.getParentFile();
    }else if(subDir.equals(".")) System.out.println(curDir.getCanonicalPath());
    else{
        File dir = new File(subDir);
        curDir= dir.getCanonicalFile();
    }
    }
}
