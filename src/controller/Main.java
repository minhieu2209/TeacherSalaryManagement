package controller;

import model.Subject;
import model.Teacher;
import model.TeachingManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Controller controller = new Controller();
        Scanner in = new Scanner(System.in);
        TeachingManagement tm = new TeachingManagement();
        TeachingManagement[] tmng = new TeachingManagement[100];
        do{
            System.out.println("==========MENU==========");
            System.out.println("1. Nhập danh sách môn học mới. In ra danh sách môn học đã có.");
            System.out.println("2. Nhập danh sách giảng viên mới. In ra danh sách giảng viên đã có.");
            System.out.println("3. Quản lý kê khai giảng dạy");
            System.out.println("4. Theo họ tên giảng viên");
            System.out.println("5. Theo số tiết giảng dạy mỗi môn.");
            System.out.println("6. Tính toán và lập bảng tính tiền công cho mỗi giảng viên");
            System.out.println("0. Thoát khỏi ứng dụng.");

            choice = in.nextInt();
            in.nextLine();
            switch (choice){
                case 0:
                    System.out.println("Tạm biệt!!!");
                    break;
                case 1:
                    System.out.print("Nhập số lượng môn học mới: ");
                    Controller.numSubject = in.nextInt();
                    controller.addLSubject();;
                    controller.inLSubject();
                    break;
                case 2:
                    System.out.print("Nhập số lượng giảng viên mới: ");
                    Controller.numTeacher = in.nextInt();
                    controller.addLTeacher();
                    controller.inLTeacher();
                    break;
                case 3:
                    tmng = tm.manageTeaching(tmng, controller.t, controller.s);
                    tm.showTM(tmng);
                    break;
            }
        }while(choice != 0);
    }
}
