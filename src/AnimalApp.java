
public class AnimalApp {

	public static void main(String[] args) {
		
		Animal dog = new Animal();
		System.out.println(dog.sleep());
		System.out.println(dog.eat());
		
		
		Monkey monkey = new Monkey();
		System.out.println(monkey.climb());
		
		
		
		cat c = new cat();
		System.out.println(c.scratch());
		
		Unicorn u = new Unicorn();
		System.out.println(u.speak());
		System.out.println("Unicorn extends Animal");
		
		
		SaberToothTiger s = new SaberToothTiger();
		System.out.println(s.run());
		System.out.println(c.scratch());
		
		
		Fish f = new Fish();
		System.out.println("Fish extend Animals");
		System.out.println(f.eat());
		System.out.println(f.sleep());
	}

}
