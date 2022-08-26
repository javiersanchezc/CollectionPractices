package com.jscoder.practice.colections.practice;


import java.util.LinkedHashSet;
import java.util.logging.Logger;


public class MatrixQQSet {
    static Logger logger = Logger.getLogger("MyLog");
    public static void main(String[] args) {
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedHashSet<String> al1 = new LinkedHashSet<>();
        for(int i=0;i<strs.length;i++)
        {
            al1.add(strs[i]);
        }

        for (String s : al1) {
            logger.info(s);
        }

    }
}
