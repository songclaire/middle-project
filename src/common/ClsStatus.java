package common;

public enum ClsStatus {
	POST(1,'N'),
	DELETE(2,'Y');
	
	ClsStatus(int num, char status){
		this.num = num;
		this.status = status;
	}
	int num = 1;
	char status = 'N';
}
