package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import repository.*;
import entity.*;
public class employee extends JFrame
{
	private JLabel title1;
	private JPanel PanelForm;
	private JTextField t1;
	private JButton ProductBtn,Customer_dataBtn,Sell_InfoBtn,view_profileBtn,log_outBtn;
	private JPasswordField t2;
	Font f;
	
	
	
	
	
	public employee()
	{  
	    super("Employee Work");
		f = new Font("Bodoni MT",Font.BOLD,30);
		
		
		this.setSize(1000,500);
		this.setLayout(null);
		
		
		
		PanelForm=new JPanel();
		PanelForm.setLayout(null);
		
		title1=new JLabel("Choice one");
		title1.setFont(f);
		title1.setBounds(380,50,400,30);
		add(title1);
		
	
		ProductBtn=new JButton("Product");
		ProductBtn.setBounds(30,200,150,30);	
		add(ProductBtn);
		
		Customer_dataBtn=new JButton("Customer_data");
		Customer_dataBtn.setBounds(200,200,150,30);
		add(Customer_dataBtn);
		
		
		Sell_InfoBtn=new JButton("Sell_Info");
		Sell_InfoBtn.setBounds(370,200,150,30);	
		add(Sell_InfoBtn);
		
		view_profileBtn=new JButton("view_profile");
		view_profileBtn.setBounds(540,200,150,30);
		add(view_profileBtn);
		
		
		log_outBtn=new JButton("log_out");
		log_outBtn.setBounds(30,250,150,30);	
		add(log_outBtn);
		
		
		
		
		
		this.add(PanelForm);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	
		
	}
	
	
	
	// public static void main(String [] args)
	// {
		// employee c =new employee();
	// }

	
}