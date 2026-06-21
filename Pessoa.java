public class Pessoa extends PessoaBase {

    public Pessoa(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura); 
    }

    @Override
    public String classificarIMC(double imc) {
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 25.0) return "Peso normal";
        else if (imc < 30.0) return "Sobrepeso";
        else return "Obesidade";
    }
}