package OOP01.encapsule;

public class PayService {
	/*
 	����...
 	income = salay - tax;
 */
	PayVO vo = new PayVO();

	public void input(String name, int salary){
		vo.setName(name);
		vo.setSalary(salary);
	}
	public int taxValue(){
		return (int) (vo.TAX*100);
	}
	public int realSalary(){
		return vo.getSalary() - ((int)(vo.getSalary()*vo.TAX));
	}
	
	/*public void disPlay(){ 
	System.out.println("=====�޿�����=====");
	System.out.println("���� : " + vo.getName());
	System.out.println("���� : " + vo.getSalary()+"��");
	System.out.println("���� : "+vo.getTax()*100 +"%");
	System.out.println("�Ǽ��ɾ� : "+vo.getIncome()+"��");
	}*/
}
