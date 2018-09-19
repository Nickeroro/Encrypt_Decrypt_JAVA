package Encrypt_Decrypt;

public class CipherContext {
    CipherStrategy myStrategy;

    public CipherContext() {
        this.myStrategy = new ConcreteCeasarCipherStrategy(22);
    }

    public CipherContext(CipherStrategy s) {
        this.myStrategy = s;
    }

    public void setStrategy(CipherStrategy s) {
        this.myStrategy = s;
    }

    public String process(String s) {
        return this.myStrategy.encipher(s) + "-->" + this.myStrategy.decipher(this.myStrategy.encipher(s));
    }

}
