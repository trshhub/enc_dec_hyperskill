package encryptdecrypt;

public class UnicodeCypher implements Codec {
    @Override
    public char[] encrypt(char[] cypherText, int key) {
        int codePoint;

        for (int i = 0; i < cypherText.length; i++) {
            codePoint = (int) cypherText[i] + key;

            cypherText[i] = (char) codePoint;
        }

        return cypherText;
    }

    @Override
    public char[] decrypt(char[] cypherText, int key) {
        int codePoint;

        for (int i = 0; i < cypherText.length; i++) {
            codePoint = (int) cypherText[i] - key;

            cypherText[i] = (char) codePoint;
        }

        return cypherText;
    }
}
