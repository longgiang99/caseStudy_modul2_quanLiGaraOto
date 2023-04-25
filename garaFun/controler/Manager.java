package controler;

import factory.FactoryStaff;
import model.Address;
import model.Staff;
import regex.TypeValidator;
import storage.ReadToFile;
import storage.WriterToFile;

import java.io.Serializable;
import java.util.*;

public class Manager extends FactoryStaff implements Work, Serializable {
    List<Staff> listStaff;

    public Manager() {
        listStaff = ReadToFile.readFile("garaFun.txt");
    }

    @Override
    public void numberCar(int car) {
    }

    @Override
    public void addStaff(String staffType) {

    }

    public void addStaff() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Hãy nhập loại nhân viên:
                M: Thợ máy.
                P: Thợ sơn.
                E: Thợ điện.
                """);
        String staffType;
        do {
            staffType = scanner.nextLine();
            if (!checkTypeStaff(staffType)) {
                System.out.println("Yêu cầu nhập đúng loại.");
            }
        } while (!checkTypeStaff(staffType));
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mã nhân viên: ");
        int codeStaff = Integer.parseInt(scanner.nextLine());
        FactoryStaff staffFactory = new FactoryStaff();

        Staff staff1 = staffFactory.getObject(staffType);
        checkCodeStaff(codeStaff);
        if (checkCodeStaff(codeStaff)) {
            System.out.println("Đã tồn tại mã nhân viên này, hãy thêm lại nhân viên với mã nhân viên khác.");
        } else {
            staff1.setName(name);
            staff1.setAge(age);
            staff1.setCodeStaff(codeStaff);
            staff1.setStaffType(staffType);
            listStaff.add(staff1);
        }
    }


    public boolean checkCodeStaff(int codeStaff) {
        boolean check = false;
        for (Staff staff : listStaff) {
            if (staff.getCodeStaff() == codeStaff) {
                check = true;
                break;
            }
        }
        return check;
    }

    public boolean checkTypeStaff(String staffType) {
        TypeValidator typeValidator = new TypeValidator();
        return typeValidator.validate(staffType);

    }

    public void saveListStaff() {
        WriterToFile.writerFile(listStaff);
    }


    public void display() {
        System.out.println(listStaff);
    }

    @Override
    public void updateStaff() {
    }
    public void updateStaffType(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập mã nhân viên cần cập nhật loại: ");
        int codeStaff = Integer.parseInt(scanner.nextLine());
        boolean isExited = false;
        for (Staff staff : listStaff) {
            if (staff.getCodeStaff() == codeStaff) {
                isExited = true;
                System.out.println("Hãy nhập loại nhân viên mới: P/E/M");
                String staffType;
                do {
                    staffType = scanner.nextLine();
                    if (!checkTypeStaff(staffType)) {
                        System.out.println("Yêu cầu nhập đúng loại.");
                    }
                } while (!checkTypeStaff(staffType));
                staff.setStaffType(staffType);
                System.out.println("Đã thay đổi loại nhân viên thành: " +staffType);
            }
        }
        if (!isExited) {
            System.out.println("Không có mã nhân viên này.");
        }
    }
    public void updateCodeStaff() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập mã nhân viên cần cập nhật mã mới: ");
        int codeStaff = Integer.parseInt(scanner.nextLine());
        boolean isExited = false;
        for (Staff staff : listStaff) {
            if (staff.getCodeStaff() == codeStaff) {
                isExited = true;
                System.out.println("Hãy nhập mã nhân viên mới: ");
                int newCodeStaff = Integer.parseInt(scanner.nextLine());
                staff.setCodeStaff(newCodeStaff);
                System.out.println("Đã thay đổi mã nhân viên từ:" + codeStaff + "sang: " + newCodeStaff);
            }
        }
        if (!isExited) {
            System.out.println("Không có tên nhân viên này.");
        }
    }

    @Override
    public void removeStaff() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("moi ban nhap ten nhan vien can xoa: ");
            String name = scanner.nextLine();
            int index = -1;
            for (int i = 0; i < listStaff.size(); i++) {
                if (listStaff.get(i).getName().equals(name)) {
                    index = i;
                    break;
                } else {
                    System.out.println("khong co ten nhan vien nay.");
                    break;
                }
            }
            if (index >= 0) {
                listStaff.remove(index);
                System.out.println("da xoa nhan vien ten: " + name);
            }
        } catch (Exception e) {
        }
        WriterToFile.writerFile(listStaff);
    }

    public void updateSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập mã nhân viên cần cập nhật lương: ");
        int codeStaff = Integer.parseInt(scanner.nextLine());
        boolean isExited = false;

        for (Staff staff : listStaff) {
            if (staff.getCodeStaff() == codeStaff) {
                isExited = true;
                System.out.println("Hãy nhập mức lương mới: ");
                int newSalary = Integer.parseInt(scanner.nextLine());
                staff.setSalary(newSalary);
                System.out.println("Đã thay đổi lương thành: " + newSalary);
            }
        }
        if (!isExited) {
            System.out.println("Không có mã nhân viên này.");

        }
    }


    public void updateAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập mã nhân viên cần cập nhật tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        boolean isExited = false;
        for (Staff staff : listStaff) {
            if (staff.getCodeStaff() == age) {
                isExited = true;
                System.out.println("Hãy nhập tuổi mới: ");
                int newAge = Integer.parseInt(scanner.nextLine());
                staff.setSalary(newAge);
                System.out.println("Đã thay đổi tuổi thành: " + newAge);
            }
        }
        if (!isExited) {
            System.out.println("Không có mã nhân viên này.");

        }
    }

    public void updateName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập mã nhân viên cần cập nhật tên: ");
        int codeStaff = Integer.parseInt(scanner.nextLine());
        boolean isExited = false;
        for (Staff staff : listStaff) {
            if (staff.getCodeStaff() == codeStaff) {
                isExited = true;
                System.out.println("Hãy nhập tên mới: ");
                String newName = scanner.nextLine();
                staff.setName(newName);
                System.out.println("Đã thay đổi tên thành: " + newName);
                break;
            }
        }
        if (!isExited) {
            System.out.println("Không có mã nhân viên này.");
        }
    }
//    public void updateSalary() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhap ma nhan vien muon thay doi luong: ");
//        int codeStaff = scanner.nextInt();
//        try {
//            Staff staffForUpdate = listStaff.stream()
//                    .filter(staff1 -> staff1.getCodeStaff() == codeStaff)
//                    .findFirst()
//                    .get();
//            System.out.println("nhap luong moi: ");
//            int newSalary = scanner.nextInt();
//            staffForUpdate.setSalary(newSalary);
//        } catch (NumberFormatException e) {
//        }
//    }

    public void updateAdrress() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập mã nhân viên cần cập nhật địa chỉ: ");
        int codeStaff = Integer.parseInt(scanner.nextLine());
        Address address = new Address();
        boolean isExited = false;
        System.out.println("Hãy nhập địa chỉ mới: ");
        for (Staff staff : listStaff) {
            if (staff.getCodeStaff() == codeStaff) {
                isExited = true;
                System.out.println("Nhập tên đường: ");
                String streetName = scanner.nextLine();
                System.out.println("Nhập tên quận: ");
                String districName = scanner.nextLine();
                address.setStreetName(streetName);
                address.setDistricName(districName);
                staff.setAddress(address);
            }
        }
        if (!isExited) {
            System.out.println("Không có mã nhân viên này.");

        }
    }


    @Override
    public void salarySetup() {
    }

    public void sortToAge() {
        listStaff.sort(Comparator.comparing(Staff::getAge));
        display();
    }

    public void findToName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên cần tìm.");
        String name = scanner.nextLine();
        boolean isExisted = false;
        for (Staff staff : listStaff) {
            if (staff.getName().equals(name)) {
                isExisted = true;
                System.out.println("Thông tin nhân viên: " + staff);
            }
        }
        if (!isExisted) {
            System.out.println("Không có tên nhân viên này.");
        }
    }


}

