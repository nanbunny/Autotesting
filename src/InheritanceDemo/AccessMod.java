package InheritanceDemo;

public class AccessMod {
	//Access modifiers, lets us give access to one file data to other files and packages in a project
	
		// Types of modifiers
		// 1. default , 2. public, 3. Protected, 4. Private
		
		// create 2 variables below.
		// we did not mention any modifier to below variables, so they have default modifer.
		// Save the file and lets access these variables from Access2 class.
		
		int hours =4;
		int mins = 40;
		
		// Scenario 2: Public Modifier
		// create 2 variables below and add public modifier before it.
		// Save the file and lets access these variables from Access2 class and Access3 class
		
		public String name = "nandu";
		public String tool = "Selenium";
		
		// Scenario 3: private Modifier
			// create 2 variables below and add private modifier before it.
			// Save the file and lets access these variables from Access2 class and Access3 class
		   // you will not be able to access, as variables are private
		// we can call the variables in current class only
		private int a =2;
		private int b = 47;
		
		// Scenario 4: protected Modifier
		// create 2 variables below and add protected modifier before it.
		// Save the file and lets access these variables from Access2 class and Access3 class
		
		protected int x = 200;
		protected int z = 300;
		

}
