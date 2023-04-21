package controler;

import java.util.List;

public class Painter extends Staff implements RepairedCarNumber{
    private boolean PaintersCertificate;

    public Painter() {
    }

    public Painter(int codeStaff, int salary, int age, String name, Address address, String staffType, boolean paintersCertificate) {
        super(codeStaff, salary, age, name, address, staffType);
        PaintersCertificate = paintersCertificate;
    }

    public boolean isPaintersCertificate() {
        return PaintersCertificate;
    }

    public void setPaintersCertificate(boolean paintersCertificate) {
        PaintersCertificate = paintersCertificate;
    }

    @Override
    public String toString() {
        return "Painter{" +
                "PaintersCertificate=" + PaintersCertificate +


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
