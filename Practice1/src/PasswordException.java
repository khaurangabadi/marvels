package comp;

public class PasswordException extends Exception{
	
	public void display(String s,String user) throws PasswordException
	{
		if(s.length()<8)
		{
			throw new PasswordException();
		}
		else
			System.out.println("password correct");
		System.out.println("welcome "+user);
		
	}

	public static void main(String[] args) {
		PasswordException p=new PasswordException();
		try
		{
		p.display("sonal", "sonal");
		}
		catch(Exception e)
		{
			System.out.println("plz give 8 digit password");
		}
		finally
		{
			System.out.println("finally printed");
		}
		

	}

}
