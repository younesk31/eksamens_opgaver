public class ProvisionBasedEmployee implements Payment {

    private double mainpay;
    private double sale;
    private double provision;

    @Override
    public double calculatePay() {
        return mainpay + (sale*(provision/100));
    }

    public double getMainpay() {
        return mainpay;
    }
    public double getSale() {
        return sale;
    }
    public double getProvision() {
        return provision;
    }

    public void setMainpay(double mainpay) {
        this.mainpay = mainpay;
    }
    public void setSale(double sale) {
        this.sale = sale;
    }
    public void setProvision(double provision) {
        this.provision = provision;
    }
}
