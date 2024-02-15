import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        try {
//            URL url = new URL("http://example.org");
//            URLConnection urlConnection = url.openConnection();

//            BufferedReader inputStream = new BufferedReader(
//                    new InputStreamReader(url.openStream()));
//
//            String line = "";
//
//            while (line != null) {
//                line = inputStream.readLine();
//                System.out.println(line);
//            }
//            inputStream.close();
//
//            URLConnection urlConnection = url.openConnection();
//            urlConnection.setDoOutput(true);
//            urlConnection.connect();
//
//            BufferedReader inputStream = new BufferedReader(
//                    new InputStreamReader(urlConnection.getInputStream()));
//
//            String line = "";
//
//            while (line != null) {
//                line = inputStream.readLine();
//                System.out.println(line);
//            }
//            inputStream.close();
//
//            Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
//
//            for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
//                String key = entry.getKey();
//                List<String> value = entry.getValue();
//                System.out.println("-----> key = " + key);
//                for (String string : value) {
//                    System.out.println("value = " + value);
//                }
//

//            URL url = new URL("http://example.org/somepage.html");
            URL url = new URL("https://api.flickr.com/services/feeds/photos_public.gne?tags=dogs");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setReadTimeout(30000);

            connection.setRequestProperty("User-Agent", "Chrome");
            int responseCode = connection.getResponseCode();

            System.out.println("Response Code = " + responseCode);
            if (responseCode != 200) {
                System.out.println("Error reading web page.");
                System.out.println(connection.getResponseMessage());
                return;
            }

            BufferedReader inputReader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = inputReader.readLine()) != null) {
                System.out.println(line);
            }
            inputReader.close();

        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}