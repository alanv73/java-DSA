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

/***************************************************************************************
 * 
 * Chapter 3 Experiments 1 - 3
 * 
 * using Intel Core i5 3470 @ 3.20 GHz / 16GB RAM
 * 
 * bubbleSort 140,000 elements of random unsorted data......    29.853 s
 * selectionSort 140,000 elements of random unsorted data...     8.549 s
 * insertionSort 140,000 elements of random unsorted data...     7.761 s
 * 
 * bubbleSort 140,000 elements of reverse sorted data.......    15.648 s
 * selectionSort 140,000 elements of reverse sorted data....     9.318 s
 * insertionSort 140,000 elements of reverse sorted data....    15.510 s
 * 
 * bubbleSort 140,000 elements of forward sorted data.......     6.203 s
 * selectionSort 140,000 elements of forward sorted data....     7.734 s
 * insertionSort 140,000 elements of forward sorted data....     0.001 s
 *
 *
 * using Intel Core i7 7700HQ @ 2.80 GHz / 16GB RAM
 * 
 * bubbleSort 140,000 elements of random unsorted data......    34.401 s
 * selectionSort 140,000 elements of random unsorted data...     6.648 s
 * insertionSort 140,000 elements of random unsorted data...     6.234 s
 * 
 * bubbleSort 140,000 elements of reverse sorted data.......    16.600 s
 * selectionSort 140,000 elements of reverse sorted data....    10.313 s
 * insertionSort 140,000 elements of reverse sorted data....    12.454 s
 * 
 * bubbleSort 140,000 elements of forward sorted data.......     8.834 s
 * selectionSort 140,000 elements of forward sorted data....     6.195 s
 * insertionSort 140,000 elements of forward sorted data....     0.000 s
 * 
 ****************************************************************************************/

class Sort {
   
