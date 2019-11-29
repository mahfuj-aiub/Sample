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

public class Teacher extends JFrame {

	private Container con;
	private JTabbedPane jtp;
	private JPanel panel1,panel2,panel3,panel4;
	private JButton log,ok,oktype;
	final JLabel[] jloutput=new JLabel[4];
	final JLabel[] jl=new JLabel[4];
	private JLabel jtea,jtype,jcombo;
	private JTextArea jteainfo;
	private JComboBox jCourse,selectmat;
	private JButton[] uplType=new JButton[4];
	JFileChooser choose;
	private String[] labelName= {"Your Name","Your Id","Your Contact No","Your Email ID "};
	private String[] type= {"Books","Videos","Assignments","Lecture Note"};
	private String[] uploadType= {"Upload Assignment","Upload Videos","Upload Lectures","Upload Note"};
	public Teacher()
	{
		this.setTitle("Teacher Side");
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
    	jtp.addTab("Course", panel2);
    	jtp.addTab("Upload", panel3);
    	jtp.addTab("Course Material", panel4);
    	panelSideShow(this);
    	
    	
    	
    }
    public void panelSideShow(Teacher t)
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
        jcombo=new JLabel("Select Course");
        jCourse=new JComboBox();
        jcombo.setBounds(10, 20, 120, 40);
        jCourse.setBounds(150, 20, 200, 40);
        panel2.add(jcombo);
        panel2.add(jCourse);
        
		panel3.setLayout(null);
		int uy=50;
		for(int i=0;i<4;i++)
		{
			uplType[i]=new JButton(uploadType[i]);
			uplType[i].setBounds(200, uy, 135, 40);
			panel3.add(uplType[i]);
			
			uy+=60;
		}
		
		panel4.setLayout(null);
		jtype=new JLabel("Select Type ");
		jtype.setBounds(10, 10, 130, 40);
		panel4.add(jtype);
       selectmat=new JComboBox(type);
		selectmat.setBounds(150, 10, 250, 40);
		panel4.add(selectmat);
		oktype=new JButton("Ok");
		oktype.setBounds(420, 10, 50, 40);
		panel4.add(oktype);
		
		
	
		
		
        actionPerform(t);
        
    	 
    }
    public void actionPerform(Teacher t)
    {
    	/*ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
												
			}
    		
    	});*/
    	/*oktype.addActionListener(new ActionListener() {

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
    		
    		
    	});*/
    	log.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				t.dispose();
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
    	uplType[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fetchFile();
				
			}
    		
    	});
    	uplType[3].addActionListener(new ActionListener() {

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
		Teacher s=new Teacher();
		s.setVisible(true);
		
		

	}


}
