package dk.kea.sem2.model.ETO;

public class HarStemtException extends Exception {
    
    private String email;

    public HarStemtException() {
    }
    
    public HarStemtException(String message) {
        super(message);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    } 
}
