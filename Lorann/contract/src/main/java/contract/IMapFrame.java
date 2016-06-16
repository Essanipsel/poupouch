package contract;



public interface IMapFrame {

	int VIEW_MODE_MEETING = 0;
	int VIEW_MODE_MAP = 0;

	void setMeeting(IMap map);

	void setViewMode(int viewMode);

	void displayMessage(String string);

	

}