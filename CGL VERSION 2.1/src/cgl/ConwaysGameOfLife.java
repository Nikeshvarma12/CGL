package cgl;
import java.util.Scanner;
public class ConwaysGameOfLife {
	public void generateNextGeneration() {
		
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading size of the Board
        int n = sc.nextInt();
        // Reading no. of initial live cells
        int m = sc.nextInt();
        int[][] l = new int[m][2];
     // Reading Live cells
        for (int i = 0; i < m; i++) {
            l[i][0] = sc.nextInt();
            l[i][1] = sc.nextInt();}
     // creating instance to CGLVersion2
	     Board c = new Board();
        
       
        c.createBoard(n, l);
        sc.close();
        
	}
	
}
