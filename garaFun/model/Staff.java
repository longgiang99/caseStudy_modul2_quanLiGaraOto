package model;

import model.Address;

import java.io.Serializable;

public  class Staff implements Serializable {
    protected int codeStaff;
    protected int salary;
    protected int age;
    protected String name;
    protected Address address;
    protected String staffType;

    public Staff() {
    }

    public Staff(int age, String name, String staffType) {
        this.age = age;
        this.name = name;
        this.staffType = staffType;
    }

    public Staff(int codeStaff, int salary, String name, String staffType) {
        this.codeStaff = codeStaff;
        this.salary = salary;
        this.name = name;
        this.staffType = staffType;
    }

    public Staff(int codeStaff, int salary, int age, String name, Address address, String staffType) {
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
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
//        return "" + '\t' + '\t' + '\t'+ codeStaff + '\t' + '\t' + '\t'+ " " + salary + '\t' + '\t' + '\t'+  " "+ age + '\t' + '\t' + '\t'+  " "+ name+ '\t' + '\t' + '\t'+  " "+ address+ '\t' + '\t' + '\t'+  " "+ staffType   ;
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
