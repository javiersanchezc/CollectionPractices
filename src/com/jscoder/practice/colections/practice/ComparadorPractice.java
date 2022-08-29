package com.jscoder.practice.colections.practice;

import java.util.Comparator;

public class ComparadorPractice implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        if(s1.getScore()>s2.getScore())
            return 1;
        else if(s1.getScore()<s2.getScore())
            return -1;
        else
        {
            if(s1.getAge()>s2.getAge())
                return 1;
            if(s1.getAge()<s2.getAge())
                return -1;
            return s1.getName().compareTo(s2.getName());
        }
    }

}
