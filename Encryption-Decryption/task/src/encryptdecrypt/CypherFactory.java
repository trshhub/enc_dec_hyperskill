package encryptdecrypt;

public class CypherFactory {

    Codec createCypher(String type) {
        Codec codec;

        switch (type) {
            case "unicode":
                codec = new UnicodeCypher();
                break;
            case "shift":
                codec = new ShiftCypher();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }

        return codec;
    }
}
