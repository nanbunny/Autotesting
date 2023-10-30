package InheritanceDemo;

public class ObjectCreate {
		   public ObjectCreate(String name) {
		      // This constructor has one parameter, name.
		      System.out.println("Passed Name is :" + name );
		   }

		   public static void main(String []args) {
		      // Following statement would create an object myPuppy
		      ObjectCreate myPuppy = new ObjectCreate( "tommy" );
		   }


}
