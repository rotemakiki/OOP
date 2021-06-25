package BusinessLayer;

public class Empty extends Tile {
	
    public Empty(Position position) {
        super('.', position);
    }
    
    @Override
    public String contactWith(Player player) {
        return "";
    }
    
    @Override
    public String contactWith(Enemy enemy) {
        return "";
    }
    
    public int acceptContact(TileVisitor tileVisitor) {
        return 0; //not important
    }

	@Override
	public String toString() {
		return ".";
	}
    

}
