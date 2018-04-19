package JDO1;
import javax.persistence.*;

@Entity
public class Emp {
	@Id String name;
	int no_of_matches;
	int runs;


public Emp(String name, int no_of_matches, int runs) {
		super();
		this.name = name;
		this.no_of_matches = no_of_matches;
		this.runs = runs;
	}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public int getNo_of_matches() {
	return no_of_matches;
}



public void setNo_of_matches(int no_of_matches) {
	this.no_of_matches = no_of_matches;
}



public int getRuns() {
	return runs;
}



public void setRuns(int runs) {
	this.runs = runs;
}



public String toString()
{
	return "name :"+name+" no of matches: "+no_of_matches+"runs : "+runs;
}

}
