package ie.cit.caf.lctutorial;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This program reads a JSON document from disk containing Artist details, parses
 * it and displays the contents in a formatted way.
 *
 * @author larkin
 * @since January 2015
 *
 */
public class Application {

	public static void main(String[] args) {
		
		String artistFile = args[0];
		System.out.printf("Processing Artist file %s......\n", artistFile);
		
		try {
			Artist artist = new ObjectMapper().readValue(new File(artistFile), Artist.class);
			
			System.out.println("\n" + artist.toString());
			
		} catch (JsonParseException e) {
			System.out.println("Error parsing the file.");
		} catch (JsonMappingException e) {
			System.out.println("Error mapping to Java object.");
		} catch (IOException e) {
			System.out.println("Unknown I/O error.");
		}
	}

}