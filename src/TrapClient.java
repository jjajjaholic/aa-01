
public class TrapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trap trap = new Trap();

		TrapTile firstStep = new SunTile();
		trap.forwrad(firstStep);
		TrapTile secondStep = new RedTile();
		trap.forwrad(secondStep);
		
		firstStep = new SunTile();
		trap.forwrad(firstStep);
		secondStep = new BlueTile();
		trap.forwrad(secondStep);
		TrapTile thirdStep = new OneTile();
		trap.forwrad(thirdStep);
	}

}
