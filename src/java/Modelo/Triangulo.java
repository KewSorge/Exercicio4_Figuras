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
public class Triangulo {
    private int base;
    private int altura;
    private double area;

    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public double getArea(){
        return area;
    }
    public void setArea(double area){
        this.area=area;
    }
    public void calArea(){
        area = (base*altura)/2;
    }
    
}
