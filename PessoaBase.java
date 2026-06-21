public abstract class PessoaBase implements CalculadoraIMC {
    // VARIÁVEIS ESTÁTICAS E CONSTANTES (Critério 3)
    public static final int IDADE_MAXIMA = 130;
    public static final double PESO_MAXIMO = 500.0;
    public static final double ALTURA_MAXIMA = 3.0;

    private String nome; 
    private int idade; 
    private double peso; 
    private double altura; 
    
    // COMPOSIÇÃO: PessoaBase "TEM UM" Historico (Critério 9)
    private Historico ultimoHistorico; 

    public PessoaBase(String nomeInformado, int idadeInformada, double pesoInformado, double alturaInformada) {
        this.setNome(nomeInformado);
        this.setIdade(idadeInformada);
        this.setPeso(pesoInformado);
        this.setAltura(alturaInformada);
    }

    public void setUltimoHistorico(Historico historico) {
        this.ultimoHistorico = historico;
    }

    public Historico getUltimoHistorico() {
        return this.ultimoHistorico;
    }

    // --- GETTERS ---
    public String getNome() { return this.nome; }
    public int getIdade() { return this.idade; }
    public double getPeso() { return this.peso; }
    public double getAltura() { return this.altura; }

    // --- SETTERS COM VALIDAÇÃO ---
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new EntradaInvalidaException("O nome não pode ficar em branco.");
        }
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > IDADE_MAXIMA) {
            throw new EntradaInvalidaException("Idade deve ser entre 0 e " + IDADE_MAXIMA + " anos.");
        }
        this.idade = idade;
    }

    public void setPeso(double peso) {
        if (peso <= 0 || peso > PESO_MAXIMO) {
            throw new EntradaInvalidaException("Peso deve ser maior que 0 e menor que " + PESO_MAXIMO + "kg.");
        }
        this.peso = peso;
    }

    public void setAltura(double altura) {
        if (altura <= 0 || altura > ALTURA_MAXIMA) {
            throw new EntradaInvalidaException("Altura deve ser maior que 0 e menor que " + ALTURA_MAXIMA + " metros.");
        }
        this.altura = altura;
    }

    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public abstract String classificarIMC(double imc);
}