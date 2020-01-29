package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Mileage {

	private JFrame frame;
	private JTextField txtMieageCalculation;
	private JTextField dis;
	private JTextField pet;
	private JTextField mil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mileage window = new Mileage();
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
	public Mileage() {
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
		
		txtMieageCalculation = new JTextField();
		txtMieageCalculation.setHorizontalAlignment(SwingConstants.CENTER);
		txtMieageCalculation.setFont(new Font("Arial", Font.BOLD, 16));
		txtMieageCalculation.setText("Mileage Calculation");
		txtMieageCalculation.setForeground(new Color(204, 51, 51));
		txtMieageCalculation.setBackground(new Color(0, 0, 0));
		txtMieageCalculation.setBounds(129, 10, 165, 26);
		panel.add(txtMieageCalculation);
		txtMieageCalculation.setColumns(10);
		
		JLabel Dis = new JLabel("Distance covered in KM");
		Dis.setFont(new Font("Arial", Font.BOLD, 16));
		Dis.setBounds(10, 53, 185, 26);
		panel.add(Dis);
		
		JLabel Pet = new JLabel("Petrol consumed in Litre");
		Pet.setFont(new Font("Arial", Font.BOLD, 16));
		Pet.setBounds(10, 102, 193, 19);
		panel.add(Pet);
		
		JLabel Mil = new JLabel("Mileage per Litre");
		Mil.setFont(new Font("Arial", Font.BOLD, 16));
		Mil.setBounds(10, 181, 133, 19);
		panel.add(Mil);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				dis.setText(null);
				pet.setText(null);
				mil.setText(null);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 232, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_1.setBounds(341, 232, 85, 21);
		panel.add(btnNewButton_1);
		
		JButton cal = new JButton("Calculate Mileage");
		cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int distance = Integer.parseInt(dis.getText());
				int mileage = Integer.parseInt(pet.getText());
				int ans =(int) (distance/mileage);
				mil.setText(String.valueOf(ans));
				
			}
		});
		cal.setForeground(new Color(204, 51, 51));
		cal.setBackground(new Color(0, 0, 0));
		cal.setFont(new Font("Arial", Font.BOLD, 16));
		cal.setBounds(116, 140, 178, 21);
		panel.add(cal);
		
		dis = new JTextField();
		dis.setBounds(258, 59, 96, 19);
		panel.add(dis);
		dis.setColumns(10);
		
		pet = new JTextField();
		pet.setBounds(258, 104, 96, 19);
		panel.add(pet);
		pet.setColumns(10);
		
		mil = new JTextField();
		mil.setBounds(258, 183, 96, 19);
		panel.add(mil);
		mil.setColumns(10);
	}

}
