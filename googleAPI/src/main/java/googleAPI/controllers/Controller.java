package googleAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import googleAPI.entitys.LogRepo;
import googleAPI.entitys.Marker;
import googleAPI.entitys.MarkerRepo;
import googleAPI.entitys.NameRepo;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class Controller {
	
	@Autowired
	public LogRepo logrepo;
	
	@Autowired
	public MarkerRepo markerrepo;
	
	@Autowired
	public NameRepo namerepo;
	
	@RequestMapping("/status")
	public String status() {
		return "Running";
	}
	
	@RequestMapping("/engineering/test/tableinsert")
	public String testTableInsert() {
		Marker marker = new Marker();
		marker.lat = 1.24;
		marker.lng = 1.0;
		markerrepo.save(marker);
		return "succes";
	}
	
	@RequestMapping("/marker/newMarker")
	public void newMarker(@RequestParam Double lat, @RequestParam Double lng) {
		Marker marker = new Marker();
		marker.lat = lat;
		marker.lng = lng;
		markerrepo.save(marker);
	}

}
