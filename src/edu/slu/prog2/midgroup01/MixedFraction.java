package edu.slu.prog2.midgroup01;

import edu.slu.prog2.prelimgroup01.Fraction;

public class MixedFraction extends Fraction {

    //This part is edited by STEPHEN COLOMA, on March 9, 2023
    private int whole;

    public MixedFraction() {
        super();
        whole = 0;
    }

    public MixedFraction(int whole, Fraction fraction) {
        super(fraction.getNumerator(), fraction.getDenominator());
        this.whole = whole;

    }

    public MixedFraction(int whole, int numerator, int denominator) {
        super(numerator, denominator);
        this.whole = whole;
    }

    public MixedFraction(Fraction fraction) {
        super(fraction.getNumerator(), fraction.getDenominator());
        this.whole = 0;
    }
    //This part is edited by EMMANUEL BROMEO, on March 9, 2023

    /**
     * this methods sets the whole number part of the mixed fraction
     */
    public void setWholePart(int whole) {
        this.whole = whole;
    }

    /**
     * this method sets the fraction part of the mixed fraction
     */
    public void setFractionPart(Fraction fraction) {
        super.setNumerator(fraction.getNumerator());
        super.setDenominator(fraction.getDenominator());

    }

    //This part is edited by REY DANIEL ROQUE, on March 9, 2023

    /**
     * this method gets the value of the whole number part of the mixed fraction
     */
    public int getWhole() {
        return whole;
    }

    /**
     * this method gets the value of the numerator and denominator which returns it as a fraction
     */
    public Fraction getFractionPart() {
        Fraction result = new Fraction(getNumerator(), getDenominator());
        return result;
    }

    //This part is edited by STEPHEN COLOMA, on March 9, 2023

    /**
     * This method adds up Mixed Fractions. If the fraction part of the result is improper,
     * make it Mixed Fractions and it's whole num will be added to the result's whole num.
     * Returns Mixed Fractions
     */
    public MixedFraction add(MixedFraction other) {
        //compute for LCD a.k.a LCM of the two numbers
        int lcm = computeLCM(getDenominator(), other.getDenominator());

        //this adds the whole number in the fractions
        int wholeNumSum = whole + other.whole;

        //this code performs the typical steps in adding fractions
        int sumForNumerator = (((lcm / getDenominator()) * getNumerator())
                + ((lcm / other.getDenominator()) * other.getNumerator()));

        //code for improper fractions
        int newSumForNumerator = 0;

        if (sumForNumerator > lcm) {
            //the remainder becomes the new numerator
            newSumForNumerator = (sumForNumerator % lcm);

            //the quotient will add up to the sum of the whole numbers
            int extra = (sumForNumerator - newSumForNumerator) / lcm;
            wholeNumSum += extra;
        } else //Otherwise, the old sumForNumerator will be used
            newSumForNumerator = sumForNumerator;

        //reduce the fraction part of the mixed Fraction if ever
        Fraction sample = new Fraction(newSumForNumerator, lcm);
        Fraction answer = sample.reduceFraction();

        //create an object for the resulting MixedFraction
        MixedFraction ans = new MixedFraction(wholeNumSum, answer.getNumerator(), answer.getDenominator());
        return ans.reduceFraction();
    }
    //This part is edited by JERWIN RAMOS, on March 9, 2023

    /**
     * This method Subtracts Mixed Fractions. If the fraction part of the result is improper,
     * make it Mixed Fractions and it's whole num will be added to the result's whole num.
     * Returns Mixed Fractions
     */
    public MixedFraction subtract(MixedFraction other) {
        //compute for LCM of the two numbers
        int lcm = computeLCM(getDenominator(), other.getDenominator());

        //this subtracts the whole number in the fractions
        int wholeDiff = whole - other.whole;

        //performs the steps in subtracting the fractions
        int diffNum = (((lcm / getDenominator()) * getNumerator()) - ((lcm / other.getDenominator()) * other.getNumerator()));

        //code for the improper fractions
        int result = 0;

        if (diffNum > lcm) {
            result = (diffNum % lcm);
            int extra = (diffNum - result) / lcm; //the quotient will subtract the sum of the whole numbers
            wholeDiff += extra;
        } else                                  //Otherwise, the old diffNum will be used
            result = diffNum;

        //reduces fraction part of the MixedFraction
        Fraction reduced = new Fraction(result, lcm);
        Fraction answer = reduced.reduceFraction();

        //create an object for the resulting MixedFraction
        MixedFraction ans = new MixedFraction(wholeDiff, Math.abs(answer.getNumerator()), answer.getDenominator());
        return ans.reduceFraction();
    }// end of method


    //This part is edited by SANCHIE EARL GUZMAN, on March 9, 2023

    /**
     * This method Multiplies Mixed Fractions. First, convert mixed fractions to improper faction.
     * If the fraction part of the result is improper,
     * make it Mixed Fractions and its quotient will be the whole number.
     * Returns Mixed Fractions
     */
    public MixedFraction multiplyBy(MixedFraction other) {

        Fraction first = this.toImproperFraction();
        Fraction second = other.toImproperFraction();
        int numAns = first.getNumerator() * second.getNumerator();
        int denAns = first.getDenominator() * second.getDenominator();
        int wholeAns = 0;
        int numerator = 0;

        //this converts an improper fraction into a mixed fraction
        if (numAns > denAns) {
            wholeAns = numAns / denAns;
            numerator = numAns % denAns;
        } else
            numerator = numAns;

        //create an object for the resulting MixedFraction
        MixedFraction answer = new MixedFraction(wholeAns, numerator, denAns);

        return answer.reduceFraction();
    }
    //This part is edited by PATRICK ANDREW BALANG, on March 9, 2023

    /**
     * This method Divides Mixed Fractions. First, convert mixed fractions to improper faction.
     * If the fraction part of the result is improper,
     * make it Mixed Fractions and its quotient will be the whole number.
     * Returns Mixed Fractions
     */
    public MixedFraction divideBy(MixedFraction other) {

        Fraction first = this.toImproperFraction();
        Fraction second = other.toImproperFraction();
        int numAns = first.getNumerator() * second.getDenominator();
        int denAns = first.getDenominator() * second.getNumerator();
        int wholeAns = 0;
        int numerator = 0;

        if (numAns > denAns) {
            wholeAns = numAns / denAns;
            numerator = numAns % denAns;
        } else
            numerator = numAns;

        //create an object for the resulting MixedFraction
        MixedFraction answer = new MixedFraction(wholeAns, numerator, denAns);

        return answer.reduceFraction();
    }
    /**
     * This method converts mixed fractions to improper fractions
     */
    private Fraction toImproperFraction() {

        int numerator = ((this.getWhole() * this.getDenominator()) + this.getNumerator());
        int denominator = (this.getDenominator());
        Fraction answer = new Fraction(numerator, denominator);

        return answer;
    }

    /**
     * This method overrides the toString method from Fraction class.
     */
    public String toString() {
        if (whole == 0) {
            return super.toString();
        } else
            return whole + " " + getNumerator() + "/" + getDenominator();
    }

    /**
     * This method reduce fractions and returns the lowest form of the fraction
     */
    public MixedFraction reduceFraction() {
        int gcd = computeGCD(getNumerator(), getDenominator());
        int numeratorLT = getNumerator() / gcd;
        int denominatorLT = getDenominator() / gcd;

        MixedFraction fraction = new MixedFraction(whole, numeratorLT, denominatorLT);
        return fraction;
    }

}