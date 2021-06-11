package com.liuxin.extendsExer;

//信用卡类
public class CheckAccount extends Account{

    private double overdraft; //可透支限额

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft){
        super(id, balance, annualInterestRate);
        this.overdraft=overdraft;

    }

    @Override
    public void withdraw(double amount) {
        if(getBalance()>amount){
            super.withdraw(amount);
        }else if(overdraft>=amount-getBalance()){ //透支额度
            overdraft-=(amount-getBalance());
            setBalance(0);
        }else {
            System.out.println("超过可透支限额");
        }
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}
