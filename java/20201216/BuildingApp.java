import java.util.*;
public class BuildingApp{
	public static void main(String[]args){
		List<Building> building=new LinkedList<>();
		building.add(new Building(4));
		building.get(0).display();
	}
}

class Building{
	int width;
	Building(int width){
		this.width=width;
	}
	public void display(){
		for(int i=0;i<this.width;i++){
			for(int j=0;j<this.width;j++){
				System.out.print('#');
			}
			System.out.println();
		}
	}
}
