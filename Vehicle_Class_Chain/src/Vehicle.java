import java.util.UUID;

public abstract class Vehicle implements Vehicle_Interface {

		private String Name;
		private String Color;
		private Double Weight;
		private Person Owner;
		
		public void transferOwnership(Person newOwner){
			this.Owner = newOwner;
		}
		
		public String getName(){
			return Name;
		}
		public String getColor(){
			return Color;
		}
		public Double getWeight(){
			return Weight;
		}
		public Person getOwner(){
			return Owner;
		}
		public void setName(String Name){
			this.Name = Name;
		}
		public void setColor(String Color){
			this.Color = Color;
		}
		public void setWeight(Double Weight){
			this.Weight = Weight;
		}
		public void setOwner(Person Owner){
			this.Owner = Owner;
		}
}
