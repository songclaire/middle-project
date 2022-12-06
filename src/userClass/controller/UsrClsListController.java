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
 * 재능기부 목록 페이지
 */
@WebServlet("/UsrClsListController.do")
public class UsrClsListController extends HttpServlet {
	
	/**
	 * 재능기부목록 페이지 접속 시 db에 저장된 리스트를 가져옴
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IUsrClsService clsService = UsrClsService.getInstance();
		
//		List<UsrClsVO> clsList = clsService.selectAllMember();
		
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}

}
