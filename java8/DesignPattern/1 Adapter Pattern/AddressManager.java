/*

Software Architecture Design Patterns in Java
by Partha Kuchana 

Auerbach Publications

*/


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;

public class AddressManager extends JFrame {
  public static final String newline = "\n";

  public static final String VALIDATE = "Validate";

  public static final String EXIT = "Exit";

  private JTextField txtCustomerName, txtAddress, txtZip, txtState;

  private JLabel lblCustomerName, lblAddress;

  private JLabel lblZip, lblState, lblType;

  private JComboBox cmbAddressType;

  private JLabel lblResult, lblResultValue;

  public AddressManager() {
    super(" Adapter Pattern - Example ");

    txtCustomerName = new JTextField(20);
    txtAddress = new JTextField(20);
    txtZip = new JTextField(10);
    txtState = new JTextField(10);

    cmbAddressType = new JComboBox();
    cmbAddressType.addItem(Customer.US);
    cmbAddressType.addItem(Customer.CANADA);

    lblCustomerName = new JLabel("Customer Name:");
    lblAddress = new JLabel("Address:");
    lblZip = new JLabel("Zip/PostalCode:");
    lblState = new JLabel("State/Province:");
    lblType = new JLabel("Address Type:");
    lblResult = new JLabel("Result:");
    lblResultValue = new JLabel("Click the Validate Button");

    //Create the open button
    JButton validateButton = new JButton(AddressManager.VALIDATE);
    validateButton.setMnemonic(KeyEvent.VK_V);
    JButton exitButton = new JButton(AddressManager.EXIT);
    exitButton.setMnemonic(KeyEvent.VK_X);
    ButtonHandler objButtonHandler = new ButtonHandler(this);

    validateButton.addActionListener(objButtonHandler);
    exitButton.addActionListener(new ButtonHandler());

    JPanel captionPanel = new JPanel();
    String captionText = "<html><b><font color=cc0000 size=+1>"
        + "Adapter Pattern Example</font></b></html>";

    JLabel captionLabel = new JLabel(captionText);
    captionPanel.add(captionLabel);

    JPanel UIPanel = new JPanel();

    //****************************************************
    GridBagLayout gridbag = new GridBagLayout();
    UIPanel.setLayout(gridbag);
    GridBagConstraints gbc = new GridBagConstraints();

    UIPanel.add(lblCustomerName);
    UIPanel.add(txtCustomerName);
    UIPanel.add(lblAddress);
    UIPanel.add(txtAddress);
    UIPanel.add(lblZip);
    UIPanel.add(txtZip);
    UIPanel.add(lblState);
    UIPanel.add(txtState);
    UIPanel.add(lblType);
    UIPanel.add(cmbAddressType);
    UIPanel.add(lblResult);
    UIPanel.add(lblResultValue);

    UIPanel.add(validateButton);
    UIPanel.add(exitButton);

    gbc.insets.top = 5;
    gbc.insets.bottom = 5;
    gbc.insets.left = 5;
    gbc.insets.right = 5;
    gbc.anchor = GridBagConstraints.WEST;

    gbc.gridx = 0;
    gbc.gridy = 0;
    gridbag.setConstraints(lblCustomerName, gbc);
    gbc.gridx = 1;
    gbc.gridy = 0;
    gridbag.setConstraints(txtCustomerName, gbc);
    gbc.gridx = 0;
    gbc.gridy = 1;
    gridbag.setConstraints(lblAddress, gbc);
    gbc.gridx = 1;
    gbc.gridy = 1;
    gridbag.setConstraints(txtAddress, gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    gridbag.setConstraints(lblZip, gbc);
    gbc.gridx = 1;
    gbc.gridy = 2;
    gridbag.setConstraints(txtZip, gbc);
    gbc.gridx = 0;
    gbc.gridy = 3;
    gridbag.setConstraints(lblState, gbc);
    gbc.gridx = 1;
    gbc.gridy = 3;
    gridbag.setConstraints(txtState, gbc);
    gbc.gridx = 0;
    gbc.gridy = 4;
    gridbag.setConstraints(lblType, gbc);
    gbc.gridx = 1;
    gbc.gridy = 4;
    gridbag.setConstraints(cmbAddressType, gbc);
    gbc.gridx = 0;
    gbc.gridy = 5;
    gridbag.setConstraints(lblResult, gbc);
    gbc.gridx = 1;
    gbc.gridy = 5;
    gridbag.setConstraints(lblResultValue, gbc);

    //gbc.anchor = GridBagConstraints.CENTER;
    gbc.insets.left = 2;
    gbc.insets.right = 2;
    gbc.insets.top = 40;

    JPanel buttonPanel = new JPanel();
    buttonPanel.add(validateButton);
    buttonPanel.add(exitButton);
    UIPanel.add(buttonPanel);
    gbc.gridx = 1;
    gbc.gridy = 6;
    gridbag.setConstraints(buttonPanel, gbc);

    //

    //Add the buttons and the log to the frame
    Container contentPane = getContentPane();
    contentPane.add(UIPanel, BorderLayout.CENTER);

    try {
      UIManager.setLookAndFeel(new WindowsLookAndFeel());
      SwingUtilities.updateComponentTreeUI(AddressManager.this);
    } catch (Exception ex) {
      System.out.println(ex);
    }

  }

  public static void main(String[] args) {
    JFrame frame = new AddressManager();

    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });

