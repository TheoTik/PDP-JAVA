package transport;
import java.io.Serializable;

public class Coordonnees implements Serializable {
	private static final long serialVersionUID = -5286747764101397330L;

	private float x;
	private float y;
	
	public Coordonnees(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	@Override
	public String toString() {
		return this.x + ";"+this.y;
	}
	
	@Override
	public int hashCode() {
		return (int) ((x-y)*1000000);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof Coordonnees))
			return false;
		Coordonnees o = (Coordonnees) obj;
		if(o.x!=this.x)
			return false;
		if(o.y!=this.y)
			return false;
		return true;
	}
	
}
