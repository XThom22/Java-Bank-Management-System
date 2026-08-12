import java.awt.Image;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Login extends JFrame implements ActionListener {
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {
        setTitle("AUTOMATED TELLER MACHINE");

        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Label = new JLabel(i3);
        Label.setBounds(70, 10, 100, 100);
        add(Label);

        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new java.awt.Font("Osward", java.awt.Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel cardno = new JLabel("CARD NUMBER");
        cardno.setFont(new java.awt.Font("Raleway", java.awt.Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 14));
        add(cardTextField);

        JLabel pin = new JLabel("PIN");
        pin.setFont(new java.awt.Font("Raleway", java.awt.Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 30);
        add(pin);

          pinTextField = new JPasswordField ();
        pinTextField.setBounds(300, 220, 230, 30);
        add(pinTextField);

         login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(java.awt.Color.BLACK);
        login.setForeground(java.awt.Color.WHITE);
        login.addActionListener(this);
        add(login);

          clear  = new JButton("ClEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(java.awt.Color.BLACK);
        clear.setForeground(java.awt.Color.WHITE);
        clear.addActionListener(this);
        add(clear);

         signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(java.awt.Color.BLACK);
        signup.setForeground(java.awt.Color.WHITE);
        signup.addActionListener(this);
        add(signup);



        getContentPane().setBackground(java.awt.Color.WHITE);

        setSize(800, 480);
        setLocation(350, 200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource() == clear) {
        cardTextField.setText("");
        pinTextField.setText("");
        } else if(ae.getSource() == login) {
            
            
        } else if(ae.getSource() == signup) {
            setVisible(false);
            new SignupOne().setVisible(true);
           
    }
    
    }

    public static void main(String[] args) {
        new Login();

    }
}