package InheritanceDemo;

public class Throws {

	public void div(int a, int b)throws ArithmeticException{
		//let us assume our arithmetic exception is our custom exception class
		if(b==0) {
			throw new ArithmeticException();
		}
		else {
		int c= a+b;
		
		System.out.println("add of two numbers:" +c);
		}
	}

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		Throws obj=new Throws();
		try {
		obj.div(5, 0);
		}
		catch(Exception e){
		System.out.println("code execution");
		}

	}
		

	

}
