package controler;

import factory.FactoryStaff;
import model.Staff;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Manager extends FactoryStaff implements Work {
    List<Staff> listStaff = new ArrayList<>();

    @Override
    public void numberCar(int car) {
    }

    public void addStaff() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap loai nhan vien:  M/ P/ E");
        String staffType = scanner.nextLine();
        System.out.println(" enter name: ");
        String name = scanner.nextLine();
        System.out.println("enter age: ");
        int age = scanner.nextInt();
        System.out.println("enter codeStaff: ");
        int codeStaff = scanner.nextInt();

//        System.out.println(" enter Type");
        FactoryStaff staffFactory = new FactoryStaff();
        Staff staff1 = staffFactory.getObject(staffType);
        boolean check = false;
        for(Staff staff: listStaff){
            if(staff.getCodeStaff() == codeStaff){
                check = true;
                break;
            }
        }
        if(check) {
            System.out.println("da ton tai ma nhan vien nay, vui long nhap ma nhan vien khac");
        }else {
//                Staff staff2  = new Staff();
            staff1.setName(name);
            staff1.setAge(age);
            staff1.setCodeStaff(codeStaff);
            listStaff.add(staff1);
        }
    }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("id");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println(" enter name ");
//        String name = scanner.nextLine();
//        System.out.println("enter age");
//        int age = scanner.nextInt();
//        System.out.println(" enter Type");
//        System.out.println(" M/ P/ E");
//        String staffType = scanner.nextLine();
//        Staff staff1 = staffFactory.getObject(staffType);
//        boolean check = false;
//        for (Staff staff : listStaff) {
//            if (staff.getCodeStaff() == id) {
//                check = true;
//                break;
//            }
//        }if (check){
//            System.out.println("da ton tai ma nhan vien nay, vui long nhap ma nhan vien khac");
//        }else {
//           Staff staff = new Staff();
//            staff.setName(name);
//            staff.setAge(age);
//            staff.setCodeStaff(id);
//            listStaff.add(staff);
//        }



    public void display() {
        for (Staff list : listStaff) {
            System.out.println(list);
        }
    }

    @Override
    public void updateStaff() {
        Staff staffUpdate = listStaff.stream().filter(staff1 -> staff1.getCodeStaff() == staff1.getCodeStaff()).findFirst().get();
    }

    @Override
    public void removeStaff() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("moi ban nhap ten nhan vien can xoa: ");
            String name = scanner.nextLine();
            for (int i = 0; i < listStaff.size(); i++) {
                if (listStaff.get(i).getName().equals(name)) {
                    listStaff.remove(i);
                    System.out.println("da xoa nhan vien ten: " + name);
                } else {
                    System.out.println("khong co ten nhan vien nay.");
                }
            }
        } catch (Exception e) {
        }
    }
    public void updateSalary(int newSalary) {
        Staff staffForUpdate = listStaff.stream()
                .filter(staff1 -> staff1.getCodeStaff() == staff1.getCodeStaff())
                .findFirst()
                .get();
        staffForUpdate.setSalary(newSalary);
        updateStaff();
    }

    @Override
    public void salary() {
    }
}
