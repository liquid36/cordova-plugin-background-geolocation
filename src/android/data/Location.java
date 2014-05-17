package com.tenforwardconsulting.cordova.bgloc.data;

import java.util.Date;

import android.os.SystemClock;
import org.json.JSONObject;
import org.json.JSONException;

public class Location {
	private String latitude;
	private String longitude;
	private Date recordedAt;
	private String accuracy;
	private String speed;
	
	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public Date getRecordedAt() {
		return recordedAt;
	}
	public void setRecordedAt(Date recordedAt) {
		this.recordedAt = recordedAt;
	}
	public String getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	public JSONObject getJSONObject() {
		try {
			JSONObject j = new JSONObject();
			j.put("id", this.id);		
			j.put("latitude", this.latitude);
			j.put("longitude", this.longitude);
			j.put("recordedAt", this.recordedAt);
			j.put("accuracy", this.accuracy);
			j.put("speed", this.speed); 
			return j;
		} catch(JSONException ex) {
			ex.printStackTrace();
		}
		return null;		
	}
	
	public static Location fromAndroidLocation(android.location.Location originalLocation) {
		Location location = new Location();
		location.setRecordedAt(new Date(originalLocation.getTime()));
		location.setLongitude(String.valueOf(originalLocation.getLongitude()));
		location.setLatitude(String.valueOf(originalLocation.getLatitude()));
		location.setAccuracy(String.valueOf(originalLocation.getAccuracy()));
		location.setSpeed(String.valueOf(originalLocation.getSpeed()));
		
		return location;
	}
}
