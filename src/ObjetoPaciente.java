import java.util.Scanner;
public class ObjetoPaciente {
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);
        Paciente paciente = new Paciente();

        System.out.println("Informe o nome do paciente: ");
        paciente.setNome(ler.nextLine());

        System.out.println("Informe o endereco do paciente: ");
        paciente.setEndereco(ler.nextLine());

        System.out.println("Informe o CPF do paciente: ");
        paciente.setCpf(ler.nextInt());

        System.out.println("Informe o sexo do paciente: ");
        paciente.setSexo(ler.next().charAt(0));

        System.out.println("Informe o nivel de escolaridade do paciente: ");
        paciente.setNivelDeEscolaridade(ler.nextLine());

        ler.nextLine();

        System.out.println("Informe o email do paciente: ");
        paciente.setEmail(ler.nextLine());

        System.out.println("Informe a data de nascimento do paciente: ");
        paciente.setDataDeNascimento(ler.nextInt());

        System.out.println("Informe o telefone do paciente: ");
        paciente.setTelefone(ler.nextInt());

        System.out.println("O nome do paciente é: " + paciente.getNome());

        System.out.println("O endereço do paciente é: " + paciente.getEndereco());

        System.out.println("O CPF do paciente é: " + paciente.getCpf());

        System.out.println("O sexo do paciente é: " + paciente.getSexo());


        System.out.println("O nivel de escolaridade do paciente é: " + paciente.getNivelDeEscolaridade());

        System.out.println("O email do paciente é: " + paciente.getEmail());

        System.out.println("A data de nascimento do paciente é: " + paciente.getDataDeNascimento());

        System.out.println("O telefone do paciente é: " + paciente.getTelefone());



    }



}


//String nome;
//String endereco;
//int cpf;
//char sexo;
//String nivelDeEscolaridade;
//String email;
//int dataDeNascimento;
//int telefone;