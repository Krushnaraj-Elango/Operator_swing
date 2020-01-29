package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Temperature {

	private JFrame frame;
	private JTextField value;
	private JTextField answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperature window = new Temperature();
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
	public Temperature() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 630, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 153, 102));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel Celsius = new JLabel("Celsius");
		Celsius.setForeground(Color.BLACK);
		Celsius.setBackground(Color.WHITE);
		Celsius.setFont(new Font("Arial", Font.BOLD, 16));
		Celsius.setBounds(155, 47, 71, 19);
		panel.add(Celsius);
		
		value = new JTextField();
		value.setFont(new Font("Arial", Font.PLAIN, 16));
		value.setBounds(319, 44, 129, 30);
		panel.add(value);
		value.setColumns(10);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				double c = Double.parseDouble(value.getText());
				double f = (c * (9/5))+32;
				answer.setText(String.valueOf(f));
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setBounds(216, 91, 120, 30);
		panel.add(btnNewButton);
		
		JLabel Farenheit = new JLabel("Fahrenheit");
		Farenheit.setForeground(Color.BLACK);
		Farenheit.setBackground(Color.WHITE);
		Farenheit.setFont(new Font("Arial", Font.BOLD, 16));
		Farenheit.setBounds(155, 148, 96, 19);
		panel.add(Farenheit);
		
		answer = new JTextField();
		answer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		answer.setBounds(319, 145, 129, 30);
		panel.add(answer);
		answer.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				value.setText(null);
				answer.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_1.setBounds(125, 198, 85, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_2.setBounds(330, 198, 85, 21);
		panel.add(btnNewButton_2);
	}
}
