package IMC;

import java.awt.EventQueue;
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

public class IMC extends JFrame {

	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtIMC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IMC frame = new IMC();
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
	public IMC() {
		setTitle("CalculadoraIMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(22, 222, 200, 14);
		contentPane.add(lblResultado);
		
		JButton btnCalcularIMC = new JButton("Calcular IMC");
		btnCalcularIMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//objeto formatador
				DecimalFormat formatador = new DecimalFormat ("#0.00");
				//variaveis
				double peso, altura, imc;
				//entrada
				peso = Double.parseDouble(txtPeso.getText().replace(",", "."));
				altura = Double.parseDouble(txtAltura.getText().replace(",", "."));
				//processamento
				imc = peso / (altura*altura);
				//sadia
				txtIMC.setText("" + formatador.format (imc).replace(".", ","));
				//estrutura de controle (aprovado / reprovado)
				if (imc < 17) {
					lblResultado.setText("Muito abaixo do peso!");
				} else if (imc >= 17 && imc < 18.5){
					lblResultado.setText("Abaixo do peso!");
				} else if (imc >= 18.5 && imc < 25) {
					lblResultado.setText("Peso Normal!");
				} else if (imc >= 25 && imc < 30) {
					lblResultado.setText("Resultado: Acima do peso");
				} else if (imc >= 30 && imc < 35) {
					lblResultado.setText("Resultado: Obesidade I");
				} else if (imc >= 35 && imc < 40) {
					lblResultado.setText("Resultado: Obesidade II (Severa)");
				} else {
					lblResultado.setText("Resultado: Obesidade III (M�rbida)");
				}
				}
			}
		);
		
		btnCalcularIMC.setBounds(10, 144, 110, 23);
		contentPane.add(btnCalcularIMC);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPeso.setText(null);
				txtAltura.setText(null);
				txtIMC.setText(null);
			}
		});
		btnLimpar.setBounds(129, 144, 110, 23);
		contentPane.add(btnLimpar);
		
		JButton btnSobre = new JButton("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Calculadora de IMC v1.0\nAutor Thiago Sobral", "Sobre", JOptionPane.DEFAULT_OPTION);
			}
		});
		btnSobre.setBounds(76, 178, 100, 23);
		contentPane.add(btnSobre);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(99, 21, 96, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(99, 52, 96, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtIMC = new JTextField();
		txtIMC.setEditable(false);
		txtIMC.setBounds(99, 83, 96, 20);
		contentPane.add(txtIMC);
		txtIMC.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(22, 24, 48, 14);
		contentPane.add(lblPeso);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(22, 55, 48, 14);
		contentPane.add(lblAltura);
		
		JLabel lblIMC = new JLabel("IMC:");
		lblIMC.setBounds(22, 86, 48, 14);
		contentPane.add(lblIMC);
		
		JLabel lblStatus = new JLabel("");
		lblStatus.setBounds(276, 29, 150, 300);
		contentPane.add(lblStatus);
		
		
	}

}
