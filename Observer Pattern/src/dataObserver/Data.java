package dataObserver;

import java.util.ArrayList;
import java.util.List;

public class Data {
	private List<Observer> database = new ArrayList<>();

	public static enum DataState {
		DATA_LESS_ELEMENTS, DATA_REMOVED, DATA_MORE_ELEMENTS, DATA_ADDED
	}

	private DataState userState;

	public DataState getState() {
		return userState;
	}

	public void setState(DataState state) {
		this.userState = state;
		notifyAllObservers();
	}

	public void attach(Observer user) {
		database.add(user);
	}

	public void notifyAllObservers() {
		for (Observer user : database) {
			user.update();
		}
	}
}
