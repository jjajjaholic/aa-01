import java.util.LinkedList;
import java.util.Queue;

public class Trap {
	// ����
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
				System.out.println("�����Դϴ�.");
			}else {
				System.out.println("���� �ٴ��� ��������");
			}
		}else {
			System.out.println("������ �ʱ�ȭ�˴ϴ�.");
			rightAnswer.clear();
			setAnswer();
		}
		
	}
	
	

}
