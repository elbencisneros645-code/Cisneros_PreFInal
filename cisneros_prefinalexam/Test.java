/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cisneros_prefinalexam;

import cisneros_prefinalexam.MergeSort.SortingAlgorithm;

/**
 *
 * @author User
 */
public class Test {

    public static void main(String[] args) {

        Player[] players = new Player[8];

        players[0] = new Player("PO1", " Ando kim ", " Eagles ", 98.00);
        players[1] = new Player("PO2", "  ", " Tiger ", 98.00);
        players[2] = new Player("PO3", "  ", " Eagles ", 98.00);
        players[3] = new Player("PO4", "  ", " Eagles ", 98.00);
        players[4] = new Player("PO5", "  ", " Eagles ", 98.00);
        players[5] = new Player("PO6", "  ", " Eagles ", 98.00);
        players[6] = new Player("PO7", "  ", " Eagles ", 98.00);
        players[7] = new Player("PO8", "  ", " Eagles ", 98.00);

        System.out.println("============Player List Before Sorted==========");
        displayPlayers(players);

        SortingAlgorithm.mergeSort(players);

        System.out.println("=============Player List After Sorting(highest to Lowest=========");
        displayPlayers(players);

        System.out.println("=============Top3 Players========================");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + " " + players[i]);

        }
        

    private static void displayPlayers(Player[] list){
       
        for (Player i : list) {
            System.out.println(i);
        }
    }

}


