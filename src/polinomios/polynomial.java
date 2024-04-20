/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polinomios;

/**
 *
 * @author chava
 *  Represents a polynomial and provides methods for working with polynomial
 * terms.
 */
class polynomial {
     
    Nodo head;

    public polynomial() {
        this.head = null;
    }

   
    public void insertTerm(double coefficient, int exponent) {
        Nodo newTerm = new Nodo(coefficient, exponent);
        if (head == null) {
            head = newTerm;
        } else {
            Nodo actual = head;
            while (actual.next != null) {
                actual = actual.next;
            }
            actual.next = newTerm;
        }
    }
    /**
     * 
     * @param x Calculates the value of the polynomial for a given value of x.
     * @return The result of evaluating the polynomial for the given value of x.
     */
       public double calculate(double x) {
        double result = 0;
        Nodo actual = head;
        while (actual != null) {
            result += actual.coefficient * Math.pow(x, actual.exponent);
            actual = actual.next;
        }
        return result;
    }


      public static void main(String[] args) {
       // Crear el polynomial
        polynomial polynomial = new polynomial();
        polynomial.insertTerm(2, 5);  
        polynomial.insertTerm(-4, 3); 
        polynomial.insertTerm(11, 0); 

      
        System.out.println("Tabla de valores del polinomio:");
        System.out.println("x\t|\tP(x)");
        System.out.println("-----------------------");
        for (double x = 0.0; x <= 5.0; x += 0.5) {
            double result = polynomial.calculate(x);
            System.out.println(x + "\t|\t" + result);
        }
    }
}
    
