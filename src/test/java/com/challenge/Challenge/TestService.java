package com.challenge.Challenge;

import org.junit.*;

import static org.junit.Assert.assertTrue;


public class TestService {
    String[] daigonalTestchain = {"TGAATG","ACGCCG","CGAGCA","GAATGA","TCCACC","TGCTCT"};
    Service bo = new Service();
    @Test
    public void diagonalSearchTest(){
        assertTrue("top left corner to right down corner search is not working",bo.diagonalSearch(daigonalTestchain));

    }

}
