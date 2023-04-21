package controler;

import factory.FactoryStaff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerAll extends FactoryStaff implements vali {
    List<Staff> listStaff = new ArrayList<>();
    @Override
    public void numberCar(int car) {
    }
    @Override
    public void addStaff(List<Staff> staff) {
    }
    public void addStaff() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" M/ P/ E");
        String staffType = scanner.nextLine();
        System.out.println(" enter name ");
        String name = scanner.nextLine();
        System.out.println("enter age");
        int age = scanner.nextInt();
        System.out.println(" enter Type");
        FactoryStaff staffFactory = new FactoryStaff();
        Staff staff1 = staffFactory.getObject(staffType);
        staff1.setName(name);
        staff1.setAge(age);
        listStaff.add(staff1);
//        factory.FactoryStaff staffFactory = new FactoryStaff();
//        String type = scanner.nextLine();
//        Staff staff = staffFactory.getObject(type);
//        do {
//            System.out.println("Enter staff object type: ");
//            String type = scanner.nextLine();
//            staff = staffFactory.getObject(type);
//            break;
//        } while (staff == null);
//
//
//       staff.setStaffType(staffType);
//       listStaff.add(staff);
    }
    public void display() {
        for (Staff list : listStaff) {
            System.out.println(list);
        }
    }
    @Override
    public void updateStaff() {
    }
    @Override
    public void updateStaff(Staff staff) {
        Staff staffUpdate = listStaff.stream().filter(staff1 -> staff1.getCodeStaff() == staff.getCodeStaff()).findFirst().get();
    }
    @Override
    public void removeStaff(List<Staff> staff) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap ten nhan vien can xoa: ");
        int name = scanner.nextInt();
        listStaff.stream().filter(staff1 -> staff1.getName()== staff1.getName());
        listStaff.remove(name);
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
    public void removeStaff() {
    }
    public void updateSalary() {

    }
}