	static enum sortMethod {bubbleSort, selectionSort, insertionSort, chazInsertionSort}; 
	static enum arrayType {random, reversed, sorted}; 
	private static Dictionary<arrayType, String> output;
	private static int timerCounter = 0;
	private long[] a;                 	// reference to array 'a'
	private int nElems;               	// number of data items
//--------------------------------------------------------------
	static {
		
		output = new Hashtable<arrayType, String>();
		output.put(arrayType.random, "random unsorted data");
		output.put(arrayType.reversed, "reverse sorted data");
		output.put(arrayType.sorted, "forward sorted data");

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
	   
	   int in;
	   for(int out=1; out<nElems; out++) {    	// out is dividing line
		   
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
	public void insertionSortChaz() {
		
		for (int j = 0; j < nElems - 1; j++) {
			
			long lowest = a[j];
			int lowestIndex = j;
			
			for (int i = j + 1; i < nElems; i++) {
				
				if (a[i] < lowest) {
					lowest = a[i];
					lowestIndex = i;
				}
			} // end i
			
			for (int k = lowestIndex; k > j; k--) {
				
				a[k] = a[k - 1];
			} // end k
			
			if (j != lowestIndex) {

				a[j] = lowest;
			}
			
		} // end j
	}
//--------------------------------------------------------------
   public static void sortTimer(Sort arr, sortMethod sort, arrayType typeOfArray) {

	   timerCounter++;
	   
	   String label = String.format("%s %,d elements of %s", sort, arr.a.length, output.get(typeOfArray));
	   
	   label = rightPad(label, '.', 57);
	   
	   System.out.printf("%-57s", label);

	   // start timer
	   long start = System.currentTimeMillis(); 
		
	   switch (sort) {
		
		   case bubbleSort:
			   arr.bubbleSort();             	// bubble sort them
			   break;
		   case selectionSort:
			   arr.selectionSort();            // selection sort them
			   break;
		   case insertionSort:
			   arr.insertionSort();            // insertion sort them
			   break;
		   case chazInsertionSort:
			   arr.insertionSortChaz();            // Chaz insertion sort them
			   break;
	   	}
		
		// stop timer
		long end = System.currentTimeMillis(); 
			  
		// display time
		System.out.printf("%10.3f s\n", (end - start)/1000.0);
		
		// print a blank line after every third line
		if ((timerCounter % 4) == 0) {
			
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
   private static String rightPad(String s, char p, int n) {
	   
	   int lengthDifference = n - s.length();
	   
	   for (int i = 0; i < lengthDifference; i++) {
		
		   s += p;
	   }
	   
	   return s;
   }
 //--------------------------------------------------------------
}  // end class Sort
////////////////////////////////////////////////////////////////
class SortApp {
	
   public static void main(String[] args) {
      
	   int maxSize = 140000;            // array size 
	   Sort arrB;                 		// reference to array for Bubble sort
	   Sort revArrB;					// array of reversed elements for Bubble sort
	   Sort sortedArrB;					// array of sorted elements for Bubble sort

	   Sort arrS;                 		// reference to array for Selection sort
	   Sort revArrS;					// array of reversed elements for Selection sort
	   Sort sortedArrS;					// array of sorted elements for Selection sort
  
	   Sort arrI;                 		// reference to array for Insertion sort
	   Sort revArrI;					// array of reversed elements for Insertion sort
	   Sort sortedArrI;					// array of sorted elements for Insertion sort

	   Sort arrChazI;
	   Sort revArrChazI;
	   Sort sortedArrChazI;

	   arrB = new Sort(maxSize);  		// create the arrays for Bubble sort
	   revArrB = new Sort(maxSize);
	   sortedArrB = new Sort(maxSize);
	   arrS = new Sort(maxSize);  		// create the arrays for Selection sort
	   revArrS = new Sort(maxSize);
	   sortedArrS = new Sort(maxSize);
	   arrI = new Sort(maxSize);  		// create the arrays for Insertion sort
	   revArrI = new Sort(maxSize);
	   sortedArrI = new Sort(maxSize);
	   arrChazI = new Sort(maxSize);
	   revArrChazI = new Sort(maxSize);
	   sortedArrChazI = new Sort(maxSize);
  
	   for(int j=0; j<maxSize; j++)	{				// fill first group of arrays with
	   												// random numbers 
		   	long n = (long)( java.lang.Math.random()*(maxSize-1) );
		   	arrB.insert(n);							// (arrays will contain identical random numbers)
		   	arrS.insert(n);
		   	arrI.insert(n);
		   	arrChazI.insert(n);
	   }

	   for(int j=maxSize-1; j>=0; j--) {			// fill second group of arrays with
		   											// reverse sorted numbers
		   revArrB.insert(j);						// (arrays will contain identical numbers)
		   revArrS.insert(j);
		   revArrI.insert(j);
		   revArrChazI.insert(j);
	   }

	   for(int j=0; j<maxSize; j++) {				// fill third group of arrays with
		   											// forward sorted numbers
		   sortedArrB.insert(j);					// (arrays will contain identical numbers)
		   sortedArrS.insert(j);
		   sortedArrI.insert(j);
		   sortedArrChazI.insert(j);
	   }

	   //arr.display();                // display items

//	   // different order
//	   // perform bubble sort on the 3 bubble sort arrays
//	   Sort.sortTimer(arrB, Sort.sortMethod.bubbleSort, Sort.arrayType.random);
//	   Sort.sortTimer(revArrB, Sort.sortMethod.bubbleSort, Sort.arrayType.reversed);
//	   Sort.sortTimer(sortedArrB, Sort.sortMethod.bubbleSort, Sort.arrayType.sorted);
//
//	   // perform selection sort on the 3 selection sort arrays
//	   Sort.sortTimer(arrS, Sort.sortMethod.selectionSort, Sort.arrayType.random);
//	   Sort.sortTimer(revArrS, Sort.sortMethod.selectionSort, Sort.arrayType.reversed);
//	   Sort.sortTimer(sortedArrS, Sort.sortMethod.selectionSort, Sort.arrayType.sorted);
//  
//	   // perform insertion sort on the 3 insertion sort arrays
//	   Sort.sortTimer(arrI, Sort.sortMethod.insertionSort, Sort.arrayType.random);
//	   Sort.sortTimer(revArrI, Sort.sortMethod.insertionSort, Sort.arrayType.reversed);
//	   Sort.sortTimer(sortedArrI, Sort.sortMethod.insertionSort, Sort.arrayType.sorted);

	   // perform the three sorts on the random arrays
	   Sort.sortTimer(arrB, Sort.sortMethod.bubbleSort, Sort.arrayType.random);
	   Sort.sortTimer(arrS, Sort.sortMethod.selectionSort, Sort.arrayType.random);
	   Sort.sortTimer(arrI, Sort.sortMethod.insertionSort, Sort.arrayType.random);
	   Sort.sortTimer(arrChazI, Sort.sortMethod.chazInsertionSort, Sort.arrayType.random);

	   // perform the three sorts on the reversed arrays
	   Sort.sortTimer(revArrB, Sort.sortMethod.bubbleSort, Sort.arrayType.reversed);
	   Sort.sortTimer(revArrS, Sort.sortMethod.selectionSort, Sort.arrayType.reversed);
	   Sort.sortTimer(revArrI, Sort.sortMethod.insertionSort, Sort.arrayType.reversed);
	   Sort.sortTimer(revArrChazI, Sort.sortMethod.chazInsertionSort, Sort.arrayType.reversed);
  
	   // perform the three sorts on the sorted arrays
	   Sort.sortTimer(sortedArrB, Sort.sortMethod.bubbleSort, Sort.arrayType.sorted);
	   Sort.sortTimer(sortedArrS, Sort.sortMethod.selectionSort, Sort.arrayType.sorted);
	   Sort.sortTimer(sortedArrI, Sort.sortMethod.insertionSort, Sort.arrayType.sorted);
	   Sort.sortTimer(sortedArrChazI, Sort.sortMethod.chazInsertionSort, Sort.arrayType.sorted);

	   //arr.display();                // display them again

   }  // end main()
}  // end class SortApp
////////////////////////////////////////////////////////////////
