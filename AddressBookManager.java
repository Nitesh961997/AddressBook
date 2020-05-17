package Com.adressbook;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class AddressBookManager 
{
	Scanner in=new Scanner(System.in);
	private static Formatter x;
	private static Scanner y;
	private static String choice;
	 public void newFile(String name)
	 {
		 try {
				x=new Formatter(name);
			}
			catch(Exception e)
			{
				System.out.println("file not created");
			}
			System.out.println("file created"+name);
			MainClass.displayMenu();
	 }
	 public void openFile(String name)
	 {
		 try 
		 {
			 y=new Scanner(new File(name));
		 }
		 catch(Exception e)
		 {
			 System.out.println("file not found");
		 }
	 }
	 public void readFile(String name)
	 {
		 File file=new File("name");
		 Scanner scan = null;
		
		 while(y.hasNext())
		
		 {
			 System.out.println("scan.nextLine");
			 String firstName=y.next();
			 String	lastName=y.next();
			 String phoneNumber=y.next();
			 System.out.printf("%s  %s  %s\n",firstName,lastName,phoneNumber);
		 }
	 }
	 public void closeFile(String name)
	 {
		 y.close();
		 MainClass.displayMenu();
	 }
	 //add New Data
	 public void addNew()
	 {
		 Person person=new Person();
		 System.out.println("enter your first name");
		 String fName=in.nextLine();
		 person.setFirstName(fName);
		 System.out.println("enter your last name");
		 String lName=in.nextLine();
		 person.setLastName(lName);
		 System.out.println("enter your mobile No");
		 long mNumber=in.nextLong();
		 person.setPhoneNumber(mNumber);
		 System.out.println(person.getFirstName());
		 System.out.println("what is name of file to add ");
		 String fileDir=in.next();
		 try {
			FileWriter fw= new FileWriter(fileDir,true);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			 pw.println(person.getFirstName()+","+person.getLastName()+","+person.getPhoneNumber());
			 pw.flush();
			 pw.close();
//			 JOptionPane.showMessageDialog(null,"data saved");
			 System.out.println("data saved");
			 MainClass.displayMenu();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
	 }
	 public void saveAs()
	 {
		 
	 }
	 public void save()
	 {
		 
	 }
	 public void edit()
	 {
		 
	 }
	 public void remove()
	 {
		 
	 }
	 public void singleAdressBookOpenAtATime()
	 {
		 
	 }
	 public void Trackrecorf()
	 {
		 
	 }
//	 public static void mainMenu()
//	 {
//		 MainClass.displayMenu();
//	 }
}