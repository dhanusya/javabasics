
public class Emergency {
	String Name;
	int phoneNumber;
	String Location;
	String place;
	static String Type;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getType() {
		return Type;
	}
	public String setType(String Type) {
		Emergency.Type =Type ;
         return Type;	
	}
	
	public String display(){
		switch(Type){
		case "Injury":		     
			return "Ambulance";
		case " Fire":
                  return "FireService";
		case "Murder":
                  return "police";
		case  "Help":
                   return "Service provider";
		default:
			return "nomessage";
	}
	}
public static void main(String args[]){
	Emergency e1=new Emergency();
		e1.setName("dhanusya");
	e1.setPhoneNumber(56437865);
	e1.setLocation("ksr school");
	e1.setType("Injury");
	e1.display();
		System.out.println(e1.getName());
		System.out.println(e1.getPhoneNumber());
		System.out.println(e1.getLocation());
		System.out.println(e1.getType());
	System.out.println("the method is "+e1.display());
}
}
	
	
	
	
	
	
	


