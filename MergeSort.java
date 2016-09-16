package Iterator;

public class MergeSort {
    public static void main(String[] args) {
		int [] array={2,1,4,3,6,5,7,8,9};
		int [] temp=new int[10];
		mergeSort(array, 0, array.length-1, temp);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	public static void merge(int [] a,int n,int [] b,int m,int []c){
		int i=0,j=0,k=0;
		while(i<n&&j<m){
			if(a[i]<b[j]){
				c[k++]=a[i++];
			}else{
				c[k++]=b[j++];
			}
		}
		
		while(i<n){
			c[k++]=a[i++];
		}
		while(j<m){
			c[k++]=b[j++];
		}
		
	}
	
	
	public static void mergeArray(int [] a,int start,int middle,int end,int [] temp){
		int i=start,
		j=middle+1,
		m=middle,
		n=end,
		k=0;
		while(i<=m&&j<=n){
			if(a[i]<a[j]){
				temp[k++]=a[i++];
			}else{
				temp[k++]=a[j++];
			}
		}
		while(i<=m){
			temp[k++]=a[i++];
		}
		
		while(j<=n){
			temp[k++]=a[j++];
		}
		
		for(i=0;i<k;i++){
			a[start+i]=temp[i];
		}

	}

	public static void mergeSort(int [] a,int start,int end,int [] temp){
		if(start<end){
			int middle=(start+end)/2;
			mergeSort(a, start, middle, temp);
			mergeSort(a,middle+1,end,temp);
			mergeArray(a, start, middle, end, temp);
		}
	}
}
