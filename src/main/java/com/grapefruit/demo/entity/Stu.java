package com.grapefruit.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Stu {
    int id;
    String name;
    String address;
    int age;
    String phone;
    boolean sex;

    public boolean isBoy() {
        return sex == true;
    }

    public boolean isGirl() {
        return sex == false;
    }
}
