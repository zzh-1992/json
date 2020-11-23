package com.grapefruit.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.grapefruit.demo.entity.Stu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JSONArray01 {

    public static void main(String[] args) {

        List<Stu> list = new ArrayList<>();
        Stu s1 = new Stu(1,"ZZZ","GZ",12,"13632222323",false);
        Stu s2 = new Stu(2,"GGG","BJ",23,"13632222325",true);
        Stu s3 = new Stu(3,"HHH","SZ",33,"13632222328",false);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        // 把集合转对象
        String jsonString = JSON.toJSONString(list);

        // 把json字符串解析为java对象
        List<Stu> stuList = JSONArray.parseArray(jsonString, Stu.class);
        List<Map> StuMap = JSONArray.parseArray(jsonString, Map.class);

        // 测试集合是否包含男生
        boolean b = stuList.stream().anyMatch(Stu::isBoy);

        // 获取男生集合
        List<Stu> boyList = stuList.stream().filter(Stu::isBoy).collect(Collectors.toList());

        // 获取女生集合
        List<Stu> girlList = stuList.stream().filter(Stu::isGirl).collect(Collectors.toList());

        System.out.println("=====");
    }
}
