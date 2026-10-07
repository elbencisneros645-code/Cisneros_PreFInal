/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cisneros_prefinalexam;

/**
 *
 * @author User
 */
public class MergeSort {
    
public class SortingAlgorithm{
    

   
    public static void mergeSort(Player[] players , int left , int right) {

       
        if (left < right) {

            int mid = left + (right - left) / 2;

           
            mergeSort(players, left, mid);

            
            mergeSort(players, mid + 1, right);

          
            merge(players, left, mid, right);
        }
    }

    
    private static void merge(Player[] players, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Player[] leftArray = new Player[n1];
        Player[] rightArray = new Player[n2];

       
        for (int i = 0; i < n1; i++) {
            leftArray[i] = players[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = players[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        
        while (i < n1 && j < n2) {

            if (leftArray[i].getScore() >= rightArray[j].getScore()) {
                players[k] = leftArray[i];
                i++;
            } else {
                players[k] = rightArray[j];
                j++;
            }

            k++;
        }

       
        while (i < n1) {
            players[k] = leftArray[i];
            i++;
            k++;
        }

       
        while (j < n2) {
            players[k] = rightArray[j];
            j++;
            k++;
        }
    }

        static void mergeSort(Player[] players) {
           
        }

        
    }
  
}
