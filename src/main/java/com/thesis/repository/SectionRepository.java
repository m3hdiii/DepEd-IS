package com.thesis.repository;

import com.thesis.model.location.officeplace.Section;

import java.util.List;

/**
 * Created by mehdi on 7/14/17.
 */
public interface SectionRepository {

    boolean addSection(Section section);
    boolean removeSection(Long sectionId);
    boolean editSection(Section section);
    List<Section> fetchSections();
}
