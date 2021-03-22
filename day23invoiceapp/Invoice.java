package day23invoiceapp;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;

public interface Invoice extends Remote {

	public boolean createInvoice(int custno, int invno, HashMap<Integer, Integer> itemmap) throws RemoteException;

	public String calculateDelivery(int invno) throws RemoteException;

	public boolean createPDF(int invno) throws RemoteException;

	public boolean createExcel(int invno) throws RemoteException;

	public boolean enterItem(int itemNo, String itemdescription, String itemunit, int price) throws RemoteException;

}