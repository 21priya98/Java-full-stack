/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
		System.out.println("1-Admin");
		System.out.println("2-User");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		char ch;
		int c=0;
		Admin a=new Admin();
		User u=new User();
		
		a.lis();
	//	void meth(){
		do{
		    switch(num){
		        case 1:
		            if(c==0 )
		            a.check();
		              if(a.count>0)
		            a.service();
		            
		           if(c>0 && a.count==0)
		           a.check();
		            break;
		            
		            
		       case 2:
		           
		           u.check();
		
		           break;
		           
		       default:
		       System.out.println("give valid input");
		    }
		    
		    
		    System.out.println("do you want to continue with login page? y/n");
		    c++;
		    ch=sc.next().charAt(0);
		    
		    
		    
		}
		
		while(ch=='Y'|| ch=='y');
//	}
	

}
}
