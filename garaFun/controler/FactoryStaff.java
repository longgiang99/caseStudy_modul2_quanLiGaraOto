package controler;

public class FactoryStaff {
    public Staff getObject(String staffType){
        switch (staffType){
            case "M":
                return  new Mechanic();
            case "E":
                return new Electrician();
            case "P":
                return new Painter();
            default: return null;
        }
    }
}
