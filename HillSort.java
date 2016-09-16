package Iterator;



public class HillSort {
    public static void main(String[] args) {
		int [] array={2,1,4,3,6,5,7,8,9};
		hillSort(array);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	
	public static void hillSort(int [] array){
		int length=array.length;
		int h;
		int temp;
		int i,j;
		for(h=length/2;h>0;h=h/2){
			for(i=h;i<length;i++){
				temp=array[i];
				for(j=i-h;j>=0;j-=h){
					if(temp<array[j]){
						array[j+h]=array[j];
					}else{
						break;
					}
				}
				array[j+h]=temp;
			}
		}
		
	}
	
	
   
}
