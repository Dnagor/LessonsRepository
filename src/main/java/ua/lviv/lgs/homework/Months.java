package ua.lviv.lgs.homework;
/**
 * List of months
 * @author Dmytro
 * @version 1
 *
 */
public enum Months {

	JANUARY(Seasons.WINTER, 31),
	FEBRUARY(Seasons.WINTER, 28),
	MARCH(Seasons.SPRING, 31),
	APRIL(Seasons.SPRING, 30),
	MAY(Seasons.SPRING, 31),
	JUNE(Seasons.SUMMER, 30),
	JULY(Seasons.SUMMER, 31),
	AUGUST(Seasons.SUMMER, 31),
	SEPTEMBER(Seasons.AUTUMN, 30),
	OCTOBER(Seasons.AUTUMN, 31),
	NOVEMBER(Seasons.AUTUMN, 30),
	DECEMBER(Seasons.WINTER, 31);
	
	
	Seasons seasons;
	private int days;
	private Months(Seasons seasons, int days) {
		this.seasons = seasons;
		this.days = days;
	}
	public Seasons getSeasons() {
		return seasons;
	}
	public int getDays() {
		return days;
	}
	
	
	
	
	
	
}
