package pl.atd.errorhandling.exception;

public class CowNotFoundException extends Exception {
    public CowNotFoundException(Long id) {
        super(String.format("Cow %s not found", id));
    }
}
