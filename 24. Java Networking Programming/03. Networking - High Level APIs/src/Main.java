import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        try {
            URI uri = new URI("hello");
            URI uriTest = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");

            URI baseUri = new URI("http://username:password@mynewerver.com:5000");
            URI uri1 = new URI("/catalogue/phones?os=android#samsung");
            URI uri2 = new URI("/catalogue/tvs?manufacturer=samsung");
            URI uri3 = new URI("/stores/locations?zip=123145");

            URI resolvedUri1 = baseUri.resolve(uri1);
            URI resolvedUri2 = baseUri.resolve(uri2);
            URI resolvedUri3 = baseUri.resolve(uri3);

            URL url1 = resolvedUri1.toURL();
            System.out.println("URL 1 = " + url1);

            URL url2 = resolvedUri2.toURL();
            System.out.println("URL 2 = " + url2);

            URL url3 = resolvedUri3.toURL();
            System.out.println("URL 3 = " + url3);
            System.out.println("Scheme = " + uri.getScheme());
            System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
            System.out.println("Authority = " + uri.getAuthority());
            System.out.println("User info = " + uri.getUserInfo());
            System.out.println("Host = " + uri.getHost());
            System.out.println("Port = " + uri.getPort());
            System.out.println("Path = " + uri.getPath());
            System.out.println("Query = " + uri.getQuery());
            System.out.println("Fragment = " + uri.getFragment());

            URI relativizedURI = baseUri.relativize(resolvedUri2);
            System.out.println("Relative URI = " + relativizedURI);

            URL url = new URL("http://example.org");

            URI uri4 = url.toURI();
            System.out.println("Scheme = " + uri4.getScheme());
            System.out.println("Scheme-specific part = " + uri4.getSchemeSpecificPart());
            System.out.println("Authority = " + uri4.getAuthority());
            System.out.println("User info = " + uri4.getUserInfo());
            System.out.println("Host = " + uri4.getHost());
            System.out.println("Port = " + uri4.getPort());
            System.out.println("Path = " + uri4.getPath());
            System.out.println("Query = " + uri4.getQuery());
            System.out.println("Fragment = " + uri4.getFragment());


        } catch (URISyntaxException e) {
            System.out.println("URI Bad Syntax: " + e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println("URL Malformed: " + e.getMessage());
        }


    }
}