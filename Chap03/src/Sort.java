import java.util.Dictionary;
import java.util.Hashtable;

/****************************************************************************************
 * 
 * @author Alan Van Art
 *
 * Chapter 3 Questions 6 - 9
 *
 * 6. In the selection sort,
 * 
 *		b. a minimum key is repeatedly discovered.
 *
 * 7. True or False: If, in a particular sorting situation, swaps take much longer than
 *    comparisons, the selection sort is about twice as fast as the bubble sort.
 * 
 * 		False
 * 
 * 8. A copy is ________ times as fast as a swap.
 * 
 * 		3 (three)
 * 
 * 9. What is the invariant in the selection sort?
 * 
 * 		items at or below the index of the outer LCV are sorted
 * 
 ***************************************************************************************/

class Sort {
   
	static enum sortMethod {bubbleSort, selectionSort, insertionSort}; 
	static enum arrayType {random, reversed, sorted}; 
	private static Dictionary<arrayType, String> output;
	private static int timerCounter = 0;
	private long[] a;                 	// reference to array 'a'
	private int nElems;               	// number of data items
//--------------------------------------------------------------
	static {
		
		output = new Hashtable<arrayType, String>();
		output.put(arrayType.random, "random unsorted data...");
		output.put(arrayType.reversed, "reverse sorted data....");
		output.put(arrayType.sorted, "forward sorted data....");

	}
//--------------------------------------------------------------
   public Sort(int max) {         		// constructor
      
      a = new long[max];                // create the array
      nElems = 0;                       // no items yet
   }
//--------------------------------------------------------------
   public void insert(long value) {   	// put element into array
      
      a[nElems] = value;             	// insert it
      nElems++;                     	// increment size
   }
//--------------------------------------------------------------
   public void insertReverseSort(long value) {
	   if (nElems == 0) {
		   a[nElems] = value;            // insert it
		   nElems++;                     // increment size
	   }
	   else {
		   
		   int i = nElems;
		   
		   for (i = nElems; i > 0; i--) {
			   
			   if (value > a[i - 1]) {
				   
				   a[i] = a[i - 1];
			   }
			   else {
				   
				   break;
			   }
		   }
		   
		   a[i] = value;
		   nElems++;
	   }
   }
//--------------------------------------------------------------
   public void display() {            		// displays array contents
      
      for(int j=0; j<nElems; j++) {       	// for each element,
         
    	  System.out.print(a[j] + " ");  	// display it
      }
      
      System.out.println("");
   }
//--------------------------------------------------------------
   public void bubbleSort() {
      
      int out, in;

      for(out=nElems-1; out>1; out--) {  	// outer loop (backward)
         
    	  for(in=0; in<out; in++) {       	// inner loop (forward)
            
    		  if( a[in] > a[in+1] ) {       // out of order?
               
    			  swap(in, in+1);          	// swap them
    		  } // end if
    	  } //end in
      } // end out
   }  // end bubbleSort()
//--------------------------------------------------------------
   public void selectionSort() {
	   int out, in, min;
	   for(out=0; out<nElems-1; out++) {   	// outer loop
	   
		   min = out;                     	// minimum
		   
		   for(in=out+1; in<nElems; in++) { // inner loop

			   if(a[in] < a[min] ) {        // if min greater,

				   min = in;               	// we have a new min
			   } // end if
		   } // end for
		   
		   swap(out, min);                	// swap them
		   
	   }  // end for(out)
   }  // end selectionSort()
//--------------------------------------------------------------
   public void insertionSort() {
	   int in, out;
	   for(out=1; out<nElems; out++) {    	// out is dividing line
		   
		   long temp = a[out];            	// remove marked item
		   in = out;                      	// start shifts at out

		   while(in>0 && a[in-1] >= temp) { // until one is smaller,
		   
			   a[in] = a[in-1];            	// shift item to right
			   --in;                       	// go left one position
		   } // end while
		   
		   a[in] = temp;                  	// insert marked item
		   
	   }  // end for
   }  // end insertionSort()
 //--------------------------------------------------------------
   public static void sortTimer(Sort arr, sortMethod sort, arrayType aType) {

	   timerCounter++;
	   
	   String trailer = output.get(aType); // choose ending phrase
	   
	   // column adjust ending phrase
	   if (sort == sortMethod.bubbleSort) { 
		   trailer += "...";
	   }
	   
	   System.out.printf("%s %,d elements of %s", sort, arr.a.length, trailer);

	   // start timer
	   long start = System.currentTimeMillis(); 
		
	   switch (sort) {
		
		   case bubbleSort:
			   arr.bubbleSort();             	// bubble sort them
			   break;
		   case selectionSort:
			   arr.selectionSort();            // bubble sort them
			   break;
		   case insertionSort:
			   arr.insertionSort();            // bubble sort them
			   break;
	   	}
		
		// stop timer
		long end = System.currentTimeMillis(); 
			  
		// display time
		System.out.printf("%10.3f s\n", (end - start)/1000.0);
		
		// print a blank line after every third line
		if ((timerCounter % 3) == 0) {
			
			timerCounter = 0;
			System.out.println();
		}

   } // end sort timer
//--------------------------------------------------------------
   private void swap(int one, int two) {
      
      long temp = a[one];
      a[one] = a[two];
      a[two] = temp;
   }
//--------------------------------------------------------------
}  // end class Sort
////////////////////////////////////////////////////////////////
class SortApp {
	
