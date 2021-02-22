package JavaDemoprogramTissa;

public class duplicateValueString {

	public static void main(String[] args) {
		
	 String[] arr= {"Java","C","C++","Python","Java"};
	 boolean flag=false;
	 
	 for(int i =0; i<arr.length-1; i++) {
		 for(int j=i+1;j<arr.length;j++) {
			 if(arr[i]==arr[j]) {
				 System.out.println("The Duplicates Element is: "+arr[j]);
				 flag=true;
			 }
		 }
	 }
	 if(flag==false)
	 {
		 System.out.println("Duplicate Element  not found");
	 }
		
	}

}
