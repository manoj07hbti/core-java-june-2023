package class_and_object.Parameterized_Constructor_with_or_without_Get_Set;

public class Laptop {
    //Data Member
    String Laptop_name;
    String Laptop_company;
    String Laptop_ram;
    String Laptop_rom;
    double Laptop_price;

    //Parameterized Constructor

    public Laptop(String laptop_name, String laptop_company, String laptop_ram, String laptop_rom, double laptop_price) {
        Laptop_name = laptop_name;
        Laptop_company = laptop_company;
        Laptop_ram = laptop_ram;
        Laptop_rom = laptop_rom;
        Laptop_price = laptop_price;
    }
    //Getter and Setter


    public String getLaptop_name() {
        return Laptop_name;
    }

    public void setLaptop_name(String laptop_name) {
        Laptop_name = laptop_name;
    }

    public String getLaptop_company() {
        return Laptop_company;
    }

    public void setLaptop_company(String laptop_company) {
        Laptop_company = laptop_company;
    }

    public String getLaptop_ram() {
        return Laptop_ram;
    }

    public void setLaptop_ram(String laptop_ram) {
        Laptop_ram = laptop_ram;
    }

    public String getLaptop_rom() {
        return Laptop_rom;
    }

    public void setLaptop_rom(String laptop_rom) {
        Laptop_rom = laptop_rom;
    }

    public double getLaptop_price() {
        return Laptop_price;
    }

    public void setLaptop_price(double laptop_price) {
        Laptop_price = laptop_price;
    }


    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Inspiron 15 3000", "Dell", "8GB", "1TB", 35000);
        System.out.println("Laptop is :" + laptop1.Laptop_name + " Company is :" + laptop1.Laptop_company + " Ram is :" + laptop1.Laptop_ram + " Rom is :" + laptop1.Laptop_rom + "Price is :" + laptop1.Laptop_price);


        //Getter And Setter Method

        System.out.println("Data after used setter method");
        laptop1.setLaptop_name("xyz");
        laptop1.setLaptop_company("pqr");
        laptop1.setLaptop_ram("abc");
        laptop1.setLaptop_rom("mno");
        laptop1.setLaptop_price(00);

        System.out.println("Laptop is :" + laptop1.Laptop_name + " Company is :" + laptop1.Laptop_company + " Ram is :" + laptop1.Laptop_ram + " Rom is :" + laptop1.Laptop_rom + "Price is :" + laptop1.Laptop_price);

    }
}
