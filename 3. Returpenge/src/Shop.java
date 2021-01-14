public class Shop {

    public int buy(int price, int paid){
        if (paid < 0 || price < 0){
            throw new NullPointerException("Beløbet eller prisen må ikke være negative tal");
        } else if (paid-price < 0){
            throw new NullPointerException("Det betalte beløb er for lille i forhold til prisen");
        }
        int change = paid - price;
        System.out.println(changeBack(change));
        return change;
    }

    private String changeBack(int change){
        System.out.println("Byttepenge: "+change+" kr =");
        int hundred = change/100;
        change = change%100;
        int fifty = change / 50;
        change = change % 50;
        int twenty = change / 20;
        change = change % 20;
        int ten = change / 10;
        change = change % 10;
        int five = change / 5;
        change = change % 5;
        int two = change / 2;
        change = change % 2;
        int one = change;
        change = 0;
        StringBuilder money = new StringBuilder();
        if (hundred > 0) {
            money.append(hundred).append(" x 100\n");
        }
        if (fifty > 0){
            money.append(fifty).append(" x 50\n");
        }
        if (twenty > 0){
            money.append(twenty).append(" x 20\n");
        }
        if (ten > 0){
            money.append(ten).append(" x 10\n");
        }
        if (five > 0){
            money.append(five).append(" x 5\n");
        }
        if (two > 0){
            money.append(two).append(" x 2\n");
        }
        if (one > 0) {
            money.append(one).append(" x 1\n");
        }
        return String.valueOf(money);
    }
}
