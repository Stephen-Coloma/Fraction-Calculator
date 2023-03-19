/**
 GROUP MEMBERS: BALANG, BROMEO, COLOMA, GUZMAN, RAMOS, ROQUE
 */

package edu.slu.prog2.prelimgroup01;

import edu.slu.prog2.midgroup01.MixedFraction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FractionArithmetic extends JFrame{
    private MixedFraction operand1;
    private MixedFraction operand2;
    
    //Panel Components
    private JPanel panelMain, panelOutput, panelInput,panelResult, panelResultLabel;

    //Label Components
    private JLabel lbl1, lbl2, lbl3;

    //TextField Components
    private JTextField txt1,txt2, txt3;

    //Button Components
    private JButton btn0, btn1, btn2, btn3,btn4,btn5,btn6,btn7,btn8, btn9;
    private JButton btnAdd, btnSub, btnMul,btnDiv, btnEquals;
    private JButton btnSlash, btnSpace, btnBackspace, btnClear, btnExit;

    //Button Handlers
    private ButtonHandler0 Handler0;
    private ButtonHandler1 Handler1;
    private ButtonHandler2 Handler2;
    private ButtonHandler3 Handler3;
    private ButtonHandler4 Handler4;
    private ButtonHandler5 Handler5;
    private ButtonHandler6 Handler6;
    private ButtonHandler7 Handler7;
    private ButtonHandler8 Handler8;
    private ButtonHandler9 Handler9;

    private AddButtonHandler addH;
    private SubButtonHandler subH;
    private MulButtonHandler mulH;
    private DivButtonHandler divH;
    private EqualsButtonHandler equalsH;

    private SlashButtonHandler slashH;
    private SpaceButtonHandler spaceH;
    private BackspaceButtonHandler backspaceH;
    private ClearButtonHandler clearH;
    private ExitButtonHandler exitH;

    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;
    private String operator;
    private char hOperator;

    //constructor of the object
    public FractionArithmetic(){
        //instantiation of labels
        lbl1 = new JLabel("Fraction or Mixed Fraction", SwingConstants.LEFT);
        lbl2 = new JLabel("Preview", SwingConstants.LEFT);
        lbl3 = new JLabel("Results",SwingConstants.LEFT);

        //instantiation of textFields
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();

        //instantiation of buttons with their action listeners
        btn0 = new JButton("0");
        Handler0 = new ButtonHandler0();
        btn0.addActionListener(Handler0);

        btn1 = new JButton("1");
        Handler1 = new ButtonHandler1();
        btn1.addActionListener(Handler1);

        btn2 = new JButton("2");
        Handler2 = new ButtonHandler2();
        btn2.addActionListener(Handler2);

        btn3 = new JButton("3");
        Handler3 = new ButtonHandler3();
        btn3.addActionListener(Handler3);

        btn4 = new JButton("4");
        Handler4 = new ButtonHandler4();
        btn4.addActionListener(Handler4);

        btn5 = new JButton("5");
        Handler5 = new ButtonHandler5();
        btn5.addActionListener(Handler5);

        btn6 = new JButton("6");
        Handler6 = new ButtonHandler6();
        btn6.addActionListener(Handler6);

        btn7 = new JButton("7");
        Handler7 = new ButtonHandler7();
        btn7.addActionListener(Handler7);

        btn8 = new JButton("8");
        Handler8 = new ButtonHandler8();
        btn8.addActionListener(Handler8);

        btn9 = new JButton("9");
        Handler9 = new ButtonHandler9();
        btn9.addActionListener(Handler9);

        btnAdd = new JButton("Add");
        addH = new AddButtonHandler();
        btnAdd.addActionListener(addH);

        btnSub = new JButton("Subtract");
        subH = new SubButtonHandler();
        btnSub.addActionListener(subH);

        btnMul = new JButton("Multiply");
        mulH = new MulButtonHandler();
        btnMul.addActionListener(mulH);

        btnDiv = new JButton("Divide");
        divH = new DivButtonHandler();
        btnDiv.addActionListener(divH);

        btnEquals = new JButton("Equals");
        equalsH = new EqualsButtonHandler();
        btnEquals.addActionListener(equalsH);

        btnSlash = new JButton("Slash");
        slashH = new SlashButtonHandler();
        btnSlash.addActionListener(slashH);

        btnSpace = new JButton("Space");
        spaceH = new SpaceButtonHandler();
        btnSpace.addActionListener(spaceH);

        btnBackspace = new JButton("Backspace");
        backspaceH = new BackspaceButtonHandler();
        btnBackspace.addActionListener(backspaceH);

        btnClear = new JButton("Clear");
        clearH = new ClearButtonHandler();
        btnClear.addActionListener(clearH);

        btnExit = new JButton("Exit");
        exitH = new ExitButtonHandler();
        btnExit.addActionListener(exitH);

        //instantiation and population of panelResultLabel
        panelResultLabel = new JPanel(new GridLayout(0, 2));
        panelResultLabel.add(lbl3);
        panelResultLabel.add(lbl1);

        //instantiation and population of panelResult
        panelResult = new JPanel(new GridLayout(0,2));
        panelResult.add(txt3);
        panelResult.add(txt1);

        //instantiation and population of panelInput
        panelOutput = new JPanel(new GridLayout(4,0));
        panelOutput.add(lbl2);
        panelOutput.add(txt2);
        panelOutput.add(panelResultLabel);
        panelOutput.add(panelResult);


        //instantiation and population of panelOutput
        panelInput = new JPanel(new GridLayout(5, 4,1,1));
        panelInput.add(btnExit);
        panelInput.add(btnClear);
        panelInput.add(btnBackspace);
        panelInput.add(btnDiv);
        panelInput.add(btn7);
        panelInput.add(btn8);
        panelInput.add(btn9);
        panelInput.add(btnMul);
        panelInput.add(btn4);
        panelInput.add(btn5);
        panelInput.add(btn6);
        panelInput.add(btnSub);
        panelInput.add(btn1);
        panelInput.add(btn2);
        panelInput.add(btn3);
        panelInput.add(btnAdd);
        panelInput.add(btnSpace);
        panelInput.add(btn0);
        panelInput.add(btnSlash);
        panelInput.add(btnEquals);

        //instantiation and population of panelMain
        panelMain = new JPanel(new GridLayout(2,0));
        panelMain.add(panelOutput);
        panelMain.add(panelInput);

        //initializing values
        txt1.setEditable(false);
        txt2.setEditable(false);
        txt3.setEditable(false);


        txt1.setFont(new java.awt.Font("Arial", Font.BOLD, 15));
        txt1.setForeground(Color.black);
        txt2.setFont(new java.awt.Font("Arial", Font.BOLD, 17));
        txt2.setForeground(Color.black);
        txt3.setFont(new java.awt.Font("Arial", Font.BOLD, 15));
        txt3.setForeground(Color.black);

        txt1.setText("");
        txt2.setText("");
        txt2.setHorizontalAlignment(JTextField.CENTER);
        txt1.setHorizontalAlignment(JTextField.RIGHT);
        txt3.setHorizontalAlignment(JTextField.CENTER);
        btnEquals.setEnabled(false);

        //setting the view when the constructor is running
        setContentPane(panelMain);
        setTitle("Calculator");
        setSize(420,420);
        setVisible(true);
        panelMain.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    } // end of constructor

    private class ButtonHandler0 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            txt1.setText(txt1.getText() + "0");
        }
    }


    private class ButtonHandler1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            txt1.setText(txt1.getText() + "1");
        }
    }

    private class ButtonHandler2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            txt1.setText(txt1.getText() + "2");
        }
    }

    private class ButtonHandler3 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            txt1.setText(txt1.getText() + "3");
        }
    }

    private class ButtonHandler4 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            txt1.setText(txt1.getText() + "4");
        }
    }

    private class ButtonHandler5 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            txt1.setText(txt1.getText() + "5");
        }
    }

    private class ButtonHandler6 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            txt1.setText(txt1.getText() + "6");
        }
    }

    private class ButtonHandler7 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            txt1.setText(txt1.getText() + "7");
        }
    }

    private class ButtonHandler8 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            txt1.setText(txt1.getText() + "8");
        }
    }

    private class ButtonHandler9 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            txt1.setText(txt1.getText() + "9");
        }
    }


    private class AddButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            operator = " + "; // this will be used in the preview
            hOperator = 'A'; //this will be used as a key to what arithmetics to perform when equals button is clicked
            String input="";
            String[] parts = new String[2]; //holds the data being split

            try {//this will try to input a Fraction
                input = txt1.getText();
                parts = input.split("/");

                int numerator = Integer.parseInt(parts[0]); //populating the array
                int denominator = Integer.parseInt(parts[1]);
                Fraction temp = new Fraction(numerator,denominator);
                operand1 = new MixedFraction(temp); //creating the operand1

                txt2.setText(operand1.toString() + operator);
                btnEquals.setEnabled(true);
            }catch (NumberFormatException ex){ //this catch will be used for inputting Mixed Fractions
                try {
                    input = txt1.getText();
                    parts = input.split(" ");

                    String[] temp = new String[2];
                    temp =parts[1].split("/");

                    int wholeNum = Integer.parseInt(parts[0]);
                    int numerator = Integer.parseInt(temp[0]);
                    int denominator = Integer.parseInt(temp[1]);
                    operand1 = new MixedFraction(wholeNum,numerator,denominator); //creating the operand1

                    txt2.setText(operand1.toString() + operator);
                    btnEquals.setEnabled(true);
                }catch (Exception exe){
                    codeForSettingException();
                }
            }catch (Exception ex){ //this catch will be used for erroneous input
                codeForSettingException();
            }

            txt1.setText("");
            btnAdd.setEnabled(false);
        }
    }

    private class SubButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            operator = " - "; // this will be used in the preview
            hOperator = 'S'; //this will be used as a key to what arithmetics to perform when equals button is clicked
            String input="";
            String[] parts = new String[2]; //holds the data being split

            try {//this will try to input a Fraction
                input = txt1.getText();
                parts = input.split("/");

                int numerator = Integer.parseInt(parts[0]); //populating the array
                int denominator = Integer.parseInt(parts[1]);
                Fraction temp = new Fraction(numerator,denominator);
                operand1 = new MixedFraction(temp); //creating the operand1

                txt2.setText(operand1.toString() + operator);
                btnEquals.setEnabled(true);
            }catch (NumberFormatException ex){ //this catch will be used for inputting Mixed Fractions
                try {
                    input = txt1.getText();
                    parts = input.split(" ");

                    String[] temp = new String[2];
                    temp =parts[1].split("/");

                    int wholeNum = Integer.parseInt(parts[0]);
                    int numerator = Integer.parseInt(temp[0]);
                    int denominator = Integer.parseInt(temp[1]);
                    operand1 = new MixedFraction(wholeNum,numerator,denominator); //creating the operand1

                    txt2.setText(operand1.toString() + operator);
                    btnEquals.setEnabled(true);
                }catch (Exception exe){
                    codeForSettingException();
                }
            }catch (Exception ex){ //this catch will be used for erroneous input
                codeForSettingException();
            }

            txt1.setText("");
            btnSub.setEnabled(false);
        }
    }

    private class MulButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            operator = " × "; // this will be used in the preview
            hOperator = 'M'; //this will be used as a key to what arithmetics to perform when equals button is clicked
            String input="";
            String[] parts = new String[2]; //holds the data being split

            try {//this will try to input a Fraction
                input = txt1.getText();
                parts = input.split("/");

                int numerator = Integer.parseInt(parts[0]); //populating the array
                int denominator = Integer.parseInt(parts[1]);
                Fraction temp = new Fraction(numerator,denominator);
                operand1 = new MixedFraction(temp); //creating the operand1

                txt2.setText(operand1.toString() + operator);
                btnEquals.setEnabled(true);
            }catch (NumberFormatException ex){ //this catch will be used for inputting Mixed Fractions
                try {
                    input = txt1.getText();
                    parts = input.split(" ");

                    String[] temp = new String[2];
                    temp =parts[1].split("/");

                    int wholeNum = Integer.parseInt(parts[0]);
                    int numerator = Integer.parseInt(temp[0]);
                    int denominator = Integer.parseInt(temp[1]);
                    operand1 = new MixedFraction(wholeNum,numerator,denominator); //creating the operand1

                    txt2.setText(operand1.toString() + operator);
                    btnEquals.setEnabled(true);
                }catch (Exception exe){
                    codeForSettingException();
                }
            }catch (Exception ex){ //this catch will be used for erroneous input
                codeForSettingException();
            }

            txt1.setText("");
            btnMul.setEnabled(false);
        }
    }

    private class DivButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            operator = " ÷ "; // this will be used in the preview
            hOperator = 'D'; //this will be used as a key to what arithmetics to perform when equals button is clicked
            String input="";
            String[] parts = new String[2]; //holds the data being split

            try {//this will try to input a Fraction
                input = txt1.getText();
                parts = input.split("/");

                int numerator = Integer.parseInt(parts[0]); //populating the array
                int denominator = Integer.parseInt(parts[1]);
                Fraction temp = new Fraction(numerator,denominator);
                operand1 = new MixedFraction(temp); //creating the operand1

                txt2.setText(operand1.toString() + operator);
                btnEquals.setEnabled(true);
            }catch (NumberFormatException ex){ //this catch will be used for inputting Mixed Fractions
                try {
                    input = txt1.getText();
                    parts = input.split(" ");

                    String[] temp = new String[2];
                    temp =parts[1].split("/");

                    int wholeNum = Integer.parseInt(parts[0]);
                    int numerator = Integer.parseInt(temp[0]);
                    int denominator = Integer.parseInt(temp[1]);
                    operand1 = new MixedFraction(wholeNum,numerator,denominator); //creating the operand1

                    txt2.setText(operand1.toString() + operator);
                    btnEquals.setEnabled(true);
                }catch (Exception exe){
                    codeForSettingException();
                }
            }catch (Exception ex){ //this catch will be used for erroneous input
                codeForSettingException();
            }

            txt1.setText("");
            btnDiv.setEnabled(false);
        }
    }

    private class EqualsButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            boolean valid = false; //this validates if the calculator will perform an arithmetic
            String input="";
            String[] parts = new String[2];

            try { //this will try to input a Fraction
                input = txt1.getText();
                parts = input.split("/");

                int numerator = Integer.parseInt(parts[0]);
                int denominator = Integer.parseInt(parts[1]);
                Fraction temp = new Fraction(numerator,denominator);
                operand2 = new MixedFraction(temp); //creating the operand2

                txt2.setText(txt2.getText() + operand2.toString());
                btnEquals.setEnabled(true);
            }catch (NumberFormatException ex){ //this catch will be used for inputting Mixed Fractions
                try {
                    input = txt1.getText();
                    parts = input.split(" ");

                    String[] temp = new String[2];
                    temp =parts[1].split("/");

                    int wholeNum = Integer.parseInt(parts[0]);
                    int numerator = Integer.parseInt(temp[0]);
                    int denominator = Integer.parseInt(temp[1]);
                    operand2 = new MixedFraction(wholeNum,numerator,denominator); //creating the operand2

                    txt2.setText(txt2.getText() + operand2.toString());
                    btnEquals.setEnabled(true);
                }catch (Exception exe){
                    codeForSettingException();

                    btnEquals.setEnabled(false);
                    valid = false;
                }
            }catch (Exception ex){ //this catch will be used for erroneous input
                codeForSettingException();

                btnEquals.setEnabled(false);
                valid = false;
            }

            txt1.setText(""); //resets the content of textField1

            //This code performs arithmetics based on the character code
            MixedFraction answer = null;
            if (!valid){
                try {
                    if (hOperator=='A'){
                        answer = operand1.add(operand2);
                        txt3.setText(answer.toString() + "  or  " + answer.toDecimal());
                    }else if (hOperator=='S'){
                        answer = operand1.subtract(operand2);
                        txt3.setText(answer.toString() + "  or  " + answer.toDecimal());
                    }else if (hOperator=='M'){
                        answer = operand1.multiplyBy(operand2);
                        txt3.setText(answer.toString() + "  or  " + answer.toDecimal());
                    }else if (hOperator=='D'){
                        answer = operand1.divideBy(operand2);
                        txt3.setText(answer.toString() + "  or  " + answer.toDecimal());
                    }else
                        txt3.setText("");

                    btnAdd.setEnabled(true);
                    btnSub.setEnabled(true);
                    btnMul.setEnabled(true);
                    btnDiv.setEnabled(true);
                    btnEquals.setEnabled(false);
                }catch (Exception exe){
                    codeForSettingException();
                }
            }
        }
    }

    /**This method will hold the code that will be used for exceptions to prevent repeating of codes*/
    private void codeForSettingException(){
        txt2.setText("ENTER A FRACTION OR MIXED FRACTION");
        txt3.setText("");

        btn0.setEnabled(false);
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btnAdd.setEnabled(false);
        btnSub.setEnabled(false);
        btnMul.setEnabled(false);
        btnDiv.setEnabled(false);
        btnSlash.setEnabled(false);
        btnSpace.setEnabled(false);
        btnBackspace.setEnabled(false);
    }

    private class SlashButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            txt1.setText(txt1.getText() + "/");
        }
    }

    private class SpaceButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            txt1.setText(txt1.getText() + " ");
        }
    }
    private class BackspaceButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
                String input = txt1.getText();
                String subs = input.substring(0,input.length()-1);

                txt1.setText(subs);
            }catch (Exception ex){

            }
        }
    }
    private class ClearButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");

            btn0.setEnabled(true);
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btnAdd.setEnabled(true);
            btnSub.setEnabled(true);
            btnMul.setEnabled(true);
            btnDiv.setEnabled(true);
            btnEquals.setEnabled(false);
            btnSlash.setEnabled(true);
            btnSpace.setEnabled(true);
            btnBackspace.setEnabled(true);
        }
    }

    private class ExitButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }






    public static void main(String[] args) {
        FractionArithmetic calculator = new FractionArithmetic();
    }
}

