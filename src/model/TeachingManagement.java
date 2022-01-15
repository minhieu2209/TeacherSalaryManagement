package model;

import controller.Main;

import java.util.Scanner;

public class TeachingManagement {
    private Subject[] subjects = new Subject[100];
    private Teacher teacher;
    private int[] numClass = new int[100];

    public TeachingManagement(Subject[] subjects, Teacher teacher, int[] numClass) {
        this.subjects = subjects;
        this.teacher = teacher;
        this.numClass = numClass;
    }

    public TeachingManagement() {

    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int[] getNumClass() {
        return numClass;
    }

    public void setNumClass(int[] numClass) {
        this.numClass = numClass;
    }

    public Subject searchSubject(Subject[] subjects, int id) {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == null) break;
            if (subjects[i].getItS() == id) {
                return subjects[i];
            }
        }
        return null;
    }

    public int tongSoTietHoc(TeachingManagement tm) {
        int sum = 0;
        for (int i = 0; i < tm.subjects.length; i++) {
            if (tm.subjects[i] == null) break;
            sum += tm.numClass[i] * tm.subjects[i].getTotalLesson();
        }
        return sum;
    }

    public TeachingManagement[] manageTeaching(TeachingManagement[] tm, Teacher[] teachers, Subject[] subjects) {
        System.out.println("Lập bảng kê khai giảng viên");
        for (int i = 0; i < tm.length; i++) {
            tm[i] = new TeachingManagement();
            if (teachers[i] == null) {
                break;
            }
            tm[i].teacher = teachers[i];
            System.out.println("Giảng viên " + teachers[i].getIdT() + ":");
            System.out.println("Các môn giảng dậy của giảng viên " + teachers[i].getIdT() + ":");
            int k = 1;
            d:
            do {
                System.out.println("Nhập mã môn học thứ " + (k) + "(nhập 0 để kết thúc):");
                //int ids;
                do {
                    Scanner in = new Scanner(System.in);
                    int ids = in.nextInt();
                    if (ids == 0) break d;
                    Subject sb = searchSubject(subjects, ids);
                    if (sb != null) {
                        tm[i].subjects[k] = sb;
                        System.out.println("Nhập số lớp của môn học(tối đa 3):");

                        do {
                            int sll = in.nextInt();
                            if (sll > 3) {
                                System.out.println("không được quá 3 lớp, Nhập lại");
                                continue;
                            }
                            if (tm[i].subjects[k].getTotalLesson() * sll + tongSoTietHoc(tm[i]) > 200) {

                                System.out.println("Đã vượt quá 200 tiết học, nhập lại");
                                continue;
                            }
                            tm[i].numClass[k] = sll;
                            System.out.println("Đã có " + tongSoTietHoc(tm[i]) + " tiết học(tối đa 200)");
                            break;
                        } while (true);
                        k++;
                        break;
                    }
                    System.out.println("Nhập sai id môn học, nhập lại");
                } while (true);
            } while (true);
        }
        return tm;
    }

    public void showTM(TeachingManagement[] tm) {
        if (tm[0] == null) {
            System.out.println("Chưa lập bảng kê khai");
            return;
        }
        System.out.println("====Bảng kê khai giảng dậy====");
        for (int i = 0; i < tm.length; i++) {
            if (tm[i].teacher == null) break;
            System.out.println("GIảng viên " + tm[i].teacher.getIdT() + ":" + tm[i].teacher.getFullName() + ":");
            for (int j = 0; j < tm[i].subjects.length; j++) {
                if (tm[i].subjects[j] == null) break;
                System.out.print("\t\t");
                System.out.println("Môn học " + tm[i].subjects[j].getItS() + ":" + tm[i].subjects[j].getSubjectName() + " Số lớp: " + tm[i].numClass[j]);
            }
            System.out.println("\t\tTổng số tiết học: " + tongSoTietHoc(tm[i]));

        }
    }
}
