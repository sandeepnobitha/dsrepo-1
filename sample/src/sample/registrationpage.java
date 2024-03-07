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
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registrationpage {

	private JFrame frame;
	private JTextField tp1;
	private JTextField tp2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrationpage window = new registrationpage();
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
	public registrationpage() {
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
		
		JLabel lblNewLabel_1 = new JLabel("REGISTRATION FORM");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(109, 11, 174, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME :");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(64, 56, 98, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ROLL NO :");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(64, 89, 85, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tp1 = new JTextField();
		tp1.setBounds(156, 58, 127, 20);
		frame.getContentPane().add(tp1);
		tp1.setColumns(10);
		
		tp2 = new JTextField();
		tp2.setBounds(156, 87, 127, 20);
		frame.getContentPane().add(tp2);
		tp2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "IT", "ECE", "MECH", "EEE"}));
		cb1.setBounds(156, 118, 127, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_4 = new JLabel("BRANCH :");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(64, 126, 82, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(" GENDER :");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(62, 151, 65, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton rb1 = new JRadioButton("MALE");
		buttonGroup.add(rb1);
		rb1.setBounds(156, 147, 90, 23);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("FEMALE");
		buttonGroup.add(rb2);
		rb2.setBounds(264, 148, 85, 23);
		frame.getContentPane().add(rb2);
		
		JLabel lblNewLabel_6 = new JLabel("PROG LANG :");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(66, 188, 96, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JCheckBox c1 = new JCheckBox("PYTHON");
		c1.setBounds(156, 185, 76, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("JAVA");
		c2.setBounds(244, 185, 76, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("C");
		c3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		c3.setBounds(331, 184, 76, 23);
		frame.getContentPane().add(c3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name = tp1.getText();
			String rollno = tp2.getText();
			String branch = (String) cb1.getSelectedItem();
			String gender=" ";
			String languages=" ";
			
			if(rb1.isSelected())
			{
				gender="male";
			}
			if(rb2.isSelected())
			{
				gender="female";
			}
			if(c1.isSelected())
			{
			  languages += " python ";	
			}
			if(c2.isSelected())
			{
				languages += " java ";
			}
			if(c3.isSelected())
			{
				languages += " c";
			}
			JOptionPane.showMessageDialog(btnNewButton, " NAME " + name +"\n ROLL NO " +rollno+"\n BRANCH "+branch+ "\n GENDER "+gender+ "\n PROG LANG " +languages);
			
			}
		});
		btnNewButton.setBounds(164, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\blue-background-7470781_640.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
	}
}
