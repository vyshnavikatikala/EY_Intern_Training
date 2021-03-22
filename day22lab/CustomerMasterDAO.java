package day22lab;

import java.util.Set;

public interface CustomerMasterDAO {
	public int insertCustomer(CustomerMasterDTO customerMasterDTO);

	public int deleteCustomer(int custno);

	public int updateCustomer(CustomerMasterDTO customerMasterDTO);

	public CustomerMasterDTO getCustomerMaster(int custno);

	public Set<CustomerMasterDTO> getCustomerMasterAll();
}
