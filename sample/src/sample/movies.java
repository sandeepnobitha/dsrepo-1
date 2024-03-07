package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movies {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movies window = new movies();
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
	public movies() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("TICKET BOOKING");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(118, 11, 148, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME :");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(77, 47, 83, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBounds(198, 45, 142, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("MOVIE NAME :");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(77, 87, 108, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "SALAAR", "RRR", "KGF-2", "PROJECT-K"}));
		c1.setBounds(198, 84, 142, 22);
		frame.getContentPane().add(c1);
		
		JLabel lblNewLabel_4 = new JLabel("NO.OF TICKETS :");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(77, 123, 108, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		c2.setBounds(198, 119, 142, 22);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("CONFIRM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = t1.getText();
				String movie= (String) c1.getSelectedItem();
				String number = (String) c2.getSelectedItem();
				
				int number_of_tickets = Integer.parseInt(number);
				int bill = 0;
				if(movie.equals("SALAAR"))
				{
					bill += 150*number_of_tickets; 
				}
				else if(movie.equals("RRR"))
				{
					bill += 200*number_of_tickets; 
				}
				else if(movie.equals("KGF-2"))
				{
					bill += 250*number_of_tickets; 
				}
				else if(movie.equals("PROJECT-K"))
				{
					bill += 3000*number_of_tickets; 
				}
				int res = 0;
				res = JOptionPane.showConfirmDialog(btnNewButton, "Name "+name+ "\n movie "+movie+"\nNumber of tickets "+number_of_tickets+"Total bill "+bill);
				if(res == 0)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Booking confirmed");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Booking cancelled");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(137, 179, 115, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\blue-background-7470781_640.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
	}
}
