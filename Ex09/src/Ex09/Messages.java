package Ex09;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Messages {
	public static void run(UserVO uvo) {
		Scanner s = new Scanner(System.in);
		MessageDAO ddao = new MessageDAO();
		UserDAO udao = new UserDAO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH-dd dd:mm:ss");
		boolean run = true;
		while(run) {
		System.out.println("\n\n**메세지관리**");
		System.out.println("------------------------------------------------");
		System.out.println("1.받은메세지 |2.보낸메세지 |3.메세지전송 |4.메세지삭제 |0.종료");
		System.out.println("------------------------------------------------");
		uvo = udao.read(uvo.getId());
		System.out.printf("이름:%s\t 포인트:%d\n", uvo.getUname(), uvo.getPoint());
		String menu = s.nextLine();
		switch(menu) {
		case "0":
			System.out.println("메인으로 돌아갑니다.");
			run = false;
			break;
		case "1":
			for(MessageVO vo : ddao.receiverList(uvo.getId())) {
				System.out.printf("%d\t%s(%s)\t%s\t%s\n",
						vo.getMid(), vo.getSender(), 
						vo.getUname(), sdf.format(vo.getSdate()), vo.getMessage());
				System.out.println("=========================================================================");
			}
			while(true) {
				System.out.print("삭제할 번호> ");
				String mid = s.nextLine();
				if(mid=="") break;
				System.out.println("삭제하시겠습니까(Y/y)?");
				String sel = s.nextLine();
				if(sel.equals("Y") || sel.equals("y") || sel.equals("ㅛ")) {
				ddao.receiveDel(Integer.parseInt(mid));
				System.out.println("받은 메세지가 삭제되었습니다.");
				break;
				}
			}
			break;
		case "2":
			for(MessageVO vo : ddao.sendList(uvo.getId())) {
				System.out.printf("%d\t%s(%s)\t%s\t%s\n",
						vo.getMid(), vo.getReceiver(), 
						vo.getUname(), sdf.format(vo.getSdate()), vo.getMessage());
				System.out.println("=========================================================================");
			}
			while(true) {
				System.out.print("삭제할 번호> ");
				String mid = s.nextLine();
				if(mid=="") break;
				System.out.println("삭제하시겠습니까(Y/y)?");
				String sel = s.nextLine();
				if(sel.equals("Y") || sel.equals("y") || sel.equals("ㅛ")) {
				ddao.sendDel(Integer.parseInt(mid));
				System.out.println("받은 메세지가 삭제되었습니다.");
				break;
				}
			}
			break;
		case "3":
			while(true) {
			System.out.print("받을 아이디> ");
			String receiver = s.nextLine();
			if(receiver=="") {
				System.out.println("전송을 취소합니다.");
			}else {
				UserVO vo = udao.read(receiver);
				if(vo.getUname()==null) {
					System.out.println("해당 아이디가 존재하지 않습니다.");
				}else {
					//메세지입력
					MessageVO mvo = new MessageVO();
					mvo.setSender(uvo.getId());
					mvo.setReceiver(receiver);
					System.out.println("메세지");
					String message = s.nextLine();
					if(message == "") { 
						System.out.println("메세지 전송을 취소합니다.");
					}else {
						mvo.setMessage(message);
						ddao.insert(mvo);
						udao.updatePoint(uvo.getId());
						System.out.println("메세지가 전송되었습니다.");
					}
					break;
				}
			}
		}
		break;
		case "4":
			break;
		default:
			System.out.println("메뉴를 다시 선택하세요.");
		}
		}
	}
}
