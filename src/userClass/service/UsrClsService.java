package userClass.service;

import userClass.dao.UsrClsDao;
import userClass.dao.IUsrClsDao;

public class UsrClsService implements IUsrClsService{
	private IUsrClsDao dao;
	private static UsrClsService service;
	private UsrClsService() {
		dao = UsrClsDao.getInstance();
	}
	public static IUsrClsService getInstance() {
		if(service == null) {
			service = new UsrClsService();
		}
		return service;
	}
}
