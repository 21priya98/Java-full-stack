import java.util.*;
public class Books{

String  bId;
 String bName;
 String bDept;
 String bEdition;
 String bAmount;
  
  Books(){
       
   }
   public Books(String bId,String bName,String bDept,String bEdition,String bAmount){
     super();
      this.bId=bId;
      this.bName=bName;
      this.bDept=bDept;
      this.bEdition=bEdition;
      this.bAmount=bAmount;
   }
   
  
 public Books(String bId,String bName,String bDept,String bEdition){

     this.bId=bId;
     this.bName=bName;
     this.bDept=bDept;
     this.bEdition=bEdition;
 }


public  String toString(){
     
    return (bId+" "+bName+" "+bDept+" "+bEdition+" "+bAmount);
}

}