package emp.dto;
//접근하고자하는 테이블의 필드와 동일하게 생성하면됨
//properties에 롬복파일 넣어주는거 잊지말것 ~!
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@AllArgsConstructor
//@NoArgsConstructor
//@Setter
//@Getter
//@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data //이렇게만 만들면 default 생성자가 없어진다.
public class EmpDTO {
	
	
	private String ename,job;
	private int empno,mgr,sal,comm,deptno;
	private Date hiredate;
	
	
}
