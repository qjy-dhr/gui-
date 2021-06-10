package ����;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class DrawFrame extends JPanel{
	Choice eraserchoice;
	Choice paintchoice;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawFrame draw=new DrawFrame();
		draw.init();
	}
public void paint1() {
	
	this.repaint();
	
}
	public void init() {
		JFrame frame1=new JFrame("����");
				//ʵ���������
		 frame1.setResizable(false);
		 
		 frame1.setBounds(50,100,1200,700);
		 
	     frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	     
		 frame1.setLayout(new BorderLayout());
		 
	     //�¼�����
		 //���ʴ�С����
		     paintchoice=new Choice();
		     
		     for(int i=1;i<=10;i++) {
		    	 
		    	 paintchoice.add(""+i);
		    	 
		     }
		     
		 //��Ƥ��С����
		     eraserchoice=new Choice();
		  
		     eraserchoice.add("10");
		     
		     eraserchoice.add("30");
		     
		     eraserchoice.add("50");
		     
		     eraserchoice.add("90");
		     
		 DrawListener drawlistener=new DrawListener(this);
		 
		 //ʵ���м����
		 
		 this.setBackground(Color.white);
		 
		 this.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
	     frame1.add(this,BorderLayout.CENTER);
	     
		 //ʵ�������������
	     JPanel panel1 = new JPanel();
	     
	     panel1.setBackground(new Color(202,195,167));    
	     
	     String[] sorts = {"����","ֱ��", "Բ", "��ǹ", "��Ƥ��", "����", "Բ�Ǿ���",

	     "����", "�����", "������", };
	     
         panel1.setLayout(new GridLayout(sorts.length,1));

	     for (int i = 0; i < sorts.length; i++) {

	     JButton button = new JButton(sorts[i]);
	     
	     button.setBackground(new Color(214,214,214));

	     button.addActionListener(drawlistener); // ����¼���������

	     panel1.add(button);

	     }

	     frame1.add(panel1, BorderLayout.WEST);

	     // ʵ��������ɫ���

	     JPanel panel2 = new JPanel();

	     panel2.setBackground(new Color(202,195,167));

	     Color[] color = { new Color(45,36,31), new Color(173,174,178), new Color(177,122,125), new Color(146,172,209),new Color(81,31,30),

	    		 new Color(144,59,28), new Color(201,192,211), new Color(214,214,214), new Color(123,139,111), new Color(193,203,215), new Color(234,208,209) };

	     //panel2.setLayout(new GridLayout(color.length,1));

	     for (int i = 0; i < color.length; i++) {

	     JButton button = new JButton();
	     
	     button.setActionCommand("color");

	     button.addActionListener(drawlistener); // ����¼���������

	     button.setPreferredSize(new Dimension(30, 30));

	     button.setBackground(color[i]);

	     panel2.add(button);

	     }
	     frame1.add(panel2, BorderLayout.SOUTH);
	     
	     //��հ�ť
	     
	     JPanel panel3 = new JPanel();
	     
	     panel3.setBackground(new Color(202,195,167));
	   
	     
	    frame1.add(panel3, BorderLayout.NORTH);
	   
	     JButton button = new JButton("clear");
	     
	    // panel3.setLayout(new FlowLayout());
	          
	     button.addActionListener(drawlistener);
	     
	     button.setActionCommand("clear");
	     
	    // panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));

	     panel3.add(button,BorderLayout.WEST);
	     
	     //�������ü��������ı���
	     paintchoice.addItemListener(drawlistener);
	          //�ı���
         Label psize=new Label("          ���ʴ�С:");
	     
	     psize.setFont(new Font("����",Font.BOLD,18));
	     
	     psize.setForeground(new Color(95,82,74));
	     
	     panel3.add(psize);
	   
	     panel3.add(paintchoice,BorderLayout.EAST);
	     //��Ƥ���ü��������ı���
	    
	   
	     eraserchoice.addItemListener(drawlistener);
              //�ı���
	     
	     Label rsize=new Label("          ��Ƥ��С:");
	     
	     rsize.setFont(new Font("����",Font.BOLD,18));
	     
	     rsize.setForeground(new Color(95,82,74));
	     
	     panel3.add(rsize);
	   
	     panel3.add(eraserchoice,BorderLayout.EAST);
	     
	     //����¼�
	     this.addMouseListener(drawlistener);

	     this.addMouseMotionListener(drawlistener); 
  
	     frame1.setVisible(true);
	}
}
