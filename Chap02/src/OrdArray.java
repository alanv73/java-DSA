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
   private void oldInsert(long value)    // put element into array
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
		   if (low == hi) {
			   break;
		   } else if (a[mid] == value) {
			   break;
		   } else if (a[mid] < value) {
			   low = mid + 1;
		   } else {
			   hi = mid - 1;
		   } // end if
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
   private boolean oldDelete(long value)
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
	   
	   if (nElems == 0) {
		   return false;
	   }
	   
	   while (true) {
		   // TODO find value and delete it
	   }
   }
   //-----------------------------------------------------------
   public void display()             // displays array contents
   {
      for(int j=0; j<nElems; j++)       // for each element,
         System.out.print(a[j] + " ");  // display it
      System.out.println("");
   }
   //-----------------------------------------------------------
}  // end class OrdArray
