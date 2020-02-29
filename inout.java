package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class inout {

	private JFrame frame;
	private JTextField fname;
	private JTextField lname;
	private JTextField dob;
	private JTextField mobile;
	private JTextField email;
	private JTextArea output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inout window = new inout();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public inout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel user = new JLabel("User Application Form");
		user.setBounds(136, 10, 132, 13);
		panel.add(user);
		
		JLabel first_name = new JLabel("First Name");
		first_name.setBounds(10, 40, 96, 13);
		panel.add(first_name);
		
		JLabel last_name = new JLabel("Last Name");
		last_name.setBounds(10, 63, 96, 13);
		panel.add(last_name);
		
		JLabel date = new JLabel("Date of Birth");
		date.setBounds(10, 86, 96, 13);
		panel.add(date);
		
		JLabel mnum = new JLabel("Mobile Number");
		mnum.setBounds(10, 109, 96, 13);
		panel.add(mnum);
		
		JLabel gender = new JLabel("Gender");
		gender.setBounds(10, 132, 96, 13);
		panel.add(gender);
		
		JLabel email_id = new JLabel("Email Id");
		email_id.setBounds(10, 155, 96, 13);
		panel.add(email_id);
		
		fname = new JTextField();
		fname.setBounds(136, 37, 96, 19);
		panel.add(fname);
		fname.setColumns(10);
		
		lname = new JTextField();
		lname.setBounds(136, 60, 96, 19);
		panel.add(lname);
		lname.setColumns(10);
		
		dob = new JTextField();
		dob.setBounds(136, 83, 96, 19);
		panel.add(dob);
		dob.setColumns(10);
		
		mobile = new JTextField();
		mobile.setBounds(136, 106, 96, 19);
		panel.add(mobile);
		mobile.setColumns(10);
		
		email = new JTextField();
		email.setBounds(136, 152, 96, 19);
		panel.add(email);
		email.setColumns(10);
		
		JRadioButton male = new JRadioButton("M");
		male.setBounds(129, 128, 103, 21);
		panel.add(male);
		
		JRadioButton female = new JRadioButton("F");
		female.setBounds(234, 128, 103, 21);
		panel.add(female);
		
		JButton Submit = new JButton("submit");
		Submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				output.append("Registration Successfull!!	Your details are:");
				output.append("\n");
				output.append("First Name	"+fname.getText());
				output.append("\n");
				output.append("Last Name	"+lname.getText());
				output.append("\n");
				output.append("Date of birth	"+dob.getText());
				output.append("\n");
				output.append("Mobile Number	"+mobile.getText());
				output.append("\n");
				if(male.isSelected())
					output.append("Gender	M");
				else
					output.append("Gender	F");
				output.append("\n");
				output.append("Email Id	"+email.getText());
				output.append("\n");
				
			}
		});
		Submit.setBounds(118, 181, 85, 21);
		panel.add(Submit);
		
		output = new JTextArea();
		output.setBounds(10, 212, 416, 143);
		panel.add(output);
	}
}
