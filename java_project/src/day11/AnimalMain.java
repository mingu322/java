package day11;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Animal();
		dog.setName("k");
		dog.setSound("멍멍");
		dog.setLeg(4);
		
		System.out.println(dog.getName() +"\t"+  dog.getSound() + "\t" + dog.getLeg());
	}

}
