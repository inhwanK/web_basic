package web_basic.jsp_ch13.erp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TitleDaoImpl implements TitleDao {
	private static final TitleDaoImpl instance = new TitleDaoImpl();
	private Connection con;
	
	public void setCon(Connection con) {
		this.con = con;
	}

	private TitleDaoImpl() {}

	public static TitleDaoImpl getIntance() {
		return instance;
	}

	@Override
	public List<Title> selectTitleByAll() {
		String sql = "select tNo,tName from title";
		try (PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();) {
			if (rs.next()) {
				List<Title> list = new ArrayList<>();
				do {
					list.add(getTitle(rs));
				} while (rs.next());
				return list;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;

	}

	private Title getTitle(ResultSet rs) throws SQLException {
		int no = rs.getInt("tNo");
		String name = rs.getString("tName");
		return new Title(no, name);
	}

	@Override
	public Title selecTitleByNo(Title title) {
		String sql = "select tNo, tName from title where tNo=?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, title.gettNo());
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					
					return getTitle(rs);
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		return null;
	}

	@Override
	public int insertTitle(Title title) {
		String sql = "insert into title values(?,?)";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, title.gettNo());
			pstmt.setString(2, title.gettName());
			return pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	@Override
	public int updateTitle(Title title) {
		String sql = "update title set tName=? where tNo =?";
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, title.gettName());
			pstmt.setInt(2, title.gettNo());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	@Override
	public int deleteTitle(int tNo) {
		String sql = "delete from title where tNo = ?";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, tNo);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
