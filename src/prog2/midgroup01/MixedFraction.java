package prog2.midgroup01;

import prog2.prelimgroup01.Fraction;

import java.text.DecimalFormat;

public class MixedFraction extends Fraction {

    //This part is edited by STEPHEN COLOMA, on March 9, 2023
    private int whole;
    /**
     * This is a default Constructor in creating a Mixed Fraction Object*/
    public MixedFraction(){
        super();
        whole = 0;
    }

    /**
     * This is a parameterized Constructor in creating a Mixed Fraction Object
     * This constructor is called when passing a Fraction object
     * @param whole this parameter will be the wholeNumber of the Mixed Fraction
     * @param fraction this parameter will be set as the fraction part of the Mixed Fraction*/
    public MixedFraction(int whole, Fraction fraction){
        super(fraction.getNumerator(), fraction.getDenominator());
        this.whole=whole;

    }

    /**
     * This is a parameterized Constructor in creating a Mixed Fraction Object
     * This constructor is called when passing a Fraction object
     * @param whole this parameter will be the wholeNumber of the Mixed Fraction
     * @param numerator this parameter will be set as the Numerator of the Mixed Fraction
     * @param denominator this parameter will be set as the denominator of the Mixed Fraction */
    public MixedFraction(int whole, int numerator, int denominator){
        super(numerator,denominator);
        this.whole=whole;
    }

    /**
     * This is a parameterized Constructor in creating a Mixed Fraction Object
     * This constructor is called when passing a Fraction object
     * @param fraction this parameter will be the basis Fraction of the Mixed Fraction and the whole number is set as 0*/
    public MixedFraction(Fraction fraction){
        super(fraction.getNumerator(), fraction.getDenominator());
        this.whole = 0;
    }
    //This part is edited by EMMANUEL BROMEO, on March 9, 2023
    /** this method sets the whole number part of the mixed fraction */
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
     *make it Mixed Fractions, and it's whole num will be added to the result's whole num.
     *Returns Mixed Fractions
     *@param other this MixedFraction object represents the value of the second fraction that will be added to the first fraction
     *@return returns the sum of the two mixed fractions in reduced form using the reduceFraction method*/
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

        if (sumForNumerator>lcm || sumForNumerator == lcm){
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
        return ans.reduceFraction();
    }
    //This part is edited by JERWIN RAMOS, on March 9, 2023
    /**This method Subtracts Mixed Fractions. If the fraction part of the result is improper,
     *make it Mixed Fractions, and it's whole num will be added to the result's whole num.
     *Returns Mixed Fractions
     *@param other this MixedFraction object represents the value of the second fraction that will be subtracted from to the first fraction
     *@return returns the difference of the two mixed fractions in reduced form using the reduceFraction method*/
    public MixedFraction subtract (MixedFraction other){
        Fraction first = this.toImproperFraction();
        Fraction second = other.toImproperFraction();

        //compute for LCM of the two numbers
        int lcm = computeLCM(first.getDenominator(), second.getDenominator());
        int diffNum = ((lcm/ first.getDenominator())* first.getNumerator()) - ((lcm/second.getDenominator())* second.getNumerator());

        int wholeNum = 0;
        int result;

        if (diffNum>lcm || diffNum == lcm){
            result = (diffNum % lcm);
            int extra = (diffNum - result)/lcm; //the quotient will subtract the sum of the whole numbers
            wholeNum += extra;
        }else                                  //Otherwise, the old diffNum will be used
            result = diffNum;

        MixedFraction answer = new MixedFraction(wholeNum, result, lcm);
        return answer.reduceFraction();

    }// end of method


