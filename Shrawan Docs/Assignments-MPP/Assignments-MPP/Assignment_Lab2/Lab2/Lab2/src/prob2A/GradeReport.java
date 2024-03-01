package prob2A;

public class GradeReport {
	
	private Student student;
	private String remark;

	GradeReport(Student student) {
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	
}
