package board.action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ActionForward {
	//path, 이동 방식을 갖고있다
	private String path;
	private boolean redirect; //true면 sendRedirect, false면 forward로 갈게
}
