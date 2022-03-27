package emp.util;

import java.util.List;
import java.util.Scanner;

import emp.dto.EmpDTO;

public class ConsoleUtil {
//사원추가와 관련한 정보 입력
	public EmpDTO getNewEmp(Scanner sc) {
		
		System.out.println("\n추가할 사원정보 입력 >> ");
		System.out.println("----------------------");
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
		
		return insertDto;
	}
	
	public void printAddSuccessMessage(EmpDTO newEmp) {
		System.out.println(newEmp.getEname()+" 사원정보 추가 성공~!");
	}
	public void printAddFailMessage(EmpDTO newEmp) {
		System.out.println(newEmp.getEname()+" 사원정보 추가 실패...");
	}
	
	public void printEmpList(List<EmpDTO> list) {
		System.out.println();
		System.out.println("*****사원정보*****");
		System.out.println("----------------------------------------------------");
		System.out.println("사번  성명  직무  매니저번호 입사일  급여  추가수당  부서번호");
		System.out.println("----------------------------------------------------");
		for(EmpDTO dto: list) {
			System.out.printf("%d %s  %s  %d  %s  %d  %d \n",dto.getEmpno(),dto.getEname(),
				dto.getJob(),dto.getMgr(),dto.getHiredate(),
				dto.getComm(),dto.getDeptno());
		}
		System.out.println();
	}
	public String printRowMessage(Scanner sc) {
		System.out.print("\n조회할 사원번호 입력 >>");
		//int empno=Integer.parseInt(sc.nextLine());
		String job =sc.nextLine();	
		return job;
	}
	
	public void printEmpMessage(EmpDTO row) {
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println("사번   성명   직무   입사일      부서번호");
		System.out.println("----------------------------------------------------");
		System.out.printf("%d  %s  %s  %s  %d \n",row.getEmpno(),row.getEname(),
				row.getJob(),row.getHiredate(),
				row.getDeptno());
	}
	
	public EmpDTO getUpdateEmp(Scanner sc) {
		EmpDTO dto=new EmpDTO();
		System.out.println();
		System.out.print("\n수정할 사원번호 입력 >> ");
		dto.setEmpno(Integer.parseInt(sc.nextLine()));
		System.out.print("\n변경할 매니저번호 입력 >> ");
		dto.setMgr(Integer.parseInt(sc.nextLine()));
		// 값 두개를 못 보내주니까 dto 안에 담고 dto를 보내주면되는거임
		//dto가 약간 그릇?같은거라 그 안에 mgr, empno 둘다 둘잉ㅆ는거임
		return dto;
	}

	public void printUpdateSuccessMessage(EmpDTO updateEmp) {
		System.out.println(updateEmp.getEname()+" 사원정보 수정 성공~!");
	}
	public void printUpdateFailMessage(EmpDTO updateEmp) {
		System.out.println(updateEmp.getEname()+" 사원정보 수정 실패...");
	//이거할 때 mgr이랑 empno만 입력받아서 이름값이 텅 빈거임!!
	}
	
	public int removeEmpno(Scanner sc) {
		System.out.println("\n탈퇴할 사원번호 입력>>");
		int empno=Integer.parseInt(sc.nextLine());
		return empno;
	}
	
	public void printRemoveSuccessMessage(int empno) {
		System.out.println(empno+" 사원정보 삭제 성공~!");
	}
	public void printRemoveFailMessage(int empno) {
		System.out.println(empno+" 사원정보 삭제 실패...");
	//삭제받을때 사원번호 하나만 받았으니까 empno 하나만 받아도 괜찮은거임 객체로 안받아도됨
	}
}
