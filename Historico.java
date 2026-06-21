import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Historico {
    private double imc;
    private String classificacao;
    private LocalDateTime dataHora;

    public Historico(double imc, String classificacao) {
        this.imc = imc;
        this.classificacao = classificacao;
        this.dataHora = LocalDateTime.now(); 
    }

    public String getResumo() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return String.format("IMC: %.2f (%s) - Gerado em: %s", 
            this.imc, this.classificacao, this.dataHora.format(formatador));
    }
}