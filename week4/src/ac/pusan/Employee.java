package ac.pusan;

public abstract class Employee {
    private String name;
    private String address;
    private String department;

    public Employee(String name, String address, String department){
        this.name = name;
        this.address = address;
        this.department = department;
    }

    public abstract double pay();

    @Override
    public String toString() {
        return "이름 : " + name + "\n" +
                "주소 : " + address + "\n" +
                "부서 : " + department + "\n";
    }
}
