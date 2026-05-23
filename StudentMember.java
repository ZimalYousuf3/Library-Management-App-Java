
// Derived Class

public class StudentMember extends Member implements LibraryService {

	public StudentMember(String memberName, int borrowedBooks) {
		
		super (memberName, borrowedBooks) ;
		
	}

	@Override
	public void borrowBook() {
		
		System.out.println("Student is borrowing books.");
	}

	@Override
	public double calculateFine() {
		return (borrowedBooks * 50);
	}

}
