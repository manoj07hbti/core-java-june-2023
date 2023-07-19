package conditional_statements;

public class DemoOROperator {

    public static void main(String []args){

        int ram=8;
        String Brand="IBM";

// 1.   TRUE  || TRUE = TRUE

        if (ram>=8 || Brand =="IBM"){
            System.out.println("True The above data of Brand & ram is right");
        }else{
            System.out.println(" The above data of Brand & ram is not right");
        }
// 2.   TRUE  || FALSE= TRUE

        Brand="SAM";
        if (ram>=8 || Brand =="IBM"){
            System.out.println("True The above data of Brand & ram is right");
        }else{
            System.out.println(" The above data of Brand & ram is not right");
        }
//3.   FALSE || TRUE=  TRUE

        ram=7;
        if (ram>=8 || Brand =="IBM"){
            System.out.println(" The above data of Brand & ram is right");
        }else{
            System.out.println("True The above data of Brand & ram is not right");
        }
//4.   FALSE || FALSE= FALSE

        ram=7;
        Brand="SAM";
        if (ram>=8 || Brand =="IBM"){
            System.out.println("The above data of Brand & ram is right");
        }else{
            System.out.println("False The above data of Brand & ram is not right");
        }

    }
}
