package model;

import java.util.Scanner;

public class Subject {
    private int sitS = 100;
    private int itS;
    private String subjectName;
    private int totalLesson;
    private int theoryLesson;
    private double price;

    public Subject() {
        this.itS = sitS++;
    }

    public Subject(int sitS, int itS, String subjectName, int totalLesson, int theoryLesson, double price) {
        this.sitS = sitS;
        this.itS = itS;
        this.subjectName = subjectName;
        this.totalLesson = totalLesson;
        this.theoryLesson = theoryLesson;
        this.price = price;
    }

    public int getSitS() {
        return sitS;
    }

    public void setSitS(int sitS) {
        this.sitS = sitS++;
    }

    public int getItS() {
        return itS;
    }

    public void setItS(int itS) {
        this.itS = itS;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getTotalLesson() {
        return totalLesson;
    }

    public void setTotalLesson(int totalLesson) {
        this.totalLesson = totalLesson;
    }

    public int getTheoryLesson() {
        return theoryLesson;
    }

    public void setTheoryLesson(int theoryLesson) {
        this.theoryLesson = theoryLesson;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void addSubject(){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập tên môn học: ");
        this.subjectName = in.nextLine();
        System.out.print("Nhập tổng số tiết học: ");
        this.totalLesson = in.nextInt();
        System.out.print("Nhâp số tiết lý thuyết: ");
        this.theoryLesson = in.nextInt();
        System.out.print("Nhập mức kinh phí(cho 1 tiết lý thuyết): ");
        this.price = in.nextInt();
    }
    public void inSubject(){
        System.out.println("--------------------------------------------------------------");
        System.out.println(this.getItS() + "|" + this.subjectName + "|" + this.totalLesson
                + "|" + this.theoryLesson + "|" + this.price);
    }
}
