package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dsicount {

	private JFrame frame;
	private JTextField txtDiscountCalculator;
	private JTextField amt;
	private JTextField dp;
	private JTextField tot;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dsicount window = new Dsicount();
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
	public Dsicount() {
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
		
		txtDiscountCalculator = new JTextField();
		txtDiscountCalculator.setForeground(new Color(255, 255, 255));
		txtDiscountCalculator.setBackground(new Color(0, 0, 0));
		txtDiscountCalculator.setFont(new Font("Arial", Font.BOLD, 16));
		txtDiscountCalculator.setText("DISCOUNT CALCULATOR");
		txtDiscountCalculator.setBounds(90, 20, 208, 19);
		panel.add(txtDiscountCalculator);
		txtDiscountCalculator.setColumns(10);
		
		JLabel princi = new JLabel("PRINCIPAL AMOUNT");
		princi.setFont(new Font("Arial", Font.BOLD, 16));
		princi.setBounds(24, 75, 169, 24);
		panel.add(princi);
		
		JLabel dis = new JLabel("DISCOUNT PERCENTAGE");
		dis.setFont(new Font("Arial", Font.BOLD, 16));
		dis.setBounds(24, 109, 216, 24);
		panel.add(dis);
		
		amt = new JTextField();
		amt.setFont(new Font("Arial", Font.PLAIN, 16));
		amt.setBounds(285, 74, 96, 19);
		panel.add(amt);
		amt.setColumns(10);
		
		dp = new JTextField();
		dp.setFont(new Font("Arial", Font.PLAIN, 16));
		dp.setBounds(285, 106, 96, 19);
		panel.add(dp);
		dp.setColumns(10);
		
		JButton cal = new JButton("Calculate");
		cal.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int amount = Integer.parseInt(amt.getText());
				int discount = Integer.parseInt(dp.getText());
				int ans = (int)(amount - (amount *((double)discount/100)));
				tot.setText(String.valueOf(ans));
			}
		});
		cal.setBackground(new Color(0, 0, 0));
		cal.setForeground(new Color(153, 51, 51));
		cal.setFont(new Font("Arial", Font.BOLD, 16));
		cal.setBounds(134, 153, 132, 30);
		panel.add(cal);
		
		JLabel net = new JLabel("NET PRICE");
		net.setFont(new Font("Arial", Font.BOLD, 16));
		net.setBounds(23, 193, 170, 24);
		panel.add(net);
		
		tot = new JTextField();
		tot.setFont(new Font("Arial", Font.PLAIN, 16));
		tot.setBounds(285, 190, 96, 19);
		panel.add(tot);
		tot.setColumns(10);
		
		JLabel rs1 = new JLabel("RS");
		rs1.setFont(new Font("Arial", Font.PLAIN, 16));
		rs1.setBounds(391, 75, 45, 13);
		panel.add(rs1);
		
		JLabel per = new JLabel("%");
		per.setFont(new Font("Arial", Font.PLAIN, 16));
		per.setBounds(391, 109, 45, 13);
		panel.add(per);
		
		JLabel label = new JLabel("RS");
		label.setFont(new Font("Arial", Font.PLAIN, 16));
		label.setBounds(391, 190, 45, 13);
		panel.add(label);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				amt.setText(null);
				dp.setText(null);
				tot.setText(null);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setBounds(24, 227, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_1.setBounds(330, 227, 85, 21);
		panel.add(btnNewButton_1);
	}

}
