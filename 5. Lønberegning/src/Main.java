public class Main {
    public static void main(String[] args) {
        TimeBasedEmployee em1 = new TimeBasedEmployee();
        ProvisionBasedEmployee em2 = new ProvisionBasedEmployee();

        em1.setHourPay(160);
        em1.setHours(120.8);
        System.out.println("Timelønnet Medarbejder løn = "+em1.calculatePay()+
                " kr. - Timeløn = "+ em1.getHourPay()+
                " kr. - Antal Timer = "+ em1.getHours());

        em2.setMainpay(20000);
        em2.setSale(10000);
        em2.setProvision(10);
        System.out.println("Provisions Medarbejder Grundløn = "+em2.getMainpay()+
                " kr. - Salg = "+em2.getSale()+
                " kr. - Provision = "+ (em2.getProvision())+
                "% - giver en løn på "+em2.calculatePay()+" kr.");
    }
}
