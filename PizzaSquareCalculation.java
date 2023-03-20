
package com.auto.hw;

public class PizzaSquareCalculation {

    // S = Pi * D^2 / 4
    public PizzaSquareCalculation(double dia) {
        double resultS = multi(div(pow(dia)));
        System.out.println("Circle square => " + resultS);

    }

        public double pow ( double s){
            return Math.pow(s, 2);
        }

        public double div ( double d){
            return d / 4;
        }

        public double multi ( double m){
            return Math.PI * m;
        }

}
