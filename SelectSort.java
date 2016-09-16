package Iterator;

public class SelectSort {
    public static void main(String[] args) {
		int [] array={2,1,4,3,6,5,8,7,9};
		test(array);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	public static void test(int [] array){
		for(int i=0;i<array.length-1;i++){
			int index=i;
			int temp=0;
			for(int j=i+1;j<array.length;j++){
				if(array[i]>array[j]){
					index=j;
				}
			}
			
			if(index!=i){
				temp=array[index];
				array[index]=array[i];
				array[i]=temp;
			}
		}
	}
}
