package OOP01.encapsule;
/*
  Date : 2015.05.15 
  Author : ���α�
  Description : ���� ���� �� ����
  1�� ���� 2�� ���� 3�� ��
  
 */
public class GameRpsService {

	GameRpsVO vo = new GameRpsVO();
	
	// ���� ���� ���� ���� ���� �� ���� ����
	  
	public String showStringValue(int playersValue) {
		String str;
		switch(playersValue){
		case 1:
			str = "����";
			break;
		case 2:
			str = "����";
			break;
		case 3:
			str = "��";
			break;
		default:
			str = "1~3������ �Է��ϼ���";
			break;
		}
		return str;
	}
	public int disPlayComValue() {
		int i = (int)(Math.random()*3)+1;
		return i;
	}

	public String showWinner(int comValue, int playersValue) {
		String str;
		if(comValue<playersValue){
			str = "��ǻ�� �¸�";
		}if(comValue>playersValue){
			str = "����� �¸�";
		}else{
			str = "�����ϴ�.";
		}
		return str;
	}

	/*
	 * if(1<2<3<1)
	 * �μ��� ���� ���밪�� 1�ΰ��� ū���� ��
	 * �μ��� ���� ���밪�� 2�ΰ��� �ۼ��� ��
	 * 
	 * 
	 * */   

}
