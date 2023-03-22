/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.upf.ads.calcimc.dominio;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class FrontImc {
    static ArrayList<Imc> listaImc = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("BEM VINDO A CALCULADORA DE IMC!");
        while (true) {
            System.out.println("Para calcular um novo IMC digite 'N'");
            System.out.println("Para listar todos IMC's calculados digite 'L'");
            System.out.println("Para sair do programa digite 'S'");
            System.out.print("Opção: ");
            Scanner sc = new Scanner(System.in);
            String lido = sc.next();
            
            
            lido = lido.toUpperCase();
            if(lido.equals("S")){
                break;
            } else if(lido.equals("N")){
                Imc imc = criarImc();
                mostrarImc(imc);
                listaImc.add(imc);
            } else if(lido.equals("L")){
                for(Imc imc : listaImc){
                    mostrarListaImc(imc);
                }
            }
            
            
        }
    }

    private static Imc criarImc() {
        Scanner sc = new Scanner(System.in);
        Imc imc = new Imc();
        System.out.print("CPF:");
        imc.setCpf(sc.nextInt());
        sc.nextLine();
        System.out.print("Nome: ");
        imc.setNome(sc.nextLine());
        System.out.print("Altura (ex: 1,75m): ");
        imc.setAltura(sc.nextDouble());
        System.out.print("Peso (ex: 80kg): ");
        imc.setPeso(sc.nextDouble());
        return imc;
        
    }

    private static void mostrarImc(Imc imc) {
        System.out.println("");
        System.out.println("Seu IMC é de " + imc.calcularImc());
        System.out.println("O status de seu IMC é de: " + imc.statusImc());
        System.out.println("");
    }

    private static void mostrarListaImc(Imc imc) { 
        for (Integer i=1; i <= listaImc.size(); i++ ){
            System.out.println(i + ": IMC = " + imc.calcularImc());
        }
    }
    
}
