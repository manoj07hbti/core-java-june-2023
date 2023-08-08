package class_and_object;

public class Laptop {

    String LapCom = "MSI";
    String LapMod = "Msi123w";
    String LapRam = "8GB";
    String LapRom = "1TB";
    int LapPri = 87000;

    public static void main(String[] args) {
        //ClassName objName=new ClassName() DEFAULT CONSTRUCTOR

        Laptop laptop = new Laptop();
        //object.propertyName


        System.out.println("Printing LapCom:" + laptop.LapCom);
        System.out.println("Printing LapMod:" + laptop.LapMod);
        System.out.println("Printing LapRam:" + laptop.LapRam);
        System.out.println("Printing LapRom:" + laptop.LapRom);
        System.out.println("Printing LapPri:" + laptop.LapPri);

        Laptop laptop1 = new Laptop();
        //object.propertyName
        System.out.println("Printing LapCom:" + laptop1.LapCom + " Printing LapMod:" + laptop1.LapMod + " Printing LapRam:" + laptop1.LapRam + " Printing LapRom:" + laptop1.LapRom + " Printing LapPri:" + laptop1.LapPri);
    }
}
