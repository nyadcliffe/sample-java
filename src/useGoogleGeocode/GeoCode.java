package useGoogleGeocode;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

public class GeoCode {

    public static void main(String[] args) {
        try {
            String path = "http://maps.googleapis.com/maps/api/geocode/json?address="
                    +java.net.URLEncoder.encode("東京都八王子市", "UTF-8")+"&sensor=true&language=ja";
//            String path = "http://maps.googleapis.com/maps/api/geocode/json?latlng=40.70594140,-74.0088760&sensor=true&language=ja";
            HttpURLConnection httpURLConnection = makeConnection(path);
            httpURLConnection.connect();
            if (isHttpError(httpURLConnection)) {
                System.out.println("fail!!");
                System.exit(0);
            }
            StringBuilder stringBuilder = getResultData(httpURLConnection);
            System.out.println(stringBuilder.toString());
        } catch (Exception e) {
            System.out.println("fail!!");
        }
    }

    private static HttpURLConnection makeConnection(String path) throws IOException {
        try {
            java.net.URL url = new java.net.URL(path);
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("User-agent", "Mozilla/5.0");
            httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
            httpURLConnection.setReadTimeout(30000);
            return httpURLConnection;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    private static boolean isHttpError(HttpURLConnection httpURLConnection) throws IOException {
        try {
            int status = httpURLConnection.getResponseCode();
            if (java.net.HttpURLConnection.HTTP_OK == status) {
                return false;
            } else {
                System.out.println(status);
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    private static StringBuilder getResultData(HttpURLConnection httpURLConnection) throws IOException {
        try {
            InputStreamReader reader = new InputStreamReader(
                    httpURLConnection.getInputStream(), "UTF-8");
            int char_data;
            StringBuilder stringBuilder = new StringBuilder("");
            while ((char_data = reader.read()) != -1) {
                stringBuilder.append((char) char_data);
            }
            return stringBuilder;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}