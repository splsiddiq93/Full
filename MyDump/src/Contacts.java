import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

class Contacts {
	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the roll number and name");
		int rol_no = input.nextInt();
		String name = input.nextLine();
		map.put(rol_no, name);
		String list = map.toString().replace("{", "").replace("}", "");
		
		
		try (FileWriter fw = new FileWriter("D:\\testout.txt",true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.println(list);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Contacts.deleteContact();
		
	}
	public void deleteContact(int number){
		try{
			String line;
		BufferedReader in = new BufferedReader(new FileReader("D:\\testout.txt"));;
		while((line = in.readLine()) != null)
		{
		    System.out.println(line);
		}
		in.close();
		in.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
