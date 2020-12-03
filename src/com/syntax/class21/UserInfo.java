package com.syntax.class21;

public class UserInfo extends UserClass{
    public String address;
    UserInfo(String name, String mobileNumber, String address){
        super(name, mobileNumber);
        this.address = address;
    }

    public void printDetails(){
        System.out.println(super.getName() + super.getMobileNumber() + address);
    }

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("Sonya", "98876877657576", "Rostov-on-Don");
        userInfo.printDetails();

        UserInfo userInfo1 = new UserInfo("Mike", "988768576", "Rostov-on-Don1");
    }



}
