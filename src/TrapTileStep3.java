
public abstract class TrapTileStep3 implements TrapTile {
	private TrapTile tile;

//	public TrapTileStep3(TrapTile tile) {
//		this.tile = tile;
//	}

	@Override
	public TrapTile nextTile() {
		return tile.nextTile();
	}
}
