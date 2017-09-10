package dataObserver;

public class ClientUIView extends Observer{
	
	public ClientUIView(Data data){
		this.data = data;
		this.data.attach(this);
	}

	@Override
	public void update() {
		System.out.println("ClientUIView data updated to: "+data.getState());
	}

}
