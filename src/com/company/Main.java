package com.company;

import java.util.ArrayList;

public class Main {

    //in a 2x2 grid there are 9 ways to go to the bottom corner only making movments downwardsa nd to the right
    //how many ways are there in a 20 by 20 grid
    public static void main(String[] args) {
	// write your code here
        System.out.println(pathFinder(0,0,17));
        System.out.println("FINISHED");
    }

    public static long pathFinder(long x, long y, long gridSize){ //0, 0, 2

        long counter = 0;

        if(x < gridSize){
            counter += pathFinder(x+1, y, gridSize);
        }
        if(y < gridSize){
            counter += pathFinder(x, y+1, gridSize);
        }

        if(y == gridSize && x == gridSize){
            return 1;
        }

        return counter;
    }
}
