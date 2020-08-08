
public class compostion_class {
	private String name;
	private dummy_class birthday;
	
	public compostion_class(String theName, dummy_class date){
      name = theName;
      birthday = date;
      System.out.println(this);
}
	public String toString() {
		return String.format("Your name is : %s and Your date of birth is : %s",name,birthday);
	}
}



