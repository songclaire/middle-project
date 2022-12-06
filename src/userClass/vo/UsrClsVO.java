package userClass.vo;

import common.ClsStatus;

/**
 * 재능기부목록 VO
 */
public class UsrClsVO {
	private String classId;       // 재능기부 ID
	private String memId;         // 작성자ID
	private String classTitle;    // 제목
	private String classContent;  // 내용
	private String classDate;     // 수정날짜
//	private String classDelete;   // 삭제여부
	private ClsStatus classDelete = ClsStatus.POST;
	private String clsCtId;       // 카테고리ID
	private String classViews;    // 조회수
	private String classThumbnail;	  // 썸네일
	
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getClassTitle() {
		return classTitle;
	}
	public void setClassTitle(String classTitle) {
		this.classTitle = classTitle;
	}
	public String getClassContent() {
		return classContent;
	}
	public void setClassContent(String classContent) {
		this.classContent = classContent;
	}
	public String getClassDate() {
		return classDate;
	}
//	public void setClassDate(String classDate) {
//		this.classDate = classDate;
//	}
//	public String getClassDelete() {
//		return classDelete;
//	}
//	public void setClassDelete(String classDelete) {
//		this.classDelete = classDelete;
//	}
	public String getClsCtId() {
		return clsCtId;
	}
	public void setClsCtId(String clsCtId) {
		this.clsCtId = clsCtId;
	}
	public String getClassViews() {
		return classViews;
	}
	public void setClassViews(String classViews) {
		this.classViews = classViews;
	}	
	
	public ClsStatus getClassDelete() {
		return classDelete;
	}
	public void setClassDelete(ClsStatus classDelete) {
		this.classDelete = classDelete;
	}
	
	public String getClassThumbnail() {
		return classThumbnail;
	}
	public void setClassThumbnail(String classThumbnail) {
		this.classThumbnail = classThumbnail;
	}
}
