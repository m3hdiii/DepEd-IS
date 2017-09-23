package com.thesis.repository.places;

import com.thesis.model.location.office.Section;

import java.util.List;

public interface SectionRepository {

    Boolean createSection(Section section);

    Boolean updateSection(Section section);

    Boolean removeSection(Section section);

    Boolean removeSection(Long sectionID);

    List<Section> fetchAllSections();

    List<Section> fetchSections(int from, int to);
}
