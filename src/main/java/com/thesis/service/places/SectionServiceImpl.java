package com.thesis.service.places;

import com.thesis.model.location.office.Section;
import com.thesis.repository.places.SectionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SectionServiceImpl implements SectionService {

    private SectionRepository sectionRepository;
    @Override
    public Boolean createSection(Section section) {
        return null;
    }

    @Override
    public Boolean updateSection(Section section) {
        return null;
    }

    @Override
    public Boolean removeSection(Section section) {
        return null;
    }

    @Override
    public Boolean removeSection(Long sectionID) {
        return null;
    }

    @Override
    public List<Section> fetchAllSections() {
        return null;
    }

    @Override
    public List<Section> fetchSections(int from, int to) {
        return null;
    }
}
