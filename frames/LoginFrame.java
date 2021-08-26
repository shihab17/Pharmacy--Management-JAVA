package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

import entity.*;
import repository.*;

public class LoginFrame extends JFrame implements ActionListener, MouseListener
{
	JLabel title, userLabel, passLabel;
	JTextField userTF;
	JPasswordField passPF;
	JButton loginBtn, exitBtn, regBtn, showPassBtn;
	JPanel panel;
	
	public LoginFrame()
	{
		super("Sample Management System - Login Window");
		
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		title = new JLabel("Sample Management System");
		title.setBounds(300, 50, 350, 30);
		panel.add(title);
		
		userLabel = new JLabel("User ID : ");
		userLabel.setBounds(300, 100, 60, 30);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(370, 100, 100, 30);
		panel.add(userTF);
		
		passLabel = new JLabel("Password : ");
		passLabel.setBounds(300, 150, 70, 30);
		panel.add(passLabel);
		
		passPF = new JPasswordField();
		passPF.setBounds(370, 150, 100, 30);
		passPF.setEchoChar('*');
		panel.add(passPF);
		
		showPassBtn = new JButton("Show");
		showPassBtn.setBounds(470,150,80,30);
		showPassBtn.addMouseListener(this);
		panel.add(showPassBtn);
		
		loginBtn = new JButton("Login");
		loginBtn.setBounds(300, 200, 80, 30);
		loginBtn.addActionListener(this);
		panel.add(loginBtn);
		
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(390, 200, 80, 30);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		
		regBtn = new JButton("Registration");
		regBtn.setBounds(300, 250, 170, 30);
		regBtn.addActionListener(this);
		panel.add(regBtn);
		
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(command.equals(loginBtn.getText()))
		{
			// String command =ae.getActionCommand();
			RepoAdmin ur = new RepoAdmin();
			Admin admin = ur.getAdmin(userTF.getText(), passPF.getText());
			
			if(admin != null)
			{
				if(admin.getStatus() == 0|| admin.getStatus() == 1)
				{
					adminFrame eh = new adminFrame(admin);
					eh.setVisible(true);
					this.setVisible(false);
				}
				
				else if(admin.getStatus() == 2) {}
				else{}
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Invaild Id or Password");
			}
			
		}
		else if(command.equals(exitBtn.getText()))
		{
			System.exit(0);
		}
		
		else{}
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me)
	{
		passPF.setEchoChar((char)0);
	}
	public void mouseReleased(MouseEvent me)
	{
		 passPF.setEchoChar('*');
	}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
}