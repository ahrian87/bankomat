import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money_amount = 10000;

        System.out.print("Podaj kwotę do wypłaty (1 - " + money_amount + " zł): ");
        int money_to_with = sc.nextInt();

        System.out.println("Wypłaciłeś: " + money_to_with + " zł");
        System.out.println("Aktualny stan konta: " + (money_amount - money_to_with) + " zł");
    }
}