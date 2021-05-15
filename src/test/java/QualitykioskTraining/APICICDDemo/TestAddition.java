package QualitykioskTraining.APICICDDemo;

import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAddition 
{
	
	CalculatorAPI Obj;
	int Res;
	
	
	//@Before("RegressionTest")
	public void InitGroup()
	{
		System.out.println("Im in Before class");
		Obj=new CalculatorAPI();	
	}
	
	@BeforeClass
	public void Init()
	{
		System.out.println("Im in Before class");
		Obj=new CalculatorAPI();
	}
	@BeforeMethod
	public void ReinitialiseResultVar()
	{
		System.out.println("I am in Before Method");
		Res=0;
	}
	@Test(priority=1)
	public void TestAdditionWithPositiveNumbers()
	{
		System.out.println("I am in 1 st TestCase");
		Res=Obj.Addition(10,20);
		Assert.assertEquals(Res, 30,"Addition does not work with positive numbers");
	}

}
