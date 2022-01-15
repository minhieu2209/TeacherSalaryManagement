package controller;

import model.Subject;
import model.Teacher;
import model.TeachingManagement;

import java.util.Scanner;

public class Controller {
    public static int numSubject;
    public static int numTeacher;
    private Subject[] s;
    private Teacher[] t;
    private TeachingManagement[] tm = new TeachingManagement[numTeacher];
    Scanner in = new Scanner(System.in);

    public void addLTeacher() {
        t = new Teacher[numTeacher];
        for (int i = 0; i < numTeacher; i++) {
            Teacher newteacher = new Teacher();
            newteacher.addTeacher();
            this.t[i] = newteacher;
        }
    }

    public void addLSubject() {
        s = new Subject[numSubject];
        for (int i = 0; i < numSubject; i++) {
            Subject newsubject = new Subject();
            newsubject.addSubject();
            this.s[i] = newsubject;
        }
    }

    public void inLTeacher() {
        for (int i = 0; i < numTeacher; i++) {
            t[i].inTeacher();
        }
    }

    public void inLSubject() {
        for (int i = 0; i < numSubject; i++) {
            s[i].inSubject();
        }
    }

    public void manageTeaching() {

        for (int i = 0; i < numTeacher; i++) {
            System.out.println("Giảng viên: ");
            t[i].inTeacher();
            tm[i].setTeachers(t[i]);
            System.out.print("Nhập số môn học của giảng viên:");
            int c = in.nextInt();
            Subject subject[] = new Subject[c];
            for (int j = 0; j < c; j++) {
                System.out.print("Nhập mã môn học: ");
                int b = in.nextInt();
                for (int k = 0; k < numSubject; k++) {
                    if (b == s[i].getItS())
                        subject[j] = s[i];
                }
            }
        }
        System.out.println("Nhập tổng số lớp: ");
    }
    public void add(TeachingManagement[] tm){
        for(int i = 0; i < tm.length; i++){

        }
    }
}