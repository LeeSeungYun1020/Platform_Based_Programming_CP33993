package ac.pusan;

public class RegEmployee extends Employee {
    private int empNumber;
    private String rank;
    private double yearlySalary;
    private double bonusRate;

    public RegEmployee(String name, String address, String department,
                       int empNumber, String rank, double yearlySalary, double bonusRate){
        super(name, address, department);
        this.empNumber = empNumber;
        this.rank = rank;
        this.yearlySalary = yearlySalary;
        this.bonusRate = bonusRate;
    }

    @Override
    public double pay() {
        return yearlySalary * bonusRate;
    }

    @Override
    public String toString() {
        return super.toString() +
                "직원번호 : " + empNumber + "\n" +
                "직급 : " + rank + "\n" +
                "연봉 : " + yearlySalary + "\n" +
                "보너스 지급율 : " + bonusRate;
    }
}
