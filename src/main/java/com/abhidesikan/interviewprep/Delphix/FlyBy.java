package com.abhidesikan.interviewprep.Delphix;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class FlyBy {
	private static final String API_KEY = "9Jz6tLIeJ0yY9vjbEUWaH9fsXA930J9hspPchute";
	private static final String startDate = "2013-05-15";
	private static final String endDate = "2018-05-15";
	private static String API_URL = "https://api.nasa.gov/planetary/earth/assets?";
	private static Date lastDate;


	/***
	 * A method which constructs a url to call the NASA API based on longitude and latitude.
	 * @param latitude
	 * @param longitude
	 * @return
	 */
	public static String constructUrl(double latitude, double longitude) {
		return API_URL + "lon=" + String.valueOf(longitude) + "&lat=" + String.valueOf(latitude) + "&begin=" + startDate + "&end=" + endDate + "&api_key=" + API_KEY;
	}

	/***
	 * A method which sorts a list of dates, identifies the differences between successive dates and computes
	 * an average / delta for those dates.
	 * @param dates
	 * @return
	 * @throws java.text.ParseException
	 */
	public static long getDelta(List<String> dates) throws java.text.ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);

		List<Date> sortedDates = new ArrayList<Date>();
		for (int i = 0; i < dates.size(); i++) {
			Date date = sdf.parse(dates.get(i));
			sortedDates.add(date);
		}

		long avg = 0;
		Collections.sort(sortedDates);
		lastDate = sortedDates.get(sortedDates.size() - 1);

		for (int i = 1; i < sortedDates.size(); i++) {
			Date firstDate = sortedDates.get(i);
			Date secondDate = sortedDates.get(i - 1);
			long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
			long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
			avg += diff;
		}
		avg = avg / sortedDates.size();
		return avg;
	}

	/***
	 * A method which parses a string as JSON and extracts the dates from the parsed object.
	 * It returns the delta value by making a call to getDelta(dates)
	 * @param contentJson
	 * @return
	 * @throws ParseException
	 * @throws java.text.ParseException
	 */

	public static long processJson(String contentJson) throws ParseException, java.text.ParseException {
		JSONParser parser = new JSONParser();
		Object object = parser.parse(contentJson);
		JSONObject jsonObj = (JSONObject) object;
		JSONArray results = (JSONArray) jsonObj.get("results");
		List<String> dates = new ArrayList<>();

		Iterator<?> it = results.iterator();
		while (it.hasNext()) {
			JSONObject obj = (JSONObject) it.next();
			dates.add(obj.get("date").toString());
		}
		return getDelta(dates);
	}

	/***
	 * A method which returns the next date when an image will be taken, given delta.
	 * @param delta The average number of days between successive pictures.
	 * @return
	 */
	public static String getNextDate(int delta) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);

		Calendar c1 = Calendar.getInstance();
		c1.setTime(lastDate);

		Calendar c2 = Calendar.getInstance();
		while (c1.before(c2)) {
			c1.add(Calendar.DATE, delta);
		}
		String nextDate = sdf.format(c1.getTime());
		return nextDate;
	}

	/***
	 *
	 * A method which prints the next date when a satellite picture will be taken, given it's location.
	 * @param latitude latitude of the place whose image we want to determine details about.
	 * @param longitude longitude of the place whose image we want to determine details about.
	 * @throws IOException
	 * @throws ParseException
	 * @throws java.text.ParseException
	 */
	public static void flyby(double latitude, double longitude) throws IOException, ParseException, java.text.ParseException {
		URL url = new URL(constructUrl(latitude, longitude));
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer content = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			content.append(inputLine);
		}
		in.close();

		long delta = processJson(content.toString());

		System.out.println("Next time : " + getNextDate((int) delta));
	}

	public static void main(String args[]) throws IOException, ParseException, java.text.ParseException {
		flyby(36.098592, -112.097796);
		flyby(43.078154, -112.097796);
		flyby(36.998979, -109.045183);
		flyby(37.7937007, -122.4039064);
	}
}
