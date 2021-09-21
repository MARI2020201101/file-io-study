package network;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;

public class NioSample {
    public static void main(String[] args) {
        NioSample sample = new NioSample();
        sample.simpleWriteAndRead();
    }

    private void simpleWriteAndRead() {
        String fileName = "C:\\study\\file-io-study\\nio.txt";
        writeFile(fileName, "My first NIO sample");
        readFile(fileName);

    }

    private void writeFile(String fileName, String str) {
        try (FileChannel channel = new FileOutputStream(fileName).getChannel()) {//채널열고
            byte[] data = str.getBytes(StandardCharsets.UTF_8);//데이터를 바이트로 변환(바이트버퍼라서)
            ByteBuffer buffer = ByteBuffer.wrap(data); //버퍼에 담아서
            channel.write(buffer);//쓴다!
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readFile(String fileName) {
        try (FileChannel channel = new FileInputStream(fileName).getChannel()){//채널열고

            /**
             * FileChannel channel1 = FileChannel.open(fileName, StandardOpenOption.READ);
             * 이런식으로도 채널 부를 수 있음.
             * nio는 채널 + 버퍼기반 방식
              */


            ByteBuffer buffer = ByteBuffer.allocate(1024);//버퍼사이즈 정하고
            channel.read(buffer);//버퍼만큼 담아서 읽는다
            buffer.flip(); //버퍼의 포지션을 앞으로 당긴다. 쓰고나서 - 첨부터 읽기위해 버퍼의 포지션을 변경
            while(buffer.hasRemaining()){//버퍼에 데이터 담겨있어??
                System.out.print((char)buffer.get()); //보여줘!
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
