package cmm01.var;
/*
 * UpCasting 
 * = ��ȯ(Conversion)
 * = promotion
 * = ������(implict) �ڵ���ȯ
 * : �ڹٰ� �����ϴ� �ڵ���ȯ���� �������� ����
 * ������ Ÿ���� ǥ�������� �����ʿ��� ���� ������ ��ȯ �ɶ��� �����ϴ�.
 */
public class No02_CastingDeomo {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
	
	byte varByte = 1;
	int varInt = 123;
	double varDou = 123.456;
	
	int upByte = (int)varByte;
	double upInt = (double)varInt; //��ȣ�� ���� ����
	
	/*
	 * DownCasting
	 * = ĳ����(Casting)
	 * ���� ����ȯ
	 * : ���α׷����� ��������� �����ϴ� Ÿ�Ժ�ȯ.
	 * ��պ�ȯ�� �Ǵ� ���� �ݵ�� ��������� ĳ���õǾ�� ��.
	 * ����!!!!! ������ �ս��� �߻��� �� �ִ�.
	 */
	float varFlo = 123.456f;
	int downFlo = (int) varFlo;

	System.out.println("�ٿ�ĳ���� ����� : " + downFlo);
	
	}
}
