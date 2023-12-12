import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double amount, vatRatio;
        Scanner input = new Scanner(System.in);
        System.out.print("Ucreti giriniz : ");
        amount = input.nextDouble();

        if (amount <= 1000){
            vatRatio = 0.18;
        }
        else{
            vatRatio = 0.08;
        }

        double vatAmount = amount * vatRatio;
        double vatFee = vatAmount + amount;
        System.out.println("KDV'siz fiyat = " + amount + " TL");
        System.out.println("KDV'li fiyat = " + vatFee + " TL");
        System.out.println("KDV tutar = " + vatAmount + " TL");
    }
}