package WordBook_DATA;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Worddata {
	
	static ArrayList<String> userlist=new ArrayList<String>();
	
	String filename;
	
	LinkedHashMap<String, Word> wordbook=new LinkedHashMap<String, Word>();
	
	static void LoadUserList() {
		File load=new File("userdata/userlist.txt");
		try {
			Scanner scan= new Scanner(load);
			while(scan.hasNext()) {
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	static void saveUserList() {
		File load=new File("userdata/userlist.txt");
		
	}
}
