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
    private JPanel panelMain, panelOutput, panelInput;

    //Label Components
    private JLabel lbl1, lbl2;

    //TextField Components
    private JTextField txt1,txt2;

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

    //constructor of the object
    public FractionArithmetic(){
        //instantiation of labels
        lbl1 = new JLabel("Type Your Fraction Here:", SwingConstants.LEFT);
        lbl2 = new JLabel("Calculations", SwingConstants.LEFT);

        //instantiation of textFields
        txt1 = new JTextField();
        txt2 = new JTextField();

        //instantiation of buttons
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

        //instantiation of panelInput
        panelOutput = new JPanel(new GridLayout(4,0));
        panelOutput.add(lbl2);
        panelOutput.add(txt2);
        panelOutput.add(lbl1);
        panelOutput.add(txt1);


        //instantiation of panelOutput
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

        //instantiation of panelMain
        panelMain = new JPanel(new GridLayout(2,0));
        panelMain.add(panelOutput);
        panelMain.add(panelInput);
    } // end of constructor

    private class ButtonHandler0 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
        }
    }


    private class ButtonHandler1 implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }

    private class ButtonHandler2 implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }

    private class ButtonHandler3 implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }

    private class ButtonHandler4 implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }

    private class ButtonHandler5 implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }

    private class ButtonHandler6 implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }

    private class ButtonHandler7 implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }

    private class ButtonHandler8 implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }

    private class ButtonHandler9 implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }


    private class AddButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }

    private class SubButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }

    private class MulButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }

    private class DivButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }

    private class EqualsButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }

    private class SlashButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }

    private class SpaceButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }
    private class BackspaceButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }
    private class ClearButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }

    private class ExitButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }






    public static void main(String[] args) {
        FractionArithmetic calculator = new FractionArithmetic();
    }
}

