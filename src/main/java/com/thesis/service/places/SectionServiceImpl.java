package com.thesis.service.places;

import com.thesis.model.location.office.Section;
import com.thesis.repository.places.SectionRepository;
import com.thesis.repository.utils.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SectionServiceImpl implements SectionService {

    @Autowired
    private SectionRepository sectionRepository;

    @Override
    public Section create(Section entity) {
        return sectionRepository.create(entity);
    }

    @Override
    public Boolean update(Section entity) {
        return sectionRepository.update(entity);
    }

    @Override
    public List<Section> fetchAll() {
        return sectionRepository.fetchAll();
    }

    @Override
    public List<Section> fetchByRange(Range range) {
        return sectionRepository.fetchByRange(range);
    }

    @Override
    public Section fetchById(Object id) {
        return sectionRepository.fetchById(id);
    }

    @Override
    public Boolean remove(Section... entities) {
        return sectionRepository.remove(entities);
    }
}
