package day4;

public class car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number:");
//		int set_no = sc.nextInt();
//		System.out.println("Enter Number:");
//		int setno1 = sc.nextInt();
		
		Calculator cl = new Calculator();
		Calculator c2;
		cl.setSname("Addition");
		cl.setNo(12);
		cl.setNo1(5);
		
		System.out.println(cl.toString());
		
		int ans = cl.getAdd();
		System.out.println(ans);

	}

}
