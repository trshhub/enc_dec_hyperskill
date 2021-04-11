class BigIntegerConverter {

    /**
     * @param number string representing the number
     * @return BigInteger instance
     */
    public static Number getBigInteger(String number) {
        return new java.math.BigInteger(number);
    }

    /*public static void main(String[] args) {
        System.out.println(getBigInteger("200") * 200);
    }*/
}