package kwiaciarnia;

public class Box extends Container{
		
		Customer person;
		
		public Box(Customer person) {
			this.person = person;
		}
		
		public String toString() {
			return "Pude�ko w�a�ciciela " + person.getName() + "\n" + super.toString();
		}
}
