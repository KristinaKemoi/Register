import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class RegisterFrame extends JFrame implements ActionListener{
	private JTextField txtFname, txtLname;
	private JLabel lblMessage;
	private JButton btnRegister;
	public RegisterFrame() {
		super("Registration");
		setLayout(new FlowLayout());
		lblMessage = new JLabel ("Enter Names") ;
		add(lblMessage);
		txtFname = new JTextField(15);
		add(txtFname);
		txtLname = new JTextField(15);
		add(txtLname);
		btnRegister = new JButton("Register");
		btnRegister.addActionListener(this);
		add(btnRegister);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btnRegister){
			String fname = txtFname.getText () ;
			String lname = txtLname.getText () ;
			lblMessage.setText ("Welcome: "+fname+" "+lname) ;
			JOptionPane.showMessageDialog(null, "Registration sucessful",
			"Success", JOptionPane.PLAIN_MESAGE) ;
		}
	}
	
	public static void main(String[] args){
		RegisterFrame rFrame = new RegisterFrame();
		rFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rFrame.setSize(200,300);
		rFrame.setVisible(true);		
	}
}
