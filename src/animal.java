import java.util.Scanner;

class animal {
    String nome;
    String especie;
    int idade;
    double peso;

    public String getNome () {
        return nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public int getIdade () {
        return idade;
    }
    public void setIdade (int idade) {
        this.idade = idade;
    }
    public String getEspecie () {
        return especie;
    }
    public void setEspecie (String especie) {
        this.especie = especie;
    }
    public double getPeso () {
        return peso;
    }
    public void setPeso (double peso) {
        this.peso = peso;
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do objeto animal1
        animal animal1 = new animal();
        System.out.println("Informe o nome do animal: ");
        animal1.setNome(scanner.nextLine());

        System.out.println("Informe a idade do animal: ");
        animal1.setIdade(scanner.nextInt());

        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("Informe a especie do animal: ");
        animal1.setEspecie(scanner.nextLine());

        System.out.print("Informe o peso do animal: ");
        animal1.setPeso(scanner.nextDouble());

        // Apresentação dos objetos
        System.out.println("nome: " + animal1.getNome());
        System.out.println("idade: " + animal1.getIdade());
        System.out.println("especie: " + animal1.getEspecie());
        System.out.println("peso: " + animal1.getPeso());


    }

    }



