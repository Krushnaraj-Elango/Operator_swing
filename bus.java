package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class bus {

	private JFrame frame;
	private JTextField name1;
	private JTextField date1;
	private JTextField seno1;
	private JTextField cost;
	private JTextField no1;
	private JTextField tot;
	private JTextField dis;
	private JTextField gst;
	private JTextField ans;
	private JTextField seno2;
	private JTextField date2;
	private JTextField name2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bus window = new bus();
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
	public bus() {
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
		
		JLabel lblNewLabel = new JLabel("BOOKING TICKETS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(112, 10, 151, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SEATS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 33, 92, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BOOKING DETAILS");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(112, 33, 151, 13);
		panel.add(lblNewLabel_2);
		
		JCheckBox s1 = new JCheckBox("");
		s1.setBounds(10, 62, 21, 21);
		panel.add(s1);
		
		JCheckBox s2 = new JCheckBox("");
		s2.setBounds(34, 62, 21, 21);
		panel.add(s2);
		
		JCheckBox s3 = new JCheckBox("");
		s3.setBounds(10, 87, 21, 21);
		panel.add(s3);
		
		JCheckBox s4 = new JCheckBox("");
		s4.setBounds(34, 87, 21, 21);
		panel.add(s4);
		
		JCheckBox s5 = new JCheckBox("");
		s5.setBounds(10, 110, 21, 21);
		panel.add(s5);
		
		JCheckBox s6 = new JCheckBox("");
		s6.setBounds(34, 110, 21, 21);
		panel.add(s6);
		
		JLabel Name1 = new JLabel("Name");
		Name1.setBounds(112, 62, 50, 13);
		panel.add(Name1);
		
		JLabel Date1 = new JLabel("DOJ");
		Date1.setBounds(112, 87, 29, 13);
		panel.add(Date1);
		
		name1 = new JTextField();
		name1.setBounds(167, 59, 96, 19);
		panel.add(name1);
		name1.setColumns(10);
		
		date1 = new JTextField();
		date1.setBounds(167, 87, 96, 19);
		panel.add(date1);
		date1.setColumns(10);
		
		JCheckBox Check = new JCheckBox("Physically disabled");
		Check.setBounds(122, 110, 151, 21);
		panel.add(Check);
		
		JLabel Seat1 = new JLabel("Seat No:");
		Seat1.setBounds(112, 137, 50, 13);
		panel.add(Seat1);
		
		seno1 = new JTextField("0");
		seno1.setBounds(167, 137, 96, 19);
		panel.add(seno1);
		seno1.setColumns(10);
		
		JLabel Cost = new JLabel("Cost");
		Cost.setBounds(273, 62, 45, 13);
		panel.add(Cost);
		
		JLabel Nos = new JLabel("Nos");
		Nos.setBounds(273, 87, 45, 13);
		panel.add(Nos);
		
		JLabel Total = new JLabel("Total");
		Total.setBounds(273, 110, 45, 13);
		panel.add(Total);
		
		JLabel Discount = new JLabel("Discount");
		Discount.setBounds(273, 137, 45, 13);
		panel.add(Discount);
		
		JLabel GST = new JLabel("GST");
		GST.setBounds(273, 169, 45, 13);
		panel.add(GST);
		
		JLabel Net_price = new JLabel("Net Price");
		Net_price.setBounds(273, 198, 45, 13);
		panel.add(Net_price);
		
		cost = new JTextField();
		cost.setText("750.00");
		cost.setBounds(328, 62, 96, 19);
		panel.add(cost);
		cost.setColumns(10);
		
		no1 = new JTextField();
		no1.setBounds(328, 87, 96, 19);
		panel.add(no1);
		no1.setColumns(10);
		
		tot = new JTextField();
		tot.setBounds(328, 112, 96, 19);
		panel.add(tot);
		tot.setColumns(10);
		
		dis = new JTextField();
		dis.setBounds(328, 137, 96, 19);
		panel.add(dis);
		dis.setColumns(10);
		
		gst = new JTextField();
		gst.setBounds(328, 166, 96, 19);
		panel.add(gst);
		gst.setColumns(10);
		
		ans = new JTextField();
		ans.setBounds(328, 195, 96, 19);
		panel.add(ans);
		ans.setColumns(10);
		
		JLabel Name2 = new JLabel("Name");
		Name2.setBounds(112, 169, 50, 13);
		panel.add(Name2);
		
		JLabel Doj2 = new JLabel("DOJ");
		Doj2.setBounds(112, 198, 29, 13);
		panel.add(Doj2);
		
		JCheckBox Check2 = new JCheckBox("Physically disabled");
		Check2.setBounds(122, 217, 141, 21);
		panel.add(Check2);
		
		JLabel se2 = new JLabel("Seat No:");
		se2.setBounds(112, 250, 50, 13);
		panel.add(se2);
		
		seno2 = new JTextField("0");
		seno2.setBounds(167, 247, 96, 19);
		panel.add(seno2);
		seno2.setColumns(10);
		
		date2 = new JTextField();
		date2.setBounds(167, 195, 96, 19);
		panel.add(date2);
		date2.setColumns(10);
		
		name2 = new JTextField();
		name2.setBounds(167, 166, 96, 19);
		panel.add(name2);
		name2.setColumns(10);
		
		JCheckBox s7 = new JCheckBox("");
		s7.setBounds(10, 133, 21, 21);
		panel.add(s7);
		
		JCheckBox s8 = new JCheckBox("");
		s8.setBounds(34, 133, 21, 21);
		panel.add(s8);
		
		JCheckBox s9 = new JCheckBox("");
		s9.setBounds(10, 156, 21, 21);
		panel.add(s9);
		
		JCheckBox s10 = new JCheckBox("");
		s10.setBounds(34, 156, 21, 21);
		panel.add(s10);
		
		JCheckBox s11 = new JCheckBox("");
		s11.setBounds(67, 62, 21, 21);
		panel.add(s11);
		
		JCheckBox s12 = new JCheckBox("");
		s12.setBounds(90, 62, 21, 21);
		panel.add(s12);
		
		JCheckBox s13 = new JCheckBox("");
		s13.setBounds(67, 87, 21, 21);
		panel.add(s13);
		
		JCheckBox s14 = new JCheckBox("");
		s14.setBounds(90, 87, 21, 21);
		panel.add(s14);
		
		JCheckBox s15 = new JCheckBox("");
		s15.setBounds(67, 110, 21, 21);
		panel.add(s15);
		
		JCheckBox s16 = new JCheckBox("");
		s16.setBounds(89, 110, 21, 21);
		panel.add(s16);
		
		JCheckBox s17 = new JCheckBox("");
		s17.setBounds(67, 133, 21, 21);
		panel.add(s17);
		
		JCheckBox s18 = new JCheckBox("");
		s18.setBounds(90, 133, 21, 21);
		panel.add(s18);
		
		JCheckBox s19 = new JCheckBox("");
		s19.setBounds(67, 156, 21, 21);
		panel.add(s19);
		
		JCheckBox s20 = new JCheckBox("");
		s20.setBounds(90, 156, 21, 21);
		panel.add(s20);
		
		JCheckBox s21 = new JCheckBox("");
		s21.setBounds(10, 179, 21, 21);
		panel.add(s21);
		
		JCheckBox s22 = new JCheckBox("");
		s22.setBounds(34, 179, 21, 21);
		panel.add(s22);
		
		JCheckBox s23 = new JCheckBox("");
		s23.setBounds(67, 179, 21, 21);
		panel.add(s23);
		
		JCheckBox s24 = new JCheckBox("");
		s24.setBounds(90, 179, 21, 21);
		panel.add(s24);
		
		JButton Print = new JButton("Confirm");
		Print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				name1.setText(null);
				date1.setText(null);
				name2.setText(null);
				date2.setText(null);
				no1.setText(null);
				tot.setText(null);
				dis.setText(null);
				gst.setText(null);
				ans.setText(null);
				seno1.setText("0");
				seno2.setText("0");
				Check.setSelected(false);
				Check2.setSelected(false);
			}
		});
		Print.setBounds(303, 232, 85, 21);
		panel.add(Print);
		
		JButton Book = new JButton("Book");
		Book.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int sn1 = Integer.parseInt(seno1.getText());
				int sn2 = Integer.parseInt(seno2.getText());
				if(sn1!=0 || sn2!=0)
				{
					switch(sn1)
					{
					case 1: s1.setSelected(true);break;
					case 2: s2.setSelected(true);break;
					case 3: s3.setSelected(true);break;
					case 4: s4.setSelected(true);break;
					case 5: s5.setSelected(true);break;
					case 6: s6.setSelected(true);break;
					case 7: s7.setSelected(true);break;
					case 8: s8.setSelected(true);break;
					case 9: s9.setSelected(true);break;
					case 10: s10.setSelected(true);break;
					case 11: s11.setSelected(true);break;
					case 12: s12.setSelected(true);break;
					case 13: s13.setSelected(true);break;
					case 14: s14.setSelected(true);break;
					case 15: s15.setSelected(true);break;
					case 16: s16.setSelected(true);break;
					case 17: s17.setSelected(true);break;
					case 18: s18.setSelected(true);break;
					case 19: s19.setSelected(true);break;
					case 20: s20.setSelected(true);break;
					case 21: s21.setSelected(true);break;
					case 22: s22.setSelected(true);break;
					case 23: s23.setSelected(true);break;
					case 24: s24.setSelected(true);break;
					}
					switch(sn2)
					{
					case 1: s1.setSelected(true);break;
					case 2: s2.setSelected(true);break;
					case 3: s3.setSelected(true);break;
					case 4: s4.setSelected(true);break;
					case 5: s5.setSelected(true);break;
					case 6: s6.setSelected(true);break;
					case 7: s7.setSelected(true);break;
					case 8: s8.setSelected(true);break;
					case 9: s9.setSelected(true);break;
					case 10: s10.setSelected(true);break;
					case 11: s11.setSelected(true);break;
					case 12: s12.setSelected(true);break;
					case 13: s13.setSelected(true);break;
					case 14: s14.setSelected(true);break;
					case 15: s15.setSelected(true);break;
					case 16: s16.setSelected(true);break;
					case 17: s17.setSelected(true);break;
					case 18: s18.setSelected(true);break;
					case 19: s19.setSelected(true);break;
					case 20: s20.setSelected(true);break;
					case 21: s21.setSelected(true);break;
					case 22: s22.setSelected(true);break;
					case 23: s23.setSelected(true);break;
					case 24: s24.setSelected(true);break;
					}
					if(sn1!=0 && sn2!=0)
					{
						no1.setText("2");
						double n = Double.parseDouble(cost.getText()) * 2;
						double discount_rate=0;
						tot.setText(String.valueOf(n));
						if(Check.isSelected() && Check2.isSelected())
							discount_rate = -800.00;
						else if(Check.isSelected() || Check2.isSelected())
							discount_rate = -400.00;
						dis.setText(String.valueOf(discount_rate));
						double total = n + discount_rate ;
						double g = (total*18)/100;
						gst.setText(String.valueOf(g));
						double answer = total+g;
						ans.setText(String.valueOf(answer));
					}
					else
					{
						no1.setText("1");
						double n = Double.parseDouble(cost.getText()) * 1;
						double discount_rate=0;
						tot.setText(String.valueOf(n));
						if(Check.isSelected() || Check2.isSelected())
							discount_rate = -400.00;
						dis.setText(String.valueOf(discount_rate));
						double total = n + discount_rate ;
						double g = (total*18)/100;
						gst.setText(String.valueOf(g));
						double answer = total+g;
						ans.setText(String.valueOf(answer));
					}
				}
			}
		});
		Book.setBounds(17, 232, 85, 21);
		panel.add(Book);
	}
}
