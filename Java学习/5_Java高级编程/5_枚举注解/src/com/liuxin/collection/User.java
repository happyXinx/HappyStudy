package com.liuxin.collection;

import java.util.Objects;

public class User implements Comparable{

    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("user equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    //按照姓名从小到大排序
    @Override
    public int compareTo(Object o) {
        if (o instanceof User){
            User user = (User)o;
            int compare =  this.name.compareTo(user.name);
            return compare;
//            if (compare != 0){
//                return compare;
//            }else {
//                return Integer.compare(this.age, user.age);
//            }
        }else {
            throw new RuntimeException("输入的类型不匹配");
        }
    }

}
