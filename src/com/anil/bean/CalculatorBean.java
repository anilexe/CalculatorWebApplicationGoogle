package com.anil.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "calculatorBean")
@RequestScoped
public class CalculatorBean implements Serializable{
	private static final long serialVersionUID = -3525225287270067217L;
	private int input1;
	private int input2;
	private String result;

	public int getInput1() {
		return input1;
	}
	public void setInput1(int input1) {
		this.input1 = input1;
	}
	public int getInput2() {
		return input2;
	}
	public void setInput2(int input2) {
		this.input2 = input2;
	}
	public CalculatorBean() {
	}
	public String getResult() {
		return result;
	}
	public String add() {
		result = Integer.toString(input1 + input2);
		clear();
		return "";
	}
	public String substract() {
		result = Integer.toString(input1 - input2);
		clear();
		return "";
	}
	public String multiply() {
		result = Integer.toString(input1* input2);
		clear();
		return "";
	}
	public String divide() {
		result = input2 == 0 ? "Invalid Input" : Double.toString(input1 / (double) input2);
		clear();
		return "";
	}
	public void clear(){
		this.input1=0;
		this.input2=0;
	}
}