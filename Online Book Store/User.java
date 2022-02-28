import java.util.*;
class User{
    
    
    ArrayList<Logindetail> list=new ArrayList<>();
    ArrayList<Logindetail> list1=new ArrayList<>();
    ArrayList<Logindetail> list2=new  ArrayList<>();
     ArrayList<Logindetail> list3=new  ArrayList<>();
    Scanner sc=new Scanner(System.in);
    
    
    void lis(){
        Logindetail l1=new Logindetail("ab","cd","abc@gmail.com","abc","a123","a123");
        Logindetail l2=new Logindetail("xy","z","xyz@gmail.com","xyz","x456","x456");
        Logindetail l3=new Logindetail("pq","rs","pqr@gmail.com","pqr","p789","p789");
        
        list2.add(l1);
        list2.add(l2);
        list2.add(l3);
        Logindetail b1=new Logindetail("it1","web technology","it","third","300");
    Logindetail b2=new Logindetail("it2","software engg","it","second","400");
    Logindetail b3=new Logindetail("cs1","microprocessor","cse","second","500");
    Logindetail b4=new Logindetail("cs2","ds","cse","third","450");
      Logindetail b5=new Logindetail("ec1","circuit","ece","second","300");
     Logindetail b6=new Logindetail("ec2","control system","ece","third","300");
     Logindetail b7=new Logindetail("ee1","electrical machines","eee","second","350");
      Logindetail b8=new Logindetail("ee2","power system","eee","third","300");
     list.add(b1);
     list.add(b2);
     list.add(b3);
     list.add(b4);
     list.add(b5);
     list.add(b6);
     list.add(b7);
     list.add(b8);
     
     
    Logindetail c1=new Logindetail("it11","dBMS","it","second");
    Logindetail c2=new  Logindetail("it12","c progtamming","it","second");
    Logindetail c3=new  Logindetail("cs11","computer archietecture","cse","third");
     Logindetail c4=new Logindetail("cs12","computer networks","cse","first");
      Logindetail c5=new Logindetail("ec11","embedded system","ece","second");
     Logindetail c6=new Logindetail("ec12","analog electronics","ece","third");
     Logindetail c7=new Logindetail("ee11","digital electronics","eee","second");
      Logindetail c8=new Logindetail("ee12","power system","eee","third");
    
    list1.add(c1);
    list1.add(c2);
    list1.add(c3);
    list1.add(c4);
     list1.add(c5);
     list1.add(c6);
     list1.add(c7);
     list1.add(c8);
     
  
    }
    

   void check(){
       lis();
       char ch;
       int c1=0,c2=0;
       System.out.println("1-Login");
       System.out.println("2-Register");
       
       int num=sc.nextInt();
       do{
		    switch(num){
		        case 1:
		            if(c1==0)
		            login();
		            else
		            service();
		            
		           break;
		            
		       case 2:
		           if(c2==0)
		           register();
		           else
		           service();
		           break;
		       default:
		       System.out.println("give valid input");
		    }
		    
		    System.out.println("do you want to continue with All service? y/n");
		    c1++;
		    c2++;
		    
		    ch=sc.next().charAt(0);
		    
		}
		while(ch=='Y'|| ch=='y');
   }
   
   void login(){
        System.out.println("Username");
       String us=sc.next();
        System.out.println("Password");
       String pwd=sc.next();
       int c=0;
       
       for(Logindetail i:list2){
           if(i.Username.equals(us) && i.Password.equals(pwd)){
        c++;
           
          service();
           }
       }
            if(c==0){
            System.out.println("Invalid username or password");
             System.exit(0); 
            }
       
   }
   
   void register(){
       System.out.println("First name:");
       String fName=sc.next();
        System.out.println("Last name:");
       String lName=sc.next();
        System.out.println("email:");
       String email=sc.next();
        System.out.println("Username:");
       String  us=sc.next();
        System.out.println("Password:");
       String pwd=sc.next();
        System.out.println("Confirm Password:");
       String cpwd=sc.next();
       if(pwd.equals(cpwd)){
       
       
       Logindetail l=new Logindetail(fName,lName,email,us,pwd,cpwd);
       list2.add(l);
       System.out.println("Registered Successfully.....");
       }
       else
       System.out.println("check your password");
   }
   
