class IndicesArray{
	public static int[] IndicesArray(int arr[],int x,int idx,int fsf){
		if(idx==arr.length){
			return new int[fsf];
		}
		if(arr[idx]==x){
			int res[]=IndicesArray(arr,x,idx+1,fsf+1);
			res[fsf]=idx;
			return res;
		}
		else{
			int res[]=IndicesArray(arr,x,idx+1,fsf);
			return res;
		}
	}
	public static void main (String[] args) {
		int arr[]={2,5,6,4,5,7,6,5,9,1,5,8};
		int find=5;
		int result[]=IndicesArray(arr,find,0,0);
		for (int i = 0; i<result.length; i++){
			System.out.println(result[i]);
		};
	}
	
}