import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField pan, aadhar;
    JButton next;

    JRadioButton seniorYes, seniorNo;
    JRadioButton existingYes, existingNo;

    JComboBox<String> religionComboBox;
    JComboBox<String> categoryComboBox;
    JComboBox<String> incomeComboBox;
    JComboBox<String> educationComboBox;
    JComboBox<String> occupationComboBox;

    String formno;

    SignupTwo(String formno) {

        this.formno = formno;

        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        // Page Title
        JLabel additionalDetails =
                new JLabel("Page 2: ADDITIONAL DETAILS");

        additionalDetails.setFont(
                new Font("Raleway", Font.BOLD, 22)
        );

        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);


        // Religion
        JLabel religion = new JLabel("Religion:");

        religion.setFont(
                new Font("Raleway", Font.BOLD, 20)
        );

        religion.setBounds(100, 140, 200, 30);
        add(religion);

        String[] religionValues = {
                "Hindu",
                "Muslim",
                "Sikh",
                "Christian",
                "Other"
        };

        religionComboBox =
                new JComboBox<>(religionValues);

        religionComboBox.setBounds(
                300, 140, 400, 30
        );

        religionComboBox.setBackground(Color.WHITE);

        add(religionComboBox);


        // Category
        JLabel category = new JLabel("Category:");

        category.setFont(
                new Font("Raleway", Font.BOLD, 20)
        );

        category.setBounds(100, 190, 200, 30);
        add(category);

        String[] categoryValues = {
                "General",
                "OBC",
                "SC",
                "ST",
                "Other"
        };

        categoryComboBox =
                new JComboBox<>(categoryValues);

        categoryComboBox.setBounds(
                300, 190, 400, 30
        );

        categoryComboBox.setBackground(Color.WHITE);

        add(categoryComboBox);


        // Income
        JLabel income = new JLabel("Income:");

        income.setFont(
                new Font("Raleway", Font.BOLD, 20)
        );

        income.setBounds(100, 240, 200, 30);
        add(income);

        String[] incomeValues = {
                "Null",
                "<1,50,000",
                "<2,50,000",
                "<5,00,000",
                "Up to 10,00,000"
        };

        incomeComboBox =
                new JComboBox<>(incomeValues);

        incomeComboBox.setBounds(
                300, 240, 400, 30
        );

        incomeComboBox.setBackground(Color.WHITE);

        add(incomeComboBox);


        // Education
        JLabel education =
                new JLabel("Educational");

        education.setFont(
                new Font("Raleway", Font.BOLD, 20)
        );

        education.setBounds(100, 290, 200, 30);
        add(education);


        JLabel qualification =
                new JLabel("Qualification:");

        qualification.setFont(
                new Font("Raleway", Font.BOLD, 20)
        );

        qualification.setBounds(
                100, 315, 200, 30
        );

        add(qualification);


        String[] educationValues = {
                "Non-Graduate",
                "Graduate",
                "Post-Graduate",
                "Doctorate",
                "Other"
        };

        educationComboBox =
                new JComboBox<>(educationValues);

        educationComboBox.setBounds(
                300, 315, 400, 30
        );

        educationComboBox.setBackground(Color.WHITE);

        add(educationComboBox);


        // Occupation
        JLabel occupation =
                new JLabel("Occupation:");

        occupation.setFont(
                new Font("Raleway", Font.BOLD, 20)
        );

        occupation.setBounds(
                100, 390, 200, 30
        );

        add(occupation);


        String[] occupationValues = {
                "Salaried",
                "Self-Employed",
                "Business",
                "Student",
                "Retired",
                "Other"
        };

        occupationComboBox =
                new JComboBox<>(occupationValues);

        occupationComboBox.setBounds(
                300, 390, 400, 30
        );

        occupationComboBox.setBackground(Color.WHITE);

        add(occupationComboBox);


        // PAN Number
        JLabel panLabel =
                new JLabel("PAN Number:");

        panLabel.setFont(
                new Font("Raleway", Font.BOLD, 20)
        );

        panLabel.setBounds(
                100, 440, 200, 30
        );

        add(panLabel);


        pan = new JTextField();

        pan.setFont(
                new Font("Raleway", Font.BOLD, 14)
        );

        pan.setBounds(
                300, 440, 400, 30
        );

        add(pan);


        // Aadhar Number
        JLabel aadharLabel =
                new JLabel("Aadhar Number:");

        aadharLabel.setFont(
                new Font("Raleway", Font.BOLD, 20)
        );

        aadharLabel.setBounds(
                100, 490, 200, 30
        );

        add(aadharLabel);


        aadhar = new JTextField();

        aadhar.setFont(
                new Font("Raleway", Font.BOLD, 14)
        );

        aadhar.setBounds(
                300, 490, 400, 30
        );

        add(aadhar);


        // Senior Citizen
        JLabel seniorCitizen =
                new JLabel("Senior Citizen:");

        seniorCitizen.setFont(
                new Font("Raleway", Font.BOLD, 20)
        );

        seniorCitizen.setBounds(
                100, 540, 200, 30
        );

        add(seniorCitizen);


        seniorYes =
                new JRadioButton("Yes");

        seniorYes.setBounds(
                300, 540, 100, 30
        );

        seniorYes.setBackground(Color.WHITE);

        add(seniorYes);


        seniorNo =
                new JRadioButton("No");

        seniorNo.setBounds(
                450, 540, 100, 30
        );

        seniorNo.setBackground(Color.WHITE);

        add(seniorNo);


        ButtonGroup seniorGroup =
                new ButtonGroup();

        seniorGroup.add(seniorYes);
        seniorGroup.add(seniorNo);


        // Existing Account
        JLabel existingAccount =
                new JLabel("Existing Account:");

        existingAccount.setFont(
                new Font("Raleway", Font.BOLD, 20)
        );

        existingAccount.setBounds(
                100, 590, 200, 30
        );

        add(existingAccount);


        existingYes =
                new JRadioButton("Yes");

        existingYes.setBounds(
                300, 590, 100, 30
        );

        existingYes.setBackground(Color.WHITE);

        add(existingYes);


        existingNo =
                new JRadioButton("No");

        existingNo.setBounds(
                450, 590, 100, 30
        );

        existingNo.setBackground(Color.WHITE);

        add(existingNo);


        ButtonGroup existingGroup =
                new ButtonGroup();

        existingGroup.add(existingYes);
        existingGroup.add(existingNo);


        // Next Button
        next = new JButton("Next");

        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);

        next.setFont(
                new Font("Raleway", Font.BOLD, 14)
        );

        next.setBounds(
                620, 660, 80, 30
        );

        next.addActionListener(this);

        add(next);


        // Window Settings
        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);

        setLocation(350, 10);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {

        String sreligion =
                religionComboBox
                        .getSelectedItem()
                        .toString();

        String scategory =
                categoryComboBox
                        .getSelectedItem()
                        .toString();

        String sincome =
                incomeComboBox
                        .getSelectedItem()
                        .toString();

        String seducation =
                educationComboBox
                        .getSelectedItem()
                        .toString();

        String soccupation =
                occupationComboBox
                        .getSelectedItem()
                        .toString();


        // Senior Citizen
        String seniorcitizen = null;

        if (seniorYes.isSelected()) {

            seniorcitizen = "Yes";

        } else if (seniorNo.isSelected()) {

            seniorcitizen = "No";
        }


        // Existing Account
        String existingaccount = null;

        if (existingYes.isSelected()) {

            existingaccount = "Yes";

        } else if (existingNo.isSelected()) {

            existingaccount = "No";
        }


        // Text Fields
        String span = pan.getText();

        String saadhar =
                aadhar.getText();


        try {

            Conn c = new Conn();

            String query =
                    "insert into signuptwo values('" +
                    formno + "','" +
                    sreligion + "','" +
                    scategory + "','" +
                    sincome + "','" +
                    seducation + "','" +
                    soccupation + "','" +
                    seniorcitizen + "','" +
                    existingaccount + "','" +
                    span + "','" +
                    saadhar + "')";


            c.s.executeUpdate(query);


            JOptionPane.showMessageDialog(
                    null,
                    "Page 2 information saved successfully!"
            );


            /*
             * Once SignupThree.java is created,
             * we'll replace the message above with:
             *
             * setVisible(false);
             * new SignupThree(formno).setVisible(true);
             */

        } catch (Exception e) {

            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        new SignupTwo("");
    }
}