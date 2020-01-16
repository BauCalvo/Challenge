package com.challenge.Challenge;

import com.challenge.Challenge.Service.MutantService;
import org.junit.*;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;


public class TestServiceMutant {

    @Autowired
    private MutantService mutantService;

    private String[] mutant = {"GCTATA","ACTGA","CGTCAG","CTGACC","CCAGTA","CTTTTG"};
    private String[] human = {"GAGAGA","CTCTCT","GAGAGA","CTCTCT","GAGAGA","CTCTCT"};
    private String mutantChain = mutant[5];
    private String humanChain = human[0];

    @Test
    public void chainSearchTest(){
        assertTrue("chain search fail", mutantService.chainSearch(mutantChain));
        assertFalse("false was expected in this chain", mutantService.chainSearch(humanChain));
    }

    @Test
    public void verticalSearchTest(){
        assertTrue("vertical search fail", mutantService.verticalSearch(mutant));
        assertFalse("false was expected in vertical search", mutantService.verticalSearch(human));
    }

    @Test
    public void horizontalSearchTest(){
        assertTrue("horizontal search fail", mutantService.horizontalSearch(mutant));
        assertFalse("false was expected in horizontal search", mutantService.horizontalSearch(human));
    }

    @Test
    public void diagonalSearchLeftTest(){
        assertTrue("top left corner to right down corner search is not working", mutantService.diagonalSearchLeft(mutant));
        assertFalse("false was expected", mutantService.diagonalSearchLeft(human));
    }
    @Test
    public void diagonalSerchRightTest(){
        assertTrue("top right corner to left down corner search is not working)", mutantService.diagonalSearchRight(mutant));
        assertFalse("false was expected diagonal Serch Right", mutantService.diagonalSearchRight(human));
    }



}
