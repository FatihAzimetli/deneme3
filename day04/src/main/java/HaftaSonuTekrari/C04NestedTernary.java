package HaftaSonuTekrari;

import java.util.Scanner;

public class C04NestedTernary {
    public static void main(String[] args) {
         /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Bir'inci Tam sayiyiyi giriniz...");
        int a = input.nextInt();

        System.out.println("Lütfen ikinci tam sayiyi giriniz...");
        int b = input.nextInt();


        System.out.println(a==b ? "Sayilar birbirine esit" : a > b ? a : b);




    }
}

