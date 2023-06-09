package model;

public class Mechanic extends Staff {
    private boolean machineRepairCertificate;
    public Mechanic() {
    }
    public Mechanic(int codeStaff, int salary, int age, String name, Address address, String staffType, boolean machineRepairCertificate) {
        super(codeStaff, salary, age, name, address, staffType);
        this.machineRepairCertificate = machineRepairCertificate;
    }
    public boolean isMachineRepairCertificate() {
        return machineRepairCertificate;
    }
    public void setMachineRepairCertificate(boolean machineRepairCertificate) {
        this.machineRepairCertificate = machineRepairCertificate;
    }
    @Override
    public String toString() {
        return "Mechanic{" +
                "machineRepairCertificate=" + machineRepairCertificate +
                ", codeStaff=" + codeStaff +
                ", salary='" + salary + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", staffType='" + staffType + '\'' +
                '}' + "\n";
    }
}
