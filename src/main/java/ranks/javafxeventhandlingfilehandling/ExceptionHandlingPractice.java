package ranks.javafxeventhandlingfilehandling;

public class ExceptionHandlingPractice{
    public static void main(String[] args) {
        try{
            int x = 5;
            int y = 0;
            if(y == 0){
                throw new MathematicalException("Invalid operation");
            }
            int result = x/y;
        } catch (MathematicalException e) {
            throw new RuntimeException(e);
        }


    }

}
// creating my own exception
class MathematicalException extends Exception{
    public MathematicalException(String message){
        super(message);
    }
}
