
// -------------------------------------------------------------------------

/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author Michael Haskins
 *   Lecture notes 
 *  @version HT 2020
 */

 class SortComparison {

    /**
     * Sorts an array of doubles using InsertionSort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order.
     *
     */
    static double [] insertionSort (double a[]){ //returns list if empty or full
    	double temp;
    	for (int i = 1; i < a.length; i++) {
	    	for(int j = i ; j > 0 ; j--){
		    	if(a[j] < a[j-1]){
		    	temp = a[j];
		    	a[j] = a[j-1];
		    	a[j-1] = temp;
		    	}
    	    }
    	}
    	return a;
        //todo: implement the sort
    }//end insertionsort
    // Given a list 8, 4, 3, 5
    // Sorts in the steps 4, 8|, 3, 5 ... 3, 4, 8|, 5 ... 3, 4, 5, 8|.
	// a is partially sorted after each increment of i.
	    /**
     * Sorts an array of doubles using Selection Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] selectionSort (double a[]){ //returns null if empty list

         //todo: implement the sort
    	if( a.length == 0)
    	{
    		return null;
    	}
    	double smallest, temp;
    	smallest = 0;
    	for( int j = 0; j < a.length - 1; j++)   //Length is n-1 as no point in looping again for an nth time, as should be all sorted
    	{
	    	for( int i = 0; i < a.length ; i++)
	    	{
	    	    smallest = a[i];
	    		if( smallest > a[i])
	    		{
	    			temp = a[i];
	    			a[i] = smallest;
	    			smallest = temp;
	    		}
	    	}
	    	a[j] = smallest;
    	}
    	return a; 
    }//end selectionsort

    /**
     * Sorts an array of doubles using Quick Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] quickSort (double a[]){ //Makes use of recursiveQuick and partition methods
    	//todo: implement the sort
    	recursiveQuick(a, 0, a.length);
    	return a;
    }//end quicksort
    
    private static void recursiveQuick(double a[], int lo, int hi) {
    	if(hi <= lo) {  //As array does not need to be sorted
    	return;
    	}
    	int pivotPos = partition(a, lo, hi); 
    	recursiveQuick(a, lo, pivotPos-1);
    	recursiveQuick(a, pivotPos+1, hi);
    	}
    
    private static int partition(double a[], int lo, int hi) { // Selects a partition element that is greater than or less than elements to right and left respectively
    	int i = lo;
    	int j = hi+1;
    	double pivot = a[lo];
    	while(true) {
	    	while( a[i++] < pivot) {   //Could have errors here, check later
	    		if(i == hi) break;
    	    }
	    	while( pivot < a[j--] ) {
	    		if(j == lo) break;
    	    }
	    	if(i >= j) break;
	    	double temp = a[i];
	    	a[i] = a[j];
	    	a[j] = temp;
    	}
    	a[lo] = a[j];
    	a[j] = pivot;
    	return j;
    }

    /**
     * Sorts an array of doubles using Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    /**
     * Sorts an array of doubles using iterative implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */

    static double[] mergeSortIterative (double a[]) {

		 //todo: implement the sort
	
    }//end mergesortIterative
    
    
    
    /**
     * Sorts an array of doubles using recursive implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */
    static double[] mergeSortRecursive (double a[]) {
    	

    	//todo: implement the sort
	
   }//end mergeSortRecursive
    	
    


   


    public static void main(String[] args) {

        //todo: do experiments as per assignment instructions
    }

 }//end class

