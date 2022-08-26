
public abstract class TrapTileStep1 implements TrapTile {
	private TrapTile tile;
	
//	public TrapTileStep1(TrapTile tile) {
//		this.tile = tile;
//	}
	

	@Override
	public TrapTile nextTile() {
		return tile.nextTile();
	}
	
	
}
