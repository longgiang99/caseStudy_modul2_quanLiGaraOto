package controler;

import java.util.List;

public interface RepairedCarNumber {
     void numberCar(int car);
     void addStaff(List<Staff> staff);
     void display();
     void updateStaff();

     void updateStaff(Staff staff);

     void removeStaff(List<Staff> staff);
     void salary();
}
