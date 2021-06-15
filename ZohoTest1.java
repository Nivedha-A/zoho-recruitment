import java.util.Scanner;


public class ZohoTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		
		int mid=(input.length()+1)/2;
		String str1=input.substring(0,mid-1);
		System.out.println(str1+" str1" );
	   String str2=input.substring(mid-1);
	System.out.println(str2+" str2" );
		String str3=str2+str1;
		System.out.println(str3);
		int k=0;
		for(int i=str3.length()-1;i>=0;i--){
			for(int j=str3.length()-1;j>=0;j--){
				
			 
			  if((i+j) <= str3.length()-1){
				  
					  System.out.print(str3.charAt(str3.length()-j-1));
					  
			  }
			  else
				  System.out.print(" ");
			}
			System.out.println("");
		}
			
	}

}
