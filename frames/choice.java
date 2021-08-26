package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import repository.*;
import entity.*;


public class choice extends JFrame implements ActionListener
{
	private JLabel title1;
	private JPanel PanelForm;
	private JTextField t1;
	private JButton AdminBtn,EmployeeBtn;
	private JPasswordField t2;
	Font f;
	
	// private ImageIcon icon,icon1,icon2;
	// icon1 = new ImageIcon(getClass().getResource("admin.png"));
	// icon2 = new ImageIcon(getClass().getResource("Employer.png"));
	
	
	
	public choice()
	{  
	    super("Home page");
		f = new Font("Bodoni MT",Font.BOLD,30);
		
		
		this.setSize(1000,500);
		this.setLayout(null);
		
		// icon1 = new ImageIcon(getClass().getResource("admin.png"));
	    // icon2 = new ImageIcon(getClass().getResource("Employer.png"));
		
		PanelForm=new JPanel();
		PanelForm.setLayout(null);
		
		title1=new JLabel("Choice one");
		title1.setFont(f);
		title1.setBounds(380,50,400,30);
		add(title1);
		
	
		AdminBtn=new JButton("Admin");
		AdminBtn.setBounds(300,100,150,30);	
		add(AdminBtn);
		
		EmployeeBtn=new JButton("Employee");
		EmployeeBtn.setBounds(450,100,150,30);
		add(EmployeeBtn);
		
		
		
		
		
		this.add(PanelForm);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		AdminBtn.addActionListener(this);
		EmployeeBtn.addActionListener(this);
	
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		// String command = e.getActionCommand();
		if(e.getSource()==EmployeeBtn)
		{
			// JOptionPane.showMessageDialog(null,"ok");
			EmployeeLoginFrame eLF = new EmployeeLoginFrame();
		}
		else if(e.getSource()==AdminBtn)
		{
			// JOptionPane.showMessageDialog(null,"ok");
			LoginFrame aF = new LoginFrame();
			 aF.setVisible(true);
		}
	}
	
	// public static void main(String [] args)
	// {
		// choice c =new choice();
	// }

	
}