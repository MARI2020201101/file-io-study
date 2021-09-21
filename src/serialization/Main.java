package serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        UserInfo user = new UserInfo("gison", "1234",32);
        UserInfo user2 = new UserInfo("gisu", "12345678",29);
        UserInfo user3 = new UserInfo("bugug", "1ere8",35);

        List<UserInfo> arr = new ArrayList<>();
        arr.add(user);
        arr.add(user2);
        arr.add(user3);

        String fileName = "userInfo.ser";
        FileOutputStream fos = new FileOutputStream(fileName);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream out = new ObjectOutputStream(bos);

        out.writeObject(arr);
        out.close();
        System.out.println("end serialization");

        FileInputStream fis = new FileInputStream(fileName);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream in = new ObjectInputStream(bis);

        ArrayList<UserInfo> arr2 = (ArrayList<UserInfo>) in.readObject();
        System.out.println(arr2);


    }
}
