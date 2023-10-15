package exception;

public class ExceptionHierarchy {

    public void hierarchy() {
        try {
            System.out.println("This is my Exception Hierarchy...");
           throw new RuntimeException();

        } catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {

        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {

        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {

        } catch (NumberFormatException numberFormatException) {

        } catch (NullPointerException nullPointerException) {

        } catch (ArithmeticException arithmeticException) {

        } catch (RuntimeException runtimeException) {
            System.out.println("Runtime Exception Occurred.."+runtimeException);
        } catch (Exception exception) {

        }
    }

    public static void main(String[] args) {
        ExceptionHierarchy obj = new ExceptionHierarchy();
        obj.hierarchy();
    }
}
