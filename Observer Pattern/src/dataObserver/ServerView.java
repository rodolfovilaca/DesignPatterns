package dataObserver;

public class ServerView extends Observer{
	
	public ServerView(Data data){
		this.data = data;
		this.data.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("SearchView data updated to: "+data.getState());
	}

}
