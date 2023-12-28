package com.Mycalculator.ThreeLayer;

public class CalculatorClass1 implements MyCalculator
{
	@Override
	public int mod(int a, int b)
	{
		return a%b;
	}
	public int add(int a,int b)
	{
		return a+b;
	}
	@Override
	public int sub(int a,int b)
	{
		return a-b;
	}
	@Override
	public int mul(int a,int b)
	{
		return a*b;
	}
	@Override
	public int div(int a,int b)
	{
		return a/b;
	}
}
