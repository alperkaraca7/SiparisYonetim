package Siparis;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class SiparisYönetim extends JFrame {

	private JPanel contentPane;
	
	JLabel hazırLabel,kargoyaverLabel,kargodaLabel,teslimLabel,iadesurecLabel,iadeLabel;
	
	enum SiparisDurumu{
		HAZIRLANIYOR,
		KARGOYAVERİLECEK,
		KARGODA,
		TESLİMEDİLDİ,
		İADESÜRECİNDE,
		İADEEDİLDİ;}
	
	SiparisDurumu s1 = SiparisDurumu.HAZIRLANIYOR;
	SiparisDurumu s2 = SiparisDurumu.KARGOYAVERİLECEK;
	SiparisDurumu s3 = SiparisDurumu.KARGODA;
	SiparisDurumu s4 = SiparisDurumu.TESLİMEDİLDİ;
	SiparisDurumu s5 = SiparisDurumu.İADESÜRECİNDE;
	SiparisDurumu s6 = SiparisDurumu.İADEEDİLDİ;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
						
				try {
					SiparisYönetim frame = new SiparisYönetim();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}}});}
	

	public SiparisYönetim() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.cyan);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		hazırLabel = new JLabel("hazırlanıyor");
		hazırLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		hazırLabel.setForeground(Color.blue);
		hazırLabel.setBackground(Color.lightGray);
		hazırLabel.setBounds(47,137,144,40);
		contentPane.add(hazırLabel);
		
		
		kargoyaverLabel = new JLabel("Kargoya Verilecek ");
		kargoyaverLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		kargoyaverLabel.setBounds(47, 187, 144, 40);
		contentPane.add(kargoyaverLabel);
		
		kargodaLabel = new JLabel("Kargoda");
		kargodaLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		kargodaLabel.setBounds(47, 237, 144, 50);
		contentPane.add(kargodaLabel);
		
		teslimLabel = new JLabel("Teslim edildi");
		teslimLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		teslimLabel.setBounds(47, 318, 144, 33);
		contentPane.add(teslimLabel);
		
		iadesurecLabel = new JLabel("iade sürecinde");
		iadesurecLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		iadesurecLabel.setBounds(47, 372, 144, 33);
		contentPane.add(iadesurecLabel);
		
		iadeLabel = new JLabel("iade edildi");
		iadeLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		iadeLabel.setBounds(47, 430, 144, 33);
		contentPane.add(iadeLabel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 823, 619);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem()==s1) {
					hazırLabel.setForeground(Color.orange); kargoyaverLabel.setForeground(Color.blue);
					kargodaLabel.setForeground(Color.blue); teslimLabel.setForeground(Color.blue);
					iadesurecLabel.setForeground(Color.blue); iadeLabel.setForeground(Color.blue);
				}

				if (comboBox.getSelectedItem()==s2) {
					hazırLabel.setForeground(Color.blue); kargoyaverLabel.setForeground(Color.orange);
					kargodaLabel.setForeground(Color.blue); teslimLabel.setForeground(Color.blue);
					iadesurecLabel.setForeground(Color.blue); iadeLabel.setForeground(Color.blue);
				}
				if (comboBox.getSelectedItem()==s3) {
					hazırLabel.setForeground(Color.blue); kargoyaverLabel.setForeground(Color.blue);
					kargodaLabel.setForeground(Color.orange); teslimLabel.setForeground(Color.blue);
					iadesurecLabel.setForeground(Color.blue); iadeLabel.setForeground(Color.blue);
				}
				if (comboBox.getSelectedItem()==s4) {
					hazırLabel.setForeground(Color.blue); kargoyaverLabel.setForeground(Color.blue);
					kargodaLabel.setForeground(Color.blue); teslimLabel.setForeground(Color.orange);
					iadesurecLabel.setForeground(Color.blue); iadeLabel.setForeground(Color.blue);
				}
				if (comboBox.getSelectedItem()==s5) {
					hazırLabel.setForeground(Color.blue); kargoyaverLabel.setForeground(Color.blue);
					kargodaLabel.setForeground(Color.blue); teslimLabel.setForeground(Color.blue);
					iadesurecLabel.setForeground(Color.orange); iadeLabel.setForeground(Color.blue);
				}
				if (comboBox.getSelectedItem()==s6) {
					hazırLabel.setForeground(Color.blue); kargoyaverLabel.setForeground(Color.blue);
					kargodaLabel.setForeground(Color.blue); teslimLabel.setForeground(Color.blue);
					iadesurecLabel.setForeground(Color.blue); iadeLabel.setForeground(Color.orange);
				}
				
			}
		});
		
		comboBox.setModel(new DefaultComboBoxModel(SiparisDurumu.values()));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(235, 23, 269, 50);

		contentPane.add(comboBox);
	
	}
}
