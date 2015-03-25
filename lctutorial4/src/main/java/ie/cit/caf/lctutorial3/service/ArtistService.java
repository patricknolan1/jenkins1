package ie.cit.caf.lctutorial3.service;

import ie.cit.caf.lctutorial3.domain.Artist;

import java.util.List;

public interface ArtistService {

	void save(Artist artist);
	Artist get(int id);
	
	void remove(Artist artist);
	List<Artist> findAll();
	
	
	
	
	
}
