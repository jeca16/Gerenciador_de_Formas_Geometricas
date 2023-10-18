package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Circulo implements Calcular{

    int raio, resposta;


    Scanner scanner = new Scanner(System.in);

    public void dadosCirculo(){
        System.out.println(" O que deseja calcular? [1-area do circulo, 2-perimetro do circulo");

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
        System.out.println(" por favor informe o valor do raio do circulo: ");
        raio = scanner.nextInt();
        scanner.nextLine();

        return 2 * Math.PI * raio;
    }

    @Override
    public double calcularPerimetro() {
        System.out.println(" por favor informe o valor do raio do circulo: ");
        raio = scanner.nextInt();
        scanner.nextLine();
        return Math.PI * Math.pow(raio, 2);
    }
}

