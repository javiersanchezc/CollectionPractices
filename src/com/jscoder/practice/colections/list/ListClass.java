package com.jscoder.practice.colections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;



class ListClass {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLog");

        List<String> items = new ArrayList<>();

        items.add("hello    world");
        items.add("hello javier");
        Collections.addAll(items, "1234" ,"56789","javier"  );
        for (int i = 0; i < items.size(); i++) {
            logger.info(items.get(i));

        }







    }
}
