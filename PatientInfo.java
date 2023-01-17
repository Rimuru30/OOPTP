import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PatientInfo extends JFrame{
    //.....
    final private Font mainFont = new Font("Times New Roman", Font.BOLD, 18);
    JTextField tfFirstName, tfLastName;
    JLabel lbMedicalName,lbPatientInfo;

    public void initialize() {
//. initialize
        lbMedicalName = new JLabel("PATIENT INFORMATION");
        lbMedicalName.setFont(mainFont);
//....
        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);
 //......       
        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);

        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

//....... 
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(8, 1, 20, 5));
        formPanel.setOpaque(false);
        
       
         
            String[] SexCombobox = {"MALE", "FEMALE", "OTHERS"};
            JComboBox SComboBox = new JComboBox(SexCombobox);
            this.pack();
            this.setVisible(true);
            this.add(SComboBox);
            
           
            String[] BtypeCombobox ={"A+", "A-", "AB+", "AB-", "B+", "B-", "O+", "O-"};
            JComboBox BComboBox = new JComboBox(BtypeCombobox);
            this.add(BComboBox);
            this.pack();
            this.setVisible(true);
            BComboBox.setBounds(1100, 775, 100, 30);      
            
       
        formPanel.add(lbMedicalName);
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);
        formPanel.add(BComboBox);
        formPanel.add(SComboBox);
      
        lbPatientInfo = new JLabel();
        lbPatientInfo.setFont(mainFont);

        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                lbPatientInfo.setText("Hello " + firstName + " " + lastName);
                
            }

        });

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstName.setText("");
                tfLastName.setText("");
    

                lbPatientInfo.setText("");
            }
            
        });

        
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 10, 10));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);

        //...formpanel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color( 255, 255, 255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(150, 80, 2, 80));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(lbPatientInfo, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        add(mainPanel);
//..
        setTitle("Garcia Medical Center");
        setSize(500, 600); 
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    private void setVisible(String string) {
    }
    public static void main(String[] args){
        PatientInfo myFrame = new PatientInfo();
        myFrame.initialize();

    }
}