public class Atleta extends PessoaBase {

    public Atleta(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura); 
    }

    @Override
    public String classificarIMC(double imc) {
        if (imc < 20.0) return "Abaixo do peso esperado (Atleta)";
        else if (imc < 27.0) return "Composição corporal adequada (Atleta)";
        else if (imc < 32.0) return "Sobrepeso (Atleta)";
        else return "Obesidade (Atleta)";
    }
}