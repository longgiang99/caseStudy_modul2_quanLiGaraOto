package model;

public class Painter extends Staff {
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
                '}' + "\n";
    }
}
