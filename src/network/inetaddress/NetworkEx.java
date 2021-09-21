package network.inetaddress;

import java.net.InetAddress;
import java.util.Arrays;

public class NetworkEx {
    public static void main(String[] args) {
        InetAddress ip =null;
        InetAddress[] ipArr = null;

        try{
            ip=InetAddress.getByName("www.naver.com");
            System.out.println(ip.getHostName());
            System.out.println(ip.getHostAddress());
            System.out.println(ip.toString());

            byte[] ipByte = ip.getAddress();
            System.out.println(Arrays.toString(ipByte));

            String result = "";
            for(int i=0;i<ipByte.length;i++){
                result+= ipByte[i]<0?ipByte[i]+256 : ipByte[i];
                result += ".";
            }
            System.out.println("-----");
            System.out.println(result);

            ipArr = InetAddress.getAllByName("www.naver.com");
            for(int i =0; i< ipArr.length;i++){
                System.out.println(ipArr[i]);
            }

        }catch (Exception e){}

    }
}
