// orderedArray.java
// demonstrates ordered array class
// to run this program: C>java OrderedApp
////////////////////////////////////////////////////////////////
class OrdArray {
   private long[] a;                 // ref to array a
   private int nElems;               // number of data items
   //-----------------------------------------------------------
   public OrdArray(int max)          // constructor
   {
      a = new long[max];             // create array
      nElems = 0;
   }
   //-----------------------------------------------------------
   public int size()
   { return nElems; }
   //-----------------------------------------------------------
   public int find(long searchKey)
   {
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;

      while(true) {
         curIn = (lowerBound + upperBound ) / 2;
         if(a[curIn]==searchKey)
            return curIn;              // found it
         else if(lowerBound > upperBound)
            return nElems;             // can't find it
         else                          // divide range
            {
            if(a[curIn] < searchKey)
               lowerBound = curIn + 1; // it's in upper half
            else
               upperBound = curIn - 1; // it's in lower half
            }  // end else divide range
      }  // end while
   }  // end find()
   //-----------------------------------------------------------
   public void oldInsert(long value)    // put element into array
   {
      int j;
      for(j=0; j<nElems; j++)        // find where it goes
         if(a[j] > value)            // (linear search)
            break;
      for(int k=nElems; k>j; k--)    // move bigger ones up
         a[k] = a[k-1];
      a[j] = value;                  // insert it
      nElems++;                      // increment size
   }  // end place()
   //-----------------------------------------------------------
   public void insert(long value) {
	   int low = 0;
	   int hi = nElems - 1;
	   int mid = 0;
	   
	   while (true) {
		   if (nElems == 0) {
			   break;
		   }
		   mid = (low + hi)/2;
		   if (low > hi) {
			   break;
		   } else if (low == hi) {
			   break;
		   } else if (a[mid] == value) {
			   break;
		   } else {
			   if (a[mid] < value) {
				   low = mid + 1;
			   } else {
				   hi = mid - 1;
			   } // end if
		   } // end else
	   } // end while
	   if (a[mid] < value) {
		   mid++;
	   } else if (a[mid] == value) {
		   System.out.println("duplicate.. " + value + " not added.");
		   return;
	   } 
	   
	   int i;
	   for (i = nElems; i > mid; i--) {
		   a[i] = a[i - 1];
	   }
	   a[i] = value;
	   nElems++;
   } // end insert()
   //-----------------------------------------------------------
   public boolean oldDelete(long value)
   {
      int j = find(value);
      if(j==nElems)                  // can't find it
         return false;
      else                           // found it
         {
         for(int k=j; k<nElems; k++) // move bigger ones down
            a[k] = a[k+1];
         nElems--;                   // decrement size
         return true;
         }
   }  // end delete()
   //-----------------------------------------------------------
   public boolean delete(long value) {
	   int low = 0;
	   int hi = nElems - 1;
	   int targetElement = nElems;
	   
	   if (nElems == 0) {
		   return false;
	   }
	   
	   while (true) {
		   int mid = (low + hi)/2;
		   
		   if(a[mid] == value) {
			   targetElement = mid;
			   break;
		   } else {
			   if (a[mid] < value) {
				   low = mid + 1;
			   } else {
				   hi = mid - 1;
			   }
		   } // else
	   } // end while
	   
	   for (int i = targetElement; i < nElems; i++) {
		   a[i] = a[i + 1];
	   } // end for
	   nElems--;
	   return true;
   } // end delete
   //-----------------------------------------------------------
   public void display()             // displays array contents
   {
      for(int j=0; j<nElems; j++)       // for each element,
         System.out.print(a[j] + " ");  // display it
      System.out.println("");
   }
   //-----------------------------------------------------------
   public static OrdArray merge(OrdArray input1, OrdArray input2) {
	   int leftSize = input1.nElems;
	   int rightSize = input2.nElems;
	   
	   OrdArray output = new OrdArray((leftSize + rightSize) * 2);
	   
	   int l = 0, r = 0, i = 0;
	   
	   while (l < leftSize && r < rightSize) {
		   if (input1.a[l] < input2.a[r]) {
			   output.a[i] = input1.a[l];
			   l++; i++;
		   } else {
			   output.a[i] = input2.a[r];
			   r++; i++;
		   }
	   }
	   
	   if (l < leftSize) {
		   for (int j = l; j < leftSize; j++) {
			   output.a[i] = input1.a[j];
			   i++;
		   }
	   } else {
		   for (int j = r; j < rightSize; j++) {
			   output.a[i] = input2.a[j];
			   i++;
		   }
	   }
	   
	   output.nElems = leftSize + rightSize;
	   
	   return output;
	   
   } // end merge()
}  // end class OrdArray
