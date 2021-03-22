package day22lab;

import java.util.Set;

public interface ItemTransactionMasterDAO {
	public int insertItem(ItemTransactionMasterDTO itemTransactionMasterDTO);

	public int deleteItem(int invno, int itemno);

	public int updateItem(ItemTransactionMasterDTO itemTransactionMasterDTO);

	public ItemTransactionMasterDTO getItemTransactionMaster(int invno, int itemno);

	public Set<ItemTransactionMasterDTO> getItemTransactionMasterAll();

	public Set<ItemTransactionMasterDTO> getItemTransactionMasterAllByInvno(int invno);
}
