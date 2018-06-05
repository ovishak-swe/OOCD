
package hotelmanagement;


 
    import java.util.Scanner;
public class room {

	private String roomID;
	private int roomNumber;
	private String cID;
	
	Scanner myscanner;
	public room()
	{
		myscanner = new Scanner(System.in);
	}
	
	public void inputAll()
	{
		System.out.println("Please enter customer id");
		Customer customer = new Customer();
		customer.customerID = myscanner.next();
		System.out.println("Please enter room id");
		roomID = myscanner.next();
		System.out.println("Please enter room number");
		roomNumber = myscanner.nextInt();
	}
}

    

