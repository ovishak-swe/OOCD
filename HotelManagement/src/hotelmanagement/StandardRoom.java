
package hotelmanagement;



    public class StandardRoom extends room{

	private String acAvailability;
	
	public StandardRoom()
	{
		
	}
	
	public void isACAvailable()
	{
		System.out.println("Is AC available for this room?");
		acAvailability = myscanner.next();
		
	}
}

