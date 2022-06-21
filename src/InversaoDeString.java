import java.util.Scanner;

public class InversaoDeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String job = "mereço uma vaga na JobRotation!";

        for (int i = job.length()-1; i >= 0 ; i--) {
            char letra = job.charAt(i);
            System.out.print(letra);
        }

        System.out.println("");

        String alt = in.nextLine();
        for (int i = alt.length()-1; i >= 0 ; i--) {
            char letra = alt.charAt(i);
            System.out.print(letra);
        }
    }
}
