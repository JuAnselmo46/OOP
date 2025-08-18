import java.util.Scanner;
public class ObjetoFuncionario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Informe o nome do funcionario: ");
        funcionario.setNome(ler.nextLine());

        System.out.println("Informe o endereco do funcionario: ");
        funcionario.setEndereco(ler.nextLine());

        System.out.println("Informe o CPF do funcionario: ");
        funcionario.setCpf(ler.nextInt());

        System.out.println("Informe o telefone do funcionario: ");
        funcionario.setTelefone(ler.nextInt());

        System.out.println("Informe o cargo do funcionario: ");
        funcionario.setCargo(ler.nextLine());

        ler.nextLine();

        System.out.println("Informe a data de adimissao do funcionario: ");
        funcionario.setDataAdimissao(ler.nextInt());

        System.out.println("Informe a data de demissao do funcionario: ");
        funcionario.setDataDeDemissao(ler.nextInt());

        System.out.println("Informe o email do funcionario: ");
        funcionario.setEmail(ler.nextLine());

        ler.nextLine();

        System.out.println("Informe o sexo do funcionario: ");
        funcionario.setSexo(ler.next().charAt(0));
        ler.nextLine();

        System.out.println("Informe o nível de escolaridade do funcionário: ");
        funcionario.setNivelDeEscolaridade(ler.nextLine());

        System.out.println("O nome do paciente é: " + funcionario.getNome());
        System.out.println("O o endereco do funcionario é: " + funcionario.getEndereco());
        System.out.println("O o CPF do funcionario é: " + funcionario.getCpf());
        System.out.println("O o telefone do funcionario é: " + funcionario.getTelefone());
        System.out.println("O cargo do funcionario é: " + funcionario.getCargo());
        System.out.println("O a data de adimissao do funcionario é: " + funcionario.getDataAdimissao());
        System.out.println("O a data de demissao do funcionario é: " + funcionario.getDataDeDemissao());
        System.out.println("O o email do funcionario é: " + funcionario.getEmail());
        System.out.println("O  sexo do funcionario é: " + funcionario.getSexo());
        System.out.println("O nivel de escolaridade do funcionario é: " + funcionario.getNivelDeEscolaridade());
    }
}




























