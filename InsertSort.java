package Iterator;

public class InsertSort {
    public static void main(String[] args) {
		int [] array={2,1,4,3,6,5,8,7,9};
		test(array);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	
	
	public static void test(int [] array){
		for(int i=1;i<array.length;i++){
			int temp=array[i];
			int j=i;
			if(array[j-1]>temp){
				while(j>=1&&array[j-1]>temp){
					array[j]=array[j-1];
					j--;
				}
				array[j]=temp;
			}
		}
	}
	
}
