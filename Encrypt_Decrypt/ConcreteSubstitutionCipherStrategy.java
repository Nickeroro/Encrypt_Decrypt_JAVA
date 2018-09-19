package Encrypt_Decrypt;

public class ConcreteSubstitutionCipherStrategy implements CipherStrategy {

    private String keySeed;

    public ConcreteSubstitutionCipherStrategy(String keySeed) {
        this.keySeed = keySeed;
    }

    @Override
    public String encipher(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char m = s.charAt(i);
            char k = keySeed.charAt(i % keySeed.length());
            int mValue = (int) m - ((Character.isUpperCase(m)) ? 65 : 97);
            int kValue = (int) k - ((Character.isUpperCase(k)) ? 65 : 97);
            int cValue = ((mValue + kValue) % 26 + 26) % 26;

            sb.append((char) (cValue + 97));
        }
        return sb.toString();
    }


    @Override
    public String decipher(String s) {

        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char k = keySeed.charAt(i % keySeed.length());
            int cValue = (int) c - ((Character.isUpperCase(c)) ? 65 : 97);
            int kValue = (int) k - ((Character.isUpperCase(k)) ? 65 : 97);
            int mValue = ((cValue - kValue) % 26 + 26) % 26;

            sb.append((char) (mValue + 97));
        }
        return sb.toString();
    }
}
