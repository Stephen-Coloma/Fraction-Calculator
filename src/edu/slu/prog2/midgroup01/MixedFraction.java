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

    //This part is edited by STEPHEN COLOMA, on March 9, 2023
    /**This method adds up Mixed Fractions. If the fraction part of the result is improper,
     make it Mixed Fractions and it's whole num will be added to the result's whole num.
     Returns Mixed Fractions*/
    public MixedFraction add (MixedFraction other){
        //compute for LCD a.k.a LCM of the two numbers
        int lcm = computeLCM(getDenominator(), other.getDenominator());

        //this adds the whole number in the fractions
        int wholeNumSum = whole + other.whole;

        //this code performs the typical steps in adding fractions
        int sumForNumerator = (((lcm/getDenominator())* getNumerator())
                + ((lcm/other.getDenominator())*other.getNumerator()));

        //code for improper fractions
        int newSumForNumerator = 0;

        if (sumForNumerator>lcm){
            //the remainder becomes the new numerator
            newSumForNumerator = (sumForNumerator % lcm);

            //the quotient will add up to the sum of the whole numbers
            int extra = (sumForNumerator - newSumForNumerator)/lcm;
            wholeNumSum += extra;
        }else //Otherwise, the old sumForNumerator will be used
            newSumForNumerator = sumForNumerator;

        //reduce the fraction part of the mixed Fraction if ever
        Fraction sample = new Fraction(newSumForNumerator, lcm);
        Fraction answer = sample.reduceFraction();

        //create an object for the resulting MixedFraction
        MixedFraction ans = new MixedFraction(wholeNumSum, answer.getNumerator(), answer.getDenominator());
        return ans;
    }

    /**This method overrides the toString method from Fraction class.*/
    public String toString(){
        if (whole == 0){
            return super.toString();
        }else
            return whole + " " + getNumerator() + "/" + getDenominator();
    }
}
