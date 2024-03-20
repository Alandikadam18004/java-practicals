import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TravelManagementSystemGUI extends JFrame implements ActionListener
 {
	private JComboBox<String> packageComboBox, genderComboBox, ticketTypeComboBox;
    	private JTextField dateField, passengerField, nameField, surnameField, ageField, phoneField, emailField, addressField;
    	private JButton submitButton;
    	private int amountToPay;

    	public TravelManagementSystemGUI() 
	{
        		setTitle("Tourism Package Management System");
        		setSize(500, 450);
        		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		setLayout(null);
        		getContentPane().setBackground(new Color(205, 255, 204)); // Light green background

        		JLabel titleLabel = new JLabel("Welcome to Travel Management System");
        		titleLabel.setForeground(Color.blue);
        		titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        		titleLabel.setBounds(100, 10, 300, 20);
        		add(titleLabel);

        		JLabel nameLabel = new JLabel("Name:");
        		nameLabel.setForeground(Color.black);
        		nameLabel.setBounds(50, 50, 50, 20);
        		add(nameLabel);
        		nameField = new JTextField();
        		nameField.setBounds(150, 50, 200, 20);
       		add(nameField);

        		JLabel surnameLabel = new JLabel("Surname:");
        		surnameLabel.setForeground(Color.black);
        		surnameLabel.setBounds(50, 80, 70, 20);
        		add(surnameLabel);
        		surnameField = new JTextField();
        		surnameField.setBounds(150, 80, 200, 20);
        		add(surnameField);

        		JLabel ageLabel = new JLabel("Age:");
        		ageLabel.setForeground(Color.black);
        		ageLabel.setBounds(50, 110, 50, 20);
        		add(ageLabel);
        		ageField = new JTextField();
        		ageField.setBounds(150, 110, 50, 20);
        		add(ageField);

        		JLabel genderLabel = new JLabel("Gender:");
        		genderLabel.setForeground(Color.black);
        		genderLabel.setBounds(50, 140, 70, 20);
        		add(genderLabel);
		String[] genders = {"Male", "Female"};
        		genderComboBox = new JComboBox<>(genders);
        		genderComboBox.setBounds(150, 140, 100, 20);
        		add(genderComboBox);

        		JLabel phoneLabel = new JLabel("Phone:");
        		phoneLabel.setForeground(Color.black);
        		phoneLabel.setBounds(50, 170, 70, 20);
        		add(phoneLabel);
        		phoneField = new JTextField();
        		phoneField.setBounds(150, 170, 200, 20);
        		add(phoneField);

        		JLabel emailLabel = new JLabel("Email:");
        		emailLabel.setForeground(Color.black);
        		emailLabel.setBounds(50, 200, 70, 20);
        		add(emailLabel);
        		emailField = new JTextField();
        		emailField.setBounds(150, 200, 200, 20);
        		add(emailField);

        		JLabel addressLabel = new JLabel("Address:");
        		addressLabel.setForeground(Color.black);
        		addressLabel.setBounds(50, 230, 70, 20);
        		add(addressLabel);
        		addressField = new JTextField();
        		addressField.setBounds(150, 230, 200, 20);
        		add(addressField);

        		JLabel packageLabel = new JLabel("Select Package:");
        		packageLabel.setForeground(Color.black);
        		packageLabel.setBounds(50, 260, 100, 20);
        		add(packageLabel);
        		String[] packages = {"Shimla Tour (6 Days 7 Nights)", "Kashmir Tour (5 Days 4 Nights)",
				 "Kolkata Tour (11 Days 10 Nights)"  ,"England Tour (6 Days 7 Nights)", 
				"Thailand Tour (5 Days 4 Nights)", "New York Tour (11 Days 10 Nights)"};
        		packageComboBox = new JComboBox<>(packages);
        		packageComboBox.setBounds(150, 260, 200, 20);
        		add(packageComboBox);

        		JLabel dateLabel = new JLabel("Enter Date (DD/MM/YY):");
        		dateLabel.setForeground(Color.black);
        		dateLabel.setBounds(50, 290, 150, 20);
        		add(dateLabel);	
        		dateField = new JTextField();
        		dateField.setBounds(210, 290, 150, 20);
        		add(dateField);

       		JLabel passengerLabel = new JLabel("Enter Number Of Passengers:");
        		passengerLabel.setForeground(Color.black);
        		passengerLabel.setBounds(50, 320, 200, 20);
        		add(passengerLabel);
        		passengerField = new JTextField();
        		passengerField.setBounds(250, 320, 50, 20);
        		add(passengerField);

        		JLabel ticketTypeLabel = new JLabel("Select Ticket Type:");
        		ticketTypeLabel.setForeground(Color.black);
        		ticketTypeLabel.setBounds(50, 350, 150, 20);
        		add(ticketTypeLabel);
        		String[] ticketTypes = {"Standard", "Economy", "First Class"};
        		ticketTypeComboBox = new JComboBox<>(ticketTypes);
        		ticketTypeComboBox.setBounds(200, 350, 150, 20);
       	 	add(ticketTypeComboBox);

        		submitButton = new JButton("Submit");
        		submitButton.setBounds(180, 390, 100, 30);
        		submitButton.addActionListener(this);
        		submitButton.setBackground(new Color(0, 153, 51)); // Dark green background
        		submitButton.setForeground(Color.white);
        		add(submitButton);

        		setVisible(true);
    	}

    	public void actionPerformed(ActionEvent e) 
	{
        		if (e.getSource() == submitButton) 
		{
            		String name = nameField.getText();
            		String surname = surnameField.getText();
            		int age = Integer.parseInt(ageField.getText());
            		String gender = (String) genderComboBox.getSelectedItem();
            		String phone = phoneField.getText();
            		String email = emailField.getText();
            		String address = addressField.getText();
            		int numberOfPassengers = Integer.parseInt(passengerField.getText());
            		String selectedPackage = (String) packageComboBox.getSelectedItem();
            		String selectedDate = dateField.getText();
            		String selectedTicketType = (String) ticketTypeComboBox.getSelectedItem();

            // Calculate amount to pay based on selected package and ticket type
           			 if (selectedPackage.startsWith("Shimla"))
                			amountToPay = 18880;
            		else if (selectedPackage.startsWith("Kashmir"))
                			amountToPay = 35500;
            		else if (selectedPackage.startsWith("Kolkata"))
                			amountToPay = 10000;
            		else if (selectedPackage.startsWith("England"))
                			amountToPay = 28880;
            		else if (selectedPackage.startsWith("Thailand"))
                			amountToPay = 15500;
            		else if (selectedPackage.startsWith("New York"))
                			amountToPay = 567800;

            // Additional amount based on ticket type
            		if (selectedTicketType.equals("Economy"))
                			amountToPay += 2000;
            		else if (selectedTicketType.equals("First Class"))
                			amountToPay += 5000;

            // Display receipt
            		String receiptMessage = "Passenger Details:\n" +
                                     "Name: " + name + "\n" +
                                     "Surname: " + surname + "\n" +
                                     "Age: " + age + "\n" +
                                     "Gender: " + gender + "\n" +
                                     "Phone: " + phone + "\n" +
                                     "Email: " + email + "\n" +
                                     "Address: " + address + "\n\n" +
                                     "Selected Package: " + selectedPackage + "\n" +
                                     "Date: " + selectedDate + "\n" +
                                     "Number of Passengers: " + numberOfPassengers + "\n" +
                                     "Ticket Type: " + selectedTicketType + "\n" +
                                     "Amount to Pay: " + amountToPay+" Rs";

            		JOptionPane.showMessageDialog(this, receiptMessage, "Receipt", 				JOptionPane.INFORMATION_MESSAGE);

            // Close the application after displaying receipt
            		dispose();
        		}
    	}
	public static void main(String[] args) 
	{
        		new TravelManagementSystemGUI();
    	}
}
