package io;

import java.io.File;
import java.io.FilenameFilter;

public class PNGFileNameFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        if(name.toLowerCase().endsWith(".png")){
            return true;
        }
        return false;
    }

}
