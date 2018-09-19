package Encrypt_Decrypt;

public class Main {
    public static void main(String args[]){

        CipherContext c = new CipherContext();
        System.out.println(c.process("TEST"));

        c = new CipherContext(new ConcreteCeasarCipherStrategy(13));
        System.out.println(c.process("TEST"));

        c.setStrategy(new ConcreteSubstitutionCipherStrategy("ABC"));
        System.out.println(c.process("AAAAAAAAA"));

    }
}