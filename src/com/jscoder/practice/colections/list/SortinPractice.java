package com.jscoder.practice.colections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class SortinPractice {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLog");
        List<String> list = new ArrayList<>();
        list.add("javier");
        list.add("calderon");
        Collections.addAll(list,"antonio","sanchez ");
        logger.info("Starting");

        Collections.sort(list);
        for (String lista:list
             ) {
            logger.info(lista);
        }
        Collections.sort(list,Collections.reverseOrder());

        logger.info("reverso");
        for (String listarteversal :list
             ) {
             logger.info(listarteversal);
        }
    }
}
