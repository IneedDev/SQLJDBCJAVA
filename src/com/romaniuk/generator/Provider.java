package com.romaniuk.generator;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Provider {
    boolean gotNumber = false;
    int theNumber;
    Map<Integer, StringBuffer> myMap = new ConcurrentHashMap<Integer, StringBuffer>();
    Set<String> mySet = new HashSet<>();

    public Set<String> getMySet() {
        return mySet;
    }

    public boolean isGotNumber() {
        return gotNumber;
    }

    public int getTheNumber() {
        return theNumber;
    }

    public Map<Integer, StringBuffer> getMyMap() {
        return myMap;
    }

    public void fillMySet(){

        int tableSize = 10000000;
        while (mySet.size()!=tableSize){
            StringBuffer stringBuffer = new StringBuffer();
            String year = Gen.pierwsze();
            String month = Gen.drugie();
            String day = Gen.trzecie();
            String number = Gen.czwarte();
            year = year.substring(2);
            String input = year + month + day + number;
            String str = Gen.kontrolna(input);
            String sbToString = stringBuffer.append(year)
                    .append(month)
                    .append(day)
                    .append(number)
                    .append(str).toString();
            mySet.add(sbToString);
//            myMap.put(i,stringBuffer.append(year)
//                    .append(month)
//                    .append(day)
//                    .append(number)
//                    .append(str));
        }
    }

}