package board.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {
	private int bno,re_ref,re_lev,re_seq,readcount;
	private String name,password,title,content,attach;
	private Date regdate;
}
