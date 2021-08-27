package io.object;

import java.io.*;

public class ObjectManager {
    public static void main(String[] args) {
        ObjectManager manager = new ObjectManager();
        String fullPath="C:\\study\\file-io-study\\serial.obj";
        SerialDTO dto = new SerialDTO("자바의 신",1,false,100L);
   //     manager.saveObject(fullPath, dto);
        manager.loadObject(fullPath);

    }

    private void saveObject(String fullPath, SerialDTO dto) {
        try(FileOutputStream fos = new FileOutputStream(fullPath);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(dto);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void loadObject(String fullPath){
        try(FileInputStream fis = new FileInputStream(fullPath);
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            SerialDTO dto = (SerialDTO) ois.readObject();
            System.out.println(dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
