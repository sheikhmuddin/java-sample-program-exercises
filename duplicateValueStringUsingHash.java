package JavaDemoprogramTissa;

import java.util.HashSet;

public class duplicateValueStringUsingHash {

	public static void main(String[] args) {
		
		String[] arr= {"Java","C","C++","Python","Java"};
		
	HashSet<String>langs=new HashSet<>();
	
	
//	System.out.println(langs.add("Java"));
//	System.out.println(langs.add("Java"));
//	System.out.println(langs.add("Python"));
	
//	langs.add("Java");
//	langs.add("Python");
//	langs.add("Java");
	
	boolean flag=false;
//	
	for(String l:arr) {
		//System.out.println(langs.add(l));
		
		if(langs.add(l)==false) {
			System.out.println("Found Duplicate Element: " +l);
			flag=true;
		}
			
	}
	if(flag==false)
	{
		System.out.println("Found  No Duplicate Element: ");
	}
	
	
		
	}

}
