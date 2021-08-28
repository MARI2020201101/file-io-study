package network;

import java.nio.IntBuffer;

public class NioDetailSample {
    public static void main(String[] args) {
        NioDetailSample sample = new NioDetailSample();
    //    sample.checkBuffer();
        sample.checkBufferStatus();

    }

    private void checkBuffer() {
        IntBuffer buffer = IntBuffer.allocate(1024);
        for(int i =0 ; i<100 ; i++){
            buffer.put(i);
        }
        System.out.println(buffer.capacity());
        System.out.println(buffer.limit());
        System.out.println(buffer.position());
        buffer.flip();
        System.out.println("--------------fliped------------");
        System.out.println(buffer.limit());
        System.out.println(buffer.position());
    }

    private void printBufferStatus(String job, IntBuffer buffer){
        System.out.println("buffer job : "+job);
        System.out.format("Buffer position : %d  remaining : %d  limit : %d \n"
        , buffer.position() , buffer.remaining() , buffer.limit());
    }

    private void checkBufferStatus(){
        IntBuffer buffer = IntBuffer.allocate(1024);
        buffer.get();
        printBufferStatus("get",buffer);
        buffer.mark();
        printBufferStatus("mark", buffer);
        buffer.get();
        printBufferStatus("get",buffer);
        buffer.reset();
        printBufferStatus("reset", buffer);
        buffer.rewind();
        printBufferStatus("rewind", buffer);
        buffer.clear();
        printBufferStatus("clear", buffer);
    }
}
