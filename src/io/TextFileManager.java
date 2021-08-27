package io;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TextFileManager {
    public static void main(String[] args) {
        TextFileManager manager = new TextFileManager();
        int numberCount = 10;
        String fullpath = "C:\\study\\file-io-study\\sample2.txt";
    //    manager.writeFile(fullpath, numberCount);
     //   manager.readFile(fullpath);
        manager.readFileWithScanner(fullpath);
    }

    private void writeFile(String fullpath, int numberCount) {
        try (FileWriter writer = new FileWriter(fullpath , StandardCharsets.UTF_8, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            for(int i = 0; i<numberCount ; i++){
                bufferedWriter.write(String.valueOf(i));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void readFile(String fileName){
        try (FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader)){
            String data;
            while((data=bufferedReader.readLine())!=null){
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void readFileWithScanner(String fileName){
        File file = new File(fileName);
        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
