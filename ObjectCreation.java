/* Aparna*/
public class ObjectCreation {
	static int count = 1;
	public ObjectCreation()
		 {
		System.out.println("Object created "+count+" times");
		}

	public static void main(String[] args) 
		{
		ObjectCreation obj = null;
		for(int i=1;i<6;i++) {
			obj = new ObjectCreation();
			count++;
		}
	}
}