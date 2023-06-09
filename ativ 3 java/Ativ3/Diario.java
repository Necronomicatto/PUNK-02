package Ativ3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Diario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Aluno> alumni = new ArrayList<>();

        while (true) {
            System.out.print("Digite a matrícula do aluno (0 para sair): ");
            int matricula = scanner.nextInt();
            if (matricula == 0) {
                break;
            }

            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.next();

            System.out.print("Digite a quantidade de notas: ");
            int quantitas = scanner.nextInt();

            Aluno alumnus = new Aluno(matricula, nome, quantitas);

            for (int i = 0; i < quantitas; i++) {
                System.out.print("Digite a nota " + (i + 1) + ": ");
                double nota = scanner.nextDouble();
                alumnus.setNota(i, nota);
            }

            alumni.add(alumnus);
        }

        System.out.println("\nLista de Alunos:");
        System.out.println("Matrícula\tNome\t\tNotas\t\tMédia");
        for (Aluno aluno : alumni) {
            System.out.print(aluno.getMatricula() + "\t\t");
            System.out.print(aluno.getNome() + "\t\t");
            for (double nota : aluno.getNotas()) {
                System.out.print(nota + "\t");
            }
            System.out.print(aluno.calculateMediocris() + "\n");
        }

        System.out.println("\nTotal de alunos: " + alumni.size());

        double mediaGeral = 0;
        for (Aluno aluno : alumni) {
            mediaGeral += aluno.calculateMediocris();
        }
        mediaGeral /= alumni.size();
        System.out.println("Média geral: " + mediaGeral);
    }
}

