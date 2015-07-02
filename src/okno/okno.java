package okno;
import java.util.List;

import packageModel.Klient;
import packageModel.Usl;
import packageModel.Uslugi;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.CardLayout;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;

import firma.Firma;

/*import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JList;*/
import javax.swing.JEditorPane;
import java.awt.Color;

//import firma.Firma;
public class okno {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					okno window = new okno();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public okno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 770, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelMenu = new JPanel();
		frame.getContentPane().add(panelMenu, "name_9336698821061");
		panelMenu.setLayout(null);
		
		final JPanel panelZamUslugi = new JPanel();
		frame.getContentPane().add(panelZamUslugi, "name_9353923329676");
		panelZamUslugi.setLayout(null);
		
		
		final JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_16372350098947");
		panel.setLayout(null);
		
		JButton button = new JButton("Wstecz");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(true);
				panel.setVisible(false);
			}
		});
		button.setBounds(655, 412, 89, 23);
		panel.add(button);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(Color.LIGHT_GRAY);
		editorPane.setEditable(false);
		editorPane.setBounds(42, 41, 238, 318);
		panel.add(editorPane);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBackground(Color.LIGHT_GRAY);
		editorPane_1.setEditable(false);
		editorPane_1.setBounds(279, 41, 135, 318);
		panel.add(editorPane_1);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBackground(Color.LIGHT_GRAY);
		editorPane_2.setEditable(false);
		editorPane_2.setBounds(413, 41, 303, 318);
		panel.add(editorPane_2);
		
		JButton btnOdwie = new JButton("Od\u015Bwie\u017C");
		btnOdwie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Firma b = new Firma();
				 List<Klient> klienci = b.selectKlienci();
			     List<Usl> usl = b.selectUsl();
			     List<Uslugi> uslugi = b.selectUslugi();
			 
			       // System.out.println("Lista klientow: ");
			       // for(Klient k: klienci)
				 String listString = "";
				 String listString1 = "";
				 String listString2 = "";

				 for (Klient s : klienci)
				 {
				     listString += s + "\n";
				 }
				 	editorPane.setText(listString);
				 	
				 for (Usl s : usl)
				 {
				     listString1+= s + "\n";
				 }
					editorPane_1.setText(listString1);
				for (Uslugi s : uslugi)
				{
				    listString2+= s + "\n";
				}
					editorPane_2.setText(listString2);

			        b.closeConnection();
			}
		});
		btnOdwie.setBounds(546, 412, 89, 23);
		panel.add(btnOdwie);
		
		JLabel lblNrImie = new JLabel("Nr  -  imie   nazwisko  -  pesel                         nazwa uslugi                    cena  -  miejscowosc  -  data");
		lblNrImie.setBounds(42, 26, 674, 14);
		panel.add(lblNrImie);
		
		
		
		
		JButton WsteczButton = new JButton("Wstecz");
		WsteczButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(true);
				panelZamUslugi.setVisible(false);
			}
		});
		WsteczButton.setBounds(655, 412, 89, 23);
		panelZamUslugi.add(WsteczButton);
		
		JLabel lblImi = new JLabel("Imi\u0119:");
		lblImi.setBounds(29, 61, 46, 14);
		panelZamUslugi.add(lblImi);
		
		textField = new JTextField();
		textField.setBounds(29, 77, 150, 20);
		panelZamUslugi.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(230, 77, 150, 20);
		panelZamUslugi.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(29, 125, 150, 20);
		panelZamUslugi.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(29, 223, 223, 20);
		panelZamUslugi.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(166, 286, 86, 20);
		panelZamUslugi.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(29, 286, 86, 20);
		panelZamUslugi.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(29, 356, 150, 20);
		panelZamUslugi.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String imie = textField.getText();
				String nazwisko = textField_1.getText();
				String pesel = textField_2.getText();
				String usluga = textField_3.getText();
				String cena = textField_4.getText();
				String data = textField_5.getText();
				String miejscowosc = textField_6.getText();
				Firma b = new Firma();

			    b.insertKlient(imie, nazwisko, pesel);
			    b.insertUsl(usluga);
			    b.insertUslugi(cena, data, miejscowosc);
			    b.closeConnection();
			    textField.setText("");
			    textField_1.setText("");
			    textField_2.setText("");
			    textField_3.setText("");
			    textField_4.setText("");
			    textField_5.setText("");
			    textField_6.setText("");
			}
		});
		btnDodaj.setBounds(545, 412, 89, 23);
		panelZamUslugi.add(btnDodaj);
		
		JLabel lblNazwisko = new JLabel("Nazwisko:");
		lblNazwisko.setBounds(230, 61, 86, 14);
		panelZamUslugi.add(lblNazwisko);
		
		JLabel lblPesel = new JLabel("Pesel");
		lblPesel.setBounds(29, 111, 46, 14);
		panelZamUslugi.add(lblPesel);
		
		JLabel lblUsluga = new JLabel("Usluga");
		lblUsluga.setBounds(29, 209, 46, 14);
		panelZamUslugi.add(lblUsluga);
		

		JLabel lblCena = new JLabel("Cena us\u0142ugi");
		lblCena.setBounds(165, 268, 73, 14);
		panelZamUslugi.add(lblCena);
		
		JLabel lblDataWykonania = new JLabel("Data wykonania");
		lblDataWykonania.setBounds(29, 268, 118, 14);
		panelZamUslugi.add(lblDataWykonania);

		
		JLabel lblMiejscowosc = new JLabel("Miejsce wykonania uslugi");
		lblMiejscowosc.setBounds(29, 339, 173, 14);
		panelZamUslugi.add(lblMiejscowosc);
		
		JLabel lblDanePersonalne = new JLabel("Dane personalne");
		lblDanePersonalne.setBounds(42, 22, 214, 14);
		panelZamUslugi.add(lblDanePersonalne);
		
		JLabel lblDaneDotyczceWykonania = new JLabel("Dane dotycz\u0105ce wykonania us\u0142ugi");
		lblDaneDotyczceWykonania.setBounds(39, 173, 336, 14);
		panelZamUslugi.add(lblDaneDotyczceWykonania);

		
		
		
		
		JButton ZamUslButton = new JButton("Zamawianie uslug");
		ZamUslButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(false);
				panelZamUslugi.setVisible(true);
			}
		});
		ZamUslButton.setBounds(37, 84, 177, 70);
		panelMenu.add(ZamUslButton);
		
		JButton btnZamwioneUsugi = new JButton("Zam\u00F3wione us\u0142ugi");
		btnZamwioneUsugi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(false);
				panel.setVisible(true);
			}
		});
		btnZamwioneUsugi.setBounds(243, 84, 155, 70);
		panelMenu.add(btnZamwioneUsugi);
	
	}
}
