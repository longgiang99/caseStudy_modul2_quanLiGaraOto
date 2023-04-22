package controler;

import factory.FactoryStaff;
import model.Address;
import model.Staff;
import regex.TypeValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager extends FactoryStaff implements Work {
    List<Staff> listStaff = new ArrayList<>();

    @Override
    public void numberCar(int car) {
    }

    public void addStaff() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap loai nhan vien:  M/ P/ E");
        String staffType;
       do {
           staffType = scanner.nextLine();
           if(checkTypeStaff(staffType) == false){
               System.out.println("yeu cau nhap dung loai");
           }
       }while (checkTypeStaff(staffType) == false);
        System.out.println(" enter name: ");
        String name = scanner.nextLine();
        System.out.println("enter age: ");
        int age = scanner.nextInt();
        System.out.println("enter codeStaff: ");
        int codeStaff = scanner.nextInt();
        FactoryStaff staffFactory = new FactoryStaff();
        Staff staff1 = staffFactory.getObject(staffType);
        checkCodeStaff(codeStaff);
        if(checkCodeStaff(codeStaff)) {
            System.out.println("da ton tai ma nhan vien nay, vui long them lai nhan vien voi ma nhan vien khac");
        }else {
            staff1.setName(name);
            staff1.setAge(age);
            staff1.setCodeStaff(codeStaff);
            listStaff.add(staff1);
        }
    }
    public boolean checkCodeStaff(int codeStaff){
        boolean check = false;
        for(Staff staff: listStaff){
            if(staff.getCodeStaff() == codeStaff){
                check = true;
                break;
            }
        }return check;
    }
    public  boolean checkTypeStaff(String staffType){
        TypeValidator typeValidator = new TypeValidator();
        boolean input = typeValidator.validate(staffType);
        return input;
    }
    public void display() {
        for (Staff list : listStaff) {
            System.out.println(list);
        }
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
                  System.out.println("da thay doi ma nhan vien tu:" + codeStaff + "sang: " + newCodeStaff );
              } else {
                  System.out.println("khong co ma nhan vien nay");
              }
          }
      }catch (IndexOutOfBoundsException e){}
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
    public void updateSalary(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap ma nhan vien can cap nhat luong: ");
        int codeStaff = scanner.nextInt();
        try {
            for (int i = 0; i <listStaff.size() ; i++) {
                if(listStaff.get(i).getCodeStaff() == codeStaff ){
                    System.out.println("hay nhap muc luong moi: ");
                    int newSalary = scanner.nextInt();
                    listStaff.get(i).setSalary(newSalary);
                    System.out.println("da thay doi luong thanh: " + newSalary );
                }
            }
        }catch (NumberFormatException e){}
    }
    public void updateSalary(int newSalary) {
       try {
           Staff staffForUpdate = listStaff.stream()
                   .filter(staff1 -> staff1.getCodeStaff() == staff1.getCodeStaff())
                   .findFirst()
                   .get();
           staffForUpdate.setSalary(newSalary);
       }catch (NumberFormatException e){}
    }

    @Override
    public void salarySetup() {
    }
}
