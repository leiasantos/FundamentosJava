package interfacesApi;

public class Player implements Comparable<Player>{

	private int id;
	private String username;
	private float points;
	
	
	public Player(int id, String username, float points) {
		this.id = id;
		this.username = username;
		this.points = points;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public float getPoints() {
		return points;
	}


	public void setPoints(float points) {
		this.points = points;
	}

	public int compareTo( Player other) {
		if(this.points > other.points) {
			return -1;
		}
		else if(this.points < other.points) {
			return 1;
		}
		else {
			return this.username.compareTo(other.username);
		}
	}
	

	@Override
	public String toString() {
		return "("+this.id+")"+this.username+" | " + this.points;
	}

	
	
	
}
