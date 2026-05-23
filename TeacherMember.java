
// Derived Class

public class TeacherMember extends Member implements LibraryService {

	public TeacherMember (String memberName, int borrowedBooks) {
		
		super (memberName, borrowedBooks) ;
	}

	@Override
	public void borrowBook() {
		
		System.out.println("Teacher is borrowing books.");
		
	}

	@Override
	public double calculateFine() {
		
		return (borrowedBooks * 30);
	}

}
