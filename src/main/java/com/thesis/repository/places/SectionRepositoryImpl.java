package com.thesis.repository.places;

import com.thesis.model.location.office.Section;
import com.thesis.repository.utils.HibernateFacade;
import com.thesis.repository.utils.Range;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SectionRepositoryImpl implements SectionRepository {

    @Autowired
    private HibernateFacade hibernateFacade;

    @Override
    public Section create(Section entity) {
        return hibernateFacade.saveEntity(Section.class, entity);
    }

    @Override
    public Boolean update(Section entity) {
        return hibernateFacade.updateEntity(entity);
    }

    @Override
    public List<Section> fetchAll() {
        List<Section> sections = hibernateFacade.fetchAllEntity("", Section.class);
        return sections;
    }

    @Override
    public List<Section> fetchByRange(Range range) {
        List<Section> sections = hibernateFacade.fetchAllEntity("", Section.class, range);
        return sections;
    }

    @Override
    public Section fetchById(Object id) {
        Section section = hibernateFacade.fetchEntityById(Section.class, id);
        return section;
    }

    @Override
    public Boolean remove(Section... entities) {
        Boolean isDeleted = hibernateFacade.removeEntities("section", "section_id", entities);
        return isDeleted;
    }
}
