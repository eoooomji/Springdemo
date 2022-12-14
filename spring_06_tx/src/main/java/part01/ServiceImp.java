package part01;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import model.MemDAO;
import model.MemDTO;

public class ServiceImp implements Service {
	private MemDAO memDAO;
	private TransactionTemplate transactionTemplate;

	public ServiceImp() {

	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	public void setMemDAO(MemDAO memDAO) {
		this.memDAO = memDAO;
	}

	// 트랜잭션 설정 방법
	@Override
	public void insertProcess() {
		String result = transactionTemplate.execute(new TransactionCallback<String>() {
			@Override
			public String doInTransaction(TransactionStatus status) {
				try {
					memDAO.insertMethod(new MemDTO(45, "용팔이", 50, "경기"));
					memDAO.insertMethod(new MemDTO(46, "유대위", 20, "대전"));
					return "OK";
				} catch (Exception ex) {
					status.setRollbackOnly();
					return ex.toString();
				}
			}
		});
		
		System.out.println("result:" + result);

	} // end insertProcess()

} // end class
