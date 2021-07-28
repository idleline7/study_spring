package sample04;

public class MessageBeanImpl implements MessageBean{
	private String name;
	private String phone;
	private Outputter outputter; //FileOutputter 이 클래스를 세터로 참조하겠다 - 접근은 부모로 해야함
	
	public MessageBeanImpl() {
		System.out.println("기본 생성자");
	}

	public MessageBeanImpl(String name) {
		System.out.println("MessageBeanImpl(String name)");
		this.name = name;
	}

	public void setPhone(String phone) {
		System.out.println("setPhone(String phone)");
		this.phone = phone;
	}
	
	public void setOutputter(Outputter outputter) {
		System.out.println("setOutputter(Outputter outputter)");
		this.outputter = outputter;
	}

	@Override
	public void helloCall() {
		System.out.println("helloCall()");
		outputter.output("이름 = " + name + ", 핸드폰 = " + phone);
	}

}