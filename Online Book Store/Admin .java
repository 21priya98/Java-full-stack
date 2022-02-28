import java.util.*;
class Admin{
    public static int count=0;
    String us="admin";
    String pwd="admin123";
    ArrayList<Books> list=new ArrayList<>();
    ArrayList<Books> list1=new ArrayList<>();
    ArrayList<Books> list2=new ArrayList<>();
    
    Scanner sc=new Scanner(System.in);
   // Paidbook pb=new Paidbook();
   void lis(){
    Books b1=new Books("it1","web technology","it","third","300");
    Books b2=new Books("it2","software engg","it","second","400");
    Books b3=new Books("cs1","microprocessor","cse","second","500");
    Books b4=new Books("cs2","ds","cse","third","450");
     Books b5=new Books("ec1","circuit","ece","second","300");
     Books b6=new Books("ec2","control system","ece","third","300");
     Books b7=new Books("ee1","electrical machines","eee","second","350");
     Books b8=new Books("ee2","power system","eee","third","300");
     list.add(b1);
     list.add(b2);
     list.add(b3);
     list.add(b4);
     list.add(b5);
     list.add(b6);
     list.add(b7);
     list.add(b8);
     
     
    Books c1=new Books("it11","web technology","it","first");
    Books c2=new Books("it12","software engg","it","second");
    Books c3=new Books("cs11","microprocessor","cse","first");
    Books c4=new Books("cs12","computer networks","cse","first");
      Books c5=new Books("ec11","embedded system","ece","second");
     Books c6=new  Books("ec12","analog electronics","ece","third");
    Books c7=new Books("ee11","digital electronics","eee","second");
      Books c8=new Books("ee12","power system","eee","third");
    
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
    System.out.println("Username");
    String s1=sc.next();
    System.out.println("Password");
    String s2=sc.next();
    int c=0;

             if(us.equals(s1) && pwd.equals(s2)){
                count++;
                 service();
             }
                   else
             System.out.println("Invalid Username or Password");
  } 
   
   void service(){
           char ch,ch1;
        
             System.out.println("1-Categories of Books");
         System.out.println("2-Update");
         
         System.out.println("3-Add");
         
         System.out.println("4-Delete");
         int num=sc.nextInt();
              
          do{ 
             
        
         
             switch(num){
                 
                 case 1:
                     
                     category();
                     break;
                case 2:
                    update();
                    break;
                case 3:
                    add();
                    break;
                case 4:
                    delete();
                    break;
                default:
                   System.out.println("give valid input");
             }
             System.out.println("Do you want to continue with current service? y/n");
             ch=sc.next().charAt(0);
         }
         while(ch=='Y'|| ch=='y');
             
             
    } 
        void category(){
             char ch1;
        
              
                     
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
             System.out.println("Do you want to continue with book type? y/n");
             ch1=sc.next().charAt(0);
         }
               while(ch1=='Y' || ch1=='y');
               
         }    
               void  update(){
                   
                   System.out.println("enter book id you want to update:");
                   String id=sc.next();
                   System.out.println("book name:");
                   String name=sc.next();
                   System.out.println("dept:");
                   String dept=sc.next();
                   System.out.println("edition:");
                   String edi=sc.next();
                   System.out.println("amount:");
                   String amt=sc.next();
                   for(Books i:list)
                   {
                       if(i.bId.equals(id)){
                     i.bName=name;
                     i.bDept=dept;
                     i.bEdition=edi;
                     i.bAmount=amt;
                       
                     }
               } 
               for(Books i:list1){
                   if(i.bId.equals(id)){
                     i.bName=name;
                     i.bDept=dept;
                     i.bEdition=edi;
                     
                       
                     }
               }
               
             System.out.println("Updated Successfully.....");  
         }
         
         void delete(){
             
            System.out.println("enter book id you want to delete");
             String id=sc.next();
             for(Books i:list){
                 
                 if(i.bId.equals(id))
                    list.remove(i);
             }
             for(Books i:list1){
                 
                 if(i.bId.equals(id))
                  list1.remove(i);
             }
             
             System.out.println("Deleted Successfully.....");
         }
         
         void add(){
             System.out.println("enter book id:");
                   String id=sc.next();
                   System.out.println("book name:");
                   String name=sc.next();
                   System.out.println("dept:");
                   String dept=sc.next();
                   System.out.println("edition:");
                   String edi=sc.next();
                   System.out.println("amount:");
                   String amt=sc.next();
                   System.out.println("Type of Book -->paid or free?");
                   String type=sc.next();
                   
                   Books b=new Books(id,name,dept,edi,amt);
                  String ss="paid";
                   Books bb=new Books(id,name,dept,edi);
                
                if(type.equals(ss))
                    list.add(b);
                else
                    list1.add(bb);
               System.out.println("Inserted  Successfully....."); 
                
         }
          void it( String d,String str){
       System.out.println("paid or free");
        String s=sc.next();
    
       
        if(s.equals(str)){
      
        for(Books i:list){
            
        if(i.bDept.equals(d))
     System.out.println(i);
        }
        }
        
        else{
            for(Books i:list1){
                
            if(i.bDept.equals(d))
            System.out.println(i.bId+" "+i.bName+" "+i.bDept+" "+i.bEdition);
        }
        }
        
        }
        
         void cse(String d,String str){
        System.out.println("paid or free");
        String s=sc.next();
        if(s.equals(str)){
        for(Books i:list){
                 if(i.bDept.equals(d))
           System.out.println(i);
        }
        }
        else{
            for(Books i:list1){ 
                if(i.bDept.equals(d))
            System.out.println(i.bId+" "+i.bName+" "+i.bDept+" "+i.bEdition);
        }
        }
        
        }
        
        void ece( String d,String str){
        System.out.println("paid or free");
        String s=sc.next();
        if(s.equals(str)){
        for(Books i:list){
                 if(i.bDept.equals(d))
           System.out.println(i);
        }
        }
        else{
            for(Books i:list1){ 
                if(i.bDept.equals(d))
            System.out.println(i.bId+" "+i.bName+" "+i.bDept+" "+i.bEdition);
        }
        }
        
        }
        
        void eee( String d, String str){
        System.out.println("paid or free");
        String s=sc.next();
        if(s.equals(str)){
        for(Books i:list){
                 if(i.bDept.equals(d))
           System.out.println(i);
        }
        }
        else{
            for(Books i:list1){ 
                if(i.bDept.equals(d))
            System.out.println(i.bId+" "+i.bName+" "+i.bDept+" "+i.bEdition);
        }
          }
        
      }    
      
     
  }
  
