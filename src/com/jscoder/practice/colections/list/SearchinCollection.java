package com.jscoder.practice.colections.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;


public class SearchinCollection {
    static Logger logger = Logger.getLogger("MyLog");
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("Shoes");
        items.add("Toys");
        items.add("Horse");
        items.add("Ball");
        items.add("Grapes");
        Collections.sort(items);

        for (String item : items) {
           logger.info(item );
        }

    }
}
