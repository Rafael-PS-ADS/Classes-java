public class Boletim {

    public String exibirResultado(double media) {
        String situacao = "";

        if (media >= 6) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }

        return situacao;
    }

    public double calcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
    
}
