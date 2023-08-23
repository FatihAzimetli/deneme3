import java.util.Scanner;

public class C001Ifstatements {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı isteyin
        //sayıların ikisi de pozitifse sayıların toplamını yazdırın
        //ikisi de negatifse sayıların çarpımını yazdırın
        //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
        //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın

        Scanner inpput = new Scanner(System.in);

        System.out.println("Lütfen birinci Tam sayi giriniz..");
        int sayi1 = inpput.nextInt();

        System.out.println("Lütfen ikici Tam sayiyi giriniz");
        int sayi2 = inpput.nextInt();

        if (sayi1>0 && sayi2>0){
            System.out.println(sayi1+sayi2);
        }else if(sayi1<0 && sayi2<0){
            System.out.println(sayi1*sayi2);
        } else if (sayi1>0 && sayi2<0 || (sayi1<0 && sayi2>0)) {
            System.out.println("Frkli isaretli sayilarla islem yapamazsin");
        }else{
            System.out.println("Sifir carpmaya göre yutan elemandir");
        }


    }
}
