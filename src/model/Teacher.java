package model;

import java.util.Scanner;

public class Teacher extends Person {
    private static int sidT = 100;
    private int idT;
    private static final String GSTS = "GS-TS";
    private static final String PGSTS = "PGS-TS";
    private static final String GV = "Giảng viên chính";
    private static final String ThS = "Thạc sỹ";


    private String level;

    public Teacher() {
        super();
        this.idT = sidT++;
    }

    public Teacher(int idT, String fullName, String address, String phoneNum, String level) {
        super(fullName, address, phoneNum);
        this.idT = idT;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void addTeacher() {
        Scanner in = new Scanner(System.in);
        int c = 0;
        System.out.print("Nhập tên giáo viên: ");
        this.setFullName(in.nextLine());
        System.out.print("Nhập địa chỉ: ");
        this.setAddress(in.nextLine());
        System.out.print("Nhâp số điện thoại: ");
        this.setPhoneNum(in.nextLine());
        do{
            System.out.println("Nhập trình độ: ");
            System.out.println("1. GS-TS");
            System.out.println("2. PGS-TS");
            System.out.println("3. Giảng viên chính");
            System.out.println("4. Thạc sỹ");
            c = in.nextInt();
            if(c == 1) this.level = GSTS;
            if(c == 2) this.level = PGSTS;
            if(c == 3) this.level = GV;
            if(c == 4) this.level = ThS;
        }while(c < 1 || c > 4);
    }

    public void inTeacher() {
        System.out.println("--------------------------------------------------------------");
        System.out.println(this.getIdT() + "|" + this.getFullName() + "|" + this.getAddress()
                + "|" + this.getPhoneNum() + "|" + this.level);
    }
}
