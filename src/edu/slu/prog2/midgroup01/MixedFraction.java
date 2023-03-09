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
    //This part is edited by EMMANUEL BROMEO, on March 9, 2023
    /** this methods sets the whole number part of the mixed fraction */
    public void setWholePart(int whole){
        this.whole = whole;
    }
    /** this method sets the fraction part of the mixed fraction */
    public void setFractionPart(Fraction fraction){
        super.setNumerator(fraction.getNumerator());
        super.setDenominator(fraction.getDenominator());

    }

    //This part is edited by REY DANIEL ROQUE, on March 9, 2023
    /** this method gets the value of the whole number part of the mixed fraction*/
    public int getWhole(){
        return whole;
    }

    /** this method gets the value of the numerator and denominator which returns it as a fraction*/
    public Fraction getFractionPart(){
        Fraction result = new Fraction(getNumerator(), getDenominator());
        return result;
    }
}
