package Problem8;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem8 pb8 = new Problem8();
		int arr[]={1,0,1,1,1};
		System.out.println(pb8.findminelement(arr));
	}
    public int findminelement(int arr[]){
    	int index1=0;
    	int index2=arr.length-1;
    	int indexmid = index1;
    	while(arr[index1]>=arr[index2]){
    		if(index2-index1==1){
    			indexmid = index2;
    			break;
    		}
    		indexmid = (index1+index2)/2;
    		if(arr[index1]==arr[index2]&&arr[index1]==arr[indexmid]&&arr[index2]==arr[indexmid]){
    			return minInOrder(arr);
    		}
    		if(arr[indexmid]>=arr[index1]){
    			index1 = indexmid;
    		}else if(arr[indexmid]<=arr[index2]){
    			index2 = indexmid;
    		}
    	}
    	return arr[indexmid];
    }
    public int minInOrder(int arr[]){
    	int minelement=0;
    	for(int i=0;i<arr.length-1;i++){
    		if(arr[i]<arr[i+1]){
    			minelement=arr[i];
    		}
    	}
    	return minelement;
    }
}
