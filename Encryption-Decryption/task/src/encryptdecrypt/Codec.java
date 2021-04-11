package encryptdecrypt;

public interface Codec {

    char[] encrypt(char[] cypherText, int key);
    char[] decrypt(char[] cypherText, int key);

    default char[] encOrDec(String mode, char[] cypherText, int key) {
        char[] result = new char[0];

        if (mode == null || mode.equals("enc")) {
            result = encrypt(cypherText, key);
        } else if (mode.equals("dec")) {
            result = decrypt(cypherText, key);
        }

        return result;
    }
}
