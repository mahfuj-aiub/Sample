

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Registration extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private Container con;
	final JTextField[] jt=new JTextField[7];
	final JLabel[] jl=new JLabel[7];
	private JLabel jl1;
	private JRadioButton jrb1,jrb2;
	private JButton jb1,jb2;
	final String[] labelName= {"First Name","Last Name","Email","Contact No","ID Number","Password","Re Enter Password"};
 	public Registration()
	{
 		this.setTitle("Registration");
 		this.setBounds(200, 100, 600, 600);
 		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		
	}
 	public void init()
 	{
 		con=this.getContentPane();
 		con.setLayout(null);
 		for(int i=0;i<7;i++)
		{
			jl[i]=new JLabel(labelName[i]);
			jt[i]=new JTextField(); 
		}
		int x=20,y=10,a=130,b=30,c=200;
		for(int i=0;i<7;i++)
		{
			jl[i].setBounds(x, y, a, b);
			jt[i].setBounds(c, y, 220, b);		
			y+=40;
		}
		for(int i=0;i<7;i++)
		{
			con.add(jl[i]);
			con.add(jt[i]);
		}
		jl1=new JLabel("Register As ");
		jl1.setBounds(20, 300, 130, 30);
		con.add(jl1);
		jrb1=new JRadioButton("Student");
		jrb2=new JRadioButton("Teacher");
		jrb1.setBounds(220, 300, 70, 30);
		jrb2.setBounds(310, 300, 80,30);
		ButtonGroup bg=new ButtonGroup();  
		bg.add(jrb1);
        bg.add(jrb2);
        con.add(jrb1);
        con.add(jrb2);
        jb1=new JButton("Register");
        jb2=new JButton("Cancel");
        jb1.setBounds(200, 350, 100, 30);
        jb2.setBounds(330, 350, 100, 30);
        con.add(jb1);
        con.add(jb2);
        actionEvent(this);
        
        
 		
 	}
 	public void actionEvent(Registration r)
 	{
 		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				JOptionPane jp=new JOptionPane();
			    JOptionPane.showInputDialog(null, "A verification code has been sent to your email. please verify");
			    
				r.dispose();
				LogIn.main(null);
				
			}
 			
 			
 		});
 		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
 			
 		});
 		this.setVisible(true);
 	}




}
