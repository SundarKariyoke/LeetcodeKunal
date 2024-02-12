class EmpInfo{
    String name;
    int yof;
    int salary;
    String address;
    EmpInfo(String name, int yof, int salary, String address){
        this.name = name;
        this.yof = yof;
        this.salary = salary;
        this.address = address;
    }
}

public class Employees {
    public static void main(String[] args) {
        EmpInfo emp1 = new EmpInfo("Sundar", 2015, 100000, "Erode-2");
        EmpInfo emp2 = new EmpInfo("Manoj", 2016, 100000, "Erode-3");
        EmpInfo emp3 = new EmpInfo("Bharani", 2014, 100000, "Erode-5");
        System.out.println("Name  " + "Year of Joining  " + "Address ");
        System.out.println(emp1.name+ "  "+emp1.yof+"  "+emp1.address);
        System.out.println(emp2.name+ "  "+emp2.yof+"  "+emp2.address);
        System.out.println(emp3.name+ "  "+emp3.yof+"  "+emp3.address);
    }
}
