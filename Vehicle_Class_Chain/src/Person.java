/*
 * Author: Diana Knieste
 * Date: 5/20/2015
 * Description: Creating classes of people and vehicles
 */
import java.util.UUID;
import java.lang.Object;

public class Person {

	private String FirstName;
	private String LastName;
	private static UUID PersonID;
	
	protected Person(){}

	protected Person(String FirstName, String LastName, UUID PersonID){
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.PersonID = UUID.randomUUID();
	}
	
	public String getFirstName(){
		return FirstName;
	}
	public String getLastName(){
		return LastName;
	}
	public UUID getPersonID(){
		return PersonID;
	}
	public void setFirstName(String FirstName){
		this.FirstName = FirstName;
	}
	public void setLastName(String LastName){
		this.LastName = LastName;
	}
	public void setPersonID(){
		this.PersonID = UUID.randomUUID();
	}
}
