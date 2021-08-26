package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import repository.*;
import entity.*;

public class adminFrame extends JFrame
{
	private JLabel title1,title2,title3,title4,title5;
	private JPanel PanelForm;
	private JTextField t1,t2,t3,t4;
	private JButton LoadBtn,InsertBtn,UpdateBtn,DeleteBtn,RefreshBtn,Get_AllBtn,BackBtn,addemployeeBtn,logoutBtn;
	//private JPasswordField t2;
	Font f,f1;
	
	Admin admin;
	
	public adminFrame(Admin admin)
	{  
	    super("Admin Log in page");
		f = new Font("Bodoni MT",Font.BOLD,30);
		f1 = new Font("Bodoni MT",Font.BOLD,20);
		
		this.setSize(1500,700);
		this.setLayout(null);
		
		PanelForm=new JPanel();
		PanelForm.setLayout(null);
		
		title3=new JLabel("SEEN BY Admin");
		title3.setFont(f);
		title3.setBounds(300,50,400,30);
		add(title3);
		
		title1= new JLabel("ID: ");
		title1.setBounds(30,100,150,30);
	    add(title1);
		t1= new JTextField();
		t1.setBounds(70,100,100,30);
		add(t1);
		
		title2= new JLabel("Name:");
		title2.setBounds(30,150,150,30);
		add(title2);
		t2= new JTextField();
		t2.setBounds(70,150,100,30);
		add(t2);
		
		
		title4= new JLabel("Designation ");
		title4.setBounds(10,200,150,30);
	    add(title4);
		t3= new JTextField();
		t3.setBounds(70,200,100,30);
		add(t3);
		
		title5= new JLabel("Salary");
		title2.setBounds(30,250,150,30);
		add(title5);
		t4= new JTextField();
		t4.setBounds(70,250,100,30);
		add(t4);
		
		
		
		LoadBtn=new JButton("Load");
		LoadBtn.setBounds(30,300,150,30);	
		add(LoadBtn);
		
		InsertBtn=new JButton("Insert");
		InsertBtn.setBounds(200,300,150,30);
		add(InsertBtn);
		
		
		UpdateBtn=new JButton("Update");
		UpdateBtn.setBounds(370,300,150,30);	
		add(UpdateBtn);
		
		DeleteBtn=new JButton("Delete");
		DeleteBtn.setBounds(540,300,150,30);
		add(DeleteBtn);
		
		
		RefreshBtn=new JButton("Refresh");
		RefreshBtn.setBounds(710,300,150,30);	
		add(RefreshBtn);
		
		Get_AllBtn=new JButton("Get_All");
		Get_AllBtn.setBounds(710,250,150,30);	
		add(Get_AllBtn);
		
		
		BackBtn=new JButton("Back");
		BackBtn.setBounds(850,350,150,30);	
		add(BackBtn);
		
		logoutBtn=new JButton("log out");
		logoutBtn.setBounds(1000,350,150,30);	
		add(logoutBtn);
		
		
		addemployeeBtn=new JButton("add employee");
		addemployeeBtn.setBounds(30,350,150,30);	
		add(addemployeeBtn);
		
		
		// showBtn= new JButton("Show");
		// showBtn.setBounds(470,150,80,30);	
		// add(showBtn);
		
		// loginBtn=new JButton("Login");
		// loginBtn.setBounds(300,200,80,30);	
		// add(loginBtn);
		
		// exitBtn=new JButton("Exit");
		// exitBtn.setBounds(390,200,80,30);
		// add(exitBtn);
		
		// title4 =new JLabel("for reg");
		// title4.setFont(f1);
		// title4.setBounds(300,260,90,30);
		// add(title4);
		
		// signupBtn=new JButton("Sign Up");
		// signupBtn.setBounds(300,300,170,30);
		// add(signupBtn);
		
		this.add(PanelForm);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	
		
	}
	
	
	
	// public static void main(String [] args)
	// {
		 // adminFrame ab = new adminFrame();
	// }

	
}