import java.util.Scanner;

public class Tela {
    static Scanner ler = new Scanner(System.in);
    
    public double pedirDouble(String mensagem) {
        System.out.println(mensagem);
        return ler.nextDouble();
    }

    
}
