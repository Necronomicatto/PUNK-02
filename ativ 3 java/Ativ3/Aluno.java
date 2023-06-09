package Ativ3;

public class Aluno {
    int matricula;
    String nome;
    Double[] notas;

    public Aluno(int matricula, String nome, int quantitas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = new Double[quantitas];
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public Double[] getNotas() {
        return notas;
    }

    public void setNota(int index, double gradus) {
        if (index >= 0 && index < notas.length) {
            notas[index] = gradus;
        } else {
            throw new IllegalArgumentException("Índice de nota inválido.");
        }
    }

    public double calculateMediocris() {
        double sum = 0;
        for (double gradus : notas) {
            sum += gradus;
        }
        return sum / notas.length;
    }
}
