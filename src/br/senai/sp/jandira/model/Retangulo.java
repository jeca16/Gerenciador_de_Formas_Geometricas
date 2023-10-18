package br.senai.sp.jandira.model;

import java.util.Scanner;


public class Retangulo implements Calcular{

    int base, altura;
    Scanner scanner = new Scanner(System.in);

    public void dadosRetangulo(){
        System.out.println(" O que deseja calcular? [1-area do Retângulo, 2-perimetro do Retângulo");

        int option = scanner.nextInt();
        switch (option){
            case 1:
                Double resultado = calcularArea();
                System.out.println(resultado);
                break;

            case 2:
                Double resultado2 = calcularPerimetro();
                System.out.println(resultado2);
                break;
        }
    }

    @Override
    public double calcularArea() {
        System.out.println(" informe a base do retângulo: ");
        base = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" informe a altura do retângulo: ");
        altura =  scanner.nextInt();
        scanner.nextLine();

        return base * altura;

    }

    @Override
    public double calcularPerimetro() {
        System.out.println(" informe a base do retângulo: ");
        base = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" informe a altura do retângulo: ");
        altura =  scanner.nextInt();
        scanner.nextLine();

        return  2 * (base + altura);
    }
}
