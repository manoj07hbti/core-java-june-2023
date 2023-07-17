package conditional_statements;

public class Assignment_of_if {
    public static void main(String[] args) {
        int marks=55;
        if(marks>=60){
            System.out.println("student get the 1st division at : " + marks);
        }

         marks=65;
        if(marks>=60){
            System.out.println("student get the 1st division at : " + marks);
        }

        marks=19;
        if(marks>=33){
            System.out.println("student should be pass in class : " + marks);
        }

        marks=89;
        if(marks>=33){
            System.out.println("student should be pass in class : " + marks);
        }

        int price=2000;
        if(price<5000){
            System.out.println("price of the product is is avarage : " + price);
        }
        price=7200;
        if(price>=5000){
            System.out.println("price of the product is costly : " + price);
        }

        String country="India";
        if(country=="India"){
            System.out.println("person is belongs from : " + country);
        }

        country="India";
        if(country=="England"){
            System.out.println("person is  belongs form : " + country);
        }




    }
}
