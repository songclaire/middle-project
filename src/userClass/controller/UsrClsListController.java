package userClass.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userClass.service.UsrClsService;
import userClass.service.IUsrClsService;
import userClass.vo.UsrClsVO;

/**
 * ��ɱ�� ��� ������
 */
@WebServlet("/UsrClsListController.do")
public class UsrClsListController extends HttpServlet {
	
	/**
	 * ��ɱ�θ�� ������ ���� �� db�� ����� ����Ʈ�� ������
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IUsrClsService clsService = UsrClsService.getInstance();
		
//		List<UsrClsVO> clsList = clsService.selectAllMember();
		
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}

}
