import javax.swing.*;
import java.awt.*;

public class PersonalInformationGUI extends JFrame {
    private JLabel firstNameLabel, lastNameLabel, addressLabel, mobileLabel, genderLabel, interestLabel;
    private JTextField firstNameField, lastNameField, addressField, mobileField;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private JCheckBox computerCheckBox, sportsCheckBox, musicCheckBox;
    private JButton submitButton, resetButton;

    public PersonalInformationGUI() {
        setTitle("Personal Information");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        firstNameLabel = new JLabel("First Name:");
        add(firstNameLabel);
        firstNameField = new JTextField();
        add(firstNameField);

        lastNameLabel = new JLabel("Last Name:");
        add(lastNameLabel);
        lastNameField = new JTextField();
        add(lastNameField);

        addressLabel = new JLabel("Address:");
        add(addressLabel);
        addressField = new JTextField();
        add(addressField);

        mobileLabel = new JLabel("Mobile No:");
        add(mobileLabel);
        mobileField = new JTextField();
        add(mobileField);

        genderLabel = new JLabel("Gender:");
        add(genderLabel);
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        add(genderPanel);

        interestLabel = new JLabel("Your Interest:");
        add(interestLabel);
        JPanel interestPanel = new JPanel();
        computerCheckBox = new JCheckBox("Computer");
        sportsCheckBox = new JCheckBox("Sports");
        musicCheckBox = new JCheckBox("Music");
        interestPanel.add(computerCheckBox);
        interestPanel.add(sportsCheckBox);
        interestPanel.add(musicCheckBox);
        add(interestPanel);

        submitButton = new JButton("Submit");
        add(submitButton);
        resetButton = new JButton("Reset");
        add(resetButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PersonalInformationGUI();
        });
    }
}
