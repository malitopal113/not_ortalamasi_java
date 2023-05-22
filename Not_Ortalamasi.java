import java.util.Scanner;
public class Not_Ortalamasi {

    public static void main(String[] args) {
        System.out.println("Not Ortalaması Hesapla");
        
        Scanner inp = new Scanner(System.in);

        int mat, fizik, kimya, bioloji, resim, müzik;
        
        System.out.print("Matematik Notunuz:");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya = inp.nextInt();

        System.out.print("Bioloji Notunuz:");
        bioloji = inp.nextInt();

        System.out.print("Resim Notunuz:");
        resim = inp.nextInt();

        System.out.print("Müzik Notunuz:");
        müzik = inp.nextInt();

        double result = (mat + fizik + kimya + müzik + resim + bioloji) / 6;

        System.out.println("Not Ortalamanız: " + result);
        
        String stResult = result >= 60 ? "Sınıfı Geçtiniz..." : "Sınıfta Kaldınız!";

        System.out.println(stResult);


 




        }
}