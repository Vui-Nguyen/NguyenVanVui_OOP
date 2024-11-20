package bai1Person;

public class Test {
	public static void main(String[] args) {
		Person p=new Person();
		p.setName("nguyen van a");
		p.setDob("23.8.256");
		p.setPob("ha noi");
		p.setGender('M');
		p.setEmail("nguyn@gmail.com");
		p.setPhone("1325431");
		System.out.println(p.getDob()+p.getEmail()+p.getGender()+p.getName()+p.getPhone()+p.getPob());
		
	}

}
