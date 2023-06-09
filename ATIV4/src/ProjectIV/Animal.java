package ProjectIV;

abstract class Animal {
    int pernas;

    public Animal() {
        pernas = 0;
    }

    public void caminha(){
        System.out.println("Este animal possui "+pernas+" pernas");
    }

    public abstract void come();
}
