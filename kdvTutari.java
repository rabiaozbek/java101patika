import java.util.Scanner;


public class kdvTutari {
    public static void main(String[] args)  {
        // değişkenkleri oluştur
        double tutar , kdvOran =0.18 ;
        // scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);
        // kullanıcıdan değerleri al
        System.out.println("ücret tutarını giriniz:");
        tutar = inp.nextDouble();
        boolean durum1 , durum2;
        durum1 =(tutar<=1000);
        kdvOran =0.18 ;
        durum2 = (tutar>1000);
        kdvOran = 0.8;
        double kdvTutar = tutar*kdvOran;
        System.out.println(kdvTutar);












        }


        }






