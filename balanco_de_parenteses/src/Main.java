import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            Stack<String> expressao = new Stack<>();
            expressao.push(sc.nextLine());
            String caracteres = expressao.pop();
            int temParentesesAMais = 0;
            for (int i = 0; i < caracteres.length(); i++) {
                char letra = caracteres.charAt(i);
                if (letra == '(') {
                    temParentesesAMais++;
                } else if (letra == ')') {
                    temParentesesAMais--;
                }
                if (temParentesesAMais < 0) {
                    break;
                }
            }
            if (temParentesesAMais == 0) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }
        sc.close();
    }
}