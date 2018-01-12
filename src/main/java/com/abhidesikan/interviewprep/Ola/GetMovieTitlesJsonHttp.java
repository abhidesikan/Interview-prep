package com.abhidesikan.interviewprep.Ola;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetMovieTitlesJsonHttp {

	private static String query = "https://jsonmock.hackerrank.com/api/movies/search/?Title=";

	static String[] getMovieTitles(String substr) throws IOException {
		JsonParser parser = new JsonParser();
		JsonObject jsonObject;
		String results = getPageResults(substr);
		jsonObject = parser.parse(results).getAsJsonObject();
		int total_pages = jsonObject.get("total_pages").getAsInt();
		int per_page = jsonObject.get("per_page").getAsInt();

		List<String> titles = new ArrayList<>();
		for(int i=1; i<=total_pages; i++) {
			String page_results = getPageResults(substr+"&page="+i);
			JsonParser parser2 = new JsonParser();
			JsonObject jsonObject2 = parser2.parse(page_results).getAsJsonObject();
			JsonArray jsonArray = jsonObject2.getAsJsonArray("data");
			for(int j=0; j<jsonArray.size(); j++) {
				titles.add(jsonArray.get(j).getAsJsonObject().get("Title").getAsString());
			}
		}

		String [] titlesArray = new String[titles.size()];
		titlesArray = titles.toArray(titlesArray);
		Arrays.sort(titlesArray);
		return titlesArray;
	}

	static String getPageResults(String substr) throws IOException {
		URL myUrl = new URL(query+substr);
		HttpURLConnection conn = (HttpURLConnection)myUrl.openConnection();
		InputStream is = conn.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String inputLine;
		while ((inputLine = br.readLine()) != null) {
			return inputLine;
		}
		br.close();
		return null;
	}

}
