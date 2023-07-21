package conditional_package;

public class DemoOrOperatorClass {
    public static void main(String[] args) {

        String brand = "Dell";
        String ram = "8.0";
        //1. TRUE  || TRUE = TRUE
        if (brand == "Dell || ram>8") {
            System.out.println(" True: good configuration.....");
        } else {
            System.out.println("good configuration.... ");
        }
        //2. TRUE || FALSE= TRUE
        String brand2 = "Dell";
        String ram2 = "7.0";
        if (brand2 == "Dell || ram2 >7.0") {
            System.out.println("good configuration....");
        } else {
            System.out.println("good configuration....");
        }


        //3. FALSE || TRUE= TRUE
        String Brand3 = "Apple";
        double ram3 = 7.0;
        if (Brand3 == "Dell" || ram3 > 7.0) {
            System.out.println("True: good configuration...");
        } else {
            System.out.println("True: good configuration....");
        }
        //4.FALSE & FALSE = FALSE
        String Brand4 = "Sumsung";
        double Ram4 = 8.0;
        if (Brand4 == "TRUE || Ram4>9.0..."){
            System.out.println("TRUE: good configuration...");
    } else{
            System.out.println("FALSE: good configuration....");
        }

    }

}







