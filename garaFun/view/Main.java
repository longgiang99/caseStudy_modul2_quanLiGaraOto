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
                    2: hien thi danh sach. 
                    3: xoa mot nhan vien.
                    4: cap nhat thong tin nhan vien. 
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
                            2: hien thi danh sach.
                            0: quay lai menu chinh.! 
                            """);
                        choice = Integer.parseInt(sc.nextLine());
                        switch (choice) {
                            case 1:
                                managerAll.addStaff();
                                break;
                            case 2:
                                managerAll.display();

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
                case 4 ->{
                    boolean checks = true;
                    while (checks){
                        System.out.println("""
                                moi nhap lua chon:
                                1: cap nhat ma nhan vien.
                                2: cap nhat luong nhan vien.
                                3: cap nhat ten nhan vien.
                                0: quay lai menu chinh.
                                """);
                        choice = Integer.parseInt(sc.nextLine());
                        switch (choice){
                            case 1:
                                managerAll.updateCodeStaff();
                                break;
                            case 2:
                                managerAll.updateSalary();
//                                System.out.println("nhap luong moi: ");
//                                int newSalary = sc.nextInt();
//                                managerAll.updateSalary(newSalary);
                                break;
                            case 0:
                                checks = false;
                                break;
                        }
                    }
                }
                case 0 -> System.exit(0);
            }
        }
    }
}
