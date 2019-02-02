package com.zkyyo.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zkyyo
 * @create 2018-06-14 6:43 PM
 **/
public class Father {
    class Data {
        List<String> stringList;
        List<Father> fathers;
    }

    public Data func1() {
        Data data = new Data();
        data.stringList = new ArrayList<>();
        data.fathers = new ArrayList<>();
        return data;
    }
}
