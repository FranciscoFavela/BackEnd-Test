package main;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Descarga {

	public static void main(String[] args) {
		try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://restcountries.com/v3.1/name/all").openStream());
				  FileOutputStream fileOS = new FileOutputStream("/Users/a839607/file_name.txt")) {
				    byte data[] = new byte[1024];
				    int byteContent;
				    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
				        fileOS.write(data, 0, byteContent);
				    }
				} catch (IOException e) {
				    // handles IO exceptions
				}

	}

}
