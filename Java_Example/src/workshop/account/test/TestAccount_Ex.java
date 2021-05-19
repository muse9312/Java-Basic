package workshop.account.test;

import java.util.Scanner;

import workshop.account.entity.Account_Ex;

public class TestAccount_Ex {

	public static void main(String[] args) {

		Account_Ex AE = new Account_Ex();
		Scanner scanner = new Scanner(System.in);

		AE.setCustId("A1100");
		AE.setAccId("221-22-3477");
		AE.setBalance(100000);
		AE.setCustName("오세원");
		int amount;
		int choice1;

		System.out.println("안녕하십니까 고객님");
		System.out.println("고객님의 성함을 입력해주십시오");
		String A; // 이름
		// * 선언문은 반복문 안에 안쓰는게 좋다!!!!

		while (true) {
			A = scanner.next();
			if (A.equals("오세원")) {
				System.out.printf(" %s 님의 고객번호는 %s 입니다  ", AE.getCustName(), AE.getCustId());
				break;
			} else {
				System.out.println("고객님은 등록 되지않았습니다. 다시 입력해주십시오");

			}
		}
		System.out.println("계좌번호를 입력해주십시오");
		String B;

		while (true) {
			B = scanner.next();
			if (B.equals("221-22-3477")) {
				System.out.printf("오세원님의 계좌잔액은 %d 남았습니다%n", AE.getBalance());
				break;
			} else {
				System.out.println("고객정보가 다릅니다. 다시 입력해주십시오");

			}
		}

		System.out.println("서비스를 선택해 주십시오");

		System.out.println("입금은 1번 , 출금은 2번을 눌러주십시오");
		choice1 = scanner.nextInt();
		switch (choice1) {
		case 1:
			System.out.println("입금 금액을 입력해주십시오");
			amount = scanner.nextInt();
			AE.deposit(amount);
			System.out.printf("네, 입금되었습니다. 오세원님의 계좌잔액은 %d 입니다%n", AE.getBalance());
			break;

		case 2:
			System.out.println("출금 금액을 입력해주십시오");
			amount = scanner.nextInt();
			AE.withdraw(amount);
			System.out.printf("네, 출금되었습니다. 오세원님의 계좌잔액은 %d 입니다", AE.getBalance());

			break;
		}

		System.out.println("이용해주셔서 감사합니다. 안녕히 가십시오^^");

//		String C = scanner.next();
//		if (C.equals("입금")) {
//			System.out.println("금액을 입력해주십시오");
//		String D = scanner.next();			
//			System.out.printf("네, 입금되었습니다.현재 고객님의 잔액은 %d 입니다 .",AE.deposit());
//			
//			
//			
//		
//		} else if (C.equals("출금")) {
//			System.out.println("금액을 입력해주십시오");
//		
//		}

//		while (A.equals("오세원")) {
//			System.out.printf(" %s 님의 고객번호는 %s 입니다  ", AE.getCustName() ,AE.getCustId());
//			System.out.println("고객님은 등록 되지않았습니다. 다시 입력해주십시오");
//			
//			
//		}   

	}

	public void CustID(String CUSTID) {

	}

}
