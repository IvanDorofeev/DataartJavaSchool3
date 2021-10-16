package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        //Task implementation
        int k=1;
        int sum1=0,sum2=0;
        for(Integer i: firstNumber){
            sum1+=i*k;
            k*=10;
        }
        k=1;
        for(Integer i: secondNumber){
            sum2+=i*k;
            k*=10;
        }
        return sum1+sum2;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        // Task implementation
        List<T> listreturn = new ArrayList<T>();
        for(int i=0;i<list.size();i+=2){
            listreturn.add(list.get(i));
        }
        return listreturn;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        // Task implementation
        List<T> list1=new ArrayList<T>();
        list1.add(list.get(0));
        list1.add(list.get(list.size()-1));
        return list1;
    }
}
