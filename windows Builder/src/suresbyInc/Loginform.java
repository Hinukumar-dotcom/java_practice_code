package suresbyInc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Loginform extends JFrame {

	private JPanel contentPane;
	private JTextField firstnametext;
	private JTextField lastnametext;
	private JTextField MailIdtext;
	private JTextField mobilenotext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginform frame = new Loginform();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Loginform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(680, 100, 532, 763);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Firstname = new JLabel("First Name");
		Firstname.setFont(new Font("Tahoma", Font.BOLD, 16));
		Firstname.setBounds(49, 57, 93, 23);
		contentPane.add(Firstname);
		
		firstnametext = new JTextField();
		firstnametext.setToolTipText("Please enter your first name");
		firstnametext.setBounds(49, 88, 388, 32);
		contentPane.add(firstnametext);
		firstnametext.setColumns(10);
		
		JLabel Lastname = new JLabel("Last Name");
		Lastname.setFont(new Font("Tahoma", Font.BOLD, 16));
		Lastname.setBounds(49, 138, 110, 23);
		contentPane.add(Lastname);
		
		lastnametext = new JTextField();
		lastnametext.setToolTipText("Please enter your last name");
		lastnametext.setColumns(10);
		lastnametext.setBounds(49, 174, 388, 32);
		contentPane.add(lastnametext);
		
		JLabel MailId = new JLabel("Email ID");
		MailId.setLabelFor(this);
		MailId.setToolTipText("");
		MailId.setFont(new Font("Tahoma", Font.BOLD, 16));
		MailId.setBounds(49, 219, 110, 23);
		contentPane.add(MailId);
		
		MailIdtext = new JTextField();
		MailIdtext.setToolTipText("Please enter your mail Id");
		MailIdtext.setColumns(10);
		MailIdtext.setBounds(49, 255, 388, 32);
		contentPane.add(MailIdtext);
		
		JLabel Gender = new JLabel("Gender");
		Gender.setToolTipText("");
		Gender.setFont(new Font("Tahoma", Font.BOLD, 16));
		Gender.setBounds(49, 300, 110, 23);
		contentPane.add(Gender);
		
		JRadioButton maleradiobutton = new JRadioButton(" Male");
		maleradiobutton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		maleradiobutton.setBounds(49, 331, 110, 25);
		contentPane.add(maleradiobutton);
		
		JRadioButton femaleradiobutton = new JRadioButton("Female");
		femaleradiobutton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		femaleradiobutton.setBounds(164, 332, 127, 25);
		contentPane.add(femaleradiobutton);
		
		JLabel mobileno = new JLabel("Mobile No");
		mobileno.setToolTipText("");
		mobileno.setFont(new Font("Tahoma", Font.BOLD, 16));
		mobileno.setBounds(49, 376, 110, 23);
		contentPane.add(mobileno);
		
		mobilenotext = new JTextField();
		mobilenotext.setToolTipText("Please enter your mobile no");
		mobilenotext.setColumns(10);
		mobilenotext.setBounds(49, 412, 388, 32);
		contentPane.add(mobilenotext);
		
		JButton submitbutton = new JButton("Submit");
		submitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				aftersubmit submit = new aftersubmit();
				submit.setVisible(true);
				dispose();
			}
		});
		submitbutton.setBackground(Color.LIGHT_GRAY);
		submitbutton.setFont(new Font("Tahoma", Font.BOLD, 16));
		submitbutton.setBounds(194, 527, 97, 25);
		contentPane.add(submitbutton);
	}
}
