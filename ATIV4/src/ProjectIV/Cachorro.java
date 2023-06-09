package ProjectIV;

public class Cachorro extends Animal implements AnimalEstimacao{
    private String nome;

    public Cachorro(String nome){
        super();
        this.nome = nome;
        pernas = 4;

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void brinca(){
        System.out.println(nome+" esta brincando.");
    }
    public void come(){
        System.out.println(nome+ "come ração");
    }
}


