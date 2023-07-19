package conditionalstmt;

public class DemoOrOP {
    public static void main(String[] args) {

        String laptopBrand="Dell";
        int ram=8;
//TRUE || TRUE =TRUE
        if (laptopBrand=="Dell" || ram==8)
        {
            System.out.println("Configuration of Laptop is good");

        }
        else {

            System.out.println("Configuration of laptop is not good");
        }





        //FALSE|| TRUE =TRUE
        laptopBrand="samsung";
        if (laptopBrand=="Dell" || ram==8)
        {
            System.out.println("Configuration of Laptop is good");

        }
        else {

            System.out.println("Configuration of laptop is not good");
        }


        //TRUE || FALSE =TRUE
        laptopBrand="Dell";
        ram=16;
        if (laptopBrand=="Dell" || ram==8)
        {
            System.out.println("Configuration of Laptop is good");

        }
        else {

            System.out.println("Configuration of laptop is not good");
        }





        //FALSE || FALSE =FALSE
        laptopBrand="HP";
        ram=4;
        if (laptopBrand=="Dell" || ram==8)
        {
            System.out.println("Configuration of Laptop is good");

        }
        else {

            System.out.println("Configuration of laptop is not good");
        }

    }
}
