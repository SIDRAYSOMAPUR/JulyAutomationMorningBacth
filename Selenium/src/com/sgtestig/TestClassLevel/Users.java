  package com.sgtestig.TestClassLevel;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Users {
	@Parameters("username")
	@Test
	public void createUser(String username)
	{
		System.out.println("The User "+username+" has created Successfully");
	}
	
	@Parameters("username")
	@Test
	public void modifyUser(String username)
	{
		System.out.println("The User "+username+" has modified Successfully");
	}
	
	@Parameters("username")
	@Test
	public void deleteUser(String username)
	{
		System.out.println("The User "+username+" has deleted Successfully");
	}
	
	@Parameters("username")
	@BeforeClass
	public void setUp()
	{
		System.out.println("Launch Browser and Navigate the Application URL");
	}

	@AfterClass
	public void cleanUp()
	{
		System.out.println("Logout from the Application and Close The Application");
		System.out.println("++++++++++++++++++++++++++++");
	}
}
