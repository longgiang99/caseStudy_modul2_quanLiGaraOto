package storage;

import model.Staff;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadToFile {
    public static List<Staff> readFile(String path) {
        File file = new File("garaFun.txt");

        List<Staff> list = new ArrayList<>();
        try( FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis);) {
            list = (List<Staff>) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }catch (Exception e){
            e.printStackTrace();
        }
        if (list == null) {
            System.out.println("khong co du lieu");
        } else {
            System.out.println(list);
        }
        return list;
    }

}
