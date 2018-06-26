
package librarymanagementsystem;

import java.util.Scanner;
public class Member {
	
	private String memberName;
	private String memberId;
	
	Scanner myscanner;
		
	public Member()
	{
		myscanner = new Scanner(System.in);
	}
	
	public void InputAll()
	{
		System.out.println("Please enter member name");
		memberName = myscanner.nextLine();
		System.out.println("Enter member id");
		memberId = myscanner.next();
	}
	
	public String getMemberName()
	{
		return memberName;
	}
	
	public String getMemberId()
	{
		return memberId;
	}
}
