package solution.models;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Session {
	private List<Talk> list = new ArrayList<>();
	public List<Talk> getList() {
		return list;
	}

	public Session(List<Talk> list, boolean isMorningSession) {
		if(!list.isEmpty()){
			list.forEach(talk ->{ 
					this.list.add(talk);
				});
			if (isMorningSession) {
				LocalTime time = LocalTime.parse("09:00");
				for (Talk talk : list) {
					talk.setTime(time);
					time = time.plusMinutes(talk.getDuration());
				}
			} else {
				LocalTime time = LocalTime.parse("13:00");
				for (Talk talk : list) {
					talk.setTime(time);
					time = time.plusMinutes(talk.getDuration());
				}
			}
		}else{
			System.out.println("Session Vazia, pois os elementos são invalidos");
		}
	}
}
