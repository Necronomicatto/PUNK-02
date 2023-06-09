package ProjectIV;

public class Peixe extends Animal implements AnimalEstimacao{
    private String nome;

    public Peixe(){
        pernas = 0;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void brinca() {
        System.out.println(nome +" esta nadando.");
    }

    @Override
    public void come(){
        System.out.println(nome +"come plankton e insetos.");
    }

}
