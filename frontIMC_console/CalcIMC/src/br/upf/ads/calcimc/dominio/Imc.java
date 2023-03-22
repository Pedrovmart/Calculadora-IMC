/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ads.calcimc.dominio;

/**
 *
 * @author User
 */
public class Imc {
    
    private Integer cpf;
    private String nome;
    private Double peso;
    private Double altura;
    
    // cálculo do IMC
    public Double calcularImc(){
        Double imc = getPeso()/(Math.pow(getAltura(), 2));
        return imc;
    }
    
    // verificação de IMC
    public String statusImc(){
        Double imc = calcularImc();
        if(imc < 18.5){
            return "Baixo peso.";
        }else if(18.6 < imc && imc < 24.9){
            return "Peso Normal.";            
        }else if(25 < imc && imc < 29.9){
            return "Sobrepeso.";
        }else if(30 < imc && imc < 34.9){
            return "Obesidade grau 1.";
        }else if(35 < imc && imc < 39.9){
            return "Obesidade grau 2.";
        } else {
            return "obesidade grau 3.";
        }
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    
}
