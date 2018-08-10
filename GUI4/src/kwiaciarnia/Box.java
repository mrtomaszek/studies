package kwiaciarnia;

public class Box extends Container{
		
		Customer person;
		
		public Box(Customer person) {
			this.person = person;
		}
		
		public String toString() {
			return "Pude³ko w³aœciciela " + person.getName() + "\n" + super.toString();
		}
}
