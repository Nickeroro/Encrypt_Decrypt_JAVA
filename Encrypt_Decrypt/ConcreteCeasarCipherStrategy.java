package Encrypt_Decrypt;


public class ConcreteCeasarCipherStrategy implements CipherStrategy {

    private int shift;

    public ConcreteCeasarCipherStrategy(int shift) {
        this.shift = shift;
    }


    @Override
    public String encipher(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int charShift = 97;
            if (Character.isUpperCase(c))
                charShift = 65;
            char ch = (char) (((int) c + this.shift - charShift) % 26 + charShift);
            sb.append(ch);
        }
        return sb.toString();
    }

    @Override
    public String decipher(String s) {

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int charShift = 97;
            if (Character.isUpperCase(c))
                charShift = 65;
            char ch = (char) (((int) c + (26 - this.shift) - charShift) % 26 + charShift);
            sb.append(ch);
        }
        return sb.toString();
    }
}



