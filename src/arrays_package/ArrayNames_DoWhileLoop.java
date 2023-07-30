package arrays_package;

public class ArrayNames_DoWhileLoop {
    public static void main(String[] args) {

 String ArrayNames[]={"Gunjan","Rakhi","kirti","Reshma","Dimpal"};
 int names=0;
 do{
     System.out.println("Names Inside The Do While Loop :"+ArrayNames[names]);
     names++;
 }while(names<ArrayNames.length);
    }
}
