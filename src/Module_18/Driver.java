package Module_18;

import java.util.Scanner;
import java.util.Date;


/**
 *
 */
public class Driver{

	//access methods
	private static int c;
	private static int a;
	private static String f, l;
	
	public static void main(String[] args)
	{
		//object creation
		AuthorList al = new AuthorList ();
		String author;
		int sel=0;

		Scanner sc = new Scanner(System.in);
		
		System.out .println("Enter your first name");
		f = sc.nextLine();
		System.out .println("Enter your last name");
		l = sc.next();
		System.out.println("");
		
		//call method
		al.selAuthor();
		
	    System.out.println("SELECT NUMBER ASSIGNED TO REQUIRED AUTHOR");
	    sel = sc.nextInt();

	    if ( sel== 1)
	    {
		   
	    	author = "Robert Kiyosaki";
	    	System.out.println(author+"'s available books");
	    	System.out.println("");	    	
	    	
	    	al.showBook();
	    	System.out.println("");
	    	System.out.println("SELECT NUMBER ASSIGNED TO REQUIRED BOOK");
	    	  	
		
	    }
	    else if (sel == 2)
	    {
	        author = "John C Maxwell";
	        System.err.println("No units available for "+author);
	    } 
	    else if (sel == 3) 
	    {
	       author = "Donald Trump";
	       System.err.println("No units available for "+author);
	    }
	    else 
	    {
	        System.err.println("invalid input");    
	    }
	    
	    sel = sc.nextInt();
	   
	    if (sel == 1)
	    {
		System.out.println("Rich Dad,Poor Dad Costs R130");
		System.out.println(""); 
		System.out.println("Please enter deposit amount");
		sel = sc.nextInt();
	
		System.out.println("OUTSTANDING AMOUNT\t:R"+al.rdpd(a ,sel,c));
		System.out.println("CUSTOMER NAME\t\t:"+ f+" "+l );
		Date date=new Date(); 
		System.out.println("DATE OF PURCHASE\t:"+date);
		
	    }
	    else if (sel == 2) 
	    {
		System.out.println("Guide to investing costs R170");   
		System.out.println(""); 
		System.out.println("Please enter deposit amount");
		sel = sc.nextInt();	
		System.out.println("OUTSTANDING AMOUNT\t:R"+al.gti(a ,sel,c));
		System.out.println("CUSTOMER NAME\t\t:"+ f+" "+l );
		Date date=new Date(); 
		System.out.println("DATE OF PURCHASE\t:"+date);
	   }
	   else
	   {
		   System.err.println("Invalid Selection");  
	   }
	   
	   
	}

}