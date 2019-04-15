
public class mergeClient {

	public static void main(String[] args) {
	      int maxSize = 100;             // array size
	      OrdArray arr = new OrdArray(maxSize);   // create the array

	      arr.insert(55);
	      arr.insert(22);
	      arr.insert(88);
	      arr.insert(00);
	      arr.insert(66);
	      arr.insert(33);

	      arr.display();

	      OrdArray arr2 = new OrdArray(maxSize);   // create the array

	      arr2.insert(77);                // insert 10 items
	      arr2.insert(44);
	      arr2.insert(99);
	      arr2.insert(11);

	      arr2.display();
	      
	      OrdArray out = OrdArray.merge(arr, arr2);
	      
	      out.display();

	}

}
