package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class form {

	private JFrame frmMrecPortal;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form window = new form();
					window.frmMrecPortal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMrecPortal = new JFrame();
		frmMrecPortal.setTitle("MREC Portal");
		frmMrecPortal.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\admin\\Downloads\\OIP.jpg"));
		frmMrecPortal.getContentPane().setBackground(new Color(192, 192, 192));
		frmMrecPortal.getContentPane().setForeground(new Color(0, 0, 0));
		frmMrecPortal.setBounds(100, 100, 450, 300);
		frmMrecPortal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMrecPortal.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(151, 11, 109, 14);
		frmMrecPortal.getContentPane().add(lblNewLabel);
		
		JLabel lb1 = new JLabel("ID :");
		lb1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lb1.setBounds(70, 68, 46, 14);
		frmMrecPortal.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("Name :");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lb2.setBounds(70, 114, 46, 14);
		frmMrecPortal.getContentPane().add(lb2);
		
		JLabel lb3 = new JLabel("Department : ");
		lb3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lb3.setBounds(70, 168, 100, 14);
		frmMrecPortal.getContentPane().add(lb3);
		
		tf1 = new JTextField();
		tf1.setBounds(180, 65, 86, 20);
		frmMrecPortal.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(180, 111, 86, 20);
		frmMrecPortal.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Data Science", "Cyber Security", "AI & ML", "IOT"}));
		cb1.setBounds(180, 164, 86, 22);
		frmMrecPortal.getContentPane().add(cb1);
		
		JButton btn1 = new JButton("Submit : ");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roll=tf1.getText();
				int id=Integer.parseInt(roll);
				String name=tf2.getText();
				String branch=(String) cb1.getSelectedItem();   
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mrec");
					String q="insert into students values('"+id+"','"+name+"','"+branch+"')";
					Statement stn=con.createStatement();
					stn.executeUpdate(q);
					JOptionPane.showMessageDialog(btn1, "record inserted");
					con.close();
				}
				catch(SQLException e1){
					e1.printStackTrace();
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn1.setBounds(151, 212, 89, 23);
		frmMrecPortal.getContentPane().add(btn1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBackground(new Color(192, 192, 192));
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\OIP.jpg"));
		lblNewLabel_4.setBounds(336, 11, 88, 92);
		frmMrecPortal.getContentPane().add(lblNewLabel_4);
	}
}
