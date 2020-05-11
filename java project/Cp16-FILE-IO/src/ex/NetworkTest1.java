package ex;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class NetworkTest1 {

	public static void main(String[] args) throws IOException, URISyntaxException {
		URL url = new URL("https://www.google.com/search?q=%EC%A7%91%EC%97%90+%EA%B0%80%EA%B3%A0%EC%8B%B6%EB%8B%A4&oq=%EC%A7%91%EC%97%90+%EA%B0%80%EA%B3%A0%EC%8B%B6%EB%8B%A4&aqs=chrome..69i57j0l7.2360j0j7&sourceid=chrome&ie=UTF-8");
		System.out.println("url.getAuthority():"+ url.getAuthority());
		//System.out.println("url.getContent():"+ url.getContent());
		System.out.println("url.getDefaultPort():"+ url.getDefaultPort());
		System.out.println("url.getPort():"+ url.getPort());
		System.out.println("url.getFile():"+ url.getFile());
		System.out.println("url.getHost():"+ url.getHost());
		System.out.println("url.getPath():"+ url.getPath());
		System.out.println("url.getProtocol():"+ url.getProtocol());
		System.out.println("url.getQuery():"+ url.getQuery());
		System.out.println("url.getRef():"+ url.getRef());
		System.out.println("url.getUserInfo():"+ url.getUserInfo());
		System.out.println("url.toExternalForm():"+ url.toExternalForm());
		System.out.println("url.toURI():"+ url.toURI());


	}

}
