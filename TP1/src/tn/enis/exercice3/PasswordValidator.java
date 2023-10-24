package tn.enis.exercice3;

public class PasswordValidator {

    public boolean validatePassword(String password) {
        return (password.length()>=6 && password.length()<= 10
                && password.matches(".*\\d.*")
                && password.matches(".*[A-Z].*")
        );
    }
}
