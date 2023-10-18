package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
    public void executarMenu(){

        boolean continuar = true;
        do {
            System.out.println("-------------------------------- Menu-----------------------------");
            System.out.println("1 - calcular circulo");
            System.out.println("2 - calcular retangulo");
            System.out.println("3 - sair");
            System.out.println("------------------------------------------------------------------");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    Circulo circulo = new Circulo();
                    circulo.dadosCirculo();
                    break;

                case 2:
                    Retangulo retangulo = new Retangulo();
                    retangulo.dadosRetangulo();
                    break;

                case 3:
                    continuar = false;
                      break;
            }

        }while (continuar);
    }
}
