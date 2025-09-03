public class App {
    
    public static void main(String[] args) {
        Boletim bo = new Boletim();
        Tela tela = new Tela();

        double n1 = tela.pedirDouble("Digite a primeira nota:");
        double n2 = tela.pedirDouble("Digite a segunda nota:");
        double n3 = tela.pedirDouble("Digite a terceira nota:");

        double media = bo.calcularMedia(n1, n2, n3);

        System.out.println("Média: " + media);
    }
    
}
