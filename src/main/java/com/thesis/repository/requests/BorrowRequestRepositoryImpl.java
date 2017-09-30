package com.thesis.repository.requests;

import com.thesis.model.request.BorrowRequest;
import com.thesis.repository.utils.HibernateFacade;
import com.thesis.repository.utils.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BorrowRequestRepositoryImpl implements BorrowRequestRepository {

    @Autowired
    private HibernateFacade hibernateFacade;

    @Override
    public BorrowRequest create(BorrowRequest entity) {
        return hibernateFacade.saveEntity(BorrowRequest.class, entity);
    }

    @Override
    public Boolean update(BorrowRequest entity) {
        return hibernateFacade.updateEntity(entity);
    }

    @Override
    public List<BorrowRequest> fetchAll() {
        List<BorrowRequest> query = hibernateFacade.fetchAllEntity("fetchAll", BorrowRequest.class);
        return query;
    }

    @Override
    public List<BorrowRequest> fetchByRange(Range range) {
        return hibernateFacade.fetchAllEntity("", range, BorrowRequest.class);
    }

    @Override
    public BorrowRequest fetchById(Object id) {
        return hibernateFacade.fetchEntityById(BorrowRequest.class, id);
    }

    @Override
    public Boolean remove(BorrowRequest... entities) {
        return hibernateFacade.removeEntities("borrow_request", "borrow_request_id", entities);
    }
}
