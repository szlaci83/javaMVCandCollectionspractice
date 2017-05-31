package view;
import java.awt.event.ActionListener;
import javax.swing.*;


public class carDealer extends JFrame{
	private JTextField personName = new JTextField(20);
	private JTextField carReg = new JTextField(20);
	private JButton buyButton = new JButton("Buy");
	private JTextField respond = new JTextField(10);
	
	
	public carDealer(){
		JPanel carDealPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,200);
		
		carDealPanel.add(personName);
		carDealPanel.add(carReg);
		carDealPanel.add(buyButton);
		carDealPanel.add(respond);
		
		this.add(carDealPanel);
		
	}
	
	public String getPersonName(){
		return personName.getText();
	}
	public String getCarReg(){
		return carReg.getText();
	}
	public String getRespond(){
		return respond.getText();
	}
	public void setRespond(String res){
	      respond.setText(res);
	}
	public void buyCarDealerListener(ActionListener listenForBuyButton ){
		buyButton.addActionListener(listenForBuyButton);
	}
	
	public void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
