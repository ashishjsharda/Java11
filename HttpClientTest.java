import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


/**
 * Using HttpClient Java 11
 * @author ashish
 */
public class HttpClientTest {
    public static void main(String[] args) throws IOException, InterruptedException {
       var req= HttpRequest.newBuilder().uri(URI.create("https://restfulapi.net/http-methods/"))
               .GET().build();
       var client= HttpClient.newHttpClient();
        HttpResponse<String> response=client.send(req,HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
