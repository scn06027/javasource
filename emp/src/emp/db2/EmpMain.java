package emp.db2;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		EmpDAO dao=new EmpDAO();
		
		while(flag) {
			System.out.println("===============================");
		
			System.out.println("1.Emp 전체 조회");
			System.out.println("2. 사원 조회");
			System.out.println("3. 사원 정보 수정");
			System.out.println("4. 사원 탈퇴");
			System.out.println("5. 사원 추가");
			System.out.println("6. 프로그램 종료");
			System.out.println("===============================");
			System.out.println();
			
			System.out.print("메뉴 선택>> ");
			int no=Integer.parseInt(sc.nextLine());
			
			switch(no) {
			case 1:
				List<EmpDTO> list=dao.getList(); //getlist 부르면 내가 리스트 값을 넘겨줄게 그니까 너도 리스트로 받아
				
				for(EmpDTO dto:list) {
					System.out.printf("%d %s %s %d %s %d %d \n",dto.getEmpno(),dto.getEname(),
							dto.getJob(),dto.getMgr(),dto.getHiredate(),
							dto.getComm(),dto.getDeptno());
				}
				break;
			case 2:
				System.out.print("\n조회할 사원번호 입력 >>");
				int empno=Integer.parseInt(sc.nextLine());
				EmpDTO row=dao.getRow(empno);
				System.out.printf("%d  %s  %s  %s  %d \n",row.getEmpno(),row.getEname(),
						row.getJob(),row.getHiredate(),
						row.getDeptno());
			case 3:
				System.out.print("\n수정할 사원번호 입력 >> ");
				empno=Integer.parseInt(sc.nextLine());
				System.out.print("\n변경할 매니저번호 입력 >> ");
				int mgr=Integer.parseInt(sc.nextLine());
				
				System.out.println(dao.update(empno, mgr)?"수정 성공":"수정 실패");
				break;
			case 4:
				System.out.print("\n탈퇴할 사원번호 입력 >> ");
				empno=Integer.parseInt(sc.nextLine());
				
				System.out.println(dao.delete(empno)?"탈퇴 성공":"탈퇴 실패");
				break;
			case 5:
				System.out.println("\n추가할 사원번호 입력 >> ");
				System.out.println("----------------------");
//				System.out.print("사원 번호: ");
//				empno=Integer.parseInt(sc.nextLine());
//				System.out.print("사원명: ");
//				String ename=sc.nextLine();
//				System.out.print("직무: ");
//				String job=sc.nextLine();
//				System.out.print("급여: ");
//				int sal=Integer.parseInt(sc.nextLine());
//				System.out.print("추가수당: ");
//				int comm=Integer.parseInt(sc.nextLine());
//				System.out.print("매니저 번호: ");
//				mgr=Integer.parseInt(sc.nextLine());
//				System.out.print("부서 번호: ");
//				int deptno=Integer.parseInt(sc.nextLine());
				
				EmpDTO insertDto= new EmpDTO();
				System.out.print("사원 번호: ");
				insertDto.setEmpno(Integer.parseInt(sc.nextLine()));
				System.out.print("사원명: ");
				insertDto.setEname(sc.nextLine());
				System.out.print("직무: ");
				insertDto.setJob(sc.nextLine());
				System.out.print("급여: ");
				insertDto.setSal(Integer.parseInt(sc.nextLine()));
				System.out.print("추가수당: ");
				insertDto.setComm(Integer.parseInt(sc.nextLine()));
				System.out.print("매니저 번호: ");
				insertDto.setMgr(Integer.parseInt(sc.nextLine()));
				System.out.print("부서 번호: ");
				insertDto.setDeptno(Integer.parseInt(sc.nextLine()));
				boolean result=dao.insert(insertDto);
				//System.out.println(dao.insert(empno, ename, job, mgr, sal, comm, deptno)?"삽입 성공":"삽입 실패");
				break;
			case 6:
				System.out.println("프로그램 종료");
				flag=false;
				break;
			default:
				System.out.println("올바른 수를 입력해주세요");
				break;
			
			}
			
			
			
		}
		

	}

}