   public static void main(String[] args) {
      
	   int maxSize = 100000;            // array size
	   Sort arrB;                 		// reference to array for Bubble sort
	   Sort revArrB;					// array of reversed elements for Bubble sort
	   Sort sortedArrB;					// array of sorted elements for Bubble sort

	   Sort arrS;                 		// reference to array for Selection sort
	   Sort revArrS;					// array of reversed elements for Selection sort
	   Sort sortedArrS;					// array of sorted elements for Selection sort
  
	   Sort arrI;                 		// reference to array for Insertion sort
	   Sort revArrI;					// array of reversed elements for Insertion sort
	   Sort sortedArrI;					// array of sorted elements for Insertion sort

	   arrB = new Sort(maxSize);  		// create the arrays for Bubble sort
	   revArrB = new Sort(maxSize);
	   sortedArrB = new Sort(maxSize);
	   arrS = new Sort(maxSize);  		// create the arrays for Selection sort
	   revArrS = new Sort(maxSize);
	   sortedArrS = new Sort(maxSize);
	   arrI = new Sort(maxSize);  		// create the arrays for Insertion sort
	   revArrI = new Sort(maxSize);
	   sortedArrI = new Sort(maxSize);
  
	   for(int j=0; j<maxSize; j++)	{				// fill first group of arrays with
	   												// random numbers 
		   	long n = (long)( java.lang.Math.random()*(maxSize-1) );
		   	arrB.insert(n);							// (arrays will contain identical random numbers)
		   	arrS.insert(n);
		   	arrI.insert(n);
	   }

	   for(int j=maxSize-1; j>=0; j--) {			// fill second group of arrays with
		   											// reverse sorted numbers
		   revArrB.insert(j);						// (arrays will contain identical numbers)
		   revArrS.insert(j);
		   revArrI.insert(j);
	   }

	   for(int j=0; j<maxSize; j++) {				// fill third group of arrays with
		   											// forward sorted numbers
		   sortedArrB.insert(j);					// (arrays will contain identical numbers)
		   sortedArrS.insert(j);
		   sortedArrI.insert(j);
	   }

	   //arr.display();                // display items

	   // perform bubble sort on the 3 arrays
	   Sort.sortTimer(arrB, Sort.sortMethod.bubbleSort, Sort.arrayType.random);
	   Sort.sortTimer(revArrB, Sort.sortMethod.bubbleSort, Sort.arrayType.reversed);
	   Sort.sortTimer(sortedArrB, Sort.sortMethod.bubbleSort, Sort.arrayType.sorted);

	   // perform selection sort on the 3 arrays
	   Sort.sortTimer(arrS, Sort.sortMethod.selectionSort, Sort.arrayType.random);
	   Sort.sortTimer(revArrS, Sort.sortMethod.selectionSort, Sort.arrayType.reversed);
	   Sort.sortTimer(sortedArrS, Sort.sortMethod.selectionSort, Sort.arrayType.sorted);
  
	   // perform insertion sort on the 3 arrays
	   Sort.sortTimer(arrI, Sort.sortMethod.insertionSort, Sort.arrayType.random);
	   Sort.sortTimer(revArrI, Sort.sortMethod.insertionSort, Sort.arrayType.reversed);
	   Sort.sortTimer(sortedArrI, Sort.sortMethod.insertionSort, Sort.arrayType.sorted);
  
	   //arr.display();                // display them again

   }  // end main()
}  // end class SortApp
////////////////////////////////////////////////////////////////
