package userClass.vo;

import common.ClsStatus;

/**
 * ��ɱ�θ�� VO
 */
public class UsrClsVO {
	private String classId;       // ��ɱ�� ID
	private String memId;         // �ۼ���ID
	private String classTitle;    // ����
	private String classContent;  // ����
	private String classDate;     // ������¥
//	private String classDelete;   // ��������
	private ClsStatus classDelete = ClsStatus.POST;
	private String clsCtId;       // ī�װ�ID
	private String classViews;    // ��ȸ��
	private String classThumbnail;	  // �����
	
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
