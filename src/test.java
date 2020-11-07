import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JSplitPane;
import javax.swing.UIManager;

public class test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		setTitle("Sechs Nimmt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 430);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel reihen = new JPanel();
		reihen.setBounds(9, 9, 583, 250);
		reihen.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		reihen.setBackground(Color.WHITE);
		contentPane.add(reihen);
		reihen.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel reihe1 = new JPanel();
		reihen.add(reihe1);
		reihe1.setBorder(new LineBorder(new Color(0, 0, 0)));
		reihe1.setLayout(new GridLayout(1, 0, 10, 0));
		
		JLabel reihenName1 = new JLabel("1");
		reihe1.add(reihenName1);
		reihenName1.setForeground(Color.BLACK);
		reihenName1.setHorizontalAlignment(SwingConstants.CENTER);
		reihenName1.setFont(new Font("Monospaced", Font.BOLD, 19));
		reihenName1.setBackground(Color.GRAY);
		
		JSplitPane r1_k_1 = new JSplitPane();
		r1_k_1.setBackground(UIManager.getColor("Button.background"));
		r1_k_1.setForeground(Color.WHITE);
		r1_k_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		reihe1.add(r1_k_1);
		
		JLabel r1_p_k_1 = new JLabel("0");
		r1_p_k_1.setHorizontalAlignment(SwingConstants.CENTER);
		r1_p_k_1.setForeground(Color.BLACK);
		r1_p_k_1.setFont(new Font("Monospaced", Font.BOLD, 19));
		r1_p_k_1.setBackground(Color.GRAY);
		r1_k_1.setLeftComponent(r1_p_k_1);
		
		JLabel r1_w_k_1 = new JLabel("0");
		r1_w_k_1.setHorizontalAlignment(SwingConstants.CENTER);
		r1_w_k_1.setForeground(Color.BLACK);
		r1_w_k_1.setFont(new Font("Monospaced", Font.BOLD, 19));
		r1_w_k_1.setBackground(Color.GRAY);
		r1_k_1.setRightComponent(r1_w_k_1);
		
		JSplitPane r1_k_2 = new JSplitPane();
		r1_k_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		reihe1.add(r1_k_2);
		
		JLabel r1_p_k_2 = new JLabel("0");
		r1_p_k_2.setHorizontalAlignment(SwingConstants.CENTER);
		r1_p_k_2.setForeground(Color.BLACK);
		r1_p_k_2.setFont(new Font("Monospaced", Font.BOLD, 19));
		r1_p_k_2.setBackground(Color.GRAY);
		r1_k_2.setLeftComponent(r1_p_k_2);
		
		JLabel r1_w_k_2 = new JLabel("0");
		r1_w_k_2.setHorizontalAlignment(SwingConstants.CENTER);
		r1_w_k_2.setForeground(Color.BLACK);
		r1_w_k_2.setFont(new Font("Monospaced", Font.BOLD, 19));
		r1_w_k_2.setBackground(Color.GRAY);
		r1_k_2.setRightComponent(r1_w_k_2);
		
		JSplitPane r1_k_3 = new JSplitPane();
		r1_k_3.setOrientation(JSplitPane.VERTICAL_SPLIT);
		reihe1.add(r1_k_3);
		
		JLabel r1_p_k_3 = new JLabel("0");
		r1_p_k_3.setHorizontalAlignment(SwingConstants.CENTER);
		r1_p_k_3.setForeground(Color.BLACK);
		r1_p_k_3.setFont(new Font("Monospaced", Font.BOLD, 19));
		r1_p_k_3.setBackground(Color.GRAY);
		r1_k_3.setLeftComponent(r1_p_k_3);
		
		JLabel r1_w_k_3 = new JLabel("0");
		r1_w_k_3.setHorizontalAlignment(SwingConstants.CENTER);
		r1_w_k_3.setForeground(Color.BLACK);
		r1_w_k_3.setFont(new Font("Monospaced", Font.BOLD, 19));
		r1_w_k_3.setBackground(Color.GRAY);
		r1_k_3.setRightComponent(r1_w_k_3);
		
		JSplitPane r1_k_4 = new JSplitPane();
		r1_k_4.setOrientation(JSplitPane.VERTICAL_SPLIT);
		reihe1.add(r1_k_4);
		
		JLabel r1_p_k_4 = new JLabel("0");
		r1_p_k_4.setHorizontalAlignment(SwingConstants.CENTER);
		r1_p_k_4.setForeground(Color.BLACK);
		r1_p_k_4.setFont(new Font("Monospaced", Font.BOLD, 19));
		r1_p_k_4.setBackground(Color.GRAY);
		r1_k_4.setLeftComponent(r1_p_k_4);
		
		JLabel r1_w_k_4 = new JLabel("0");
		r1_w_k_4.setHorizontalAlignment(SwingConstants.CENTER);
		r1_w_k_4.setForeground(Color.BLACK);
		r1_w_k_4.setFont(new Font("Monospaced", Font.BOLD, 19));
		r1_w_k_4.setBackground(Color.GRAY);
		r1_k_4.setRightComponent(r1_w_k_4);
		
		JSplitPane r1_k_5 = new JSplitPane();
		r1_k_5.setOrientation(JSplitPane.VERTICAL_SPLIT);
		reihe1.add(r1_k_5);
		
		JLabel r1_p_k_5 = new JLabel("0");
		r1_p_k_5.setHorizontalAlignment(SwingConstants.CENTER);
		r1_p_k_5.setForeground(Color.BLACK);
		r1_p_k_5.setFont(new Font("Monospaced", Font.BOLD, 19));
		r1_p_k_5.setBackground(Color.GRAY);
		r1_k_5.setLeftComponent(r1_p_k_5);
		
		JLabel r1_w_k_5 = new JLabel("0");
		r1_w_k_5.setHorizontalAlignment(SwingConstants.CENTER);
		r1_w_k_5.setForeground(Color.BLACK);
		r1_w_k_5.setFont(new Font("Monospaced", Font.BOLD, 19));
		r1_w_k_5.setBackground(Color.GRAY);
		r1_k_5.setRightComponent(r1_w_k_5);
		
		JPanel reihe2 = new JPanel();
		reihe2.setBorder(new LineBorder(new Color(0, 0, 0)));
		reihen.add(reihe2);
		reihe2.setLayout(new GridLayout(1, 0, 10, 0));
		
		JLabel reihenName2 = new JLabel("2");
		reihe2.add(reihenName2);
		reihenName2.setHorizontalAlignment(SwingConstants.CENTER);
		reihenName2.setForeground(Color.BLACK);
		reihenName2.setFont(new Font("Monospaced", Font.BOLD, 19));
		reihenName2.setBackground(Color.GRAY);
		
		JSplitPane r2_k_1 = new JSplitPane();
		r2_k_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		reihe2.add(r2_k_1);
		
		JLabel r2_p_k_1 = new JLabel("0");
		r2_p_k_1.setHorizontalAlignment(SwingConstants.CENTER);
		r2_p_k_1.setForeground(Color.BLACK);
		r2_p_k_1.setFont(new Font("Monospaced", Font.BOLD, 19));
		r2_p_k_1.setBackground(Color.GRAY);
		r2_k_1.setLeftComponent(r2_p_k_1);
		
		JLabel r2_w_k_1 = new JLabel("0");
		r2_w_k_1.setHorizontalAlignment(SwingConstants.CENTER);
		r2_w_k_1.setForeground(Color.BLACK);
		r2_w_k_1.setFont(new Font("Monospaced", Font.BOLD, 19));
		r2_w_k_1.setBackground(Color.GRAY);
		r2_k_1.setRightComponent(r2_w_k_1);
		
		JSplitPane r2_k_2 = new JSplitPane();
		r2_k_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		reihe2.add(r2_k_2);
		
		JLabel r2_p_k_2 = new JLabel("0");
		r2_p_k_2.setHorizontalAlignment(SwingConstants.CENTER);
		r2_p_k_2.setForeground(Color.BLACK);
		r2_p_k_2.setFont(new Font("Monospaced", Font.BOLD, 19));
		r2_p_k_2.setBackground(Color.GRAY);
		r2_k_2.setLeftComponent(r2_p_k_2);
		
		JLabel r2_w_k_2 = new JLabel("0");
		r2_w_k_2.setHorizontalAlignment(SwingConstants.CENTER);
		r2_w_k_2.setForeground(Color.BLACK);
		r2_w_k_2.setFont(new Font("Monospaced", Font.BOLD, 19));
		r2_w_k_2.setBackground(Color.GRAY);
		r2_k_2.setRightComponent(r2_w_k_2);
		
		JSplitPane r2_k_3 = new JSplitPane();
		r2_k_3.setOrientation(JSplitPane.VERTICAL_SPLIT);
		reihe2.add(r2_k_3);
		
		JLabel r2_p_k_3 = new JLabel("0");
		r2_p_k_3.setHorizontalAlignment(SwingConstants.CENTER);
		r2_p_k_3.setForeground(Color.BLACK);
		r2_p_k_3.setFont(new Font("Monospaced", Font.BOLD, 19));
		r2_p_k_3.setBackground(Color.GRAY);
		r2_k_3.setLeftComponent(r2_p_k_3);
		
		JLabel r2_w_k_3 = new JLabel("0");
		r2_w_k_3.setHorizontalAlignment(SwingConstants.CENTER);
		r2_w_k_3.setForeground(Color.BLACK);
		r2_w_k_3.setFont(new Font("Monospaced", Font.BOLD, 19));
		r2_w_k_3.setBackground(Color.GRAY);
		r2_k_3.setRightComponent(r2_w_k_3);
		
		JSplitPane r2_k_4 = new JSplitPane();
		r2_k_4.setOrientation(JSplitPane.VERTICAL_SPLIT);
		reihe2.add(r2_k_4);
		
		JLabel r2_p_k_4 = new JLabel("0");
		r2_p_k_4.setHorizontalAlignment(SwingConstants.CENTER);
		r2_p_k_4.setForeground(Color.BLACK);
		r2_p_k_4.setFont(new Font("Monospaced", Font.BOLD, 19));
		r2_p_k_4.setBackground(Color.GRAY);
		r2_k_4.setLeftComponent(r2_p_k_4);
		
		JLabel r2_w_k_4 = new JLabel("0");
		r2_w_k_4.setHorizontalAlignment(SwingConstants.CENTER);
		r2_w_k_4.setForeground(Color.BLACK);
		r2_w_k_4.setFont(new Font("Monospaced", Font.BOLD, 19));
		r2_w_k_4.setBackground(Color.GRAY);
		r2_k_4.setRightComponent(r2_w_k_4);
		
		JSplitPane r2_k_5 = new JSplitPane();
		r2_k_5.setOrientation(JSplitPane.VERTICAL_SPLIT);
		reihe2.add(r2_k_5);
		
		JLabel r2_p_k_5 = new JLabel("0");
		r2_p_k_5.setHorizontalAlignment(SwingConstants.CENTER);
		r2_p_k_5.setForeground(Color.BLACK);
		r2_p_k_5.setFont(new Font("Monospaced", Font.BOLD, 19));
		r2_p_k_5.setBackground(Color.GRAY);
		r2_k_5.setLeftComponent(r2_p_k_5);
		
		JLabel r2_w_k_5 = new JLabel("0");
		r2_w_k_5.setHorizontalAlignment(SwingConstants.CENTER);
		r2_w_k_5.setForeground(Color.BLACK);
		r2_w_k_5.setFont(new Font("Monospaced", Font.BOLD, 19));
		r2_w_k_5.setBackground(Color.GRAY);
		r2_k_5.setRightComponent(r2_w_k_5);
		
		JPanel reihe3 = new JPanel();
		reihe3.setBorder(new LineBorder(new Color(0, 0, 0)));
		reihen.add(reihe3);
		reihe3.setLayout(new GridLayout(1, 0, 10, 0));
		
		JLabel reihenName3 = new JLabel("3");
		reihe3.add(reihenName3);
		reihenName3.setHorizontalAlignment(SwingConstants.CENTER);
		reihenName3.setForeground(Color.BLACK);
		reihenName3.setFont(new Font("Monospaced", Font.BOLD, 19));
		reihenName3.setBackground(Color.GRAY);
		
		JSplitPane r3_k_1 = new JSplitPane();
		r3_k_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		reihe3.add(r3_k_1);
		
		JLabel r3_p_k_1 = new JLabel("0");
		r3_p_k_1.setHorizontalAlignment(SwingConstants.CENTER);
		r3_p_k_1.setForeground(Color.BLACK);
		r3_p_k_1.setFont(new Font("Monospaced", Font.BOLD, 19));
		r3_p_k_1.setBackground(Color.GRAY);
		r3_k_1.setLeftComponent(r3_p_k_1);
		
		JLabel r3_w_k_1 = new JLabel("0");
		r3_w_k_1.setHorizontalAlignment(SwingConstants.CENTER);
		r3_w_k_1.setForeground(Color.BLACK);
		r3_w_k_1.setFont(new Font("Monospaced", Font.BOLD, 19));
		r3_w_k_1.setBackground(Color.GRAY);
		r3_k_1.setRightComponent(r3_w_k_1);
		
		JSplitPane r3_k_2 = new JSplitPane();
		r3_k_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		reihe3.add(r3_k_2);
		
		JLabel r3_p_k_2 = new JLabel("0");
		r3_p_k_2.setHorizontalAlignment(SwingConstants.CENTER);
		r3_p_k_2.setForeground(Color.BLACK);
		r3_p_k_2.setFont(new Font("Monospaced", Font.BOLD, 19));
		r3_p_k_2.setBackground(Color.GRAY);
		r3_k_2.setLeftComponent(r3_p_k_2);
		
		JLabel r3_w_k_2 = new JLabel("0");
		r3_w_k_2.setHorizontalAlignment(SwingConstants.CENTER);
		r3_w_k_2.setForeground(Color.BLACK);
		r3_w_k_2.setFont(new Font("Monospaced", Font.BOLD, 19));
		r3_w_k_2.setBackground(Color.GRAY);
		r3_k_2.setRightComponent(r3_w_k_2);
		
		JSplitPane r3_k_3 = new JSplitPane();
		r3_k_3.setOrientation(JSplitPane.VERTICAL_SPLIT);
		reihe3.add(r3_k_3);
		
		JLabel r3_p_k_3 = new JLabel("0");
		r3_p_k_3.setHorizontalAlignment(SwingConstants.CENTER);
		r3_p_k_3.setForeground(Color.BLACK);
		r3_p_k_3.setFont(new Font("Monospaced", Font.BOLD, 19));
		r3_p_k_3.setBackground(Color.GRAY);
		r3_k_3.setLeftComponent(r3_p_k_3);
		
		JLabel r3_w_k_3 = new JLabel("0");
		r3_w_k_3.setHorizontalAlignment(SwingConstants.CENTER);
		r3_w_k_3.setForeground(Color.BLACK);
		r3_w_k_3.setFont(new Font("Monospaced", Font.BOLD, 19));
		r3_w_k_3.setBackground(Color.GRAY);
		r3_k_3.setRightComponent(r3_w_k_3);
		
		JSplitPane r3_k_4 = new JSplitPane();
		r3_k_4.setOrientation(JSplitPane.VERTICAL_SPLIT);
		reihe3.add(r3_k_4);
		
		JLabel r3_p_k_4 = new JLabel("0");
		r3_p_k_4.setHorizontalAlignment(SwingConstants.CENTER);
		r3_p_k_4.setForeground(Color.BLACK);
		r3_p_k_4.setFont(new Font("Monospaced", Font.BOLD, 19));
		r3_p_k_4.setBackground(Color.GRAY);
		r3_k_4.setLeftComponent(r3_p_k_4);
		
		JLabel r3_w_k_4 = new JLabel("0");
		r3_w_k_4.setHorizontalAlignment(SwingConstants.CENTER);
		r3_w_k_4.setForeground(Color.BLACK);
		r3_w_k_4.setFont(new Font("Monospaced", Font.BOLD, 19));
		r3_w_k_4.setBackground(Color.GRAY);
		r3_k_4.setRightComponent(r3_w_k_4);
		
		JSplitPane r3_k_5 = new JSplitPane();
		r3_k_5.setOrientation(JSplitPane.VERTICAL_SPLIT);
		reihe3.add(r3_k_5);
		
		JLabel r3_p_k_5 = new JLabel("0");
		r3_p_k_5.setHorizontalAlignment(SwingConstants.CENTER);
		r3_p_k_5.setForeground(Color.BLACK);
		r3_p_k_5.setFont(new Font("Monospaced", Font.BOLD, 19));
		r3_p_k_5.setBackground(Color.GRAY);
		r3_k_5.setLeftComponent(r3_p_k_5);
		
		JLabel r3_w_k_5 = new JLabel("0");
		r3_w_k_5.setHorizontalAlignment(SwingConstants.CENTER);
		r3_w_k_5.setForeground(Color.BLACK);
		r3_w_k_5.setFont(new Font("Monospaced", Font.BOLD, 19));
		r3_w_k_5.setBackground(Color.GRAY);
		r3_k_5.setRightComponent(r3_w_k_5);
		
		JPanel reihe4 = new JPanel();
		reihe4.setBorder(new LineBorder(new Color(0, 0, 0)));
		reihen.add(reihe4);
		reihe4.setLayout(new GridLayout(1, 0, 10, 0));
		
		JLabel reihenName4 = new JLabel("4");
		reihe4.add(reihenName4);
		reihenName4.setHorizontalAlignment(SwingConstants.CENTER);
		reihenName4.setForeground(Color.BLACK);
		reihenName4.setFont(new Font("Monospaced", Font.BOLD, 19));
		reihenName4.setBackground(Color.GRAY);
		
		JSplitPane r4_k_1 = new JSplitPane();
		r4_k_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		reihe4.add(r4_k_1);
		
		JLabel r4_w_k_1 = new JLabel("0");
		r4_k_1.setLeftComponent(r4_w_k_1);
		r4_w_k_1.setHorizontalAlignment(SwingConstants.CENTER);
		r4_w_k_1.setForeground(Color.BLACK);
		r4_w_k_1.setFont(new Font("Monospaced", Font.BOLD, 19));
		r4_w_k_1.setBackground(Color.GRAY);
		
		JLabel r4_p_k_1 = new JLabel("0");
		r4_k_1.setRightComponent(r4_p_k_1);
		r4_p_k_1.setHorizontalAlignment(SwingConstants.CENTER);
		r4_p_k_1.setForeground(Color.BLACK);
		r4_p_k_1.setFont(new Font("Monospaced", Font.BOLD, 19));
		r4_p_k_1.setBackground(Color.GRAY);
		
		JSplitPane r4_k_2 = new JSplitPane();
		reihe4.add(r4_k_2);
		r4_k_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		
		JLabel r4_w_k_2 = new JLabel("0");
		r4_w_k_2.setHorizontalAlignment(SwingConstants.CENTER);
		r4_w_k_2.setForeground(Color.BLACK);
		r4_w_k_2.setFont(new Font("Monospaced", Font.BOLD, 19));
		r4_w_k_2.setBackground(Color.GRAY);
		r4_k_2.setRightComponent(r4_w_k_2);
		
		JLabel r4_p_k_2 = new JLabel("0");
		r4_k_2.setLeftComponent(r4_p_k_2);
		r4_p_k_2.setHorizontalAlignment(SwingConstants.CENTER);
		r4_p_k_2.setForeground(Color.BLACK);
		r4_p_k_2.setFont(new Font("Monospaced", Font.BOLD, 19));
		r4_p_k_2.setBackground(Color.GRAY);
		
		JSplitPane r4_k_3 = new JSplitPane();
		r4_k_3.setOrientation(JSplitPane.VERTICAL_SPLIT);
		reihe4.add(r4_k_3);
		
		JLabel r4_p_k_3 = new JLabel("0");
		r4_p_k_3.setHorizontalAlignment(SwingConstants.CENTER);
		r4_p_k_3.setForeground(Color.BLACK);
		r4_p_k_3.setFont(new Font("Monospaced", Font.BOLD, 19));
		r4_p_k_3.setBackground(Color.GRAY);
		r4_k_3.setLeftComponent(r4_p_k_3);
		
		JLabel r4_w_k_3 = new JLabel("0");
		r4_w_k_3.setHorizontalAlignment(SwingConstants.CENTER);
		r4_w_k_3.setForeground(Color.BLACK);
		r4_w_k_3.setFont(new Font("Monospaced", Font.BOLD, 19));
		r4_w_k_3.setBackground(Color.GRAY);
		r4_k_3.setRightComponent(r4_w_k_3);
		
		JSplitPane r4_k_4 = new JSplitPane();
		r4_k_4.setOrientation(JSplitPane.VERTICAL_SPLIT);
		reihe4.add(r4_k_4);
		
		JLabel r4_p_k_4 = new JLabel("0");
		r4_p_k_4.setHorizontalAlignment(SwingConstants.CENTER);
		r4_p_k_4.setForeground(Color.BLACK);
		r4_p_k_4.setFont(new Font("Monospaced", Font.BOLD, 19));
		r4_p_k_4.setBackground(Color.GRAY);
		r4_k_4.setLeftComponent(r4_p_k_4);
		
		JLabel r4_w_k_4 = new JLabel("0");
		r4_w_k_4.setHorizontalAlignment(SwingConstants.CENTER);
		r4_w_k_4.setForeground(Color.BLACK);
		r4_w_k_4.setFont(new Font("Monospaced", Font.BOLD, 19));
		r4_w_k_4.setBackground(Color.GRAY);
		r4_k_4.setRightComponent(r4_w_k_4);
		
		JSplitPane r4_k_5 = new JSplitPane();
		r4_k_5.setOrientation(JSplitPane.VERTICAL_SPLIT);
		reihe4.add(r4_k_5);
		
		JLabel r4_p_k_5 = new JLabel("0");
		r4_p_k_5.setHorizontalAlignment(SwingConstants.CENTER);
		r4_p_k_5.setForeground(Color.BLACK);
		r4_p_k_5.setFont(new Font("Monospaced", Font.BOLD, 19));
		r4_p_k_5.setBackground(Color.GRAY);
		r4_k_5.setLeftComponent(r4_p_k_5);
		
		JLabel r4_w_k_5 = new JLabel("0");
		r4_w_k_5.setHorizontalAlignment(SwingConstants.CENTER);
		r4_w_k_5.setForeground(Color.BLACK);
		r4_w_k_5.setFont(new Font("Monospaced", Font.BOLD, 19));
		r4_w_k_5.setBackground(Color.GRAY);
		r4_k_5.setRightComponent(r4_w_k_5);
		
		JPanel GegnerPunkte = new JPanel();
		GegnerPunkte.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		GegnerPunkte.setBounds(602, 9, 122, 250);
		contentPane.add(GegnerPunkte);
		GegnerPunkte.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel spieler1 = new JLabel("New label");
		GegnerPunkte.add(spieler1);
		
		JLabel spieler2 = new JLabel("New label");
		GegnerPunkte.add(spieler2);
		
		JLabel spieler3 = new JLabel("New label");
		GegnerPunkte.add(spieler3);
		
		JLabel spieler4 = new JLabel("New label");
		GegnerPunkte.add(spieler4);
		
		JPanel SpielerInfo = new JPanel();
		SpielerInfo.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		SpielerInfo.setBounds(9, 269, 715, 111);
		contentPane.add(SpielerInfo);
	}
}
