import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
// import com.google.gson.JsonArray;



public class StockAPI 
{
    public static String Prices(String name) 
    {
        String price = "";
        String apiUrl = "https://finnhub.io/api/v1/quote?symbol="+ name +"&token=cvefq7pr01ql1jnb4v40cvefq7pr01ql1jnb4v4g";
        // https://api.polygon.io/v3/reference/dividends?apiKey=MsgmZWkmXMd4KxeTpwdRwbSpLsbQOcHz
        try 
        {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            // connection.setRequestProperty("Bearer", "MsgmZWkmXMd4KxeTpwdRwbSpLsbQOcHz");
            connection.connect();
            int responseCode = connection.getResponseCode();
            
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read the response
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Process the JSON response using Gson library
                Gson gson = new Gson();
                // Turn the whole json file into an object
                JsonObject jsonObject = gson.fromJson(response.toString(), JsonObject.class);
                // // get the results array from the object
                // JsonArray jsonArray = jsonObject.get("results").getAsJsonArray();
                // // turn the contents of the array back into an object
                // JsonObject result = jsonArray.get(0).getAsJsonObject();

               // locate company name from object and display it
                String dataValue = jsonObject.get("c").getAsString();
                // System.out.println("Data value: " + dataValue);
                price = dataValue.toString();
            } else {
                System.out.println("Request failed with response code: " + responseCode);
            }

            
            connection.disconnect();
        } 
        catch (Exception e) 
        {
            System.out.println("Exception in NetClientGet:- " + e);
        }
        return price;
    }
}
