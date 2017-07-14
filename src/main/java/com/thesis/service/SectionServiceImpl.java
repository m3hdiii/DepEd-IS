package com.thesis.service;

import com.thesis.model.Section;
import com.thesis.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mehdi on 7/14/17.
 */

@Service
public class SectionServiceImpl implements SectionService {

    @Autowired
    private SectionRepository sectionRepository;

    @Override
    public boolean addSection(Section section) {
        return false;
    }

    @Override
    public boolean removeSection(Long sectionId) {
        return false;
    }

    @Override
    public boolean editSection(Section section) {
        return false;
    }

    @Override
    public List<Section> fetchSections() {
        return sectionRepository.fetchSections();
    }
}
