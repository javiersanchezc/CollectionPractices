package com.jscoder.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class StreamPracticeSplit {
    static Logger logger = Logger.getLogger("MyLog");
    public static void main(String[] args) {

        List<String> lines = new ArrayList<>();
        String line = "javier,antonio,sanchez,calderon,esta,jugando,con,arreglos";
        lines.addAll(Arrays.asList(line.split(",")));
        lines.forEach(data -> logger.info(data));


    }


}
