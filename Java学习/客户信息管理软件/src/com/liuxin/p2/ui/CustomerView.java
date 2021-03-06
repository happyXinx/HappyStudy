package com.liuxin.p2.ui;

import com.liuxin.p2.bean.Customer;
import com.liuxin.p2.service.CustomerList;
import com.liuxin.p2.uitl.CMUtility;

/*
主模块，负责显示

 */
public class CustomerView {
    private CustomerList customers =new CustomerList(10);

    public CustomerView(){
        Customer cust=new Customer("张三", '男', 30, "010-56253825", "abc@email.com");
        this.customers.addCustomer(cust);
    }

    public void enterMainMenu(){

        boolean loopFlag=true;
        do {
            System.out.println("\n-----------------客户信息管理软件-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退       出\n");
            System.out.print("                   请选择(1-5)：");
            char key= CMUtility.readMenuSelection();
            System.out.println();
            switch (key){
                case '1':
                    this.addNewCustomer();
                    break;
                case '2':
                    this.modifyCustomer();
                    break;

                case '3':
                    this.deleteCustomer();
                    break;

                case '4':
                    this.listAllCustomers();
                    break;

                case '5':
                    System.out.println("确认是否退出（Y/N）：");
                    char yn=CMUtility.readConfirmSelection();
                    if(yn=='Y'){
                        loopFlag=false;
                    }
            }
        }while (loopFlag);

    }

    private void addNewCustomer(){
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(4);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(15);
        System.out.print("邮箱：");
        String email = CMUtility.readString(15);
        Customer cust = new Customer(name, gender, age, phone, email);
        boolean flag = this.customers.addCustomer(cust);
        if (flag) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("----------------记录已满,无法添加-----------------");
        }
    }

    private void modifyCustomer(){
        System.out.println("---------------------修改客户---------------------");
        Customer cust = null;

        while(true) {
            System.out.print("请选择待修改客户编号(-1退出)：");
            int index = CMUtility.readInt();
            if (index == -1) {
                return;
            }

            cust = this.customers.getCustomer(index - 1);
            if (cust != null) {
                System.out.print("姓名(" + cust.getName() + ")：");
                String name = CMUtility.readString(4, cust.getName());
                System.out.print("性别(" + cust.getGender() + ")：");
                char gender = CMUtility.readChar(cust.getGender());
                System.out.print("年龄(" + cust.getAge() + ")：");
                int age = CMUtility.readInt(cust.getAge());
                System.out.print("电话(" + cust.getPhone() + ")：");
                String phone = CMUtility.readString(15, cust.getPhone());
                System.out.print("邮箱(" + cust.getEmail() + ")：");
                String email = CMUtility.readString(15, cust.getEmail());
                cust = new Customer(name, gender, age, phone, email);
                boolean flag = this.customers.replaceCustomer(index - 1, cust);
                if (flag) {
                    System.out.println("---------------------修改完成---------------------");
                } else {
                    System.out.println("----------无法找到指定客户,修改失败--------------");
                }

                return;
            }

            System.out.println("无法找到指定客户！");
        }

    }

    private void deleteCustomer(){
        System.out.println("---------------------删除客户---------------------");
        Customer cust = null;

        while(true) {
            System.out.print("请选择待删除客户编号(-1退出)：");
            int index = CMUtility.readInt();
            if (index == -1) {
                return;
            }

            cust = this.customers.getCustomer(index - 1);
            if (cust != null) {
                System.out.print("确认是否删除(Y/N)：");
                char yn = CMUtility.readConfirmSelection();
                if (yn == 'N') {
                    return;
                }

                boolean flag = this.customers.deleteCustomer(index - 1);
                if (flag) {
                    System.out.println("---------------------删除完成---------------------");
                } else {
                    System.out.println("----------无法找到指定客户,删除失败--------------");
                }

                return;
            }

            System.out.println("无法找到指定客户！");
        }
    }

    private void listAllCustomers(){
        System.out.println("---------------------------客户列表---------------------------");
        Customer[] custs = this.customers.getAllCustomers();
        if (custs.length == 0) {
            System.out.println("没有客户记录！");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t邮箱");

            for(int i = 0; i < custs.length; ++i) {
                System.out.println(i + 1 + "\t" + custs[i].getDetails());
            }
        }

        System.out.println("-------------------------客户列表完成-------------------------");
    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }

}
