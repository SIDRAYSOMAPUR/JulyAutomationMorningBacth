package com.sgtestig;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserMethods {
	@Test
	public void createUser()
	{
		System.out.println("User created successful");
	}
	
	
	@Test
	public void modifyUser()
	{
		System.out.println("User modified successful");
	}
	
	
	@Test
	public void deleteUser()
	{
		System.out.println("User deleted successful");
	}
	
	@BeforeSuite
	public void users_BeforeSuite()
	{
		System.out.println("User's @BeforeSuite demo");
	}
	
	
	@AfterSuite
	public void users_AfterSuite()
	{
		System.out.println("User's @AfterSuite demo");
	}
	
	@BeforeTest
	public void users_BeforeTest() {
		System.out.println("User's @BeforeTest demo");
	}
	
	@AfterTest
	public void users_AfterTest() {
		System.out.println("User's @AfterTest demo");
	}
	
	
	@BeforeClass
	public void users_BeforeClass() {
		System.out.println("User's @BeforeClass demo");
	}
	
	@AfterClass
	public void users_AfterClass() {
		System.out.println("User's @AfterClass demo");
	}
	
	
	@BeforeMethod
	public void users_BeforeMethod() {
		System.out.println("User's @BeforeMethod demo");
	}
	
	@AfterMethod
	public void users_AfterMethod() {
		System.out.println("User's @AfterMethod demo");
	}
}
