package hechengfuyong;

public class test {
	public static void main(String[] args) {
		StudentDAO studentdao=new StudentDAO();
		studentdao.setDBOperator(new NewDBUtil());
		String id = null;
		studentdao.findStudentById(id);
		studentdao.findAllStudents();
	}
}