    //frame.pack();
    frame.setSize(350, 300);
    frame.setVisible(true);
  }

  public String getCustomerName() {
    return txtCustomerName.getText();
  }

  public String getAddress() {
    return txtAddress.getText();
  }

  public String getZip() {
    return txtZip.getText();
  }

  public String getAddrState() {
    return txtState.getText();
  }

  public String getAddressType() {
    return (String) cmbAddressType.getSelectedItem();
  }

  public void setResultValue(String str) {
    lblResultValue.setText(str);
  }

} // End of class AddressManager

class ButtonHandler implements ActionListener {
  AddressManager objAddressManager;

  public void actionPerformed(ActionEvent e) {
    String validationResult = null;

    //System.out.println(e.getActionCommand());
    if (e.getActionCommand().equals(AddressManager.EXIT)) {
      System.exit(1);
    }
    if (e.getActionCommand().equals(AddressManager.VALIDATE)) {
      String custName = objAddressManager.getCustomerName();
      String address = objAddressManager.getAddress();
      String zip = objAddressManager.getZip();
      String state = objAddressManager.getAddrState();
      String addressType = objAddressManager.getAddressType();

      //Create a customer object
      Customer objCustomer = new Customer(custName, address, zip, state,
          addressType);

      //Check if the address is valid
      if (objCustomer.isValidCustomerAddress()) {
        validationResult = "Valid customer data";
      } else {
        validationResult = "Invalid customer data";
      }

      objAddressManager.setResultValue(validationResult);
    }
  }

  public ButtonHandler() {
  }

  public ButtonHandler(AddressManager inObjAddressManager) {
    objAddressManager = inObjAddressManager;
  }

} // End of class ButtonHandler

class USAddress extends AddressValidator {

  public boolean isValidAddress(String inp_address, String inp_zip,
      String inp_state) {

    if (inp_address.trim().length() < 10)
      return false;
    if (inp_zip.trim().length() < 5)
      return false;
    if (inp_zip.trim().length() > 10)
      return false;
    if (inp_state.trim().length() != 2)
      return false;

    return true;
  }
}// end of class

class Customer {
  public static final String US = "US";

  public static final String CANADA = "Canada";

  private String address;

  private String name;

  private String zip, state, type;

  public boolean isValidCustomerAddress() {
    if (type.equals(Customer.US)) {
      USAddress us = new USAddress();
      return us.isValidAddress(address, zip, state);
    }
    if (type.equals(Customer.CANADA)) {
      CAAddress objCAAddress = new CAAddress();
      CAAddressAdapter adapter = new CAAddressAdapter(objCAAddress);
      return adapter.isValidAddress(address, zip, state);
    }
    return true;
  }

  public Customer(String inp_name, String inp_address, String inp_zip,
      String inp_state, String inp_type) {

    name = inp_name;
    address = inp_address;
    zip = inp_zip;
    state = inp_state;
    type = inp_type;
  }
}// end of class

class CAAddressAdapter extends AddressValidator {

  private CAAddress objCAAddress;

  public CAAddressAdapter(CAAddress address) {
    objCAAddress = address;
  }

  public boolean isValidAddress(String inp_address, String inp_zip,
      String inp_state) {

    return objCAAddress
        .isValidCanadianAddr(inp_address, inp_zip, inp_state);
  }
}// end of class

class CAAddress {

  public boolean isValidCanadianAddr(String inp_address, String inp_pcode,
      String inp_prvnc) {

    if (inp_address.trim().length() < 15)
      return false;
    if (inp_pcode.trim().length() != 6)
      return false;
    if (inp_prvnc.trim().length() < 6)
      return false;

    return true;
  }
}// end of class

abstract class AddressValidator {
  public abstract boolean isValidAddress(String inp_address, String inp_zip,
      String inp_state);
}// end of class
