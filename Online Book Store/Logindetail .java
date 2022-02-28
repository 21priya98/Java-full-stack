public class Logindetail{
    
    
    String  fName;
 String lName;
 String email;
 String Username;
 String Password;
 String cPassword;
  
  Logindetail(){
       
   }
  public Logindetail(String fName,String lName,String email,String Username,String Password,String cPassword){
     super();
      this.fName=fName;
      this.lName=lName;
      this.email=email;
      this.Username=Username;
      this.Password=Password;
      this.cPassword=cPassword;
      
   }  
   String  bId;
 String bName;
 String bDept;
 String bEdition;
 String bAmount;
  
  
   public Logindetail(String bId,String bName,String bDept,String bEdition,String bAmount){
     super();
      this.bId=bId;
      this.bName=bName;
      this.bDept=bDept;
      this.bEdition=bEdition;
      this.bAmount=bAmount;
   }
   
  
 public Logindetail(String bId,String bName,String bDept,String bEdition){

     this.bId=bId;
     this.bName=bName;
     this.bDept=bDept;
     this.bEdition=bEdition;
 }

public Logindetail(String bName,String bEdition,String bAmount){

     
     this.bName=bName;
     this.bEdition=bEdition;
     this.bAmount=bAmount;
 }
public  String toString(){
     
    return (bId+" "+bName+" "+bDept+" "+bEdition+" "+bAmount);
}
}