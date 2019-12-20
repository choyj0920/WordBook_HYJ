package WordBook_DATA;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Worddata {
	
	static ArrayList<String> userlist=new ArrayList<String>();
	
	String filename;
	
	LinkedHashMap<String, Word> wordbook=new LinkedHashMap<String, Word>();
	
	static void Loaduserlist();
}
