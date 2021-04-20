package com.internalpositioning.find3.find3app;

import java.util.regex.*;

public class MACUtility {

    public static boolean isMacAddress(String addr){
        String regEx = "^([0-9A-Fa-f]{2}[:-])"
                + "{5}([0-9A-Fa-f]{2})|"
                + "([0-9a-fA-F]{4}\\."
                + "[0-9a-fA-F]{4}\\."
                + "[0-9a-fA-F]{4})$";

        Pattern p = Pattern.compile(regEx);

        if(addr == null){
            return false;
        }

        Matcher m = p.matcher(addr);

        return m.matches();
    }

}
