package view;

import controler.ManagerAll;
import controler.Staff;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerAll managerAll = new ManagerAll();
        Scanner sc =new Scanner(System.in);
        int choice = 0;
        while (true){
            System.out.println("""
                    moi nhap lua chon:
                    1: them nhan vien.
                    2: hien thi danh sach: 
                    3: xoa mot nhan vien: 
                    0: thoat chuongw trinh.! 
                    """);
            System.out.println("Enter your choice");
            choice = Integer.parseInt(sc.nextLine());
            boolean check = true;
            switch (choice){
                case 1 -> {
                    System.out.println("""
                            moi nhap lua chon: 
                            1: them nhan vien.                  
                            0: quay lai menu chinh.! 
                            """);
                    while (check){
                        System.out.println("Enter your choice");
                        choice = Integer.parseInt(sc.nextLine());
                        switch (choice) {
                            case 1:
                                managerAll.addStaff();
                            case 0:
                                check = false;
                        }
                    }
                }
                case 2 -> {
                        managerAll.display();
                }
                case 3 -> {
                    managerAll.removeStaff();
                }
                case 0 -> System.exit(0);
            }
        }


    }
}
