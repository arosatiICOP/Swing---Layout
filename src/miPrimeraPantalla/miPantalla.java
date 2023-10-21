package miPrimeraPantalla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.ScrollPane;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JToggleButton;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import java.awt.Dimension;

public class miPantalla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					miPantalla frame = new miPantalla();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public miPantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Norte = new JPanel();
		panel_Norte.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_Norte, BorderLayout.NORTH);
		FlowLayout fl_panel_Norte = new FlowLayout(FlowLayout.CENTER, 5, 5);
		panel_Norte.setLayout(fl_panel_Norte);
		
		JButton btnjButton1 = new JButton("jButton1");
		panel_Norte.add(btnjButton1);
		
		JButton btnjButton2 = new JButton("jButton2");
		panel_Norte.add(btnjButton2);
		
		JButton btnjButton3 = new JButton("jButton3");
		panel_Norte.add(btnjButton3);
		
		JButton btnjButton4 = new JButton("jButton4");
		panel_Norte.add(btnjButton4);
		
		JPanel panel_Centro = new JPanel();
		panel_Centro.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_Centro, BorderLayout.CENTER);
		panel_Centro.setLayout(new BorderLayout(15, 0));
		
		JButton btnjButton6 = new JButton("jButton6");
		panel_Centro.add(btnjButton6, BorderLayout.NORTH);
		
		JButton btnjButton9 = new JButton("jButton9");
		panel_Centro.add(btnjButton9, BorderLayout.SOUTH);
		
		JButton btnjButton7 = new JButton("jButton7");
		panel_Centro.add(btnjButton7, BorderLayout.WEST);
		
		JButton btnjButton8 = new JButton("jButton8");
		panel_Centro.add(btnjButton8, BorderLayout.EAST);
		
		JButton btnjButton5 = new JButton("jButton5");
		panel_Centro.add(btnjButton5, BorderLayout.CENTER);
		
		JPanel panel_Sur = new JPanel();
		panel_Sur.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_Sur, BorderLayout.SOUTH);
		panel_Sur.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnjButton13 = new JButton("jButton13");
		panel_Sur.add(btnjButton13);
		
		JButton btnjButton14 = new JButton("jButton14");
		panel_Sur.add(btnjButton14);
		
		JButton btnjButton15 = new JButton("jButton15");
		panel_Sur.add(btnjButton15);
		
		JButton btnjButton16 = new JButton("jButton16");
		panel_Sur.add(btnjButton16);
		
		JPanel panel_Este = new JPanel();
		panel_Este.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_Este, BorderLayout.EAST);
		panel_Este.setLayout(new BoxLayout(panel_Este, BoxLayout.Y_AXIS));
		
		JButton btnjButton17 = new JButton("jButton17");
		btnjButton17.setVerticalAlignment(SwingConstants.TOP);
		panel_Este.add(btnjButton17);
		
		JButton btnjButton18 = new JButton("jButton18");
		panel_Este.add(btnjButton18);
		
		JButton btnjButton19 = new JButton("jButton19");
		panel_Este.add(btnjButton19);
		
		JButton btnjButton20 = new JButton("jButton20");
		panel_Este.add(btnjButton20);
		
		JPanel panel_Oeste = new JPanel();
		panel_Oeste.setRequestFocusEnabled(false);
		panel_Oeste.setFocusable(false);
		panel_Oeste.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_Oeste.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_Oeste.setAlignmentX(1.0f);
		panel_Oeste.setPreferredSize(new Dimension(75, 75));
		contentPane.add(panel_Oeste, BorderLayout.WEST);
		panel_Oeste.setLayout(null);
		
		JButton btnjButton00 = new JButton("...");
		btnjButton00.setBounds(5, 15, 45, 25);
		panel_Oeste.add(btnjButton00);
		
		JButton btnjButton01 = new JButton("...");
		btnjButton01.setBounds(15, 85, 45, 25);
		panel_Oeste.add(btnjButton01);
		
		JButton btnjButton02 = new JButton("...");
		btnjButton02.setBounds(25, 155, 45, 25);
		panel_Oeste.add(btnjButton02);
	}
}
