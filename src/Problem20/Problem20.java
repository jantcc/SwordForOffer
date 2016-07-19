package Problem20;

public class Problem20 {

	public static void main(String[] args) {
		Problem20 p = new Problem20();
		int[][] array = {{1,3,5,7},{8,9,10,12}};
		p.printMatrixClockwisely(array);

	}
	public void printMatrixClockwisely(int[][] array){
		int rows = array.length;
		int columns = array[0].length;
		if(array==null || rows<=0 || columns<=0){
		return ;	
		}
		int start =0;
		while(rows>start*2 && columns>start*2){
			printMatrixInCricle(array,rows,columns,start);
			start++;
		}
	}
	private void printMatrixInCricle(int[][] array, int rows, int columns, int start) {
		int endX = rows-start-1;
		int endY = columns-start-1;
		
		//第一步
		for(int i=start;i<=endY;i++){
			int number = array[start][i];
			System.out.print(number+" ");
		}
		//第二步
		if(start<endX){
			for(int i=start+1;i<=endX;i++){
				int number = array[i][endY];
				System.out.print(number+" ");
			}
		//第三步
			if(start<endX && start<endY){
				for(int i=endY-1;i>=start;i--){
					int number = array[endX][i];
					System.out.print(number+" ");
				}
			}
		//第四步
			if(start<endX-1 && start<endY){
				for(int i=endX-1;i>=start+1;i--){
					int number = array[i][start];
					System.out.print(number+" ");
				}
			}
		}
	}
}
