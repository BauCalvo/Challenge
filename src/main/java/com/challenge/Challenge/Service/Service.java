package com.challenge.Challenge.Service;

public class Service {



        public static boolean chainSearch(String chain){
            for (int i = 0; i < chain.length() - 3;i++){
                if (chain.charAt(i) == chain.charAt(i+1) &&
                        chain.charAt(i) == chain.charAt(i+2) &&
                        chain.charAt(i) == chain.charAt(i+3)){
                    return true;
                }
            }
            return false;
        }



        public boolean horizontalSearch(String[] dna){
            for (String chain:dna) {
                if (chainSearch(chain)){
                    return true;
                }

            }
            return false;
        }

        // cambiar
        public boolean verticalSearch(String[] dna){
            for (int i = 0; i < dna.length; i++){
                String verticalChain = "";
                for (int j = 0; j < dna.length; j++){
                    verticalChain = verticalChain + dna[j].charAt(i);
                }
                if (chainSearch(verticalChain)){
                    return true;
                }
            }
            return false;
        }

        public boolean diagonalSearchLeft(String[] dna){
            // top left corner to right down corner
            for(int x = 0; x < dna.length - 3;x++){
                String diagonalChain = "";
                int j = 0 + x;
                for (int i = 0; j < dna.length && i < dna.length; i++){
                    diagonalChain = diagonalChain + dna[i].charAt(j);
                    j++;
                }
                if (chainSearch(diagonalChain)){
                    return true;
                }
            }
            for (int x = 0;x < dna.length - 3;x++){
                String diagonalChain = "";
                int j = 0 ;
                for (int i = 0 + x; j < dna.length && i < dna.length; i++){
                    diagonalChain = diagonalChain + dna[i].charAt(j);
                    j++;
                }
                if (chainSearch(diagonalChain)){
                    return true;
                }
            }
            return false;
        }
        public boolean diagonalSearchRight(String[] dna){
            // TOP right corner to left down corner
            for (int x = 0; x < dna.length - 3;x++){
                String diagonalChain = "";
                int j = 3 + x;
                for (int i =0; j > -1 && i < dna.length; i++ ){
                    diagonalChain = diagonalChain + dna[i].charAt(j);
                    j--;
                }
                if (chainSearch(diagonalChain)){
                    return true;
                }
            }
            for (int x = 0; x < dna.length - 3;x++){
                String diagonalChain = "";
                int j = dna.length-1-x;
                for (int i =0; j > -1 && i < dna.length; i++ ){
                    diagonalChain = diagonalChain + dna[i].charAt(j);
                    j--;
                }
                if (chainSearch(diagonalChain)){
                    return true;
                }
            }
            return false;
        }
}
