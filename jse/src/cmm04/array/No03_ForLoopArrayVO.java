package cmm04.array;

public class No03_ForLoopArrayVO {

	
	void sum(int[] input) {
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
		}
		System.out.println("�Է� ���� 5���� ���� : " + sum);
	}
}
