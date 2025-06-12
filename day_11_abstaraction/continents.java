package day_11_abstaraction;

interface distrtic{
	public String distrticname(String distrticname);
}
interface state extends distrtic{
	public String statename(String state); 
}
 class country implements state{
public String distrticname(String distrticname) {
	return distrticname;
}
public String statename(String state) {
	return state;
}
public String county(String countryname) {
	return countryname;
}
}
 class continents implements state {
public String statename(String state) {
	return state;
}
public String distrticname(String distrticname) {
	return distrticname;
}

}
