import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ise gore qacanc
        double ofisiIs = 5;
        double sahaIs = 8;
        double remoteIs = 4;


        //istifadeci melumatlari
        Scanner sc = new Scanner(System.in);
        System.out.println("Adinizi daxil edin: ");
        String isciAdi = new Scanner(System.in).nextLine();

        System.out.println("Is novu daxil edin misal'Ofis','Saha','Remote'");
        String isNovu = new Scanner(System.in).nextLine();

        System.out.println("Is Saati daxil edin: ");
        int isSaati = new Scanner(System.in).nextInt();

        System.out.println("Is gunu daxil edin: ");
        int isGunu = new Scanner(System.in).nextInt();

        double maasNetice = isGunu * isSaati * ofisiIs;
        System.out.println("netice : "+ maasNetice);

        if (isGunu > 22){
            maasNetice = maasNetice + maasNetice * 0.10;
            System.out.println(maasNetice);
        }else {
            System.out.println(maasNetice);
        }
    }

}
