package student;

public class Student {

	int studentNum;
	private String name;
	private String major;
	private String address;
	private static int serial = Define.SERIAL;
	
	public Student(){
		this("이름 없음", "학과 없음", "주소 없음");
	}
	
	public Student(String name, String major, String address){
		this.name = name;
		this.major = major;
		this.address = address;
		++Student.serial;
		studentNum = serial;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
