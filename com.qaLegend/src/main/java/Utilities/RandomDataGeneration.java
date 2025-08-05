package Utilities;

import java.util.Locale;

import com.github.javafaker.Faker;

public class RandomDataGeneration {

	public static String getName()
	{
		Faker fake = new Faker();
		return fake.name().name();
	}
	
	public static String getFirstName()
	{
		Faker fake = new Faker(new Locale("en-US"));
		return fake.name().firstName();
	}
	
	public static String getLastName()
	{
		Faker fake = new Faker(new Locale("en-US"));
		return fake.name().lastName();
	}
	public static String getPrefix()
	{
		Faker fake = new Faker();
		return fake.name().prefix();
	}
	
	public static String generateEmail() {
		Faker fake = new Faker();
        String firstName = fake.name().firstName().toLowerCase();
        String lastName = fake.name().lastName().toLowerCase();
        int randomNum = fake.number().numberBetween(100, 999);
        String domain = fake.internet().domainName(); // e.g., "example.com"

        return firstName + "." + lastName + randomNum + "@" + domain;
    }
	
	public static String getEmail()
	{
		Faker fake = new Faker();
		return fake.internet().emailAddress();
	}
	
	public static String getEmail1()
	{
		
		Faker fake = new Faker();
		return fake.name().firstName().concat("@gmail.com");
		
	}
	public static String getMobileNumber()
	{
		Faker fake = new Faker(new Locale("en-IND"));
		String extension = fake.phoneNumber().extension();
		String phn = fake.phoneNumber().cellPhone().concat(extension); 
		return phn;
	}
	public static String generatePhnoneNumber()
	{
		Faker fake = new Faker(new Locale("en-IND"));
		return fake.phoneNumber().phoneNumber();
	}
	
	public static String generatePassword()
	{
		Faker fake = new Faker();
		return fake.internet().password();
		
	}
	
	public static String generateUserName()
	{
		Faker fake = new Faker();
		return fake.name().username();
	}
	
	}
	
	
	
	
	


