public class Driver
{
	public static void main(String[] args)
	{
		int[] ar = {7,8,1,3,4,2};
		Driver.mergerSort(ar);
		Driver.display(ar, 0, ar.length-1);
		
		
	}
	
	static void mergerSort(int[] ar)
	{
		Driver.mergeSortHelper(ar, 0, ar.length-1);
	}
	
	static void mergeSortHelper(int[] ar, int begin, int end)
	{
		Driver.display(ar, begin, end);
		if(begin != end)
		{
			int leftBegin = begin;
			int leftEnd = ((end-begin)/2 + begin);
			int rightBegin = ((end-begin)/2 + begin) + 1;
			int rightEnd = end;
			Driver.mergeSortHelper(ar, leftBegin, leftEnd);
			Driver.mergeSortHelper(ar, rightBegin, rightEnd);
			int[] tempAr = new int[end-begin + 1];
			int left = leftBegin;
			int right = rightBegin;
			for(int i = 0; i < tempAr.length; i ++) 
	        {
	            if(left >= rightBegin && right <= end) 
	            {
	                tempAr[i] = ar[right];
	                right++;
	                continue;
	            }
	            
	            if(right > end && left <= rightBegin) 
	            {
	                tempAr[i] = ar[left];
	                left++;
	                continue;
	            }
	            
	            if(right <= end && left <= rightBegin) 
	            {
	                if(ar[left] <= ar[right]) 
	                {
	                    tempAr[i] = ar[left];
	                    left++;
	                } 
	                
	                else 
	                {
	                    tempAr[i] = ar[right];
	                    right++;
	                }
	            }
	        }
			
			for(int i = 0; i < tempAr.length; i++)
			{
				ar[begin + i] = tempAr[i]; 
			}
		}
	}
	
	static void display(int[] ar, int begin, int end)
	{
		for(int i = begin; i <= end; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println("");
	}
}