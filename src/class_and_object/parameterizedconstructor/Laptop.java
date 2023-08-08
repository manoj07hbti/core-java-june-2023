package class_and_object.parameterizedconstructor;

public class Laptop {
    String laptopName;
    String ram;
    String processor;

    public Laptop(String laptopName, String ram, String processor) {
        this.laptopName = laptopName;
        this.ram = ram;
        this.processor = processor;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public static void main(String[] args) {
        Laptop laptop1=new Laptop("HP","8GB","i3");
        System.out.println("Laptop name is:"+laptop1.laptopName+"\t"+"RAM is:"+laptop1.ram+"\t"+"Its Processor is:"+laptop1.processor);
    Laptop laptop2=new Laptop("DELL","16GB","i5");
        System.out.println("Laptop name is:"+laptop2.laptopName+"\t"+"RAM is:"+laptop2.ram+"\t"+"Its Processor is:"+laptop2.processor);
        System.out.println("after changes...");
        laptop1.setLaptopName("LENOVO");
        System.out.println("Laptop name is:"+laptop1.laptopName+"\t"+"RAM is:"+laptop1.ram+"\t"+"Its Processor is:"+laptop1.processor);

    }
}

