
package librarymanagementsystem;

public class AudioCopy extends BookClass{
	
	private double audio_duration;
	
	public void input_audio_duration()
	{
		System.out.println("Audio duration of book id "+getBookId());
		audio_duration = myscanner.nextDouble();
	}
	
	public void setNewMemberInfoForABook()
	{
		Member member = new Member();
		setBook_borrower_id(member.getMemberId());
	}
	public void display_All_Info_About_Audio_Type_Book()
	{
		System.out.println("\n\nBook id              : "+getBookId());
		System.out.println("Book title           : "+getBookTitle());
		System.out.println("Book author          : "+getBookAuthor());
		System.out.println("Book price           : "+getBookPrice());
		System.out.println("Book audio duration  : "+audio_duration);
		if(book_Availability())
		{
			System.out.println("Status of the book   : Available");
		}
		else
		{
			System.out.println("Status of the book   : Not available");
		}
		
	}

}
