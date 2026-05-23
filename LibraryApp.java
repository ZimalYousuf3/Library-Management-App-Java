import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryApp extends JFrame implements ActionListener {
	
	JLabel lbl1, lbl2, lbl3, lbl4, display, fine ;
	JTextField memberName, booksBorrowed;
	JComboBox <String> type;
	JButton calculate;
	
	public LibraryApp() {
		
		setTitle ("Library App");
		setSize (450, 250);
		setLayout (new GridLayout (6, 4, 5, 15));
		
		// Setting Labels
		lbl1 = new JLabel (" Enter member name: ");
		lbl2 = new JLabel (" Enter number of books borrowed: ");
		lbl3 = new JLabel (" Select member type: ");
		lbl4 = new JLabel (" Click to calculate fine ");
		display = new JLabel (" Your Total fine is PKR ");
		fine = new JLabel ();
		
		// Setting Text Fields
		memberName = new JTextField ();
		booksBorrowed = new JTextField ();
		
		// Setting Combo Box
		type = new JComboBox <> (new String [] { "Student", "Teacher", "Guest" } );
		
		// Setting Button
		calculate = new JButton ("Calculate") ;
		
		// Adding Labels, TextFields, Buttons and ComboBox
		add (lbl1); add(memberName);
		add (lbl2); add (booksBorrowed);
		add (lbl3); add (type);
		add (lbl4); add (calculate);
		add (display); add (fine);
		
		calculate.addActionListener(this);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new LibraryApp();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String name = memberName.getText();
		int books = Integer.parseInt(booksBorrowed.getText());
		String member_type = (String) type.getSelectedItem();
		
		if (member_type.equals ("Student") )  {
			StudentMember s = new StudentMember (name, books);
			fine.setText(String.valueOf(s.calculateFine()));
		}
		
		if (member_type.equals("Teacher")) {
			TeacherMember t = new TeacherMember (name, books);
			fine.setText(String.valueOf(t.calculateFine()));
		}
		
		if (member_type.equals("Guest")) {
			GuestMember g = new GuestMember (name, books);
			fine.setText(String.valueOf(g.calculateFine()));
		}
		
	}

}
