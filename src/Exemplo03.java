import java.util.Scanner;

class Pessoa {
    String nome;
    int idade;
    String endereco;
    String profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do objeto pessoa1
        Pessoa pessoa1 = new Pessoa();
        System.out.println("Digite o nome da pessoa 1:");
        pessoa1.setNome(scanner.nextLine());
        System.out.println("Digite a idade da pessoa 1:");
        pessoa1.setIdade(scanner.nextInt());
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.println("Digite o endereço da pessoa 1:");
        pessoa1.setEndereco(scanner.nextLine());
        System.out.println("Digite a profissão da pessoa 1:");
        pessoa1.setProfissao(scanner.nextLine());


        // Criação do objeto pessoa2
        Pessoa pessoa2 = new Pessoa();
        System.out.println("Digite o nome da pessoa 2:");
        pessoa2.setNome(scanner.nextLine());
        System.out.println("Digite a idade da pessoa 2:");
        pessoa2.setIdade(scanner.nextInt());
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.println("Digite o endereço da pessoa 2:");
        pessoa2.setEndereco(scanner.nextLine());
        System.out.println("Digite a profissão da pessoa 2:");
        pessoa2.setProfissao(scanner.nextLine());


        // Apresentação dos objetos
        System.out.println("\n----- OBJETO 1 -----");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Endereço: " + pessoa1.getEndereco());
        System.out.println("Profissão: " + pessoa1.getProfissao());

        System.out.println("\n----- OBJETO 2 -----");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("Endereço: " + pessoa2.getEndereco());
        System.out.println("Profissão: " + pessoa2.getProfissao());

        scanner.close();
    }
}