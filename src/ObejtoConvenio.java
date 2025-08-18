import java.util.Scanner;

public class ObejtoConvenio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Convenio paciente = new Convenio();

        System.out.println("Informe o nome do paciente: ");
        paciente.setNome(ler.nextLine());

        System.out.println("Informe o tipo de plano paciente: ");
        paciente.setPlano(ler.nextLine());

        System.out.println("Informe a tarifa: ");
        paciente.setTarifa(ler.nextLine());

        System.out.println("O nome do paciente é: " + paciente.getNome());
        System.out.println("O o tipo de plano paciente é: " + paciente.getPlano());
        System.out.println("O a tarifa é: " + paciente.getTarifa());


    }
}



