package encryptdecrypt;

public class InputParser {

    private String[] args;
    private String mode;
    private int key;
    private String data;
    private String in;
    private String out;
    private String alg;

    private static final String _mode = "-mode";
    private static final String _key = "-key";
    private static final String _data = "-data";
    private static final String _in = "-in";
    private static final String _out = "-out";
    private static final String _alg = "-alg";

    public InputParser(String[] args, String mode, int key, String data, String in, String out, String alg) {
        this.args = args;
        this.mode = mode;
        this.key = key;
        this.data = data;
        this.in = in;
        this.out = out;
        this.alg = alg;
    }

    InputParser invoke() {
        for (int i = 0; i < args.length; i += 2) {
            if (args[i].equals(_mode)) {
                mode = args[i + 1];
            } else if (args[i].equals(_key)) {
                key = Integer.parseInt(args[i + 1]);
            } else if (args[i].equals(_data)) {
                data = args[i + 1];
                data = data.replace("\"", "");
            } else if (args[i].equals(_in)) {
                in = args[i + 1];
            } else if (args[i].equals(_out)) {
                out = args[i + 1];
            } else  if (args[i].equals(_alg)) {
                alg = args[i + 1];
            }
        }
        return this;
    }

    public String getMode() {
        return mode;
    }

    public int getKey() {
        return key;
    }

    public String getData() {
        return data;
    }

    public String getIn() {
        return in;
    }

    public String getOut() {
        return out;
    }

    public String getAlg() {
        return alg;
    }

    public String[] getArgs() {
        return args;
    }
}
