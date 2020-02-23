package hechengfuyong;

public class StudentDAO {
	private DBUtil dBOperator;
	String id;
	public void setDBOperator(DBUtil dBOperator) {
		this.dBOperator=dBOperator;
	}
	public void findStudentById(String id) {
		this.id=id;
		String StudentById=dBOperator.getConnection();
		System.out.println(StudentById);
	}
	public void findAllStudents() {
		dBOperator.find();
	}
}
