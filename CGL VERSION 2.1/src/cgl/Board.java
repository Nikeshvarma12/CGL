package cgl;

public class Board {
	Nextgeneration c=new Nextgeneration();
	public void printBoard(boolean[][] board) {
		  int m=board.length;
	        for(int i=0;i<m;i++)
	        {
	            for(int j=0;j<m;j++)
	            {
	                if(board[i][j]==true)
	                {
	                System.out.print('*');
	                }
	                else
	                {
	               
	                System.out.print('.');
	                }
	            }
	            System.out.println();
	        }
		
		
	}
	public boolean createBoard(int n,int l[][]){
		if(n>=0)
		{
			if(l==null) {
				return true;
			}
			
			boolean b[][]=new boolean[n][n];
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n;j++)
	            {
	                b[i][j]=false;
	            }

	        }
	        for(int i=0;i<l.length;i++)
	        {
	            int r=l[i][0]; 
	            int c=l[i][1];
	            b[r][c]=true;
	        }
	        System.out.println("CurrentGenration");
	        printBoard(b);
	        System.out.println("NextGenration");
	       
			 
		
		return true;}
		else {
			return false;
			
		}
	
	}

}
