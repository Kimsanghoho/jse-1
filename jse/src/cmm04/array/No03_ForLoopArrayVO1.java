package cmm04.array;

public class No03_ForLoopArrayVO1 {
	private int[] arr = new int[0];
	void sum() {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("�Է� ���� 5���� ���� : " + sum);
	}
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
}
