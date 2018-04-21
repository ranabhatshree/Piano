package com.shree.piano;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class MyPiano extends JFrame
{

	private static final long serialVersionUID = 1L;
	private static JButton a;
	private static JButton b;
	private static JButton c;
	private static JButton c1;	
	private static JButton d;
	private static JButton e;
	private static JButton f;
	private static JButton g;
	private static JButton cs;
	private static JButton ds;
	private static JButton fs;
	private static JButton gs;
	private static JButton as;
	private static JButton cs1;
	private JLabel l;
	
	
	//creating constructor
   public MyPiano()
	{
		//setting GUI
		SetUpGUI();
		
		PlayOnClick();


		
	}
	
	public void SetUpGUI()
	{
		
		
		//creating BUttons
		createButtons();
		
		//adding into the frame
		add(c);
		add(d);
		add(e);
		add(f);
		add(g);
		add(a);
		add(b);
		add(c1);
		
	
		//adding sharp
		add(cs);
		add(ds);
		add(fs);
		add(gs);
		add(as);
 		add(cs1);
		
		
		//setting the frame properties
		setBackground(Color.white);
		setSize(660, 500);
		setLayout(null);
		setVisible(true);
		setTitle("Piano");
		setLocation(300, 100);
		setResizable(false);
		
	}
	
	public  void createButtons()
	{
		
		//creating buttons
		c = new JButton("C");
		c.setBounds(10,200,60,200);
				
		d = new JButton("D");
		d.setBounds(90,200,60,200);
		
		e = new JButton("E");
		e.setBounds(170,200,60,200);
		
		f = new JButton("F");
		f.setBounds(250,200,60,200);
		
		g = new JButton("G");
		g.setBounds(330,200,60,200);
		
		a = new JButton("A");
		a.setBounds(410,200,60,200);
		
		b = new JButton("B");
		b.setBounds(490,200,60,200);
		
		c1 = new JButton("C");
		c1.setBounds(570,200,60,200);
		
		//creating buttons sharp
		cs = new JButton("C#");
		cs.setBounds(50,20,60,170);
		cs.setFont(new Font("Sansserif",Font.BOLD,20));
		
		ds = new JButton("D#");
		ds.setBounds(130,20,60,170);
		ds.setFont(new Font("Sansserif",Font.BOLD,20));
		
		fs = new JButton("F#");
		fs.setBounds(210,20,60,170);
		fs.setFont(new Font("Sansserif",Font.BOLD,20));
		
		gs = new JButton("G#");
		gs.setBounds(290,20,60,170);
		gs.setFont(new Font("Sansserif",Font.BOLD,18));

		as = new JButton("A#");
		as.setBounds(370,20,60,170);
		as.setFont(new Font("Sansserif",Font.BOLD,20));

		cs1 = new JButton("C#");
		cs1.setBounds(450,20,60,170);
		cs1.setFont(new Font("Sansserif",Font.BOLD,20));

	
	}
	
	public static void PlayOnClick()
	{
		playA();
		
		playB();
		
		playC();
		
		playD();
		
		playE();
		
		playF();
		
		playG();		

		playC1();
		
		playCS();
		
		playDS();
		
		playFS();
		
		playGS();
		
		playAS();
		
		playCS1();
		
	}

	public static void playA()
	{
		a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					// set your path for sound 
					File mySound = new File("C:\\Users\\User\\eclipse-workspace\\Piano\\src\\com\\shree\\sound\\a1.wav");
					new PlayPianoSound(mySound); //creating object of PlayPiano Sound
				}
				catch(Exception e1)
				{
					System.out.print(e1.getMessage());
				}
				
			}
		});
	}
	
	public static void playB()
	{
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					File mySound = new File("C:\\Users\\User\\eclipse-workspace\\Piano\\src\\com\\shree\\sound\\b1.wav");
					new PlayPianoSound(mySound); //creating object of PlayPiano Sound
				}
				catch(Exception e1)
				{
					System.out.print(e1.getMessage());
				}
				
			}
		});
	}

	public static void playC()
	{
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					File mySound = new File("C:\\Users\\User\\eclipse-workspace\\Piano\\src\\com\\shree\\sound\\c1.wav");
					new PlayPianoSound(mySound); //creating object of PlayPiano Sound
				}
				catch(Exception e1)
				{
					System.out.print(e1.getMessage());
				}
				
			}
		});
	}

	public static void  playD()
	{
		
		d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					File mySound = new File("C:\\Users\\User\\eclipse-workspace\\Piano\\src\\com\\shree\\sound\\d1.wav");
					new PlayPianoSound(mySound); //creating object of PlayPiano Sound
				}
				catch(Exception e1)
				{
					System.out.print(e1.getMessage());
				}
				
			}
		});
	}
	
	public static void playE()
	{
		e.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					File mySound = new File("C:\\Users\\User\\eclipse-workspace\\Piano\\src\\com\\shree\\sound\\e1.wav");
					new PlayPianoSound(mySound); //creating object of PlayPiano Sound
				}
				catch(Exception e1)
				{
					System.out.print(e1.getMessage());
				}
				
			}
		});
	}
	
	public static void playF()
	{
		f.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					File mySound = new File("C:\\Users\\User\\eclipse-workspace\\Piano\\src\\com\\shree\\sound\\f1.wav");
					new PlayPianoSound(mySound); //creating object of PlayPiano Sound
				}
				catch(Exception e1)
				{
					System.out.print(e1.getMessage());
				}
				
			}
		});
	}
	
	public static void playG()
	{
		g.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					File mySound = new File("C:\\Users\\User\\eclipse-workspace\\Piano\\src\\com\\shree\\sound\\g1.wav");
					new PlayPianoSound(mySound); //creating object of PlayPiano Sound
				}
				catch(Exception e1)
				{
					System.out.print(e1.getMessage());
				}
				
			}
		});
	}
	
	public static void playC1()
	{
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					File mySound = new File("C:\\Users\\User\\eclipse-workspace\\Piano\\src\\com\\shree\\sound\\c2.wav");
					new PlayPianoSound(mySound); //creating object of PlayPiano Sound
				}
				catch(Exception e1)
				{
					System.out.print(e1.getMessage());
				}
				
			}
		});
	}
	
	public static void playCS()
	{
		cs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					File mySound = new File("C:\\Users\\User\\eclipse-workspace\\Piano\\src\\com\\shree\\sound\\c1s.wav");
					new PlayPianoSound(mySound); //creating object of PlayPiano Sound
				}
				catch(Exception e1)
				{
					System.out.print(e1.getMessage());
				}
				
			}
		});

	}
	
	public static void playDS()
	{
		ds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					File mySound = new File("C:\\Users\\User\\eclipse-workspace\\Piano\\src\\com\\shree\\sound\\d1s.wav");
					new PlayPianoSound(mySound); //creating object of PlayPiano Sound
				}
				catch(Exception e1)
				{
					System.out.print(e1.getMessage());
				}
				
			}
		});
	}
	
	public static void playFS()
	{
		fs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					File mySound = new File("C:\\Users\\User\\eclipse-workspace\\Piano\\src\\com\\shree\\sound\\f1s.wav");
					new PlayPianoSound(mySound); //creating object of PlayPiano Sound
				}
				catch(Exception e1)
				{
					System.out.print(e1.getMessage());
				}
				
			}
		});
	}
	
	public static void playGS()
	{
		gs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					File mySound = new File("C:\\Users\\User\\eclipse-workspace\\Piano\\src\\com\\shree\\sound\\g1s.wav");
					new PlayPianoSound(mySound); //creating object of PlayPiano Sound
				}
				catch(Exception e1)
				{
					System.out.print(e1.getMessage());
				}
				
			}
		});
	}
	
	public static void playAS()
	{
		as.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					File mySound = new File("C:\\Users\\User\\eclipse-workspace\\Piano\\src\\com\\shree\\sound\\a1s.wav");
					new PlayPianoSound(mySound); //creating object of PlayPiano Sound
				}
				catch(Exception e1)
				{
					System.out.print(e1.getMessage());
				}
				
			}
		});
	}
	
	public static void playCS1()
	{
		cs1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					File mySound = new File("C:\\Users\\User\\eclipse-workspace\\Piano\\src\\com\\shree\\sound\\c1s.wav");
					new PlayPianoSound(mySound); //creating object of PlayPiano Sound
				}
				catch(Exception e1)
				{
					System.out.print(e1.getMessage());
				}
				
			}
		});
	}
	


	public static void main(String[] args) {

		
		 new MyPiano();
		
	}

}
