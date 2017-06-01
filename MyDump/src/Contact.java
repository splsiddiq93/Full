import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;
public class Contact {
private String nameOfThePerson;
private int mobileNumber;
LinkedList contacts = new LinkedList<>();
Scanner input = new Scanner(System.in);
public void addContacts(){
	System.out.println("Enter the number");
	mobileNumber = input.nextInt();
	contacts.add(mobileNumber);
	try(FileWriter fw = new FileWriter("D:\\testout.txt", true);
		    BufferedWriter bw = new BufferedWriter(fw);
		    PrintWriter out = new PrintWriter(bw))
		{
		    out.println(contacts.toString());
		} catch (IOException e) {
		    e.printStackTrace();
		}
}

public void deleteContacts(int mobileNumber){
	
}

public static void main(String args[]){
	Contact obj = new Contact();
	obj.addContacts();
}


}
