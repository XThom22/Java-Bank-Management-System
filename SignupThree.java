import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class SignupThree extends JFrame implements ActionListener {

    JRadioButton savings, fixedDeposit, current, recurring;

    JCheckBox atmCard, internetBanking, mobileBanking,
              emailAlerts, chequeBook, eStatement, declare;

    JButton submit, cancel;

    String formno;

    SignupThree(String formno) {

        this.formno = formno;

        setLayout(null);

        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);


        // ACCOUNT TYPE
        JLabel type = new JLabel("Account Type:");
        type.setFont(new Font("Raleway", Font.BOLD, 14));
        type.setBounds(100, 140, 200, 30);
        add(type);

        savings = new JRadioButton("Savings Account");
        savings.setFont(new Font("Raleway", Font.BOLD, 16));
        savings.setBounds(100, 180, 180, 30);
        savings.setBackground(Color.WHITE);
        add(savings);

        fixedDeposit = new JRadioButton("Fixed Deposit Account");
        fixedDeposit.setFont(new Font("Raleway", Font.BOLD, 16));
        fixedDeposit.setBounds(350, 180, 250, 30);
        fixedDeposit.setBackground(Color.WHITE);
        add(fixedDeposit);

        current = new JRadioButton("Current Account");
        current.setFont(new Font("Raleway", Font.BOLD, 16));
        current.setBounds(100, 220, 250, 30);
        current.setBackground(Color.WHITE);
        add(current);

        recurring = new JRadioButton("Recurring Deposit Account");
        recurring.setFont(new Font("Raleway", Font.BOLD, 16));
        recurring.setBounds(350, 220, 250, 30);
        recurring.setBackground(Color.WHITE);
        add(recurring);

        ButtonGroup accountGroup = new ButtonGroup();
        accountGroup.add(savings);
        accountGroup.add(fixedDeposit);
        accountGroup.add(current);
        accountGroup.add(recurring);


        // CARD NUMBER
        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 300, 200, 30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-1234");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 300, 300, 30);
        add(number);

        JLabel cardDetail = new JLabel("Your 16-digit Card Number");
        cardDetail.setFont(new Font("Raleway", Font.BOLD, 12));
        cardDetail.setBounds(100, 330, 300, 20);
        add(cardDetail);


        // PIN
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 370, 300, 30);
        add(pnumber);

        JLabel pinDetail = new JLabel("Your 4-digit PIN");
        pinDetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pinDetail.setBounds(100, 400, 300, 20);
        add(pinDetail);


        // SERVICES
        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 450, 400, 30);
        add(services);

        atmCard = new JCheckBox("ATM Card");
        atmCard.setFont(new Font("Raleway", Font.BOLD, 16));
        atmCard.setBounds(100, 490, 200, 30);
        atmCard.setBackground(Color.WHITE);
        add(atmCard);

        internetBanking = new JCheckBox("Internet Banking");
        internetBanking.setFont(new Font("Raleway", Font.BOLD, 16));
        internetBanking.setBounds(350, 490, 200, 30);
        internetBanking.setBackground(Color.WHITE);
        add(internetBanking);

        mobileBanking = new JCheckBox("Mobile Banking");
        mobileBanking.setFont(new Font("Raleway", Font.BOLD, 16));
        mobileBanking.setBounds(100, 530, 200, 30);
        mobileBanking.setBackground(Color.WHITE);
        add(mobileBanking);

        emailAlerts = new JCheckBox("Email Alerts");
        emailAlerts.setFont(new Font("Raleway", Font.BOLD, 16));
        emailAlerts.setBounds(350, 530, 200, 30);
        emailAlerts.setBackground(Color.WHITE);
        add(emailAlerts);

        chequeBook = new JCheckBox("Cheque Book");
        chequeBook.setFont(new Font("Raleway", Font.BOLD, 16));
        chequeBook.setBounds(100, 570, 200, 30);
        chequeBook.setBackground(Color.WHITE);
        add(chequeBook);

        eStatement = new JCheckBox("E-Statement");
        eStatement.setFont(new Font("Raleway", Font.BOLD, 16));
        eStatement.setBounds(350, 570, 200, 30);
        eStatement.setBackground(Color.WHITE);
        add(eStatement);


        // DECLARATION
        declare = new JCheckBox(
            "I hereby declare that the above entered details are correct to the best of my knowledge."
        );

        declare.setFont(new Font("Raleway", Font.BOLD, 12));
        declare.setBounds(100, 650, 650, 30);
        declare.setBackground(Color.WHITE);
        add(declare);


        // SUBMIT BUTTON
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);


        // CANCEL BUTTON
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);


        getContentPane().setBackground(Color.WHITE);

        setSize(850, 820);
        setLocation(350, 0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == submit) {

            // GET ACCOUNT TYPE
            String accountType = null;

            if (savings.isSelected()) {
                accountType = "Savings Account";

            } else if (fixedDeposit.isSelected()) {
                accountType = "Fixed Deposit Account";

            } else if (current.isSelected()) {
                accountType = "Current Account";

            } else if (recurring.isSelected()) {
                accountType = "Recurring Deposit Account";
            }


            // VALIDATE ACCOUNT TYPE
            if (accountType == null) {
                JOptionPane.showMessageDialog(
                    null,
                    "Account Type is Required"
                );
                return;
            }


            // VALIDATE DECLARATION
            if (!declare.isSelected()) {
                JOptionPane.showMessageDialog(
                    null,
                    "Please accept the declaration before submitting."
                );
                return;
            }


            // GENERATE CARD NUMBER AND PIN
            Random random = new Random();

            String cardNumber = String.valueOf(
                (Math.abs(random.nextLong()) % 90000000L)
                + 1000000000000000L
            );

            String pinNumber = String.valueOf(
                (Math.abs(random.nextLong()) % 9000L)
                + 1000L
            );


            // GET SELECTED SERVICES
            String facility = "";

            if (atmCard.isSelected()) {
                facility += "ATM Card ";
            }

            if (internetBanking.isSelected()) {
                facility += "Internet Banking ";
            }

            if (mobileBanking.isSelected()) {
                facility += "Mobile Banking ";
            }

            if (emailAlerts.isSelected()) {
                facility += "Email Alerts ";
            }

            if (chequeBook.isSelected()) {
                facility += "Cheque Book ";
            }

            if (eStatement.isSelected()) {
                facility += "E-Statement ";
            }


            // DATABASE
            try {

                Conn c = new Conn();


                String query1 =
                "insert into signupthree values('" +
                formno + "','" +
                accountType + "','" +
                cardNumber + "','" +
                pinNumber + "','" +
                facility + "')";

                String query2 =
                    "insert into login values('" +
                    formno + "','" +
                    cardNumber + "','" +
                    pinNumber + "')";

                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);


                // SHOW CARD NUMBER AND PIN
                JOptionPane.showMessageDialog(
                    null,
                    "Card Number: " + cardNumber +
                    "\nPIN: " + pinNumber
                );


                // OPEN DEPOSIT SCREEN
                setVisible(false);

               


            } catch (Exception e) {

                System.out.println(e);

                JOptionPane.showMessageDialog(
                    null,
                    "Database Error: " + e.getMessage()
                );
            }


        } else if (ae.getSource() == cancel) {

            setVisible(false);
        }
    }


    public static void main(String[] args) {

        new SignupThree("");
    }
}