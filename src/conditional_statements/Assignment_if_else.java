package conditional_statements;

public class Assignment_if_else {
    public static void main(String[] args) {
        //if and else
        int marks=70;
        if(marks>=60){
            System.out.println("student get 1st division at percentage : " +marks);
        }else{
            System.out.println("student not get first division");
        }
        marks=33;
        if(marks<=33){
            System.out.println("student not cleared exam at : " + marks);
        }else{
            System.out.println("student cleared exam at : " + marks);
        }
        int price=5500;
        if(price>=5000){
            System.out.println("price of the product is higher then it greater than 5000 : " + price);
        }else{
            System.out.println("price of the product is avarage than it is 5000 : " + price);
        }

        int price1=4500;
        if(price1>=5000){
            System.out.println("price of the product is higher then it greater than 5000 : " + price1);
        }else{
            System.out.println("price of the product is avarage than it is 5000 : " + price1);
        }
        String country="India";
        if(country=="India"){
            System.out.println("person is belongs from : " +country);
        }else{
            System.out.println("person is not belongs from : " +country);
        }



    }
}
