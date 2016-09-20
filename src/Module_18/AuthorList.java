package Module_18;

public class AuthorList 
{
	//access level to data members 
	 private String fname,lname;
	
	 //methods filled with display functions
		public void selAuthor()
		{
			System.out.println("____[AUTHORS]_____");
			System.out.println("1. Robert Kiyosaki");
			System.out.println("2. John C Maxwell");
			System.out.println("3. Donald Trump");
			System.out.println("");
		}
		
		public void showBook()
		{
			System.out.println("1. Rich Dad,Poor Dad");
			System.out.println("2. Guide to Investing");
		}
		
		//overloaded methods
		public int gti(int a , int b,int c)
		{	
			a = 270;
			c = a-b;		
			return c;	
		}
		//utility methods
		public int rdpd(int a , int b,int c)
		{
			a= 160;
			c = a-b;		
			return c;	
		}
	 
	 
	 /**
	    * Class constructor for customer name.
	    */
	 public AuthorList()
		{
			
		}
	 
	 //Encapsulation
	 public AuthorList(String fname,String lname)
		{
			this.fname= fname;
			this.lname=lname;
		}
	 //getter method
	public String getfName() 
	{
        return fname;
    }
	//setter method
    public void setfName(String f_name)
    {
        this.fname = f_name;
    }
    public String getlName() {
        return lname;
    }
    public void setlName(String l_name) 
    {
        this.lname =l_name;
    }    
        
	
}