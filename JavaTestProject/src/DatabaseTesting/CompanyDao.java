package DatabaseTesting;

public class CompanyDao {

	public static void main(String[] args) {
		WorkerDao dao=new WorkerDao();
		Worker w1=new Worker();
		dao.connect();
		dao.getInformation(w1);

	}

}
