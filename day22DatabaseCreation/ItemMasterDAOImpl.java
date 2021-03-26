package day22DatabaseCreation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class ItemMasterDAOImpl implements ItemMasterDAO {
	private Connection connection;

	public ItemMasterDAOImpl(Connection connection) {
		this.connection = connection;
	}

	@Override
	public int insertItemDetails(ItemMasterDTO itemMasterDTO) {
		try {
			String query = "insert into itemmaster (itemno,itemdescription,itemprice,itemunit) values(?,?,?,?);";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, itemMasterDTO.getItemno());
			ps.setString(2, itemMasterDTO.getItemdescription());
			ps.setInt(3, itemMasterDTO.getItemprice());
			ps.setString(4, itemMasterDTO.getItemunit());
			System.out.println(ps);
			ps.execute();
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteItemDetails(int itemno) {
		ItemMasterDTO itemobj = new ItemMasterDTO();
		String query = "delete from itemmaster where itemno=?";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, itemno);
			ps.execute();
			connection.commit();
		} catch (Exception e) {
		}
		return 0;
	}

	@Override
	public int updateItemDetails(ItemMasterDTO itemMasterDTO) {
		ItemMasterDTO itemobj = new ItemMasterDTO();
		String query = "update itemmaster set itemdescription=? where itemno=?";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, itemMasterDTO.getItemdescription());
			ps.setInt(2, itemMasterDTO.getItemno());
			System.out.println(ps);
			ps.executeUpdate();
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ItemMasterDTO getItemMaster(int itemno) {
		ItemMasterDTO itemobj = new ItemMasterDTO();
		String query = "select * from itemmaster where itemno=?";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, itemno);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				itemobj.setItemno(rs.getInt("itemno"));
				itemobj.setItemdescription(rs.getString("itemdescription"));
				itemobj.setItemprice(rs.getInt("itemprice"));
				itemobj.setItemunit(rs.getString("itemunit"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return itemobj;

	}

	@Override
	public Set<ItemMasterDTO> getItemMasterAll() {
		Set<ItemMasterDTO> itemdetails = new HashSet<ItemMasterDTO>();
		Statement stmt;
		try {
			ItemMasterDTO itemobj;
			stmt = connection.createStatement();
			String query = "select * from itemmaster";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				itemobj = new ItemMasterDTO();
				itemobj.setItemno(rs.getInt("itemno"));
				itemobj.setItemdescription(rs.getString("itemdescription"));
				itemobj.setItemprice(rs.getInt("itemprice"));
				itemobj.setItemunit(rs.getString("itemunit"));
				itemdetails.add(itemobj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return itemdetails;
	}

}
