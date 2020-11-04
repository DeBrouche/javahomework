public class homework11_5_13_13 {
    public static void main(String[] args) 
			throws CloneNotSupportedException {
		//创建Course对象
		homework11_5_13_13Course course1 = new homework11_5_13_13Course("Data Structures");

		//向Course1中添加三个学生
		course1.addStudent("张三");
		course1.addStudent("李四");
		course1.addStudent("王五");

		//Clone Course1
		homework11_5_13_13Course course2 = course1.clone();

		// 向course2中添加三个学生
		course2.addStudent("陈六");
		course2.addStudent("刘七");

		//显示course1中的学生
		System.out.println("\ncourse1中学生数量："
			+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");
		System.out.println();

		//显示course2中的学生
		System.out.println("\ncourse2中学生数量："
			+ course2.getNumberOfStudents());
		String[] students2 = course2.getStudents();
		for (int i = 0; i < course2.getNumberOfStudents(); i++)
			System.out.print(students2[i] + ", ");
		System.out.println();
	}
}