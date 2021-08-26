package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import repository.*;
import entity.*;

public class EmployeeFrame extends JFrame implements ActionListener
{
	private JLabel title1,title2,title3,title4,title5,e_Address,e_Gender,Address,dateofbirth,PN;
	private JPanel PanelForm;
	private JTextField t1,t2,t3,te_Address,te_Gender,te_Bloodgroup,tAddress,tdateofbirth,tPN;
	private JButton LoadBtn,InsertBtn,UpdateBtn,DeleteBtn,RefreshBtn,Get_AllBtn,logoutBtn,MedicineBtn;

	Font f,f1;
	
	private Admin admin;
	private RepoEmployee er;
	private RepoAdmin ur;
	
	public EmployeeFrame(Admin admin)
	{  
	    super("Employee Log in page");
		f = new Font("Bodoni MT",Font.BOLD,30);
		f1 = new Font("Bodoni MT",Font.BOLD,20);
		
		this.setSize(1500,700);
		this.setLayout(null);
		er = new RepoEmployee();
		ur= new RepoAdmin();
		PanelForm=new JPanel();
		PanelForm.setLayout(null);
		
		title3=new JLabel("SEEN BY Employee");
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
		
		
		title4= new JLabel("Salary ");
		title4.setBounds(30,200,150,30);
	    add(title4);
		t3= new JTextField();
		t3.setBounds(70,200,100,30);
		add(t3);
		
		dateofbirth= new JLabel("D O b");
		dateofbirth.setBounds(30,250,150,30);
	    add(dateofbirth);
		tdateofbirth= new JTextField();
		tdateofbirth.setBounds(70,250,100,30);
		add(tdateofbirth);
		
		
		
		MedicineBtn=new JButton("Medicine view");
		MedicineBtn.setBounds(710,350,150,30);	
		add(MedicineBtn);
		
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
		
		logoutBtn=new JButton("log out");
		logoutBtn.setBounds(540,250,150,30);
		add(logoutBtn);
		
		
		RefreshBtn=new JButton("Refresh");
		RefreshBtn.setBounds(710,300,150,30);	
		add(RefreshBtn);
		
		Get_AllBtn=new JButton("Get_All");
		Get_AllBtn.setBounds(710,250,150,30);	
		add(Get_AllBtn);
		
		
		
		
		
		e_Address= new JLabel("Email Address: ");
		e_Address.setBounds(200,100,150,30);
	    add(e_Address);
		te_Address= new JTextField();
		te_Address.setBounds(300,100,100,30);
		add(te_Address);
		
		e_Gender= new JLabel("Gender : ");
		e_Gender.setBounds(200,150,150,30);
	    add(e_Gender);
		te_Gender= new JTextField();
		te_Gender.setBounds(300,150,100,30);
		add(te_Gender);
		
		
		
		
		
		PN= new JLabel("P N : ");
		PN.setBounds(500,150,150,30);
	    add(PN);
		tPN= new JTextField();
		tPN.setBounds(570,150,150,30);
		add(tPN);
		
		Address= new JLabel("Address : ");
		Address.setBounds(200,250,150,30);
	    add(Address);
		tAddress= new JTextField();
		tAddress.setBounds(300,250,100,30);
		add(tAddress);
		
		this.add(PanelForm);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == LoadBtn  )
		{
			if (!t1.getText().equals("") || t1.getText().equals(null) )
			{
				//t1,t2,t3,te_Address,te_Gender,te_Bloodgroup,tAddress,tdateofbirth,tPN
				employee e = er.searchEmployee(t1.getText() );
				if(e!=null)
				{
					t2.setText(e.geteName());
					t3.setText(e.geteSalary()+"");
					tdateofbirth.setText(e.geteDateOfBirth());
					te_Address.setText(e.geteEmail());
					te_Gender.setText(e.geteGender());
					tPN.setText(e.getePhoneNumber());
					
					t1.setEnabled(false);
					t2.setEnabled(true);
					
					
					
				}
			}
		}
		else if (ae.getSource() == InsertBtn )
		{
			employee e = new employee();
			Admin a = new Admin();
			Random rd = new Random();
			int x = rd.nextInt(9999999)+10000000;
			//t1,t2,t3,t4,te_Address,te_Gender,te_Bloodgroup,tAddress,tdateofbirth,tPN
			e.seteId(t1.getText());
			e.seteName(t2.getText());
			e.seteSalary(Double.parseDouble(t3.getText()));
			e.seteDateOfBirth(tdateofbirth.getText());
			e.seteEmail(te_Address.getText());
			e.seteGender(te_Gender.getText());
			e.setePhoneNumber(tPN.getText());
			
			a.setAdminId(t1.getText() );
			a.setPassword(x+"");
			a.setStatus(1);
			er.insertInDB(e);
			
		}
		else if (ae.getSource() == UpdateBtn )
		{
			
		}
		else if (ae.getSource() == DeleteBtn )
		{
			
		}
		else if (ae.getSource() == RefreshBtn )
		{
			
			t1.setText("");
			t2.setText("");
			t3.setText("");
			te_Address.setText("");
			te_Gender.setText("");
			te_Bloodgroup.setText("");
			tAddress.setText("");
			tdateofbirth.setText("");
			tPN.setText("");
			
			t1.setEnabled(true);
			LoadBtn.setEnabled(true);
			InsertBtn.setEnabled(true);
			UpdateBtn.setEnabled(false);
			DeleteBtn.setEnabled(false);
			RefreshBtn.setEnabled(true);
		}
			
			
		else if (ae.getSource() == Get_AllBtn )
		{
			
		}

		else if (ae.getSource() == logoutBtn )
		{
			JOptionPane.showMessageDialog(null,"ok");
			EmployeeLoginFrame elF = new EmployeeLoginFrame();
			//elF.setVisible(true);
			//this.setVisible(false);
		}
		else if (ae.getSource() == MedicineBtn )
		{
			
		}
		else{}
	}
	
	
	 // public static void main(String [] args)
	 // {
		  // EmployeeFrame e = new EmployeeFrame();
	 // }

	
}