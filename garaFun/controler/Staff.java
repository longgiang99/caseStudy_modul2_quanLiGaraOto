package controler;

public  class Staff {
    protected int codeStaff;
    protected String salary;
    protected int age;
    protected String name;
    protected Address address;
    protected String staffType;

    public Staff() {
    }

    public Staff(int codeStaff, String salary, int age, String name, Address address, String staffType) {
        this.codeStaff = codeStaff;
        this.salary = salary;
        this.age = age;
        this.name = name;
        this.address = address;
        this.staffType = staffType;
    }

    public int getCodeStaff() {
        return codeStaff;
    }

    public void setCodeStaff(int codeStaff) {
        this.codeStaff = codeStaff;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "codeStaff=" + codeStaff +
                ", salary='" + salary + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", staffType='" + staffType + '\'' +
                '}';
    }
}
