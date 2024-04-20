/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polinomios;

/**
 *
 * @author chava
 *It stores information about a term of a polynomial and links it to the 
 * next term.
 */
class Nodo {
      double coefficient;
    int exponent;
    Nodo next;
/**
 * 
 * @param coefficient; Stores the coefficient of the polynomial term.
 * @param exponent ; Stores the exponent of the polynomial term.
 */
    public Nodo(double coefficient, int exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
        this.next = null;
    }
}
