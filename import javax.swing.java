import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.TreeUI;

public class mobile 
{
      public static void main(String args[])
      {
            JFrame screen=new JFrame();

            JLabel Label1=new JLabel();
            Label1.setText("Students Name: ");
            Label1.setBounds(30,30,200,20);
            Label1.setVisible(true);
            screen.add(Label1);

            JTextField txt1=new JTextField();
            txt1.setBounds(200,30,250,20);
            txt1.setVisible(true);
            screen.add(txt1);

            JLabel Label2=new JLabel();
            Label2.setText("Roll No.: ");
            Label2.setBounds(30,60,200,20);
            Label2.setVisible(true);
            screen.add(Label2);
            
            JTextField txt2=new JTextField();
            txt2.setBounds(200,60,250,20);
            txt2.setVisible(true);
            screen.add(txt2);

            JLabel Label3=new JLabel();
            Label3.setText("City: ");
            Label3.setBounds(30,90,200,20);
            Label3.setVisible(true);
            screen.add(Label3);

            String item[]={"Pune","Nashik","Mumbai"};
            JComboBox combo1=new JComboBox(item);
            combo1.setBounds(200,90,250,20);
            combo1.setVisible(true);
            screen.add(combo1);

            JLabel Label4=new JLabel();
            Label4.setText("Gender: ");
            Label4.setBounds(30,120,200,20);
            Label4.setVisible(true);
            screen.add(Label4);

            JRadioButton r1=new JRadioButton("Male");
            r1.setBounds(200, 120, 100, 20);
            r1.setVisible(true);
            screen.add(r1);

            JRadioButton r2=new JRadioButton("Female");
            r2.setBounds(300, 120, 100, 20);
            r2.setVisible(true);
            screen.add(r2);

            ButtonGroup bg=new ButtonGroup();
            bg.add(r1);
            bg.add(r2);

            JLabel label5=new JLabel("languages :");
            label5.setBounds(30, 150, 100, 20);
            label5.setVisible(true);
            screen.add(label5);

            JCheckBox jb1=new JCheckBox("Data Structure");
            jb1.setBounds(200, 150, 150, 20);
            jb1.setVisible(true);
            screen.add(jb1);

            JCheckBox jb2=new JCheckBox("Java");
            jb2.setBounds(350, 150, 200, 20);
            jb2.setFocusable(false);
            jb2.setVisible(true);
            screen.add(jb2);

            JButton bt=new JButton("Submit");
            bt.setBounds(200, 180, 100, 25);
            bt.setFocusable(false);
            bt.setVisible(true);
            screen.add(bt);

            screen.setSize(600, 400);
            screen.setLayout(null);
            screen.setVisible(true);

      }
}
