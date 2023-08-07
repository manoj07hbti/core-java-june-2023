package class_and_object;

public class Engineer {
//data member or properties
    String name="Shubham";
    String section="Civil";
    double perLastYear=87.58;

    public static void main(String[] args) {
        //ClassName objectName= new ClassName ;   DEFAULT CONSTRUCTOR

        Engineer engineer1=new Engineer();
        Engineer engineer2=new Engineer();
        Engineer engineer3=new Engineer();
        Engineer engineer4=new Engineer();
        Engineer engineer5=new Engineer();




        System.out.println("Engineer name is:"+engineer1.name+"\tsection is:"+engineer1.section+"\tPercentage is: " +engineer1.perLastYear);
        System.out.println("Engineer name is:"+engineer2.name+"\t section is:"+engineer2.section+"\tpercentage is:"+engineer2.perLastYear);
        System.out.println("Engineer name is:"+engineer3.name+"\tsection is:"+engineer3.section+"\tpercentage is "+engineer3.perLastYear);

        System.out.println("Engineer name is:"+engineer4.name+"\tsection is:"+engineer4.section+"\tPercentage is: " +engineer4.perLastYear);
        System.out.println("Engineer name is:"+engineer5.name+"\t section is:"+engineer5.section+"\tpercentage is:"+engineer5.perLastYear);

    }
}
