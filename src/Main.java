import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int sayi;
    int toplam=0;
    Scanner input=new Scanner(System.in);
    System.out.print("Sayı giriniz:");
    sayi= input.nextInt();
    for(int i=1;i<sayi;i++){
        if(sayi%i==0){
            toplam=i+toplam;

        }
    }
        if(toplam==sayi){
            System.out.println("Girilen sayi mukemmel sayidir.");
        }
        else{
            System.out.println("Girilen sayi mukemmel sayi degldir.");

        }
    }
}