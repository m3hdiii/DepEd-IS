package com.thesis.repository.places;

import com.thesis.model.account.User;
import com.thesis.model.location.office.Section;
import com.thesis.repository.utils.HibernateFacade;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SectionRepositoryImpl implements SectionRepository  {

    @Autowired
    private HibernateFacade hibernateFacade;
    private SessionFactory sessionFactory = hibernateFacade.getSessionFactory();

    @Override
    public Boolean createSection(Section section) {
        Session hibernateSession;
        try {
            hibernateSession = sessionFactory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        Transaction tx = null;

        try {
            tx = hibernateSession.beginTransaction();
            hibernateSession.save("Section", section);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
            return null;
        } finally {
            if (hibernateSession != null)
                hibernateSession.close();
        }

        return true;
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
