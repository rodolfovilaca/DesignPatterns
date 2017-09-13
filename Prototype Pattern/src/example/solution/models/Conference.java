package solution.models;

import java.util.ArrayList;
import java.util.List;

import solution.utils.SubsetSum;

public class Conference {
	private final int MORNING_SESSION = 180;
	private final int AFTERNOON_SESSION = 240;
	private List<Track> tracks = new ArrayList<>();

	public Conference(String conferenceTalks) {
		if(!conferenceTalks.trim().isEmpty()){
			String[] talksDescription = conferenceTalks.split("\n");
			List<Talk> talks = Talk.generateList(talksDescription);
			if(!talks.isEmpty()){
				scheduleTalks(talks);
			}
		}else{
			System.out.println("Texto vazio");
		}
	}

	private void scheduleTalks(List<Talk> talks) {
		int tracksCounter = 1;
		while (!talks.isEmpty()) {
			@SuppressWarnings("unchecked")
			List<Talk> morningSubSet = (List<Talk>) SubsetSum.getSubsetSum(talks, MORNING_SESSION);
			talks.removeAll(morningSubSet);
			@SuppressWarnings("unchecked")
			List<Talk> afternoonSubSet = (List<Talk>) SubsetSum.getSubsetSum(talks, AFTERNOON_SESSION);
			talks.removeAll(afternoonSubSet);
			Track track = new Track(tracksCounter++,new Session(morningSubSet,true),new Session(afternoonSubSet,false));
			tracks.add(track);
		}
	}
	public void print(){
		tracks.forEach(track -> track.print());
	}
}
