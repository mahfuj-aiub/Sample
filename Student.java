import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class Student extends JFrame{
	private Container con;
	private JTabbedPane jtp;
	private JPanel panel1,panel2,panel3,panel4;
	private JButton log,ok,oktype;
	final JLabel[] jloutput=new JLabel[4];
	final JLabel[] jl=new JLabel[4];
	private JLabel jtea,jtype;
	private JTextArea jteainfo;
	private JComboBox jcb,jctb;
	private JButton[] uplType=new JButton[2];
	private JTextArea[] uplText=new JTextArea[2];
	private String[] teacherName= {"Masum Billah","Victor Stany Rozario","Ezazul Islam","Mohaimin Bin Noor"};
	private String[] labelName= {"Your Name","Your ID","Your Contact No","Your Email Id"};
	private String[] type= {"Books","Videos","Assignments","Lecture Note"};
	private String[] uploadType= {"Upload Assignment","Upload Note"};
	JFileChooser choose;
	public Student()
	{
		this.setTitle("Student Side");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200, 100, 600, 600);
		con=this.getContentPane();
		con.setLayout(null);
		inIt();
		
	}
    public void inIt()
    {
    	log=new JButton("Sign Out");
    	log.setBounds(500, 0, 100, 30);
    	con.add(log);
    	jtp=new JTabbedPane();
    	jtp.setBounds(0, 10, 590, 590);
    	con.add(jtp);
    	panel1=new JPanel();
    	panel2=new JPanel();
    	panel3=new JPanel();
    	panel4=new JPanel();
    	jtp.addTab("Home", panel1);
    	jtp.addTab("Teacher", panel2);
    	jtp.addTab("Course Material", panel3);
    	jtp.addTab("Upload", panel4);
    	panelSideShow(this);
    	
    	
    	
    }
    public void panelSideShow(Student st)
    {
        panel1.setLayout(null);
        int y=10;
        for(int i=0;i<4;i++)
		{
			jl[i]=new JLabel(labelName[i]);
			jloutput[i]=new JLabel(); 
			jl[i].setBounds(10, y, 130,40);
			jloutput[i].setBounds(160, y, 250, 40);
			panel1.add(jl[i]);
			panel1.add(jloutput[i]);
			y+=60;
		}
        panel2.setLayout(null);
        jtea=new JLabel("Select Teacher");
        jtea.setBounds(10, 10, 130, 40);
        panel2.add(jtea);
        jcb=new JComboBox(teacherName);
        jcb.setBounds(150, 10, 250, 40);
        jcb.setEditable(true);
        panel2.add(jcb);
        ok=new JButton("Ok");
        ok.setBounds(420, 10, 50, 40);
        panel2.add(ok);
        jteainfo=new JTextArea();
		jteainfo.setBounds(10, 60, 300, 300);
		panel2.add(jteainfo);
		panel3.setLayout(null);
		jtype=new JLabel("Select Type ");
		jtype.setBounds(10, 10, 130, 40);
		panel3.add(jtype);
		jctb=new JComboBox(type);
		jctb.setBounds(150, 10, 250, 40);
		panel3.add(jctb);
		oktype=new JButton("Ok");
		oktype.setBounds(420, 10, 50, 40);
		panel3.add(oktype);
		panel4.setLayout(null);
		int uy=50;
		for(int i=0;i<2;i++)
		{
			uplType[i]=new JButton(uploadType[i]);
			uplType[i].setBounds(200, uy, 135, 40);
			panel4.add(uplType[i]);
			
			uy+=60;
		}
		
				
		
		
        actionPerform(st);
        
    	 
    }
    public void actionPerform(Student st)
    {
    	ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str=jcb.getSelectedItem().toString();
				jteainfo.setText(str+" Sir, is amazing");								
			}
    		
    	});
    	oktype.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str=jctb.getSelectedItem().toString();
				if(str.equals("Books")) {
					books();
				}
				else if(str.equals("Videos")) {
					videos();
				}
				else if (str.equals("Assignments"))
				{
					assignments();
				}
				else if(str.equals("Lecture Notes")) {
					lectureNote();
				}
				
			}
    		
    		
    	});
    	log.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				st.dispose();
				LogIn.main(null);
				
			}
    		
    	});
    	uplType[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fetchFile();
				
			}
    		
    	});
    	uplType[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fetchFile();
				
			}
    		
    	});
    }
    public void fetchFile()
    {
    	choose=new JFileChooser();
    	choose.setCurrentDirectory(new java.io.File("."));
    	choose.setDialogTitle("Select File");
    	choose.setFileSelectionMode(JFileChooser.FILES_ONLY);
    	choose.setAcceptAllFileFilterUsed(false);
    	if(choose.showOpenDialog(this)==JFileChooser.APPROVE_OPTION) {
    		System.out.println(choose.getSelectedFile());
    	}
    	else
    		System.out.println("No Selection");
    	
    }
    public void books()
    {
    	
    }
    public void videos()
    {
    	
    }
    public void assignments()
    {
    	
    }
    public void lectureNote()
    {
    	
    }
	public static void main(String[] args) {
		Student s=new Student();
	
		s.setVisible(true);
		
		

	}

}
