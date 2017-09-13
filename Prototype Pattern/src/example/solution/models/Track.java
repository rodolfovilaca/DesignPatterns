package solution.models;

public class Track {
	private Session morningSession;
	private Session afternoonSession;
	private int id;

	public Track(int id, Session morningSession, Session afternoonSession) {
		this.morningSession = morningSession;
		this.afternoonSession = afternoonSession;
		this.id = id;
	}

	public Session getMorningSession() {
		return morningSession;
	}

	public Session getAfternoonSession() {
		return afternoonSession;
	}

	public int getId() {
		return id;
	}
	
	public void print(){
		System.out.println("Track "+id+":");
		morningSession.getList().forEach(System.out::println);
		System.out.println("12:00PM Lunch");
		afternoonSession.getList().forEach(System.out::println);
		int afternoonTime = afternoonSession.getList().stream().mapToInt(talk -> talk.getDuration()).sum();
		if(afternoonTime>=180){
			System.out.println("05:00PM Networking Event");
		}
	}
}
