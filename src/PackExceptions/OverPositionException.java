package PackExceptions;

public class OverPositionException extends RuntimeException {
    public OverPositionException (){
        System.out.println("Il numero non è compreso tra 1 e 5!");
    }
}
