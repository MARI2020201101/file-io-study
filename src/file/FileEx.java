package file;

import java.util.Enumeration;
import java.util.Properties;

public class FileEx {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.class.path"));

        Properties prop = System.getProperties();
        Enumeration e = prop.propertyNames();
        while( e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
