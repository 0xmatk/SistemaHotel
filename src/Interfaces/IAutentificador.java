package Interfaces;


import java.security.SecureRandom;

public interface IAutentificador {

    static final int TOKEN_LENGTH = 10;

    public default String generateToken() {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < TOKEN_LENGTH; i++) {
            sb.append(secureRandom.nextInt(10));
        }

        return sb.toString();
    }
}
