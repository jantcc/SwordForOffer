package Problem14;

public class Problem14 {

	public static void main(String[] args) {
		Problem14 p = new Problem14();
		int array[] = {1,2,3,4,5};
		p.order(array);
		for(int i : array){
			System.out.print(i+ "");
		}
	}
	public void order(int[] array){
		if(array==null){
			return ;
		}
		int i=0,j=array.length-1;
		while(i<j){
			//��һ��ָ��i���ָ��ż��,�ڶ���ָ��ָ������,�ͽ���2��ֵ
			while(i<j && !isEven(array[i])){
				i++;
			}
			while(i<j && isEven(array[j])){
				j--;
			}
			if(i<j){
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
	}
	public boolean isEven(int n){
		return n%2==0;
	}
}	
