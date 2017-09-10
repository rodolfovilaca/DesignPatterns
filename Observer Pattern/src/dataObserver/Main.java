package dataObserver;

import dataObserver.Data.DataState;

public class Main {
	public static void main(String[] args) {
		Data data = new Data();
		new ClientUIView(data);
		new ServerView(data);
		
		data.setState(DataState.DATA_ADDED);
		data.setState(DataState.DATA_MORE_ELEMENTS);
		data.setState(DataState.DATA_LESS_ELEMENTS);
		data.setState(DataState.DATA_REMOVED);
		
	}
}
