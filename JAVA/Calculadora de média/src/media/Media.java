package media;

import java.awt.EventQueue;
import java.awt.Font;
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
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Media.class.getResource("/icones/calc2.png")));
		setTitle("Calculadora da m\u00E9dia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 337, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nota 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(28, 29, 48, 14);
		contentPane.add(lblNewLabel);

		txtNota1 = new JTextField();
		txtNota1.setBounds(86, 28, 132, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nota 2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(28, 75, 48, 14);
		contentPane.add(lblNewLabel_1);

		txtNota2 = new JTextField();
		txtNota2.setBounds(86, 74, 132, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);

		JButton btnCalcular = new JButton("");
		btnCalcular.setToolTipText("Calcular M\u00E9dia");
		btnCalcular.setIcon(new ImageIcon(Media.class.getResource("/icones/calculator2.png")));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// objeto formatador
				DecimalFormat formatador = new DecimalFormat("#0.0");
				// variáveis
				double nota1, nota2, media;
				// entrada
				nota1 = Double.parseDouble(txtNota1.getText().replace(",", "."));
				nota2 = Double.parseDouble(txtNota2.getText().replace(",", "."));
				// processamento
				media = (nota1 + nota2) / 2;
				// saída
				txtMedia.setText("" + formatador.format(media));
				// estrutura de controle (aprovado ou reprovado)
				if (media < 5) {
					JOptionPane.showMessageDialog(null, "REPROVADO","Status", JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "APROVADO","Status", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnCalcular.setBounds(28, 162, 128, 128);
		contentPane.add(btnCalcular);

		JLabel lblNewLabel_2 = new JLabel("M\u00E9dia:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(28, 122, 48, 14);
		contentPane.add(lblNewLabel_2);

		txtMedia = new JTextField();
		txtMedia.setEditable(false);
		txtMedia.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtMedia.setBounds(86, 119, 132, 20);
		contentPane.add(txtMedia);
		txtMedia.setColumns(10);

		JButton btnLimpar = new JButton("");
		btnLimpar.setIcon(new ImageIcon(Media.class.getResource("/icones/apagar_128px.png")));

		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNota1.setText(null);
				txtNota2.setText(null);
				txtMedia.setText(null);
			}
		});
		btnLimpar.setToolTipText("Limpar campos");
		btnLimpar.setBounds(166, 162, 128, 128);
		contentPane.add(btnLimpar);
		
		JButton btnNewButton = new JButton("Sobre");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Calculadora da Média ver 1.0\nAutor: José de Assis","Sobre", JOptionPane.DEFAULT_OPTION);
			}
		});
		btnNewButton.setBounds(240, 51, 69, 23);
		contentPane.add(btnNewButton);
	}
}
