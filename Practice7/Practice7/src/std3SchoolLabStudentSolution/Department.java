package std3SchoolLabStudentSolution;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Department {
	private String name;
	private List<Person> persons;

	public Department(String name) {
		this.name = name;
		this.persons = new ArrayList<Person>();

	}

	public void addPerson(Person p) {
		this.persons.add(p);
	}

	public List<Person> getPersons() {
		return this.persons;
	}

	public void showAllMembers() {
//		for (Person p : persons) {
//			System.out.print("Name: " + p.getName() + " phone: " + p.getPhone() + " age: " + p.getAge() + " role: ");
//			for (Role pRole : p.getRoles()) {
//				System.out.print(pRole.getClass().getSimpleName() + " ");
//			}
//			System.out.println("\n");
//		}

		persons.stream().forEach(p -> {
			System.out.print("Name: " + p.getName() + " phone: " + p.getPhone() + " age: " + p.getAge() + " role: ");
			p.getRoles().stream().flatMap(role -> p.getRoles().stream())
					.forEach(r -> System.out.print(r.getClass().getSimpleName() + " "));
			System.out.println("\n");
		});

	}

	public void unitsPerFaculty() {
//		for (Person p : persons) {
//			for (Role pRole : p.getRoles()) {
//				if (pRole instanceof Faculty) {
//					System.out.println("Name: " + p.getName() + " Units: " + pRole.getUnits() + "\n");
//				}
//			}
//		}

		persons.stream()
				.flatMap(person -> person.getRoles().stream().filter(role -> role instanceof Faculty)
						.map(role -> "Name: " + person.getName() + " Units: " + role.getUnits()))
				.forEach(System.out::println);
	}

	public double getTotalSalary() {
		return persons.stream().flatMap(person -> person.getRoles().stream()).map(role -> role.getSalary()).reduce(0.0,
				(x, y) -> x + y);
//		for (Person p : persons) {
//			for (Role pRole : p.getRoles()) {
//				sumSalary += pRole.getSalary();
//			}
//		}
//		return sumSalary;
	}

	public void showStudentsByFaculty(String name) {
		List<Course> facultyCourse = persons.stream().filter(person -> person.getName().equals(name))
				.filter(person -> person.getRoles().stream().anyMatch(role -> role instanceof Faculty))
				.flatMap(person -> person.getRoles().stream().filter(role -> role instanceof Faculty)
						.flatMap(role -> ((Faculty) role).getCourses().stream()))
				.distinct().collect(Collectors.toList());
		System.out.println("Students taught by faculty member :: " + name);
		persons.stream()
				.filter(person -> person.getRoles().stream().filter(role -> role instanceof Student)
						.anyMatch(student -> ((Student) student).getCourses().stream().anyMatch(
								course -> facultyCourse.stream().anyMatch(course1 -> course.equals(course1)))))
				.forEach(person -> {
					System.out.println(person.getName() + " " + person.getPhone() + " " + person.getAge());
				});
	}
}
