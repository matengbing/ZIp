package Iterator;

public class MaopaoSort {
    public static void main(String[] args) {
		int [] array={1,2,5,4,7,8,9,3,2,5};
		test(array);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	
	
	public static void test(int [] array){
		int length=array.length;
		for(int i=0;i<length;i++){
			int temp=i;
			for(int j=length-1;j>i;j--){
				if(array[j]<array[j-1]){
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
					
				}
			}
		
		}
	}
}
