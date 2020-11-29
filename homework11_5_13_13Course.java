public class homework11_5_13_13Course implements Cloneable {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public homework11_5_13_13Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

    @Override 
    //重写对象类中的克隆方法 可访问
	public homework11_5_13_13Course clone() throws CloneNotSupportedException {
		//浅层复制
		homework11_5_13_13Course courseClone =	(homework11_5_13_13Course)super.clone();
		//深层复制学生
		courseClone.students = students.clone();
		return courseClone;
	}

	public void dropStudent(String student) {
		
	}
}