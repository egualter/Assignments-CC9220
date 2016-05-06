import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window.Type;


public class EditarFuncionario {

	private JFrame frmEditarFuncionario;
	private JTextField txtcpf;
	private JTextField txtnome;
	private JTextField txtsenha;
	private JTextField txtfuno;
	private JTextField txtturno;
	private JTextField txtidade;

	/**
	 * Launch the application.
	 */
	public static void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarFuncionario window = new EditarFuncionario();
					window.frmEditarFuncionario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EditarFuncionario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEditarFuncionario = new JFrame();
		frmEditarFuncionario.setType(Type.UTILITY);
		frmEditarFuncionario.setTitle("Editar Funcionario");
		frmEditarFuncionario.setBounds(100, 100, 359, 396);
		frmEditarFuncionario.getContentPane().setLayout(null);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCpf.setBounds(10, 11, 66, 33);
		frmEditarFuncionario.getContentPane().add(lblCpf);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(10, 89, 66, 33);
		frmEditarFuncionario.getContentPane().add(lblNome);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setBounds(10, 128, 66, 33);
		frmEditarFuncionario.getContentPane().add(lblSenha);
		
		JLabel lblFuno = new JLabel("Fun\u00E7\u00E3o:");
		lblFuno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFuno.setBounds(10, 167, 66, 33);
		frmEditarFuncionario.getContentPane().add(lblFuno);
		
		JLabel lblTurno = new JLabel("Turno:");
		lblTurno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTurno.setBounds(10, 206, 66, 33);
		frmEditarFuncionario.getContentPane().add(lblTurno);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdade.setBounds(10, 245, 66, 33);
		frmEditarFuncionario.getContentPane().add(lblIdade);
		
		txtcpf = new JTextField();
		txtcpf.setText("(CPF)");
		txtcpf.setHorizontalAlignment(SwingConstants.CENTER);
		txtcpf.setColumns(10);
		txtcpf.setBounds(82, 11, 122, 33);
		frmEditarFuncionario.getContentPane().add(txtcpf);
		
		txtnome = new JTextField();
		txtnome.setText("(Nome)");
		txtnome.setHorizontalAlignment(SwingConstants.CENTER);
		txtnome.setColumns(10);
		txtnome.setBounds(82, 89, 122, 33);
		frmEditarFuncionario.getContentPane().add(txtnome);
		
		txtsenha = new JTextField();
		txtsenha.setText("(Senha)");
		txtsenha.setHorizontalAlignment(SwingConstants.CENTER);
		txtsenha.setColumns(10);
		txtsenha.setBounds(82, 128, 122, 33);
		frmEditarFuncionario.getContentPane().add(txtsenha);
		
		txtfuno = new JTextField();
		txtfuno.setText("(Fun\u00E7\u00E3o)");
		txtfuno.setHorizontalAlignment(SwingConstants.CENTER);
		txtfuno.setColumns(10);
		txtfuno.setBounds(82, 167, 122, 33);
		frmEditarFuncionario.getContentPane().add(txtfuno);
		
		txtturno = new JTextField();
		txtturno.setText("(Turno)");
		txtturno.setHorizontalAlignment(SwingConstants.CENTER);
		txtturno.setColumns(10);
		txtturno.setBounds(82, 206, 122, 33);
		frmEditarFuncionario.getContentPane().add(txtturno);
		
		txtidade = new JTextField();
		txtidade.setText("(Idade)");
		txtidade.setHorizontalAlignment(SwingConstants.CENTER);
		txtidade.setColumns(10);
		txtidade.setBounds(82, 245, 122, 33);
		frmEditarFuncionario.getContentPane().add(txtidade);
		
		JButton button = new JButton("Adicionar");
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBackground(new Color(135, 206, 250));
		button.setBounds(82, 285, 122, 23);
		frmEditarFuncionario.getContentPane().add(button);
		
		JButton button_1 = new JButton("Voltar");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBackground(new Color(135, 206, 250));
		button_1.setBounds(82, 319, 122, 23);
		frmEditarFuncionario.getContentPane().add(button_1);
		
		JLabel label = new JLabel("<Status>");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(92, 55, 95, 23);
		frmEditarFuncionario.getContentPane().add(label);
		
		JButton button_2 = new JButton("Adicionar");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setBackground(new Color(135, 206, 250));
		button_2.setBounds(214, 16, 122, 23);
		frmEditarFuncionario.getContentPane().add(button_2);
		
		JLabel label_1 = new JLabel("<Status>");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(226, 285, 95, 23);
		frmEditarFuncionario.getContentPane().add(label_1);
	}

}