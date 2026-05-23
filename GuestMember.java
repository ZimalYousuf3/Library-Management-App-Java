
public class GuestMember extends Member implements LibraryService {

	public GuestMember (String memberName, int borrowedBooks) {
		super (memberName, borrowedBooks) ;
	}

	@Override
	public void borrowBook() {
		
		System.out.println("Guest is borrowing books.");
		
	}

	@Override
	public double calculateFine() {

		return (borrowedBooks * 100);
	}

}
