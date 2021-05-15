package QualitykioskTraining.APICICDDemo;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMultiplication 
{

	CalculatorAPI Cal;
	int Res;
	@BeforeClass
	public void CreateObj()
	{
		System.out.println("I am in Before Class");
		Cal=new CalculatorAPI();
		
	}
	@BeforeMethod
	public void InitialiseRes()
	{
		System.out.println("I am in Before Method");
		Res=0;
	}
	
	@Test(priority=1)
	
	public void TestdivisionWithPositive()
	{
		System.out.println("I am in 1st TestMultiplicationnWithPositive");
		Res=Cal.Multiplication(100,2);
		Assert.assertEquals(Res,200,"Multiplication does not work with positive numbers");
	
	}
}
