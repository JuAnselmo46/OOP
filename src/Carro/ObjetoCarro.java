package Carro;

public class ObjetoCarro {
    public static void main(String [] args) {

        Carro carro1 = new Carro("AIKlO",365);
        Carro carro2 = new Carro("JYllACC",2435);

        System.out.println(carro1.getPlaca());
        System.out.println(carro1.getNumChassi());

        System.out.println(carro2.getPlaca());
        System.out.println(carro2.getNumChassi());
    }
}


