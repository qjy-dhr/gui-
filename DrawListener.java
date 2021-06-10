package ª≠± ;

import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.*;

public class DrawListener extends MouseAdapter implements ActionListener, ItemListener{	

	
	private int x1,x2,y1,y2;
	private int nx1,nx2,ny1,ny2;
	
	
	DrawFrame d;
	Graphics2D g;
	String sort="ª≠± ";
	Color color;
	Boolean flag=true;
	int Econ=10;//œ∆§¥Û–°
	int Pcon=1;//ª≠± ¥Û–°
	Choice ec;
	Choice pc;
	
	public DrawListener(DrawFrame drawframe) {
		ec=drawframe.eraserchoice;
		pc=drawframe.paintchoice;
		//g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		d=drawframe;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("color")) {
			
			JButton button = (JButton) e.getSource();

			color = button.getBackground();

			System.out.println("color = " + color);

			 } 
		else if(e.getActionCommand().equals("clear"))
		{
			
			d.paint1();
			
			}
		else {
			
			JButton button = (JButton) e.getSource();

			sort = button.getActionCommand();

			System.out.println("String = " + sort);
						
		}

	}
	public void mouseClicked(MouseEvent e) {
		
		 g.setStroke(new BasicStroke(Pcon)); 
		 
		if (sort.equals("∂‡±ﬂ–Œ") && !flag) {
			
			x2 = e.getX();

			y2 = e.getY();

			if ((Math.abs(nx1-x2)<10 && Math.abs(ny1-y2)<10)||e.getClickCount() == 2) {
				
			g.drawLine(nx1, ny1, nx2, ny2);

			flag = true;

			}
          if(flag==false) {
	           g.drawLine(nx2, ny2, x2, y2);

	           nx2 = x2;

	           ny2 = y2;

               }
			} 	
		
		else if(sort.equals("ª≠± ")) {
			 
			 g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,

					 RenderingHints.VALUE_ANTIALIAS_ON);

					g.drawLine(x1, y1, x2, y2);

					x1 = x2;

					y1 = y2;
					
		}
		else if(sort.equals("≈Á«π")) { 
			 
			 g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,

			 RenderingHints.VALUE_ANTIALIAS_ON);

			for (int k = 0; k < 20; k++) {
			Random i = new Random();

			int a = i.nextInt(8);

			int b = i.nextInt(10);

			g.drawLine(x2 + a, y2 + b, x2 + a, y2 + b);

			}
			
			
		}
	}
	
	public void mousePressed(MouseEvent e) {
		
		x1=e.getX();
		
		y1=e.getY();
		
        g=(Graphics2D) d.getGraphics();
		
		g.setColor(color);
				
	}

	public void mouseReleased(MouseEvent e) {
		
		 g.setStroke(new BasicStroke(Pcon)); 
		 
        x2=e.getX();
		
		y2=e.getY();
		
		if (sort.equals("÷±œﬂ")) {
			
			g.drawLine(x1, y1, x2, y2);

			} 
		
		else if (sort.equals("ª°œﬂ")) {
			
			g.drawArc(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), 0, 180);

			} 
		
		else if (sort.equals("∂‡±ﬂ–Œ") && flag) {
			
			g.drawLine(x1, y1, x2, y2);

			nx1 = x1;

			ny1 = y1;

			nx2 = x2;

			ny2 = y2;

			flag = false;

			} 
		
		else if (sort.equals("‘≤")) {
			g.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));

			} 
		else if (sort.equals("»˝Ω«–Œ")) {
			g.drawLine((x1+x2)/2, y1, x1, y2);
			g.drawLine((x1+x2)/2, y1, x2, y2);
			g.drawLine(x1, y2, x2, y2);
		}
		else if (sort.equals("æÿ–Œ")) {
				
			g.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));

			}
		else if (sort.equals("‘≤Ω«æÿ–Œ")) {
				
			g.drawRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), 50, 50);

			} 
	}
	
	public void mouseDragged(MouseEvent e){
		
		x2 = e.getX();

		y2 = e.getY();
		
		g.setStroke(new BasicStroke(Pcon));

		if (sort.equals("ª≠± ")) {

		 g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,

		 RenderingHints.VALUE_ANTIALIAS_ON);

		g.drawLine(x1, y1, x2, y2);

		x1 = x2;

		y1 = y2;

		} 
		else if (sort.equals("œ∆§≤¡")) {

			g.setStroke(new BasicStroke(Econ));
			
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,

		RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.white);

		g.drawLine(x1, y1, x2, y2);

		x1 = x2;

		y1 = y2;

		} 
		else if (sort.equals("≈Á«π")) {
		 
		 g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,

		 RenderingHints.VALUE_ANTIALIAS_ON);

		for (int k = 0; k < 20; k++) {
		Random i = new Random();

		int a = i.nextInt(8);

		int b = i.nextInt(10);

		g.drawLine(x2 + a, y2 + b, x2 + a, y2 + b);

		}

		}
//		else if (sort.equals("÷±œﬂ")) {
//			
//			g.drawLine(x1, y1, x2, y2);			
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			
//			repaint();
//
//			
//			} 
//		
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==ec) {
			System.out.println("ƒ„∫√");
			String Esize = ec.getSelectedItem();

			if(Esize=="10")

			{ Econ = 10; }

			else if(Esize=="30")

			{ Econ = 30; }

			else if(Esize=="50")

			{ Econ = 50; }

			else if(Esize=="90")

			{ Econ = 90; }
			
		}
		else {
			String Psize = pc.getSelectedItem();
			
			Pcon=Integer.parseInt(Psize);
			
			
			
		}
	}
	

}
