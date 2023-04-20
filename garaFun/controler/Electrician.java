package controler;

import java.util.List;

public class Electrician extends Staff implements RepairedCarNumber{
    private boolean electricalRepairCertificate;

    public Electrician() {
    }

    public Electrician(int codeStaff, int salary, int age, String name, Address address, String staffType, boolean electricalRepairCertificate) {
        super(codeStaff, salary, age, name, address, staffType);
        this.electricalRepairCertificate = electricalRepairCertificate;
    }

    public boolean isElectricalRepairCertificate() {
        return electricalRepairCertificate;
    }

    public void setElectricalRepairCertificate(boolean electricalRepairCertificate) {
        this.electricalRepairCertificate = electricalRepairCertificate;
    }

    @Override
    public String toString() {
        return "Electrician{" +
                "electricalRepairCertificate=" + electricalRepairCertificate +
                ", codeStaff=" + codeStaff +
                ", salary='" + salary + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", staffType='" + staffType + '\'' +
                '}';
    }

    @Override
    public void numberCar(int car) {

    }

    @Override
    public void addStaff(List<Staff> staff) {

    }


    @Override
    public void display() {

    }

    @Override
    public void updateStaff() {

    }

    @Override
    public void updateStaff(Staff staff) {

    }

    @Override
    public void removeStaff(List<Staff> staff) {

    }


    @Override
    public void salary() {

    }
}
