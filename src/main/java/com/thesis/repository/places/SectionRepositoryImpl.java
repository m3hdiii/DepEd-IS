package com.thesis.repository.places;

import com.thesis.model.account.User;
import com.thesis.model.location.office.Department;
import com.thesis.model.location.office.Section;
import com.thesis.repository.utils.HibernateFacade;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
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
    public Boolean removeSection(Long sectionId) {
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
            NativeQuery<Section> query = hibernateSession.createNativeQuery("DELETE FROM section WHERE section_id = :sectionId", Section.class);
            query.setParameter("sectionId", sectionId);
            int result = query.executeUpdate();

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
    public List<Section> fetchAllSections() {
        Session hibernateSession;
        List<Section> sections = null;
        try {
            hibernateSession = sessionFactory.openSession();
            Query<Section> query = hibernateSession.createNamedQuery("fetchAllSections", Section.class);
            sections = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return sections;
    }

    @Override
    public List<Section> fetchSections(int from, int to) {
        return null;
    }
}
