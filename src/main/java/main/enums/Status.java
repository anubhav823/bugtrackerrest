package main.enums;

public enum Status {

	TO_DO (1, "To Do"),
	IN_PROGRESS (2, "In Progress"),
	WAITING_ON_HOLD (3, "Waiting/On Hold"),
	FINISHED (4, "Finished");
	
	private int code;
	private String text;
	
	private Status(int code, String text) {
		this.code = code;
		this.text = text;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	
}
