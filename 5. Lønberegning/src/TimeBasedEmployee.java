public class TimeBasedEmployee implements Payment {

    private double hours;
    private double hourPay;

    @Override
    public double calculatePay() {
        return hours*hourPay;
    }

    public double getHours() {
        return hours;
    }
    public double getHourPay() {
        return hourPay;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    public void setHourPay(double hourPay) {
        this.hourPay = hourPay;
    }
}
