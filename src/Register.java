import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {
    private JPanel Panel;
    private JButton BACKButton;

    private JTextField txtUsername;
    private JTextField txtEmail;
    private JPasswordField pwdPassword;
    private JButton OKButton;
    private JPasswordField pwdPassCon;


    public Register() {
        main main = new main();
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(new String(pwdPassword.getPassword()).equals(new String(pwdPassCon.getPassword()))){
                    main.input(txtUsername.getText(),txtEmail.getText(),new String(pwdPassword.getPassword()));
                    JOptionPane.showMessageDialog(null,"Success","--",JOptionPane.OK_CANCEL_OPTION);
                }else {
                    JOptionPane.showMessageDialog(null, "false", "--", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }
    public JPanel getPanel() {

        return Panel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}
