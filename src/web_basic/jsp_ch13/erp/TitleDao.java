package web_basic.jsp_ch13.erp;

import java.util.List;

public interface TitleDao {
	List<Title> selectTitleByAll();
	
	Title selecTitleByNo(Title title);
	
	int insertTitle(Title title);
	int updateTitle(Title title);
	int deleteTitle(int tNo);
	
}
