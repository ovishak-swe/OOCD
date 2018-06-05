
package hotelmanagement;



    import java.util.Scanner;
public class Customer extends room{

	public String customerID;
	private String customerName;
	
	Scanner myscanner;
	
	public Customer()
	{
		myscanner = new Scanner(System.in);
	}
	
	public void rentRoom()
	{
		System.out.println("Please enter customer name");
		customerName = myscanner.next();
	}
	
}
    

