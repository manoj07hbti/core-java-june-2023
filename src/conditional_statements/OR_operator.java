package conditional_statements;

public class OR_operator {
    public static void main(String[] args) {
        String brand="IBM";
        int RAM=8;
        if( brand=="IBM" || RAM>=8){
            System.out.println("the configuration is good");
        }else{
            System.out.println("the configuration is not good");
        }
        RAM=8;
        brand="IBM";
        if(brand=="thinkpad" || RAM>=8){
            System.out.println("the configuration is good");
        }else{
            System.out.println("the configuration is not good");
        }
        RAM=4;
        brand="IBM";
        if(brand=="IBM" || RAM>=8){
            System.out.println("the configuration is good");
        }else{
            System.out.println("the configuration is not good");
        }
        RAM=4;
        brand="thinkpad";
        if(brand=="IBM" || RAM>=8){
            System.out.println("the configuration of product is good");
        }else{
            System.out.println("the configuration of product is not good");

            int marks=70;
            String section="A";
            if(marks>=60 || section=="A"){
                System.out.println("student will pass in section A ");
            }else{
                System.out.println("student will fail in section A");
            }
            marks=30;
            section="B";
            if(marks>=33 || section=="c"){
                System.out.println("student will pass in section B");
            }else{
                System.out.println("student will fail in section B");
            }
        }
    }
}
