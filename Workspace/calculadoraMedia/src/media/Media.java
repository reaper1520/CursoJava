package media;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Media extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtMedia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Media frame = new Media();
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
	public Media() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Media.class.getResource("/icones/icone darth.png")));
		setTitle("Calculadora da Media");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 313, 271);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nota 1:");
		lblNewLabel.setBounds(10, 11, 48, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 2:");
		lblNewLabel_1.setBounds(10, 43, 48, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(52, 8, 96, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(52, 40, 96, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		JButton btnCalcular = new JButton("");
		btnCalcular.setToolTipText("CalcularMedia");
		btnCalcular.setIcon(new ImageIcon(Media.class.getResource("/icones/icone perc.png")));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//objeto formatador
				DecimalFormat formatador = new DecimalFormat ("#0.0");
				//variaveis
				double nota1, nota2, media;
				//entrada
				nota1 = Double.parseDouble(txtNota1.getText().replace(",", "."));
				nota2 = Double.parseDouble(txtNota2.getText().replace(",", "."));
				//processamento
				media = (nota1 + nota2) / 2;
				//sadia
				txtMedia.setText("" + formatador.format (media).replace(".", ","));
				//estrutura de controle (aprovado / reprovado)
				if (media < 5) {
					JOptionPane.showMessageDialog(null, "Reprovado", "Status", JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Aprovado", "Status", JOptionPane.INFORMATION_MESSAGE);	
				}
			}
		});
		btnCalcular.setBounds(20, 93, 128, 128);
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel_2 = new JLabel("Media:");
		lblNewLabel_2.setBounds(10, 71, 48, 14);
		contentPane.add(lblNewLabel_2);
		
		txtMedia = new JTextField();
		txtMedia.setEditable(false);
		txtMedia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtMedia.setBounds(52, 68, 96, 20);
		contentPane.add(txtMedia);
		txtMedia.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar Campo");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtNota1.setText(null);
			txtNota2.setText(null);
			txtMedia.setText(null);
			
			}
		});
		btnLimpar.setToolTipText("Limpar Campo");
		btnLimpar.setBounds(158, 93, 128, 128);
		contentPane.add(btnLimpar);
		
		JButton btnSobre = new JButton("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Calculadora de Média v1.0\nAutor Thiago Sobral", "Sobre", JOptionPane.DEFAULT_OPTION);
			}
		});
		btnSobre.setBounds(177, 39, 89, 23);
		contentPane.add(btnSobre);
	}
}
