import java.util.ArrayList;

public class MonthList {
	
public String name;
private ArrayList<String > months;

protected MonthList(String name) {
	this.name = name;
	this.months = new ArrayList<String>();
}

public String getName() {
	return name;
}

public ArrayList<String> getMonths() {
	return months;
}

public void setName(String name) {
	this.name = name;
}

public void setMonths(ArrayList<String> months) {
	this.months = months;
}
public void addMonth() {
	
	months.add("January");
	months.add("February");
	months.add("March");
	months.add("April");
	months.add("May");
	months.add("June");
	months.add("July");
	months.add("August");
	months.add("September");
	months.add("October");
	months.add("November");
	months.add("December");
		
}

}
