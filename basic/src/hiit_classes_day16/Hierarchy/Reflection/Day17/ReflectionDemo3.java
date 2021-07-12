package hiit_classes_day16.Hierarchy.Reflection.Day17;

public class ReflectionDemo3 {
	public static void main(String[] args) throws Exception{
//		
//	 Student s =(Student)Class.forName("hiit_classes_day16.Hierarchy.Reflection.Day17.JavaStudent").getConstructor().newInstance();
//	 System.out.println(s);
//	 
		Student s=(Student)Class.forName("hiit_classes_day16.Hierarchy.Reflection.Day17.JavaStudent")
				.getDeclaredConstructor().newInstance();
		System.out.println(s);
		
		s=(Student)Class.forName("hiit_classes_day16.Hierarchy.Reflection.Day17.JavaStudent")
				.getDeclaredConstructor(String.class).newInstance("ramu");
		System.out.println(s);

	}

}

abstract class Student {
	
}

class JavaStudent extends Student{
	
	public JavaStudent() {

	}
	
	public JavaStudent(String s) {
		
	}
}
