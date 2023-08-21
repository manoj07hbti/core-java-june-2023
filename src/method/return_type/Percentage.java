package method.return_type;

public class Percentage {

    //TODO write a code to find a percentage

    public double findPercentage(int number){//TODO <----------with input
        double percentage=(double) number*100/600;

     return percentage;
    }
    public double findPercentages(){//TODO <------------without input
        double number = 508;
        double percentage=number*100/600;
        return percentage;
    }

    public static void main(String[] args) {
        Percentage obj=new Percentage();
        System.out.println("Percentage of Given Numbers is :"+(obj.findPercentage(500)+"%"));
        double output=obj.findPercentages();
        System.out.println("Percentage of Given Numbers is :"+output+"%");
    }
}
