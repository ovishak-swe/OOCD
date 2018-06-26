
package librarymanagementsystem;

import java.util.Scanner;


public class LibraryManagementSystem {

    
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
		System.out.println("Which type of book do you want?");
		String type = myscanner.nextLine();
		
		if(type.equalsIgnoreCase("audio"))
		{
			System.out.println("How many books do you want?");
			int amountOfbooks = myscanner.nextInt();
			AudioCopy[] ac = new AudioCopy[amountOfbooks];
			
			for(int i=0; i<amountOfbooks; i++)
			{
				ac[i] = new AudioCopy();
				ac[i].inputAll();
				ac[i].input_audio_duration();
				ac[i].display_All_Info_About_Audio_Type_Book();
			}
			System.out.println("Enter book id to borrow");
			int idToBorrow = myscanner.nextInt();
			if(ac[idToBorrow-1].getBook_borrower_id().equals("0"))
			{
				Member member = new Member();
				member.InputAll();
				ac[idToBorrow-1].setNewMemberInfoForABook();
			}
			else
			{
				System.out.println("Sorry!! your requested book is currently unavailable ");
			}
		}
		else
		{
			System.out.println("How many books do you want?");
			int amountOfbooks = myscanner.nextInt();
			HardCopy[] hc = new HardCopy[amountOfbooks];
			
			for(int i=0; i<amountOfbooks; i++)
			{
				hc[i] = new HardCopy();
				hc[i].inputAll();
				hc[i].inputNumberOfPages();
				hc[i].display_All_Info_About_HardCopy_Type_Book();
			}
			System.out.println("Enter book id to borrow");
			int idToBorrow = myscanner.nextInt();
			if(hc[idToBorrow-1].getBook_borrower_id().equals("0"))
			{
				Member member = new Member();
				member.InputAll();
				hc[idToBorrow-1].setNewMemberInfoForABook();
			}
			else
			{
				System.out.println("Sorry!! your requested book is currently unavailable ");
			}
		}
		
		
		myscanner.close();
	}

}

       
    }
    
}
