# 🧮 Calculadora Java Swing

Uma calculadora simples desenvolvida em Java utilizando Swing para interface gráfica, criada como projeto acadêmico para a disciplina de Programação Orientada a Objetos.

## 📋 Descrição

Este projeto implementa uma calculadora básica com interface gráfica intuitiva, permitindo realizar as quatro operações matemáticas fundamentais: adição, subtração, multiplicação e divisão.

## ✨ Funcionalidades

- **Operações básicas**: Soma (+), Subtração (-), Multiplicação (×), Divisão (÷)
- **Interface gráfica intuitiva**: Campos para entrada de números e botões para operações
- **Teclado numérico**: Botões de 0-9 para entrada de dados
- **Validação de entrada**: Tratamento de divisão por zero
- **Layout responsivo**: Interface organizada com GridBagLayout

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Java Swing** para interface gráfica
- **Maven** para gerenciamento de dependências
- **JUnit 5** para testes unitários

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 17 ou superior
- Maven 3.6 ou superior

### Compilação e Execução

1. **Clone o repositório:**
   ```bash
   git clone [URL_DO_SEU_REPOSITORIO]
   cd Atividade-Calculadora-JavaSwing
   ```

2. **Compile o projeto:**
   ```bash
   mvn clean compile
   ```

3. **Execute a aplicação:**
   ```bash
   mvn exec:java -Dexec.mainClass="br.com.gabriel.calculadora.CalculadoraApp"
   ```

   Ou execute diretamente:
   ```bash
   java -cp target/classes br.com.gabriel.calculadora.CalculadoraApp
   ```

### Executar Testes
```bash
mvn test
```

### Gerar Documentação
```bash
mvn javadoc:javadoc
```

## 📁 Estrutura do Projeto

```
src/
├── main/java/br/com/gabriel/calculadora/
│   ├── Calculadora.java          # Classe com lógica das operações matemáticas
│   └── CalculadoraApp.java       # Interface gráfica principal
└── test/java/br/com/gabriel/calculadora/
    └── CalculadoraTest.java      # Testes unitários
```

## 🔧 Arquitetura

### Classe `Calculadora`
- Implementa as operações matemáticas básicas
- Método `calcular()` que recebe dois números e um operador
- Tratamento de exceções para divisão por zero

### Classe `CalculadoraApp`
- Interface gráfica usando Swing
- Layout organizado com GridBagLayout
- Campos de entrada para números
- Botões para operações matemáticas
- Teclado numérico integrado

## 🧪 Testes

O projeto inclui testes unitários para validar as operações matemáticas:
- Testes de soma, subtração, multiplicação e divisão
- Validação de divisão por zero
- Testes com números decimais

## 📦 Dependências

- **JUnit Jupiter API 5.10.0** - Framework de testes
- **JUnit Jupiter Engine 5.10.0** - Executor de testes

## 👨‍💻 Desenvolvedor

**Gabriel Franco** - Estudante de Programação Orientada a Objetos

## 📚 Disciplina

**Programação Orientada a Objetos** - Quarto Período, Primeiro Bimestre  
**Professora:** Thalyse Duarte

## 📝 Licença

Este projeto foi desenvolvido para fins acadêmicos.

## 🤝 Contribuições

Este é um projeto acadêmico, mas sugestões e melhorias são sempre bem-vindas!

---

**Nota:** Este projeto demonstra conceitos fundamentais de POO como encapsulamento, herança e polimorfismo, além de boas práticas de desenvolvimento Java. 