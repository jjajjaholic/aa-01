
public abstract class TrapTileStep2 implements TrapTile {
	private TrapTile tile;
	
//	public TrapTileStep2(TrapTile tile) {
//		this.tile = tile;
//	}
	
	@Override
	public TrapTile nextTile() {
		return tile.nextTile();
	}
	
}
