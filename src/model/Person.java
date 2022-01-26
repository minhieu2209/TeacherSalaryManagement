package model;

public class Person {
    private String fullName;
    private String address;
    private String phoneNum;

    public Person(String fullName, String address, String phoneNum) {
        this.fullName = fullName;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public Person() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
