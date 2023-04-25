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
        String choice;
        while (true){
            System.out.println("""
                    Mời nhập lưạ chọn:
                    1: Thêm nhân viên.
                    2: Hiển thị danh sách. 
                    3: Xóa.
                    4: Cập nhật thông tin. 
                    5: Lưu.
                    6: Sắp xếp theo tuổi.
                    7: Tìm nhân viên.
                    0: Thoát chương trình.! 
                    """);
            System.out.println("Mời nhập lựa chọn");
            choice = sc.nextLine();
            boolean check = true;
            switch (choice){
                case "1" -> {
                    while (check){
                        System.out.println("""
                            Mời nhập lưạ chọn: 
                            1: Thêm nhân viên.
                            2: Hiển thị danh sách.
                            3: Lưu.
                            0: quay lai menu chinh.! 
                            """);
                        choice = sc.nextLine();
                        switch (choice) {
                            case "1":
                                managerAll.addStaff();
                                break;
                            case "2":
                                managerAll.display();break;
                            case  "3":
                                managerAll.saveListStaff();break;

                            case "0":
                                check = false;
                                break;
                            default:
                                System.out.println("Lựa chọn của bạn không đúng, vui lòng nhập lại.");
                        }
                    }
                }
                case "2" -> {
                        managerAll.display();
                }
                case "3" -> {
                    managerAll.removeStaff();
                }
                case "4" ->{
                    boolean checks = true;
                    while (checks){
                        System.out.println("""
                                Mời nhập lựa chọn:
                                1: Cập nhật mã nhân viên.
                                2: Câp nhật lương nhân viên.
                                3: Cập nhật tên nhân viên.
                                4: Cập nhật tuổi nhân viên.
                                5: Cập nhật địa chỉ nhân viên.
                                6: Cập nhật loại nhân viên.
                                0: Quay lại.
                                """);
                        choice = sc.nextLine();
                        switch (choice){
                            case "1":
                                managerAll.updateCodeStaff();
                                break;
                            case "2":
                                managerAll.updateSalary();
                                break;
                            case "3":
                                managerAll.updateName();
                                break;
                            case "4":
                                managerAll.updateAge();
                                break;
                            case "5":
                                managerAll.updateAdrress();
                            case "6":
                                managerAll.updateStaffType();
                            case "0":
                                checks = false;
                                break;
                            default:
                                System.out.println("Lựa chọn của bạn không đúng, vui lòng nhập lại.");
                        }
                    }
                }
                case "5" ->{
                    managerAll.saveListStaff();
                }
                case "6" ->{
                    managerAll.sortToAge();
                }
                case "7" -> {
                    managerAll.findToName();
                }
                case "0" -> System.exit(0);
                default -> {
                    System.out.println("Lựa chọn của bạn không đúng, vui lòng nhập lại.");
                }
            }
        }
    }
}
