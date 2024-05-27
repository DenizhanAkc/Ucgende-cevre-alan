import java.util.Scanner;

public class cevreAlan
{
    public static void main(String[] args) {

        // Hipotenus hesabimiz icin degiskenlerimizi tanimlayalim.
        int a, b, c;
        //Scanner sinifimizi tanimladik.
        Scanner girdi = new Scanner(System.in);

        //Kullanicidan deger alalim.
        System.out.print("1.kenar : ");
        a = girdi.nextInt();

        System.out.print("2. kenar : ");
        b = girdi.nextInt();

        System.out.print("3. Kenar : ");
        c = girdi.nextInt();


        double u;
        u = (a + b + c) / 2;
        double cevre = 2 * u;
        System.out.println("Ucgenin cevresi: " + cevre);

        double alan;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Ucgenin alani : " + alan);
    }
}
