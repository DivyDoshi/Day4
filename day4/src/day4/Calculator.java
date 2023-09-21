package day4;

public class Calculator {
	private int no,no1;
	private String sname;
	private int Add;
	private int Sub;
	private int Div;
	private int Mul;
	
	public Calculator(int no, int no1, String sname, int add, int sub, int div, int mul) {
		super();
		this.no = no;
		this.no1 = no1;
		this.sname = sname;
		Add = add;
		Sub = sub;
		Div = div;
		Mul = mul;
	}

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public int getSub() {
		return (no-no1);
	}

	public void setSub(int sub) {
		Sub = sub;
	}

	public int getDiv() {
		return (no/no1);
	}

	public void setDiv(int div) {
		Div = div;
	}

	public int getMul() {
		return (no*no1);
	}

	public void setMul(int mul) {
		Mul = mul;
	}

	public int getAdd() {
		return (no+no1);
	}

	public void setAdd(int add) {
		Add = add;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	

	public int getNo1() {
		return no1;
	}
	public void setNo1(int no1) {
		this.no1 = no1;
	}
	

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Calculator [no=" + no + ", no1=" + no1 + ", sname=" + sname + ", Add=" + Add + "]";
	}

	
	}
	

