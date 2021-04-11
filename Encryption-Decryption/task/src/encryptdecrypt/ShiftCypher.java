package encryptdecrypt;

public class ShiftCypher implements Codec{

    @Override
    public char[] encrypt(char[] cypherText, int key) {
        int codePoint;
        int codePointAtZ = 122;
        int codePointBeforeA = 96;

        for (int i = 0; i < cypherText.length; i++) {
            if (((int) cypherText[i] >= 65 && (int) cypherText[i] <= 90) || ((int) cypherText[i] >= 97 && (int) cypherText[i] <= 122)) {
                codePoint = (int) cypherText[i] + key;
                if (codePoint > codePointAtZ) {
                    codePoint = codePointBeforeA + (codePoint - codePointAtZ);
                }
                cypherText[i] = (char) codePoint;
            }

        }

        return cypherText;
    }

    @Override
    public char[] decrypt(char[] cypherText, int key) {
        int codePoint;
        int codePointAfterZ = 123;
        int codePointAtA = 97;

        for (int i = 0; i < cypherText.length; i++) {
            if (((int) cypherText[i] >= 65 && (int) cypherText[i] <= 90) || ((int) cypherText[i] >= 97 && (int) cypherText[i] <= 122)) {
                codePoint = (int) cypherText[i] - key;
                if (codePoint < codePointAtA) {
                    codePoint = codePointAfterZ - (codePointAtA - codePoint);
                }
                cypherText[i] = (char) codePoint;
            }


        }
        return cypherText;
    }
}
