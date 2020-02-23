package com.atguigu.ioc.life;

public class Person {
	private Integer id;
    private String sex;
    private String name;
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		System.out.println("Two������ע��");
		this.id = id;
	}
	public Person() {
		System.out.println("One����������");
	}
	
	//init()��destroy()�����Զ�������
    public void init(){
    	System.out.println("Three:��ʼ��");
    }
    
    public void destory(){
    	System.out.println("Five:����");
    }
    
	@Override
	public String toString() {
		return "Four:Person [id=" + id + ", sex=" + sex + ", name=" + name + "]";
	}
	public Person(Integer id, String sex) {
		super();
		this.id = id;
		this.sex = sex;
	}
    
}
