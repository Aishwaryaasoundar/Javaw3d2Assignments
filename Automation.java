package Week3.day2;

public class Automation  extends MultipleLanguage implements Language , Testtool
{

	public void selenium() {
		// TODO Auto-generated method stub
		
	}

	public void java() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		
	} 
	/*Assignment * on Abstraction
	===========
	Interface :Language
	     Methods   :Java()
	Interface :TestTool
	     Methods   :Selenium()
	AbstractClass :MultipleLangauge
	     Methods   :python() and un implemented method as ruby()
	Execution class: Automation 
		Implement all the methods of interface and abstract class in Automation class*/
	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.java();
		obj.python();
		obj.ruby();
	}
	
}
	
		
	


