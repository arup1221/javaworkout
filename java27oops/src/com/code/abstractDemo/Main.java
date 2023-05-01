package com.code.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(24);
        son.career();

        Daughter daughter = new Daughter(87);
        daughter.career();

        Parent.hello();

        son.normal();

    }
}
