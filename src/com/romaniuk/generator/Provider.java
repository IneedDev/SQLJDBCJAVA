package com.romaniuk.generator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Provider {
    boolean gotNumber = false;
    int theNumber;
    Map<Integer, StringBuffer> myMap = new ConcurrentHashMap<Integer, StringBuffer>();

    public boolean isGotNumber() {
        return gotNumber;
    }

    public int getTheNumber() {
        return theNumber;
    }

    public Map<Integer, StringBuffer> getMyMap() {
        return myMap;
    }

    public void fillMyMap(){

        for (int i = 0; i< 100; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            String year = Gen.pierwsze();
            String month = Gen.drugie();
            String day = Gen.trzecie();
            String number = Gen.czwarte();
            year = year.substring(2);
            String input = year + month + day + number;
            String str = Gen.kontrolna(input);
            myMap.put(i,stringBuffer.append(year)
                    .append(month)
                    .append(day)
                    .append(number)
                    .append(str));
        }
    }

}