package com.challenge.Challenge;

import com.challenge.Challenge.Service.Service;
import org.junit.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TestService {
    private Service bo = new Service();

    private String[] mutant = {"GCTATA","ACTGA","CGTCAG","CTGACC","CCAGTA","CTTTTG"};
    private String[] human = {"GAGAGA","CTCTCT","GAGAGA","CTCTCT","GAGAGA","CTCTCT"};
    private String mutantChain = mutant[5];
    private String humanChain = human[0];

    @Test
    public void chainSearchTest(){
        assertTrue("chain search fail",bo.chainSearch(mutantChain));
        assertFalse("false was expected in this chain",bo.chainSearch(humanChain));
    }

    @Test
    public void verticalSearchTest(){
        assertTrue("vertical search fail",bo.verticalSearch(mutant));
        assertFalse("false was expected in vertical search",bo.verticalSearch(human));
    }

    @Test
    public void horizontalSearchTest(){
        assertTrue("horizontal search fail",bo.horizontalSearch(mutant));
        assertFalse("false was expected in horizontal search",bo.horizontalSearch(human));
    }

    @Test
    public void diagonalSearchLeftTest(){
        assertTrue("top left corner to right down corner search is not working",bo.diagonalSearchLeft(mutant));
        assertFalse("false was expected",bo.diagonalSearchLeft(human));
    }
    @Test
    public void diagonalSerchRightTest(){
        assertTrue("top right corner to left down corner search is not working)",bo.diagonalSearchRight(mutant));
        assertFalse("false was expected diagonal Serch Right",bo.diagonalSearchRight(human));
    }



}
