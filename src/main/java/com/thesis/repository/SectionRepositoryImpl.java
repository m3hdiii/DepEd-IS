package com.thesis.repository;

import com.thesis.model.location.officeplace.Section;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehdi on 7/14/17.
 */

class SaveSection{

    public static List<Section> fetchSections(){
        return new ArrayList<Section>(){{
//            add(new Section(1L, "sec1", "sec1 Desc", null));
//            add(new Section(2L, "sec2", "sec2 Desc", null));
//            add(new Section(3L, "sec3", "sec3 Desc", null));
//            add(new Section(4L, "sec4", "sec4 Desc", null));

        }};
    }
}

@Repository
public class SectionRepositoryImpl implements SectionRepository {
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
        return SaveSection.fetchSections();
    }
}
