package Iterator;

public class FastSort {
    public static void main(String[] args) {
		int [] array={2,1,4,3,6,5,7,8,9};
		test(array,0,array.length-1);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	public static void test(int [] array,int low ,int height){
		if(low>=height){
			return;
		}
		int i=low;
		int j=height;
		int index=array[low];
		while(i<j){
			while(i<j&&array[j]>index){
				j--;
			}
			if(i<j){
				array[i++]=array[j];
			}	
		}
		
		while(i<j){
			while(i<j&&array[i]<index){
				i++;
			}
			if(i<j){
				array[j--]=array[i];
			}	
		}
		
		
		array[i]=index;
		test(array,low,i-1);
		test(array,i+1,height);
	}
}
