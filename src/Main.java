public class Main {
    public static void main(String[] args) {

        // Стоимость билета
        int ticketPrice = 20_543;

        // Расcчитываем количество миль
        int miles = ticketPrice / 20;

        // Выводим результат
        System.out.println("За купленный билет начисленно " + miles + " миль. ");
    }
}
