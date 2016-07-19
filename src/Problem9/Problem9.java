package Problem9;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println(new Problem9().Problem9(10));
	}
	public int Problem9(int n){
		int result[]={0,1};
		int preOne=1;
		int preTwo=0;
		int res = 0;
		if(n<2){
			return result[n];
		}
		for(int i=2;i<=n;i++){
			res=preOne+preTwo;
			preTwo = preOne;
			preOne = res;
			
		}
		return res;
	}

}
