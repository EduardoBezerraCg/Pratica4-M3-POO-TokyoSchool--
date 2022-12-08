import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        String marca;
        String modelo;
        int Hd;

        System.out.println("Introduza a marca");
        marca = scan.nextLine();

        System.out.println("Introduza a modelo");
        modelo = scan.nextLine();

        System.out.println("Introduza o Hd");
        Hd = scan.nextInt();

        Pc pc1 = new Pc("Lenovo", "21-C", 512);
    }
}