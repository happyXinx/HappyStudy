package com.liuxin.java;

public class StudentTest {

    public static void main(String[] args) {
        Student[] stus=new Student[20];
        for(int i=0; i<stus.length; i++){
            stus[i]=new Student();
            stus[i].number=i+1;
            stus[i].state=(int)(Math.random()*4+1);
            stus[i].score=(int)(Math.random()*101);
        }
        for(int i=0; i<stus.length; i++){
            System.out.println(stus[i].info());
        }
        System.out.println("************************");
        //使用冒泡排序按学生成绩排序，并遍历所有学生信息
        for(int i=0; i<stus.length-1; i++){
            for(int j=0; j<stus.length-1-i; j++){
                if(stus[j].score>stus[j+1].score){
                    Student temp=stus[j];
                    stus[j]=stus[j+1];
                    stus[j+1]=temp;
                }
            }
        }
        for(int i=0; i<stus.length; i++){
            System.out.println(stus[i].info());
        }
    }

}

class Student{
    int number;
    int state;
    int score;

    public String info(){
        return "学号："+this.number+"，年级："+this.state+",分数："+this.score;
    }
}
