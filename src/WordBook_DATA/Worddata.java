package WordBook_DATA;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Worddata {
	
	static LinkedHashMap<String,User> userlist=new LinkedHashMap<String, User>();
	
	static String filename="words.txt";
	
	static LinkedHashMap<String, Word> wordBook=new LinkedHashMap<String, Word>();
	
	LinkedHashMap<String, Word> myWordBook=new LinkedHashMap<String, Word>();
	
	
	static void LoadUserList() {
		File load=new File("userdata/userlist.txt");
		try {
			Scanner scan= new Scanner(load);
			while(scan.hasNext()) {
				User newuser= new User(scan.nextLine().trim(),
						scan.nextLine().trim(),scan.nextInt());
				scan.nextLine();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	static void saveUserList() {
		File file=new File("userdata/userlist.txt");
		//颇老 按眉 积己  
	    try {
	      FileWriter fw = new FileWriter(file);	      
	      for(User u: userlist.values()) {
	    	  fw.write(u.toString());
	      }
	      fw.close();
	      
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}
	boolean login(String iD,String pW) {
		if(userlist.containsKey(iD) &&
				userlist.get(iD).userPw.equals(pW)) {
			return true;
		}
		else
			return false;
	}
	
	Worddata(String username){
		String filepath= "userdata/"+username+".txt";
		
	}
	
	
	
}
