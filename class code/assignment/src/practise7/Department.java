package practise7;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Department {
	private String name;
	private List<Person> persons;
	
	public Department(String name) {
		this.name = name;
		this.persons = new ArrayList<Person>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addPerson(Person p) {
		this.persons.add(p);
	}
	
	public List<Person> getPersons(){
		return this.persons;
	}
	
	public void showAllMembers() {

		for(Person p: persons) {
			System.out.print("Name: " + p.getName() + " phone: "+ p.getPhone()+ " age: "+ p.getAge() + " role: ");
			for(Role pRole: p.getRoles()) {
				System.out.print(pRole.getClass().getSimpleName() + " ");
			}
			System.out.print("\n");
		}
		System.out.println();
		

	}	
	
	// Using Lambda
	public void showAllMembersLS() {
		Map<String, String> faculties = persons.stream()
				.collect(Collectors.toMap(p-> "Name: " + p.getName()
												+ " phone: "+ p.getPhone()
												+ " age: "+ p.getAge(),
										  p -> p.getRoles().stream()
										  		.map(r->r.getClass().getSimpleName())
										  		.collect(Collectors.joining(" ")) ));
		System.out.println("Show All Member LS");
		faculties.forEach((k,v)->{
			System.out.println(k + " role: " + Optional.ofNullable(v).orElse(""));
		});
		
		
		persons.stream().forEach(p -> {
			System.out.print("Name: " + p.getName() + " phone: " + p.getPhone() + " age: " + p.getAge() + " role: ");
			p.getRoles().stream().flatMap(role -> p.getRoles().stream())
					.forEach(r -> System.out.print(r.getClass().getSimpleName() + " "));
			System.out.println("\n");
		});

		
	}
	
	public void unitsPerFaculty() {
		for(Person p :persons) {
			for(Role pRole: p.getRoles()) {
				if(pRole instanceof Faculty) {
					System.out.print("Name: " + p.getName() 
					+ " Units: " + pRole.getUnits() + "\n");
				}
			}
		}
	}
	
	// Using Lambda
	public void unitsPerFacultyLS() {
		Function<Person, Stream<Role>> facultyRoles = (p)-> p.getRoles().stream()
									.filter(r -> r instanceof Faculty); 
		
		Map<String, Faculty> faculties = persons.stream()
						.filter(p -> facultyRoles.apply(p).count() != 0)
						.collect(Collectors.toMap(Person::getName,
							p -> facultyRoles.apply(p).map(r->(Faculty)r).findFirst().get()));
		
		faculties.forEach((k,v)->{
			System.out.println("Name: " + k + " Units: " 
					+ Optional.ofNullable(v).orElseGet(()-> new Faculty(0.0)).getUnits());
		});
		
		persons.stream()
		.flatMap(person -> person.getRoles().stream().filter(role -> role instanceof Faculty)
				.map(role -> "Name: " + person.getName() + " Units: " + role.getUnits()))
		.forEach(System.out::println);

	}

	public double getTotalSalary() {
		double sumSalary = 0.0;
		for(Person p: persons) {
			for(Role pRole: p.getRoles()) {
				sumSalary+= pRole.getSalary();
			}
		}
		return sumSalary;

	}
	
	// Using Lambda
	public double getTotalSalaryLS() {		
		return persons.stream()
				.flatMap(p->p.getRoles().stream())
				.mapToDouble(Role::getSalary)
				.sum();
		
		/*return persons.stream()
		 * .flatMap(person -> person.getRoles().stream())
		 * .map(role -> role.getSalary())
		 * .reduce(0.0,	(x, y) -> x + y);*/
	}
	
	// Using Lambda
	public void showStudentNamesByFacultyLS(String name) {
		
		List<Course> coursesTaughtByFaculty = persons.stream()
				.filter(p->p.getName().equals(name))
				.flatMap(p->p.getRoles().stream())
				.filter(r -> r instanceof Faculty)
				.map(r->(Faculty)r)
				.limit(1)
				.flatMap(f->f.getCourses().stream())
				.collect(Collectors.toList());
				
		if(coursesTaughtByFaculty.isEmpty()) 
			System.out.println("No courses taught by Professor " + name + " yet.");
		else 
			persons.stream()
			.filter(p->p.getRoles().stream()
						.filter(r -> r instanceof Student)
						.map(r->(Student)r)
						.flatMap(s->s.getCourses().stream())
						.filter(c->coursesTaughtByFaculty.contains(c)).count() != 0)
			.map(p->p.getName())
			.forEach(System.out::println);
	}
}