package io;

import java.io.File;
import java.io.FileFilter;

public class JPGFileFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.isFile()){
            if(pathname.getName().toLowerCase().endsWith(".jpg")){
                return true;
            }
        }
        return false;
    }
}
