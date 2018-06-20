



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

// Login class which takes a user name and passed it to client class
public class Login implements ActionListener{
  JFrame frame1;
  JTextField tf;
  JButton button;
  JLabel heading;
  JLabel label;
  public static void main(String[] args){
  new Login();
  }
  public Login(){
  frame1 = new JFrame("Login Page");
  tf=new JTextField();
  button=new JButton("Login");
  heading=new JLabel("Chat Server");
  heading.setFont(new Font("Impact", Font.BOLD,40));
  label=new JLabel("Enter you Login Name");
  label.setFont(new Font("Serif", Font.PLAIN, 24));
  JPanel panel = new JPanel();
 