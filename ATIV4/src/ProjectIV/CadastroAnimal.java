package ProjectIV;

public class CadastroAnimal {
    public static void main(String[] args){
        Cachorro dog = new Cachorro("null");
        dog.setNome("Sif");

        Peixe fish = new Peixe();
        fish.setNome("XYZ");

        Formiga ant = new Formiga();
        ant.pernas = 6;

        System.out.println("Nome do cachorro: "+dog.getNome());
        dog.brinca();
        dog.come();
        System.out.println();

        System.out.println("Nome do peixe "+fish.getNome());
        fish.come();
        fish.brinca();
        System.out.println();

        ant.come();
    }
}
