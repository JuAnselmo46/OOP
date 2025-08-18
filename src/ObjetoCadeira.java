import java.util.Scanner;
public class ObjetoCadeira {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        class Cadeira{
            String modelo;
            String cor;
            double peso;
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
            public double getPeso() {
            return peso;

            }

            public void setPeso(double peso){
                this.peso = peso;
            }

            public String getMarca() {
                return marca;
            }
            public void setMarca(String marca) {
                this.marca = marca;
            }




        }

        System.out.println("Entre com o numero de cadeiras: ");
        int n = scan.nextInt();
        scan.nextLine();

        for(int i=0; i<n;i++) {


            System.out.println("Informe o modelo da cadeira: ");//]
            String modelo = scan.nextLine();
            System.out.println("Informe a cor da cadeira: ");
            String cor = scan.nextLine();
            System.out.println("Informe o peso da cadeira: ");
            double peso = scan.nextDouble();
            scan.nextLine();
            System.out.println("Informe a marca da cadeira: ");
           String marca = scan.nextLine();

            Cadeira cadeira = new Cadeira();

            cadeira.setModelo(modelo);
            cadeira.setCor(cor);
            cadeira.setPeso(peso);
            cadeira.setMarca(marca);


            System.out.println("Modelo: " + cadeira.getModelo());
            System.out.println("Cor: " + cadeira.getCor());
            System.out.println("Peso: " + cadeira.getPeso() + " kg");
            System.out.println("Marca: " + cadeira.getMarca());

        }
    }
}