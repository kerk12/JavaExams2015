package com.kerk12.Calculator;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class SimpleCalc extends Applet implements ActionListener {

	TextField number1;
	TextField number2;
	Label result;
	Button add;
	Button sub;
	Button mul;
	Button div;
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		number1 = new TextField("");
		number2 = new TextField("");
		result = new Label("");
		add = new Button("+");
		sub = new Button("-");
		mul = new Button("x");
		div = new Button("/");
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		add(number1);
		add(number2);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(result);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == add){
			try{
				double num1 = Double.parseDouble(number1.getText());
				double num2 = Double.parseDouble(number2.getText());
				double res = num1 + num2;
				result.setText(String.valueOf(res));
				result.setForeground(Color.black);
			} catch (NumberFormatException f){
				result.setText("U fucked up nigga!");
				result.setForeground(Color.red);
			}
		}
		if (e.getSource() == sub){
			try{
				double num1 = Double.parseDouble(number1.getText());
				double num2 = Double.parseDouble(number2.getText());
				double res = num1 - num2;
				result.setText(String.valueOf(res));
				result.setForeground(Color.black);
			} catch (NumberFormatException f){
				result.setText("U fucked up nigga!");
				result.setForeground(Color.red);
			}
		}
		if (e.getSource() == mul){
			try{
				double num1 = Double.parseDouble(number1.getText());
				double num2 = Double.parseDouble(number2.getText());
				double res = num1 * num2;
				result.setText(String.valueOf(res));
				result.setForeground(Color.black);
			} catch (NumberFormatException f){
				result.setText("U fucked up nigga!");
				result.setForeground(Color.red);
			}
		}
		if (e.getSource() == div){
			try{
				double num1 = Double.parseDouble(number1.getText());
				double num2 = Double.parseDouble(number2.getText());
				double res = num1 / num2;
				result.setText(String.valueOf(res));
				result.setForeground(Color.black);
			} catch (NumberFormatException f){
				result.setText("U fucked up nigga!");
				result.setForeground(Color.red);
			} 
		}
	}

}
