
public enum dummy {
	Hinukumar("He is a Devops Engineer","25"),
	SivaKoti("He is a .Net Developer","27"),
	Prathibha("She is a Marketing Manager","23"),
	KiranKunch("He is a Network Engineer","35");

	private final String Description;
	private final String age;
	
	dummy(String Desc,String theAge){
		Description = Desc;
		age = theAge;
	}
	
	String getDesc() {
		return Description;
	}
	String getAge() {
		return age;
	}
	
}
