package com.thesis.service.data;

import com.thesis.model.location.office.Section;

import java.util.List;

/**
 * Created by mehdi on 7/14/17.
 */
public interface SectionService {

    boolean addSection(Section section);
    boolean removeSection(Long sectionId);
    boolean editSection(Section section);
    List<Section> fetchSections();
}
