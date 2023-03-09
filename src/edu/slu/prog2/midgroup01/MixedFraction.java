package edu.slu.prog2.midgroup01;

import edu.slu.prog2.prelimgroup01.Fraction;

public class MixedFraction extends Fraction {

    //This part is edited by STEPHEN COLOMA, on March 9, 2023
    private int whole;
    public MixedFraction(){
        super();
        whole = 0;
    }

    public MixedFraction(int whole, Fraction fraction){
        super(fraction.getNumerator(), fraction.getDenominator());
        this.whole=whole;

    }

    public MixedFraction(int whole, int numerator, int denominator){
        super(numerator,denominator);
        this.whole=whole;
    }

    public MixedFraction(Fraction fraction){
        super(fraction.getNumerator(), fraction.getDenominator());
        this.whole = 0;
    }

}
