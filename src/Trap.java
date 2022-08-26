import java.util.LinkedList;
import java.util.Queue;

public class Trap {
	// 정답
	// List<String> rightAnswer = new ArrayList<>();
	Queue<TrapTile> rightAnswer = new LinkedList<>();
	private TrapTile trapTile;

	public Trap() {
		setAnswer();
	}

	public void setAnswer() {
		rightAnswer.add(new SunTile());
		rightAnswer.add(new BlueTile());
		rightAnswer.add(new OneTile());
	}

	public void forwrad(TrapTile tile) {
		trapTile = rightAnswer.poll();
		tile.step();
		if(trapTile.getClass().equals(tile.getClass())) {
			if(rightAnswer.isEmpty()) {
				System.out.println("성공입니다.");
			}else {
				System.out.println("다음 바닥을 밟으세요");
			}
		}else {
			System.out.println("함정이 초기화됩니다.");
			rightAnswer.clear();
			setAnswer();
		}
		
	}
	
	

}
