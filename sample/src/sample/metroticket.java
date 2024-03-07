package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class metroticket {

	private JFrame frame;
	private JTextField tp1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metroticket window = new metroticket();
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
	public metroticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\admin\\Downloads\\images.png"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TICKET BOOKING");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(128, 11, 135, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(23, 70, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(23, 110, 77, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(23, 147, 106, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NO.OF TICKETS :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(23, 186, 106, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tp1 = new JTextField();
		tp1.setBounds(128, 68, 135, 20);
		frame.getContentPane().add(tp1);
		tp1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "PARADE GROUND", "SECBAD WEST", "GANDHI HOSP", "MUSHIRABAD", "RTC X ROADS", "CHIKADPALLY", "NARAYANGUDA", "SULTAN BAZAAR", "MGBS"}));
		c1.setBounds(128, 107, 135, 22);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "PARADE GROUND", "SECBAD WEST", "GANDHI HOSP", "MUSHIRABAD", "RTC X ROADS", "CHIKADPALLY", "NARAYANGUDA", "SULTAN BAZAAR", "MGBS"}));
		c2.setBounds(128, 144, 135, 22);
		frame.getContentPane().add(c2);
		
		JComboBox c3 = new JComboBox();
		c3.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "0", "3", "0", "2", "5", "0", "4", "0", "6", "0", "7", "0", "8", "0", "9", "0"}));
		c3.setBounds(128, 183, 135, 22);
		frame.getContentPane().add(c3);
		
		JButton btnNewButton = new JButton("CONFIRM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tp1.getText();
				String source=(String)c1.getSelectedItem();
				String destination=(String)c2.getSelectedItem();
				String tickets=(String)c3.getSelectedItem();
				int numbertickets=Integer.parseInt(tickets);
				int bill=0;
				if(source.equals(destination))
				{
					JOptionPane.showMessageDialog(btnNewButton, "please check station");
				}
				else
				{
					bill += 45*numbertickets;
					JOptionPane.showConfirmDialog(btnNewButton, "NAME "+name+ "\n SOURCE "+source+ "\n DESTINATION " +destination+ "\n NO.OF TICKETS"+tickets+ "\n BILL"+bill);
			
				}
				
			}
			
		});
		btnNewButton.setBounds(128, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\images.png"));
		lblNewLabel_5.setBounds(227, -12, 207, 262);
		frame.getContentPane().add(lblNewLabel_5);
	}

}
