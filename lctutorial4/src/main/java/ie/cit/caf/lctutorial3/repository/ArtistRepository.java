package ie.cit.caf.lctutorial3.repository;

import java.util.List;

import ie.cit.caf.lctutorial3.domain.Artist;

public interface ArtistRepository {

	public Artist get(int id);
	
	public void save(Artist artist);
	
	public void remove(Artist artist);
	
	public List<Artist> findAll();

	
	
	
	

}