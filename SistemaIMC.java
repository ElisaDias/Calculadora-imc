import java.util.Scanner;

public class SistemaIMC {
    public void executar() {
        Scanner teclado = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n Bem vindo ao sistema!");
            System.out.println("1 - Cadastrar e Calcular IMC");
            System.out.println("0 - Sair do Sistema");
            System.out.print("Escolha uma opção: ");

            opcao = teclado.nextInt();
            teclado.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("\n--- CADASTRO E CÁLCULO ---");
                    System.out.print("Digite o nome: ");
                    String nome = teclado.nextLine();

                    System.out.print("Digite a idade: ");
                    int idade = teclado.nextInt();

                    System.out.print("Digite o peso: ");
                    double peso = teclado.nextDouble();

                    System.out.print("Digite a altura: ");
                    double altura = teclado.nextDouble();

                    System.out.println("Tipo de perfil: 1 - Paciente Comum | 2 - Atleta");
                    System.out.print("Escolha: ");
                    int tipo = teclado.nextInt();
                    teclado.nextLine();

                    try {
                        PessoaBase pessoaCadastrada;
                        
                        if (tipo == 2) {
                            pessoaCadastrada = new Atleta(nome, idade, peso, altura);
                        } else {
                            pessoaCadastrada = new Pessoa(nome, idade, peso, altura);
                        }

                        double imc = pessoaCadastrada.calcularIMC();
                        String classificacao = pessoaCadastrada.classificarIMC(imc);

                        Historico novoHistorico = new Historico(imc, classificacao);
                        pessoaCadastrada.setUltimoHistorico(novoHistorico);

                        System.out.println("\n--------------------------");
                        System.out.println("Nome: " + pessoaCadastrada.getNome());
                        System.out.println(pessoaCadastrada.getUltimoHistorico().getResumo()); 
                        System.out.println("--------------------------");
                        
                    } catch (EntradaInvalidaException e) {
                        System.out.println("\n❌ ERRO DE VALIDAÇÃO: " + e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("\nEncerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("\n Opção inválida! Tente novamente.");
                    break;
            }
        }
        teclado.close();
    }
}