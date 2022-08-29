package com.jscoder.practice.colections.practice;



import java.util.TreeSet;
import java.util.logging.Logger;



public class MainClass {
    static Logger logger = Logger.getLogger("MyLog");
    public static void main(String[] args) {

        TreeSet <Student> ts = new TreeSet<>( new ComparadorPractice());
        ts.add(new Student("liusan",20,90.0F));
        ts.add(new Student("lisi",22,90.0F));
        ts.add(new Student("wangwu",20,90.0F));
        ts.add(new Student("sunliu",22,100.0F));

        ts.forEach(cadena -> logger.info(String.valueOf(cadena)));





    }
}
