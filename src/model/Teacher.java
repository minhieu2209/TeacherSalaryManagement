package model;

import java.util.Scanner;

public class Teacher {
    private static int sidT = 100;
    private int idT;
    private String fullName;
    private String address;
    private String phoneNum;
    private String level;

    public Teacher() {
        this.idT = sidT++;
    }

    public Teacher(int idT, String fullName, String address, String phoneNum, String level) {
        this.idT = idT;
        this.fullName = fullName;
        this.address = address;
        this.phoneNum = phoneNum;
        this.level = level;
    }

    public static int getSidT() {
        return sidT;
    }

    public static void setSidT(int sidT) {
        Teacher.sidT = sidT;
    }

    public int getIdT() {
        return idT;
    }

    public void setIdT(int idT) {
        this.idT = idT;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    public void addTeacher(){
        Scanner in = new Scanner(System.in);
        String[] s = {"GS-TS", "PGS-TS", "Giảng viên chính", "Thạc sỹ"};
        int c = 0;
        System.out.print("Nhập tên giáo viên: ");
        this.fullName = in.nextLine();
        System.out.print("Nhập địa chỉ: ");
        this.address = in.nextLine();
        System.out.print("Nhâp số điện thoại: ");
        this.phoneNum = in.nextLine();
        System.out.println("Nhập trình độ: ");
        System.out.println("1. GS-TS");
        System.out.println("2. PGS-TS");
        System.out.println("3. Giảng viên chính");
        System.out.println("4. Thạc sỹ");
        c = in.nextInt();
        if(c == 1) this.level = "GS-TS";
        if(c == 2) this.level = "PGS-TS";
        if(c == 3) this.level = "Giảng viên chính";
        if(c == 4) this.level = "Thạc sỹ";
        if(c != 1 && c != 2 && c!= 3 && c != 4) System.err.println("mời nhập lại");
    }
    public void inTeacher(){
        System.out.println("--------------------------------------------------------------");
        System.out.println(this.getIdT() + "|" + this.fullName + "|" + this.address
                + "|" + this.phoneNum + "|" + this.level);
    }
}
