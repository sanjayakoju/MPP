package practise3;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	private String phone;
	private int age;
	private List<Role> roleList;
	
	public Person(String name, String phone, int age, List<Role> rList) {
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.roleList = new ArrayList<>();
		this.roleList = rList;
	}
	
	
	public List<Role> getRoles() {
		return roleList;	
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public List<Role> getRoleList() {
		return roleList;
	}


	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", age=" + age + ", roleList=" + roleList + "]";
	}
	
	
}
