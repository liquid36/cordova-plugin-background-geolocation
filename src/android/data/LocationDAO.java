package com.tenforwardconsulting.cordova.bgloc.data;

public interface LocationDAO {
	public Alarm[] getActiveAlarm();
	public Location[] getAllLocations();
	public boolean persistLocation(Location l);
	public void deleteLocation(Location l);
}
