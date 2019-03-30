// a document can't be instantiated but children can
public abstract class Document {

	protected String name;
	
	public void printThatIExist() {
		System.out.println("Document exists!");
	}
	
	// declaration only
	public abstract void printDocumentName();
}
