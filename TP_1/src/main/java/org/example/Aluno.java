package org.example;

public class Aluno {
    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        setNome(nome);
        setNota1(nota1);
        setNota2(nota2);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula <= 0) {
            throw new IllegalArgumentException("A matrícula deve ser maior que zero.");
        }
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.length() < 4 || !nome.contains(" ")) {
            throw new IllegalArgumentException("O nome deve ter pelo menos quatro caracteres e deve conter nome e sobrenome.");
        }
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 < 0 || nota1 > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
        }
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 < 0 || nota2 > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
        }
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
}
