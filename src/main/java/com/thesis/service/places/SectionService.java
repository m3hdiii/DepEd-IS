package com.thesis.service.places;

import com.thesis.model.location.office.Section;

import java.util.List;

public interface SectionService {

    Boolean createSection(Section section);

    Boolean updateSection(Section section);

    Boolean removeSection(Long sectionID);

    List<Section> fetchAllSections();

    List<Section> fetchSections(int from, int to);

}
