package ee.dmipet90.helmes.homework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import ee.dmipet90.helmes.homework.entity.Sector;
import ee.dmipet90.helmes.homework.repository.SectorRepository;
import ee.dmipet90.helmes.homework.service.SectorService;

@Service
public class SectorServiceImpl implements SectorService {
	
	@Autowired 
	SectorRepository sectorRepository;

	@Cacheable("sectors")
	@Override
	public Iterable<Sector> getAllSectors() {
		return sectorRepository.findAll();
	}
	
}