   void service(){
       char ch;
     //  System.out.println("*****Service*****");
       System.out.println("1-Book Categories");
       System.out.println("2-Buy a Book");
       System.out.println("3-Book History");
       int num=sc.nextInt();
       
       do{
		    switch(num){
		        case 1:
		            category();
		            break;
		            
		       case 2:
		            buy();
		           break;
		       case 3:
		            history();
		           break;
		       default:
		       System.out.println("give valid input");
		    }
		    
		    System.out.println("do you want to continue with  current service? y/n");
		    ch=sc.next().charAt(0);
		    
		}
		while(ch=='Y'|| ch=='y');
   }
   
   void category(){
       char ch1;
          //  System.out.println("*****Department******");
               System.out.println("1-IT");
               System.out.println("2-CSE");
               System.out.println("3-ECE");
               System.out.println("4-EEE");
               int n=sc.nextInt();
               
               do{
             switch(n){
                 
                 case 1:
                     
                    it("it","paid");
                     break;
                case 2:
                     cse("cse","paid");
                      break;
                case 3:
                    ece("ece","paid");
                    break;
                case 4:
                      eee("eee","paid");
                      break;
                      
                default:
                   System.out.println("give valid input");
             }
             System.out.println("Do you want to continue with book type?y/n");
             ch1=sc.next().charAt(0);
         }
               while(ch1=='Y' || ch1=='y');
               
       
   }
   void it( String d,String str){
       System.out.println("paid or free");
        String s=sc.next();
    
       
        if(s.equals(str) ){
      
        for(Logindetail i:list){
            
        if(i.bDept.equals(d))
     System.out.println(i);
        }
        }
        
        else{
            
            for(Logindetail i:list1){
                
            if(i.bDept.equals(d))
            System.out.println(i.bId+" "+i.bName+" "+i.bDept+" "+i.bEdition);
        }
        }
        
        
        }
        
         void cse(String d,String str){
        System.out.println("paid or free");
        String s=sc.next();
        if(s.equals(str)){
        for(Logindetail i:list){
                 if(i.bDept.equals(d))
           System.out.println(i);
        }
        }
        else{
            for(Logindetail i:list1){ 
                if(i.bDept.equals(d))
            System.out.println(i.bId+" "+i.bName+" "+i.bDept+" "+i.bEdition);
        }
        }
        
        }
        
        void ece( String d,String str){
        System.out.println("paid or free");
        String s=sc.next();
        if(s.equals(str)){
        for(Logindetail i:list){
                 if(i.bDept.equals(d))
           System.out.println(i);
        }
        }
        else{
            for(Logindetail i:list1){ 
                if(i.bDept.equals(d))
            System.out.println(i.bId+" "+i.bName+" "+i.bDept+" "+i.bEdition);
        }
        }
        
        }
        
        void eee( String d, String str){
        System.out.println("paid or free");
        String s=sc.next();
        if(s.equals(str)){
        for(Logindetail i:list){
                 if(i.bDept.equals(d))
           System.out.println(i);
        }
        }
        else{
            for(Logindetail i:list1){ 
                if(i.bDept.equals(d))
            System.out.println(i.bId+" "+i.bName+" "+i.bDept+" "+i.bEdition);
        }
          }
        
      }    
   void buy(){
       System.out.println("enter bookID you want:");
          String id=sc.next();
          for(Logindetail i:list){
              if(i.bId.equals(id))
                  list3.add(new Logindetail(i.bName,i.bEdition,i.bAmount));
              
          }
          for(Logindetail i:list1){
              if(i.bId.equals(id))
               list3.add(new Logindetail(i.bName,i.bEdition,i.bAmount));
                
              
          }
      
       
   }
   void history(){
       for(Logindetail i:list3)
              System.out.println(i.bName+" "+i.bEdition+" "+i.bAmount);
          
   }
}