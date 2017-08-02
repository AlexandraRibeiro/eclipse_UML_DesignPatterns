package avaj_launcher;

public class Baloon extends Aircraft implements Flyable {

	private WeatherTower weatherTower;
	
	Baloon(String name, Coordinates coordinates) {
		super(name, coordinates);
	}
	
	
	@Override
	public void updateConditions() {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerTower(WeatherTower weatherTower) {
		String logBaloon = "Tower says: " + "Baloon#" + name + "(" + Long.toString(id) + ") registered to weather tower.";
		this.weatherTower = weatherTower;
		this.weatherTower.register(this); //Tower.java
		
		Tools.arrLogs.add(logBaloon); //debug > put in file
	}

}
