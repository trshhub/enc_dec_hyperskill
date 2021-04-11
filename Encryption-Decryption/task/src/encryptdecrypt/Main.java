package encryptdecrypt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mode = null;
        int key = 0;
        String data = null;
        String in = null;
        String out = null;
        String alg = null;

        InputParser inputParser = new InputParser(args, mode, key, data, in, out, alg).invoke();
        mode = inputParser.getMode();
        key = inputParser.getKey();
        data = inputParser.getData();
        in = inputParser.getIn();
        out = inputParser.getOut();
        alg = inputParser.getAlg();

//        System.out.println("mode: " + inputParser.getMode());
//        System.out.println("key: " +  inputParser.getKey());
//        System.out.println("data: " +  inputParser.getData());
//        System.out.println("in: " + inputParser.getIn());
//        System.out.println("out: " + inputParser.getOut());
//        System.out.println("alg: " + inputParser.getAlg());

        Codec codec = new CypherFactory().createCypher(alg);

        char[] result = {};

        result = readData(scanner, codec, mode, key, data, in, result);
        //System.out.println(result.length);

        writeData(out, result);

    }

    private static void writeData(String out, char[] result) {
        if (out == null || out.isBlank()) {
            System.out.println(String.valueOf(result));
        } else {
            try (FileWriter writer = new FileWriter(out); BufferedWriter bfWriter = new BufferedWriter(writer)) {
                bfWriter.write(String.valueOf(result));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static char[] readData(Scanner scan, Codec codec, String mode, int key, String data, String in,
                                   char[] result) {
        if (data == null && in == null) {
            data = scan.nextLine();
            result = codec.encOrDec(mode, data.toCharArray(), key);
        } else if (in != null) {
            try {
                data = Files.readString(Paths.get(in));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            assert data != null;
            result = codec.encOrDec(mode, data.toCharArray(), key);
        } else {
            result = codec.encOrDec(mode, data.toCharArray(), key);
        }
        return result;
    }

}
