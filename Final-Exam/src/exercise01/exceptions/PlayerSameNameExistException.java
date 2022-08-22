package exercise01.exceptions;

public class PlayerSameNameExistException extends Exception {

    public PlayerSameNameExistException(String message) {
        super(message);
    }
}
