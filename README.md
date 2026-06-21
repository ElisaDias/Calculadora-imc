# SISTEMATIZAÇÃO 

### 👤 Aluna
* **Nome:** Elisa DIas
* **Disciplina:** Programação Orientada a Objetos
* **Semestre:** 2026/1

---

## 🚀 Descrição do Projeto
Este sistema é uma solução desenvolvida em **Java** para cadastro de usuários, cálculo automatizado e classificação do Índice de Massa Corporal (IMC), atendendo aos critérios do edital e estruturado exatamente sob a árvore de diretórios exigida.

**Critério 1: Tipos de dados e operadores**
Implementação: Uso de primitivos de precisão como double para armazenar peso/altura e operadores aritméticos na fórmula matemática do cálculo do IMC em PessoaBase.java.

**Critério 2: Controles de fluxo**

Implementação: Menu principal estruturado com loops while e condicionais switch-case no Main.java, além de estruturas if/else encadeadas para avaliar as faixas de peso.

**Critério 3: Variáveis estáticas e constantes**

Implementação: Constantes de validação limite (IDADE_MAXIMA, PESO_MAXIMO, ALTURA_MAXIMA) declaradas como public static final no topo da classe PessoaBase.java.

**Critério 4: Interface**

Implementação: Criação do arquivo CalculadoraIMC.java, definindo o contrato obrigatório de métodos que as classes do sistema devem assinar.

**Critério 5: Classe Abstrata**

Implementação: A classe PessoaBase.java foi definida com o modificador abstract, contendo a lógica concreta de calcularIMC() e a assinatura abstrata pura de classificarIMC().

**Critério 6: Encapsulamento**

Implementação: Atributos restritos com o modificador private em PessoaBase.java, controlados estritamente por métodos modificadores (setters) que barram dados incoerentes.

**Critério 7: Herança**

Implementação: As subclasses Pessoa.java (paciente comum) e Atleta.java estendem a superclasse utilizando a palavra-chave extends e reutilizam seu construtor via super().

**Critério 8: Polimorfismo**

Implementação: Sobrescrita dinâmica do método classificarIMC() usando a anotação @Override nas subclasses, aplicando regras e tabelas de corte de IMC completamente distintas para civis e atletas.

**Critério 9: Composição**

Implementação: A classe PessoaBase "tem um" Historico. Cada vez que o IMC é calculado, um objeto de Historico.java é instanciado e encapsulado dentro da pessoa, registrando o resultado junto com a data e hora exatas obtidas via LocalDateTime.now().

**Critério 10: Tratamento de Exceções com Exceção Personalizada**

Implementação: Criação da classe EntradaInvalidaException.java. O sistema dispara essa exceção caso dados absurdos passem pelos setters e o Main.java faz a captura segura usando blocos try/catch.

**Critério 11: Gerenciamento de dependências - pom.xml**

Implementação: Inclusão do arquivo pom.xml na raiz do projeto, padronizando o ecossistema e o ciclo de vida do software sob o gerenciador Apache Maven.

**Critério 12: Sistema funcional com menu CLI completo**

Implementação: Console interativo desenvolvido no Main.java que roda continuamente de forma robusta e limpa, blindado contra quebras de buffer do Scanner.

**Critério 13: Documentação README**

Implementação: Este próprio arquivo explicativo e descritivo.

## 📦 Como Compilar e Executar

O projeto segue a estrutura padrão exigida, com os arquivos fontes organizados no subdiretório do sistema. Para compilar e executar a aplicação direto pelo terminal na raiz do projeto, utilize os comandos:

1. **Compile todos os códigos-fonte de uma única vez:**
   ```bash
   javac src/main/java/*.java
