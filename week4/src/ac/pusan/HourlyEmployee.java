package ac.pusan;

public class HourlyEmployee extends Employee {
    private double basicPay;
    private double payRate;
    private String contractExpDate;
    private int hoursWorked;

    public HourlyEmployee(String name, String address, String department,
                          String contractExpDate, double basicPay, double payRate){
        super(name, address, department);
        this.basicPay = basicPay;
        this.payRate = payRate;
        this.contractExpDate = contractExpDate;
        hoursWorked = 0;
    }

    @Override
    public double pay() {
        double total = basicPay + hoursWorked * payRate;
        hoursWorked = 0;
        return total;
    }

    public void addHours(int hour) {
        hoursWorked += hour;
    }

    @Override
    public String toString() {
        return super.toString() +
                "계약만료일 : " + contractExpDate + "\n" +
                "기본 임금 : " + basicPay + "\n" +
                "시간당 임금 : " + payRate + "\n" +
                "근무 시간 : " + hoursWorked;
    }
}
