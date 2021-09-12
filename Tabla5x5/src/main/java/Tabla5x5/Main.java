
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabla5x5;

public class Main {

    public static void main(String[] args) {
        int t [] [];
        t = new int [5] [5];
        
        for (int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                t [i] [j]=i+j;
            }
        }
        System.out.println("TABLA: ");
        for (int i=4;i>=0;i--)
        {
            System.out.println();
            for (int j=0;j<5;j++)
            {
             System.out.println(t[i][j]+" ");
            }
        }
    }
    
}
