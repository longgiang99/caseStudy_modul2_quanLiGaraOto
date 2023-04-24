package view;

import controler.Manager;
import model.Staff;
import storage.ReadToFile;
import storage.WriterToFile;

import java.util.List;
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
                    5: luu.
                    6: sap xep theo tuoi.
                    7: tim nhan vien theo ten.
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
                                4: cap nhat tuoi nhan vien.
                                5: cap nhat dia chi nhan vien.
                                0: quay lai menu chinh.
                                """);
                        choice = Integer.parseInt(sc.nextLine());
                        switch (choice){
                            case 1:
                                managerAll.updateCodeStaff();
                                break;
                            case 2:
//                                managerAll.updateSalary();
//                                System.out.println("nhap luong moi: ");
//                                int newSalary = sc.nextInt();
                                managerAll.updateSalary();
                                break;
                            case 3:
                                managerAll.updateName();
                                break;
                            case 4:
                                managerAll.updateAge();
                                break;
                            case 5:
                                managerAll.updateAdrress();
                            case 0:
                                checks = false;
                                break;
                        }
                    }
                }
                case 5 ->{
                    managerAll.saveListStaff();
                }
                case 6 ->{
                    managerAll.sortToAge();
                }
                case 7 -> {
                    managerAll.findToName();
                }
                case 0 -> System.exit(0);
            }
        }
    }
}
