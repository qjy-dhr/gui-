package 画笔;

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
		JFrame frame1=new JFrame("画板");
				//实现面板属性
		 frame1.setResizable(false);
		 
		 frame1.setBounds(50,100,1200,700);
		 
	     frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	     
		 frame1.setLayout(new BorderLayout());
		 
	     //事件监听
		 //画笔大小设置
		     paintchoice=new Choice();
		     
		     for(int i=1;i<=10;i++) {
		    	 
		    	 paintchoice.add(""+i);
		    	 
		     }
		     
		 //橡皮大小设置
		     eraserchoice=new Choice();
		  
		     eraserchoice.add("10");
		     
		     eraserchoice.add("30");
		     
		     eraserchoice.add("50");
		     
		     eraserchoice.add("90");
		     
		 DrawListener drawlistener=new DrawListener(this);
		 
		 //实现中间面板
		 
		 this.setBackground(Color.white);
		 
		 this.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
	     frame1.add(this,BorderLayout.CENTER);
	     
		 //实现左面属性面板
	     JPanel panel1 = new JPanel();
	     
	     panel1.setBackground(new Color(202,195,167));    
	     
	     String[] sorts = {"画笔","直线", "圆", "喷枪", "橡皮擦", "矩形", "圆角矩形",

	     "弧线", "多边形", "三角形", };
	     
         panel1.setLayout(new GridLayout(sorts.length,1));

	     for (int i = 0; i < sorts.length; i++) {

	     JButton button = new JButton(sorts[i]);
	     
	     button.setBackground(new Color(214,214,214));

	     button.addActionListener(drawlistener); // 添加事件监听机制

	     panel1.add(button);

	     }

	     frame1.add(panel1, BorderLayout.WEST);

	     // 实现下面颜色面板

	     JPanel panel2 = new JPanel();

	     panel2.setBackground(new Color(202,195,167));

	     Color[] color = { new Color(45,36,31), new Color(173,174,178), new Color(177,122,125), new Color(146,172,209),new Color(81,31,30),

	    		 new Color(144,59,28), new Color(201,192,211), new Color(214,214,214), new Color(123,139,111), new Color(193,203,215), new Color(234,208,209) };

	     //panel2.setLayout(new GridLayout(color.length,1));

	     for (int i = 0; i < color.length; i++) {

	     JButton button = new JButton();
	     
	     button.setActionCommand("color");

	     button.addActionListener(drawlistener); // 添加事件监听机制

	     button.setPreferredSize(new Dimension(30, 30));

	     button.setBackground(color[i]);

	     panel2.add(button);

	     }
	     frame1.add(panel2, BorderLayout.SOUTH);
	     
	     //清空按钮
	     
	     JPanel panel3 = new JPanel();
	     
	     panel3.setBackground(new Color(202,195,167));
	   
	     
	    frame1.add(panel3, BorderLayout.NORTH);
	   
	     JButton button = new JButton("clear");
	     
	    // panel3.setLayout(new FlowLayout());
	          
	     button.addActionListener(drawlistener);
	     
	     button.setActionCommand("clear");
	     
	    // panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));

	     panel3.add(button,BorderLayout.WEST);
	     
	     //画笔设置监听及其文本框
	     paintchoice.addItemListener(drawlistener);
	          //文本框
         Label psize=new Label("          画笔大小:");
	     
	     psize.setFont(new Font("楷体",Font.BOLD,18));
	     
	     psize.setForeground(new Color(95,82,74));
	     
	     panel3.add(psize);
	   
	     panel3.add(paintchoice,BorderLayout.EAST);
	     //橡皮设置监听及其文本框
	    
	   
	     eraserchoice.addItemListener(drawlistener);
              //文本框
	     
	     Label rsize=new Label("          橡皮大小:");
	     
	     rsize.setFont(new Font("楷体",Font.BOLD,18));
	     
	     rsize.setForeground(new Color(95,82,74));
	     
	     panel3.add(rsize);
	   
	     panel3.add(eraserchoice,BorderLayout.EAST);
	     
	     //添加事件
	     this.addMouseListener(drawlistener);

	     this.addMouseMotionListener(drawlistener); 
  
	     frame1.setVisible(true);
	}
}
