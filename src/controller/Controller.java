package controller;

import model.Subject;
import model.Teacher;
import model.TeachingManagement;

import java.util.Scanner;

public class Controller {
    public static int numSubject;
    public static int numTeacher;
    public Subject[] s;
    public Teacher[] t;
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
    public void add(TeachingManagement[] tm){
        for(int i = 0; i < tm.length; i++){

        }
    }
}