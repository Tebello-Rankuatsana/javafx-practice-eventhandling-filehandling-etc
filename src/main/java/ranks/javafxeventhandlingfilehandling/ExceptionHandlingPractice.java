package ranks.javafxeventhandlingfilehandling;

public class ExceptionHandlingPractice{
    public static void main(String[] args) {
        try{
            int result = 5/0;
        }catch(MathematicalException e) {
            e.printStackTrace();
        }
    }

}
// creating my own exception
class MathematicalException extends Exception{
    public MathematicalException(String message){
        super(message);
    }
}