    //This part is edited by SANCHIE EARL GUZMAN, on March 9, 2023
    /**This method Multiplies Mixed Fractions. First, convert mixed fractions to improper faction.
     *If the fraction part of the result is improper,
     *make it Mixed Fractions and its quotient will be the whole number.
     *Returns Mixed Fractions
     *@param other this MixedFraction object which represents the value of the second fraction that will be multiplied to the first fraction
     *@return returns the product of the two mixed fractions in reduced form using the reduceFraction method */
    public MixedFraction multiplyBy (MixedFraction other){

        Fraction first = this.toImproperFraction();
        Fraction second = other.toImproperFraction();
        int numAns = first.getNumerator()* second.getNumerator();
        int denAns = first.getDenominator()* second.getDenominator();
        int wholeAns = 0;
        int numerator = 0;

        //this converts an improper fraction into a mixed fraction
        if (numAns>denAns || numAns == denAns){
             wholeAns = numAns / denAns;
             numerator = numAns % denAns;
        }
        else
            numerator = numAns;

        //create an object for the resulting MixedFraction
        MixedFraction answer = new MixedFraction(wholeAns,numerator, denAns);

        return answer.reduceFraction();
    }

    //This part is edited by SANCHIE EARL GUZMAN, on March 9, 2023
    /**This method Multiplies Mixed Fractions. First, convert mixed fractions to improper faction.
     *If the fraction part of the result is improper,
     *make it Mixed Fractions and its quotient will be the whole number.
     *Returns Mixed Fractions
     *@param other this MixedFraction object which represents the value of the second fraction that will be divided from the first fraction
     *@return returns the quotient of the two mixed fractions in reduced form using the reduceFraction method*/
    public MixedFraction divideBy (MixedFraction other){

        Fraction first = this.toImproperFraction();
        Fraction second = other.toImproperFraction();
        int numAns = first.getNumerator()* second.getDenominator();
        int denAns = first.getDenominator()* second.getNumerator();
        int wholeAns = 0;
        int numerator = 0;

        //this converts an improper fraction into a mixed fraction
        if (numAns>denAns || numAns == denAns){
            wholeAns = numAns / denAns;
            numerator = numAns % denAns;
        }
        else
            numerator = numAns;

        //create an object for the resulting MixedFraction
        MixedFraction answer = new MixedFraction(wholeAns,numerator, denAns);

        return answer.reduceFraction();
    }

    /**This method converts mixed fractions to improper fractions*/
    private Fraction toImproperFraction(){

        int numerator = ((this.getWhole()*this.getDenominator())+this.getNumerator());
        int denominator = (this.getDenominator());
        Fraction answer = new Fraction(numerator, denominator);

        return answer;
    }

    /**This method reduce fractions and returns the lowest form of the fraction*/
    public MixedFraction reduceFraction (){
        int gcd = computeGCD(getNumerator(), getDenominator());
        int numeratorLT = getNumerator()/gcd;
        int denominatorLT = getDenominator()/gcd;

        MixedFraction fraction = new MixedFraction(whole, numeratorLT, denominatorLT);
        return fraction;
    }

    /**This method overrides the toString method from Fraction class.*/
    public String toString() {
        if (whole == 0) {
            if (getNumerator() == 0){
                return "0";
            } else if (getNumerator()<0 || getDenominator()<0){
                return "-" + Math.abs(getNumerator()) + "/" + Math.abs(getDenominator());
            }else
                return super.toString();

        } else if (getNumerator() == 0) {
            return String.valueOf(whole);
        } else{
            if (getNumerator()<0||getDenominator()<0){
                return  whole + " " + Math.abs(getNumerator()) + "/" + Math.abs(getDenominator());
            }else
                return whole + " " + getNumerator() + "/" + getDenominator();
        }

    }

    //This part is edited by STEPHEN COLOMA, on March 19, 2023
    /**This method converts Mixed Fraction to decimal value*/
    public String toDecimal (){
        //this code converts fraction into decimal with upto 2 decimal places
        DecimalFormat f = new DecimalFormat(".##");
        double temp = (double) getNumerator()/getDenominator();

        String ansDec = f.format(temp);

        if (whole == 0){
            if (Double.parseDouble(ansDec)<0){
                return "-" + String.valueOf(Math.abs(Double.parseDouble(ansDec)));
            }else
                return whole + ansDec;
        }else {
            if (Double.parseDouble(ansDec)<0){
                return String.valueOf(whole + Double.parseDouble(ansDec));
            }else
                return whole + ansDec;
        }

    }
}
