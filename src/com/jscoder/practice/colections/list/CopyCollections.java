package com.jscoder.practice.colections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class CopyCollections {
    static Logger logger = Logger.getLogger("MyLog");
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("esta ");
        list.add("es");
        list.add("jodido");
        for (String s : list) {
            logger.info(s);

        }
        List<String> listaaCopiar = new ArrayList<>();
        listaaCopiar.add("ape");
        listaaCopiar.add("ape");
        listaaCopiar.add("ape");



        for (String s : listaaCopiar) {

            logger.info(s);

        }


        Collections.copy(list, listaaCopiar);


        for (String s : list) {
            logger.info(s);
        }




    }
}
