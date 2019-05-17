/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Kewen Sorge
 */
public class Retangulo {
    private int base;
    private int altura;
    private double area;

    /*public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }*/

    public Retangulo() {
      
    }

    public double getBase() {
        return base;
    }

    public void setBase(int B) {
        this.base = B;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int A) {
        this.altura = A;
    }
    public void setArea(double area){
        this.area = area;
    }
    
    public  double  getArea(){
        return area;
    }

    public void calArea(){
        area = base*altura;
    }
    
}
