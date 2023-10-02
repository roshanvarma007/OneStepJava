package oopProject;

public class student {

	private String name;
	private String collage;
	private int passYear;
	private String job;


	// NOw Again declear a cunstroctor
	
	public student (String name,String collage,int paasYear , String  job) {
		this.name = name ;
		this.collage = collage;
		this.passYear = passYear;
		this.job = job;
	}
	
	public void startJourney() {
		System.out.println("Name : "+ this.name);
	}
	
	public void collageJourney() {
		System.out.println(this.name+"has joined "+ this.collage + "passed in year of :" + this.passYear);
	}
	
	public void jobJourney() {
		System.out.println(this.name + "Now working in international company " + this.job);
	}
}
