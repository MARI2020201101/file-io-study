package file;

import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        int[] scores = {1,100,90,90,
                        2,70,90,100,
                        3,50,60,90,
                        4,99,87,89};

        try{
            RandomAccessFile raf = new RandomAccessFile("score.dat","rw");
            for(int i =0;i<scores.length;i++){
                raf.writeInt(scores[i]);
            }
            raf.seek(0);
            while(true){
                System.out.println(raf.readInt());
            }
        }catch (Exception e){}
    }
}
