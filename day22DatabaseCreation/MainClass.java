package day22DatabaseCreation;

import java.sql.Connection;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) throws ParseException {
		Connection con = DBUtility.getConnection();
		Scanner sc = new Scanner(System.in);
		CustomerMasterDTO customermasterdto = new CustomerMasterDTO();
		System.out.println("Enter Customer No: ");
		int cust_no = sc.nextInt();
		customermasterdto.setCustomerno(cust_no);
		System.out.println("Enter Customer Address: ");
		String cust_add = sc.next();
		customermasterdto.setCustomeraddress(cust_add);
		System.out.println("Enter Customer email: ");
		String cust_email = sc.next();
		customermasterdto.setCustomeremail(cust_email);
		System.out.println("Enter Customer Name: ");
		String cust_name = sc.next();
		customermasterdto.setCustomername(cust_name);
		System.out.println("Enter Customer Phone No: ");
		String cust_phno = sc.next();
		customermasterdto.setCustomerphone(cust_phno);
		CustomerMasterDAOImpl customermasterdaoimpl = new CustomerMasterDAOImpl(DBUtility.getConnection());
		customermasterdaoimpl.insertCustomer(customermasterdto);
		Set<CustomerMasterDTO> customerdetails = new HashSet<CustomerMasterDTO>();
		customerdetails = customermasterdaoimpl.getCustomerMasterAll();
		System.out.println(customerdetails);
		// System.out.println(customermasterdaoimpl.getCustomerMaster(1));
//		CustomerMasterDTO customermasterdtoupdate=new CustomerMasterDTO();
//		customermasterdtoupdate.setCustomerno(3);
//		customermasterdtoupdate.setCustomername("vignesh");
//		customermasterdtoupdate.setCustomerphone("9876543210");
//		customermasterdaoimpl.updateCustomer(customermasterdtoupdate);
//		customermasterdaoimpl.deleteCustomer(3);
		System.out.println("-----------------------");

		InvoiceMasterDTO invoicemasterdto = new InvoiceMasterDTO();
//		System.out.println("Enter Customer No: ");
//		int cust_no = sc.nextInt();
		System.out.println("Enter Invoice No: ");
		int inv_no = sc.nextInt();
		invoicemasterdto.setInvno(inv_no);
		invoicemasterdto.setCustomerno(cust_no);
		System.out.println("Enter Date: ");
		String dt = sc.next();
		invoicemasterdto.setInvdate(dt);
		InvoiceMasterDAOImpl invoicemasterdaoimpl = new InvoiceMasterDAOImpl(DBUtility.getConnection());
		invoicemasterdaoimpl.insertInvoice(invoicemasterdto);
		Set<InvoiceMasterDTO> invoicedetails = new HashSet<InvoiceMasterDTO>();
		invoicedetails = invoicemasterdaoimpl.getInvoiceMasterAll();
		System.out.println(invoicedetails);
//		System.out.println(invoicemasterdaoimpl.getInvoiceMaster(101));
//		InvoiceMasterDTO invoicemasterdtoupdate=new InvoiceMasterDTO();
//		invoicemasterdtoupdate.setInvno(103);
//		invoicemasterdtoupdate.setInvdate("2021-03-12");
//		invoicemasterdaoimpl.updateInvoice(invoicemasterdtoupdate);
//		invoicemasterdaoimpl.deleteInvoice(103);
		System.out.println("--------------------");

		ItemMasterDTO itemmasterdto = new ItemMasterDTO();
		System.out.println("Enter Item No: ");
		int item_no = sc.nextInt();
		itemmasterdto.setItemno(item_no);
		System.out.println("Enter Item Description: ");
		String item_desc = sc.next();
		itemmasterdto.setItemdescription(item_desc);
		System.out.println("Enter Item Price: ");
		int item_price = sc.nextInt();
		itemmasterdto.setItemprice(item_price);
		System.out.println("Enter Item Unit: ");
		String item_unit = sc.next();
		itemmasterdto.setItemunit(item_unit);
		ItemMasterDAOImpl itemmasterdaoimpl = new ItemMasterDAOImpl(DBUtility.getConnection());
		itemmasterdaoimpl.insertItemDetails(itemmasterdto);
		Set<ItemMasterDTO> itemdetails = new HashSet<ItemMasterDTO>();
		itemdetails = itemmasterdaoimpl.getItemMasterAll();
		System.out.println(itemdetails);
//		System.out.println(itemmasterdaoimpl.getItemMaster(1001));
//		ItemMasterDTO itemmasterdtoupdate = new ItemMasterDTO();
//		itemmasterdtoupdate.setItemdescription("Parle - G");
//		itemmasterdtoupdate.setItemno(1003);
//		itemmasterdaoimpl.updateItemDetails(itemmasterdtoupdate);
//		itemmasterdaoimpl.deleteItemDetails(1003);
		System.out.println("--------------------");

		ItemTransactionMasterDTO itemtransactionmasterdto = new ItemTransactionMasterDTO();
		itemtransactionmasterdto.setItemno(item_no);
		itemtransactionmasterdto.setInvno(inv_no);
		System.out.println("Enter Item Quantity: ");
		int item_quant = sc.nextInt();
		itemtransactionmasterdto.setItemqty(item_quant);
		ItemTransactionMasterDAOImpl itemtransactionmasterdaoimpl = new ItemTransactionMasterDAOImpl(
				DBUtility.getConnection());
//		itemtransactionmasterdaoimpl.insertItem(itemtransactionmasterdto);
		Set<ItemTransactionMasterDTO> itemtransactiondetails = new HashSet<ItemTransactionMasterDTO>();
		itemtransactiondetails = itemtransactionmasterdaoimpl.getItemTransactionMasterAll();
		System.out.println(itemtransactiondetails);
//		System.out.println(itemtransactionmasterdaoimpl.getItemTransactionMaster(101, 1001));
//		ItemTransactionMasterDTO itemtransactionmasterdtoupdate = new ItemTransactionMasterDTO();
//		itemtransactionmasterdtoupdate.setInvno(103);
//		itemtransactionmasterdtoupdate.setItemno(1003);
//		itemtransactionmasterdtoupdate.setItemqty(1);
//		itemtransactionmasterdaoimpl.updateItem(itemtransactionmasterdtoupdate);
//		itemtransactionmasterdaoimpl.deleteItem(103, 1003);
		sc.close();

		DBUtility.closeConnection(null);
	}
}
