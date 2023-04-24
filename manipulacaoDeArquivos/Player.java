package manipulacaoDeArquivos;

public class Player implements java.io.Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -96383262355594720L;
	private int id;
	private String name;
	private float score;
	
	public Player(int id, String name, float score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return id + " ; " + name + " ; " + score;
	}
	
	public String showInfo() {
		return "Player("+ id + "," + name + "," + score + ")";
	}
	

}
