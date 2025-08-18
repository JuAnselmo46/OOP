import java.util.Scanner;
public class ObjetoComputador {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        class Computador{
            String modelo;
            String cor;
            String marca;

            public void setModelo(String modelo){
                this.modelo = modelo;
            }

            public String getModelo() {
                return modelo;
            }
            public String getCor(){
                return cor;
            }
            public void setCor(String cor){
                this.cor = cor;
            }

            public String getMarca() {
                return marca;
            }
            public void setMarca(String marca) {
                this.marca = marca;
            }




        }

        System.out.println("Entre com o numero de computadores: ");
        int n = ler.nextInt();
        ler.nextLine();

        for(int i=0; i<n;i++) {


            System.out.println("Informe o modelo do computador: ");//]
            String modelo = ler.nextLine();
            System.out.println("Informe a cor do computador: ");
            String cor = ler.nextLine();
            System.out.println("Informe a marca do computador: ");
            String marca = ler.nextLine();

            Computador computador = new Computador();

            computador.setModelo(modelo);
            computador.setCor(cor);
            computador.setMarca(marca);


            System.out.println("Modelo: " + computador.getModelo());
            System.out.println("Cor: " + computador.getCor());
            System.out.println("Marca: " + computador.getMarca());




        }
    }
}