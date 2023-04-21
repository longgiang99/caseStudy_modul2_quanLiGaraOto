package view;

import controler.Manager;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Manager managerAll = new Manager();
        Scanner sc =new Scanner(System.in);
        int choice = 0;
        while (true){
            System.out.println("""
                    moi nhap lua chon:
                    1: them nhan vien.
                    2: hien thi danh sach: 
                    3: xoa mot nhan vien: 
                    0: thoat chuong trinh.! 
                    """);
            System.out.println("Enter your choice");
            choice = Integer.parseInt(sc.nextLine());
            boolean check = true;
            switch (choice){
                case 1 -> {
                    while (check){
                        System.out.println("""
                            moi nhap lua chon: 
                            1: them nhan vien.
                            2: update luong nhan vien.                  
                            0: quay lai menu chinh.! 
                            """);
                        choice = Integer.parseInt(sc.nextLine());
                        switch (choice) {
                            case 1:
                                managerAll.addStaff();
                                break;
                            case 2:
                                System.out.println("nhap luong moi: ");
                                int salary = sc.nextInt();
                                managerAll.updateSalary(salary);
                                break;
                            case 0:
                                check = false;
                                break;
                            default:
                                throw new IllegalStateException("Unexpected value: " + choice);
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
