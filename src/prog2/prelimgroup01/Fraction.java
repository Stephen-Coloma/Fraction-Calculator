package prog2.prelimgroup01;

import prog2.midgroup01.Arithmetics;

public class Fraction implements Arithmetics {
    /**This method was reused from the previous prelim project*/
    private int numerator;
    private int denominator;

    public Fraction(){
        numerator = 0;
        denominator =1;
    }

    public Fraction(int wholeNumVal){
        this.numerator = wholeNumVal;
        this.denominator = 1;
    }

    public Fraction(int numerator , int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**This method sets the numerator of the object*/
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**This method sets the numerator of the object*/
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    /**This method gets the denominator of the object returning it as an int*/
    public int getNumerator(){
        return numerator;
    }

    /**This method gets the denominator of the object and returning it as an int*/
    public int getDenominator(){
        return denominator;
    }

    /**This method returns a string format of the object*/
    public String toString(){
        return numerator + "/" + denominator;
    }

    /**This method makes the fraction into its decimal form*/
    public static double toDouble(Fraction ans){
        return (double) ans.numerator/ans.denominator;
    }

    /**This method is used to compute for GCD.*/
    protected static int computeGCD(int a, int b){
        if (a ==0)
            return b;
        else
            return computeGCD(b%a, a);

    }

    /**This method is used to compute the LCD of a fraction.
     * This is useful in adding, subtracting fractions and comparing fractions*/
    protected static int computeLCM(int a, int b){
        int lcm = (a*b)/computeGCD(a,b);
        return lcm;
    }

    /**This method adds fractions. Its parameters contain two fraction with data type of Fraction
     returns the string format of the result*/
    public Fraction add (Fraction other){
        //compute for LCD a.k.a LCM of the two numbers
        int lcm = computeLCM(denominator, other.denominator);

        //this code performs the typical steps in adding fractions
        int sum = (((lcm/denominator)* numerator)
                + ((lcm/other.denominator)*other.numerator));

        //create an object for the resulting fraction
        Fraction ans = new Fraction(sum, lcm);
        return ans.reduceFraction();
    }

    /**This method subtracts fractions. Its parameters contain two fraction with data type of Fraction
     returns the string format of the result*/
    public Fraction subtract (Fraction other){
        //compute for LCD a.k.a LCM
        int lcm = computeLCM(denominator, other.denominator);

        //this code performs the typical steps in subtracting fractions
        int dif = (((lcm/denominator)* numerator)
                - ((lcm/other.denominator)*other.numerator));

        //create an object for the resulting fraction
        Fraction ans = new Fraction(dif, lcm);

        return ans.reduceFraction();
    }

    /**This method multiplies fractions. Its parameters contain two fraction with data type of Fraction
     returns the string format of the result*/
    public Fraction multiplyBy (Fraction other){
        int numerator =  this.numerator* other.numerator;
        int denominator = this.denominator* other.denominator;

        Fraction ans = new Fraction(numerator, denominator);
        return ans.reduceFraction();
    }

    /**This method divides fractions. Its parameters contain two fraction with data type of Fraction
     returns the string format of the result*/
    public Fraction divideBy (Fraction other){
        int numerator = this.numerator* other.denominator;
        int denominator = this.denominator * other.numerator;

        Fraction ans = new Fraction(numerator, denominator);
        return ans.reduceFraction();
    }

    /**This method reduce fractions and returns the lowest form of the fraction*/
    public Fraction reduceFraction (){
        int gcd = computeGCD(numerator, denominator);
        int numeratorLT = numerator/gcd;
        int denominatorLT = denominator/gcd;

        Fraction fraction = new Fraction(numeratorLT, denominatorLT);
        return fraction;
    }
}//end of class

