package com.controle.tdd;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void FizzBuzz_de_1_devrait_retourner_1(){
        FizzBuzz FB=new FizzBuzz();
        for(int i=1;i<=20;i++){
        String nbre=FB.de(i);}
    Assertions.fail("echec cycle 1");
    }
}
