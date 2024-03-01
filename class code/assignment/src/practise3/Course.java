package practise3;

public class Course {

	private int id;
	private String title;
	private double unit;
	
	public Course(int id, String title, double unit) {
		this.id = id;
		this.title = title;
		this.unit = unit;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getUnit() {
		return unit;
	}
	public void setUnit(double unit) {
		this.unit = unit;
	}
	
	public double getUnits() {
		return getUnit();
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", unit=" + unit + "]";
	}
	
	
}
