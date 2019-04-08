package com.dnb.serviceimpl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;




import org.springframework.stereotype.Repository;

import com.dnb.model.CustomerDet;
import com.dnb.model.CustomerDetails;
import com.dnb.model.CustomerPo;

@Repository
@Transactional
public class CustomerDetailsImpl {

	@PersistenceContext
	private EntityManager entityManager;

	// HibernateTemplate hibernateTemplate;
	public CustomerDetails getCustomerDetails(String custName, String phoneNo) throws Exception {
		// List<CustomerDetails> simpleModelList = null;
		CustomerDetails simpleModelList1 = new CustomerDetails();
		

		CustomerPo sim = new CustomerPo();

		if ((custName != null && !"".equals(custName)) && (phoneNo != null && !"".equals(phoneNo))) { 
			/*simpleModelList1 = entityManager.createQuery(
					"SELECT a FROM CustomerDetails a  LEFT JOIN  custinterest  b   ON a.id=b.id  LEFT JOIN  CustomerloginDetails c  ON a.id=c.id LEFT JOIN Owns d ON a.id=d.id LEFT JOIN Coners e ON a.id=e.id LEFT JOIN Persons f ON a.id=f.id where a.name=?1 and a.phone=?2",
					CustomerDetails.class).setParameter(1, custName).setParameter(2, phoneNo).getSingleResult(); // a.phoneNumber
*/
			return simpleModelList1;
		}

		/*else if (custName != null && !"".equals(custName)) {
			simpleModelList1 = entityManager.createQuery(
					"SELECT a FROM CustomerDetails a  LEFT JOIN  custinterest  b   ON a.id=b.id  LEFT JOIN  CustomerloginDetails c  ON a.id=c.id LEFT JOIN Owns d ON a.id=d.id LEFT JOIN Coners e ON a.id=e.id LEFT JOIN Persons f ON a.id=f.id where a.name = :custName",
					CustomerDetails.class).setParameter("custName", custName).getSingleResult();
			sim.setCustDet(simpleModelList1);
		} else if (phoneNo != null && !"".equals(phoneNo)) {
			simpleModelList1 = entityManager.createQuery(
					"SELECT a FROM CustomerDetails a  LEFT JOIN  custinterest  b   ON a.id=b.id  LEFT JOIN  CustomerloginDetails c  ON a.id=c.id LEFT JOIN Owns d ON a.id=d.id LEFT JOIN Coners e ON a.id=e.id LEFT JOIN Persons f ON a.id=f.id  where a.phone=:phoneNo",
					CustomerDetails.class).setParameter("phoneNo", phoneNo).getSingleResult();
			sim.setCustDet(simpleModelList1);
		}*/

		return simpleModelList1;
	}
	public CustomerDet getCustomerDetailsKeySearch(String custName) throws Exception
	{
		CustomerDet simpleModelList1 = new CustomerDet();
		//String simpleModelList1="";
      if (custName != null && !"".equals(custName))
		{
      // simpleModelList1= entityManager.createQuery("SELECT a FROM CustomerDetails a where a.name = :custName",CustomerDetails.class).setParameter("custName", custName).getSingleResult();
      // simpleModelList1= entityManager.createQuery("SELECT a FROM CustomerDet a  where a.name LIKE('asfd%') and a.name = :custName",CustomerDet.class).setParameter("custName", custName).getSingleResult();
    //   simpleModelList1= entityManager.createQuery("SELECT a FROM CustomerDet a  where a.name LIKE %:asfd % and a.name = :custName",CustomerDet.class).setParameter("custName", custName).getSingleResult();
       //@Query("SELECT f FROM Item f WHERE f.id=:id AND f.itemNm LIKE %:itemNm %")
       /* Query simpleModelList1 = entityManager.createQuery("select e.name from CustomerDetails e where e.name = ?");
         simpleModelList1.setParamter(custName, <name>);
         String name = (String) q.getSingleResult();		
         // SELECT name FROM simple  where name LIKE('asdf%')
System.out.println(simpleModelList1);*/
	        return simpleModelList1;
	         }
      return simpleModelList1;
	}
		
		/* TypedQuery<CustomerDetails[]> query = entityManager.createQuery(
			      "SELECT c.name FROM CustomerDetails c",CustomerDetails[].class);
			  List<CustomerDetails[]> results = query.getResultList();
			 return results;
	}*/
    public String addCustomerDetails(CustomerDetails customerDetails) {
		// List<CustomerDetails> simpleModelList = entityManager.createQuery("select a
		// from CustomerDetails a where a.name like
		// :custName",CustomerDetails.class).setParameter("custName",
		// custName).getResultList();
		entityManager.persist(customerDetails);
		return "Record Successfully Added";
	}
    public String deleteCustomerDetails(Integer id) {
		// List<CustomerDetails> simpleModelList = entityManager.createQuery("select a
		// from CustomerDetails a where a.name like
		// :custName",CustomerDetails.class).setParameter("custName",
		// custName).getResultList();
        CustomerDetails customerDetails = entityManager.find(CustomerDetails.class, id);
		entityManager.remove(customerDetails);
		return "Record Deleted Successfully";
	}
    /*public CustomerDetails exportToExcel() {
		try {
			String excelRootpath = "C:\\dnbexcel\\dnb.xlsx";
			FileOutputStream fileOutput = new FileOutputStream(new File(excelRootpath));
			// create xlsx workbook
			XSSFWorkbook workbook = new XSSFWorkbook();
			// create new worksheet
			XSSFSheet sheet = workbook.createSheet("Dnb Customers");
			Object[][] dnbCustomers = { { "Name", "887" }, { "Name1", "123" }, { "Name3", "345" } };
			int rowNum = 0;
			for (Object[] customers : dnbCustomers) {
				Row row = sheet.createRow(rowNum++);
				int column = 0;
				for (Object value : customers) {
					Cell cell = row.createCell(column++);
					if (value instanceof String) {
						cell.setCellValue((String) value);
					} else if (value instanceof Integer) {
						cell.setCellValue((Integer) value);
					}
				}
			}
			workbook.write(fileOutput);
			System.out.println("Customers data exported");
			 workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}*/
}
