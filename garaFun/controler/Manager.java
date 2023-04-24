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
    List<Staff> listStaff = new ArrayList<>();

    public Manager() {
        listStaff = ReadToFile.readFile("garaFun.txt");
    }

    @Override
    public void numberCar(int car) {
    }

    public void addStaff() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap loai nhan vien:  M/ P/ E");
        String staffType;
        do {
            staffType = scanner.nextLine();
            if (checkTypeStaff(staffType) == false) {
                System.out.println("yeu cau nhap dung loai");
            }
        } while (checkTypeStaff(staffType) == false);
        System.out.println(" enter name: ");
        String name = scanner.nextLine();
        System.out.println("enter age: ");
        int age = scanner.nextInt();
        System.out.println("enter codeStaff: ");
        int codeStaff = scanner.nextInt();
        FactoryStaff staffFactory = new FactoryStaff();
        Staff staff1 = staffFactory.getObject(staffType);
        checkCodeStaff(codeStaff);
        if (checkCodeStaff(codeStaff)) {
            System.out.println("da ton tai ma nhan vien nay, vui long them lai nhan vien voi ma nhan vien khac");
        } else {
            staff1.setName(name);
            staff1.setAge(age);
            staff1.setCodeStaff(codeStaff);
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
        boolean input = typeValidator.validate(staffType);
        return input;
    }

    public void saveListStaff() {
        WriterToFile.writerFile(listStaff);
    }
//    public void displayDemo(){
//        for (Staff staff : listStaff) {
//            System.out.println(staff);
//    }

    public void display() {
//        System.out.printf("%-10s %-20s %-20s\n", " PaintersCertificate ", '\t' + "  codeStaff  ", "  salary "," age "," name ", " address "," staffType ");
//        ReadToFile.readFile("garaFun.txt");
        sortToAge();
        System.out.println(listStaff);
    }

    @Override
    public void updateStaff() {
    }

    public void updateCodeStaff() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap ma nhan vien can update code: ");
        int codeStaff = scanner.nextInt();
        try {
            for (int i = 0; i < listStaff.size(); i++) {
                if (listStaff.get(i).getCodeStaff() == codeStaff) {
                    System.out.println("hay nhap ma nhan vien moi: ");
                    int newCodeStaff = scanner.nextInt();
                    listStaff.get(i).setCodeStaff(newCodeStaff);
                    System.out.println("da thay doi ma nhan vien tu:" + codeStaff + "sang: " + newCodeStaff);
                } else {
                    System.out.println("khong co ma nhan vien nay");
                }
            }
        } catch (IndexOutOfBoundsException e) {
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
        System.out.println("hay nhap ma nhan vien can cap nhat luong: ");
        int codeStaff = scanner.nextInt();
        try {
            for (int i = 0; i < listStaff.size(); i++) {
                if (listStaff.get(i).getCodeStaff() == codeStaff) {
                    System.out.println("hay nhap muc luong moi: ");
                    int newSalary = scanner.nextInt();
                    listStaff.get(i).setSalary(newSalary);
                    System.out.println("da thay doi luong thanh: " + newSalary);
                } else {
                    System.out.println("khong co ma nhan vien nay.");
                }
            }
        } catch (NumberFormatException e) {
        }
    }

    public void updateAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap ma nhan vien can cap nhat tuoi: ");
        int age = scanner.nextInt();
        try {
            for (int i = 0; i < listStaff.size(); i++) {
                if (listStaff.get(i).getCodeStaff() == age) {
                    System.out.println("hay nhap tuoi moi: ");
                    int newAge = scanner.nextInt();
                    listStaff.get(i).setSalary(newAge);
                    System.out.println("da thay doi tuoi thanh: " + newAge);
                } else {
                    System.out.println("khong co ma nhan vien nay.");
                }
            }
        } catch (NumberFormatException e) {
        }
    }

    public void updateName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap ma nhan vien can cap nhat name: ");
        int name = scanner.nextInt();
        try {
            for (int i = 0; i < listStaff.size(); i++) {
                if (listStaff.get(i).getCodeStaff() == name) {
                    System.out.println("hay nhap ten moi: ");
                    int newName = scanner.nextInt();
                    listStaff.get(i).setSalary(newName);
                    System.out.println("da thay doi ten thanh: " + newName);
                } else {
                    System.out.println("khong co ma nhan vien nay.");
                }
            }
        } catch (NumberFormatException e) {
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
        System.out.println("hay nhap ma nhan vien can cap nhat dia chi: ");
        int codeStaff = scanner.nextInt();
        Address address = new Address();
        System.out.println("hay nhap dia chi moi: ");
        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i).getCodeStaff() == codeStaff) {
                System.out.println("nhap ten duong: ");
                String streetName = scanner.nextLine();
                System.out.println("nhap ten quan: ");
                String districName = scanner.nextLine();
                address.setStreetName(streetName);
                address.setDistricName(districName);
            } else {
                System.out.println("khong co ma nhan vien nay.");
            }
        }
    }

    //public void softToSalary(){
//        listStaff.sort();
//}
    @Override
    public void salarySetup() {
    }

    public void sortToAge() {
        listStaff.sort(Comparator.comparing(Staff::getAge));
    }

    public void findToName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten nv can tim.");
        String name = scanner.nextLine();
        boolean isExisted = false;
        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i).getName().equals(name)) {
                isExisted = true;
                System.out.println("thong tin nhan vien: "+ listStaff.get(i));
            }
        }
        if (!isExisted) {
            System.out.println("khong co ten nhan vien nay.");
        }
    }


}

