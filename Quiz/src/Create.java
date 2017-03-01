import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Create extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Create() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create Account");
		lblNewLabel.setBounds(234, 18, 113, 16);
		add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(198, 73, 73, 16);
		add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(283, 68, 170, 26);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(198, 113, 64, 16);
		add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(283, 106, 170, 26);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setBounds(152, 160, 114, 16);
		add(lblConfirmPassword);
		
		textField_2 = new JTextField();
		textField_2.setBounds(283, 155, 170, 26);
		add(textField_2);
		textField_2.setColumns(10);
		
		String[] component= {"Select","Teacher","Student"} ;
		JComboBox comboBox = new JComboBox(component);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==comboBox){
					JComboBox cBox =(JComboBox)e.getSource();	
					String msg= (String)cBox.getSelectedItem();
					
				}
			}
		});
		comboBox.setMaximumRowCount(3);
		comboBox.setToolTipText("");
		comboBox.setBounds(293, 203, 141, 26);
		add(comboBox);
		
		JButton create = new JButton("Create");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// add function to add the account information to DB 	
			}
		});
		create.setBounds(311, 265, 117, 29);
		add(create);
		
		

	}
}
