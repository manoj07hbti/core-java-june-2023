package class_and_object;

public class Laptop {

    String laptopName="HP";
    String ram="8GB";
    String processor="i3";

    public static void main(String[] args) {
        Laptop laptop1=new Laptop();
        Laptop laptop2=new Laptop();
        Laptop laptop3=new Laptop();
        Laptop laptop4=new Laptop();
        Laptop laptop5=new Laptop();


        System.out.println("Laptop name is:"+laptop1.laptopName+"\t"+"RAM is:"+laptop1.ram+"\t"+"Its Processor is:"+laptop1.processor);
        System.out.println("Laptop name is:"+laptop2.laptopName+"\t"+"RAM is:"+ laptop2.ram+"\t"+"Its Processor is:"+laptop2.processor);
        System.out.println("Laptop name is:"+laptop3.laptopName+"\t"+"RAM is:"+ laptop3.ram+"\t"+"Its Processor is:"+laptop3.processor);
        System.out.println("Laptop name is:"+laptop4.laptopName+"\t"+"RAM is:"+ laptop4.ram+"\t"+"Its Processor is:"+laptop4.processor);
        System.out.println("Laptop name is:"+laptop5.laptopName+"\t"+"RAM is:"+ laptop5.ram+"\t"+"Its Processor is:"+laptop5.processor);


    }



}
