import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciJob {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int value, prevNumber=0, nextNumber=1, soma;
        List<Integer> list = new ArrayList<>();

        value = in.nextInt();

        for (int i = 0; i < 100; i++) {
            list.add(prevNumber);
            soma = prevNumber + nextNumber;
            prevNumber = nextNumber;
            nextNumber = soma;
        }

        if (list.contains(value)){
            System.out.println(value + " pertence a senquência");
        }else{
            System.out.println(value + " não pertence a senquência");
        }
    }
}
