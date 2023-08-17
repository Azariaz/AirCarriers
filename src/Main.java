public class Main {
    public static void main(String[] args) {

        int ticketPrice = 18249; // Стоимость билета
        int oneMillInRub = 20; // Кол-во руб. для одной бонусной мили

        int bonusRub = ticketPrice / oneMillInRub; // Кол-во начисленных миль за купленный билет

        System.out.println(bonusRub);

    }
}
