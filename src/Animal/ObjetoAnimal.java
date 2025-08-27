package Animal;

public class ObjetoAnimal {
    public static void main(String [] args) {

        Animal animal1 = new Animal("Marrom", 45);
        Animal animal2 = new Animal("Branco", 22);

        System.out.println(animal1.getCor());
        System.out.println(animal1.getTamanho());

        System.out.println(animal2.getCor());
        System.out.println(animal2.getTamanho());
    }
}




