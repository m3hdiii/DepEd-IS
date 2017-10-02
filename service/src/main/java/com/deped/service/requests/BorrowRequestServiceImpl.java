package com.deped.service.requests;

import com.deped.model.Operation;
import com.deped.model.Response;
import com.deped.model.request.BorrowRequest;
import com.deped.repository.requests.BorrowRequestRepository;
import com.deped.repository.utils.Range;
import com.deped.service.ServiceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowRequestServiceImpl implements BorrowRequestService {

    @Autowired
    private BorrowRequestRepository borrowRequestRepository;

    @Override
    public ResponseEntity<BorrowRequest> create(BorrowRequest entity) {
        BorrowRequest savedEntity = borrowRequestRepository.create(entity);
        ResponseEntity<BorrowRequest> responseEntity = new ResponseEntity<>(savedEntity, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<Response> update(BorrowRequest entity) {
        Boolean isUpdated = borrowRequestRepository.update(entity);
        Response response = ServiceUtils.makeResponse(isUpdated, Operation.UPDATE, BorrowRequest.class);
        ResponseEntity<Response> responseEntity = new ResponseEntity<>(response, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<List<BorrowRequest>> fetchAll() {
        List<BorrowRequest> entities = borrowRequestRepository.fetchAll();
        ResponseEntity<List<BorrowRequest>> responseEntity = new ResponseEntity<>(entities, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<List<BorrowRequest>> fetchByRange(Range range) {
        List<BorrowRequest> entities = borrowRequestRepository.fetchByRange(range);
        ResponseEntity<List<BorrowRequest>> responseEntity = new ResponseEntity<>(entities, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<BorrowRequest> fetchById(Object id) {
        BorrowRequest entity = borrowRequestRepository.fetchById(id);
        ResponseEntity<BorrowRequest> responseEntity = new ResponseEntity<>(entity, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<Response> remove(BorrowRequest... entities) {
        Boolean isRemoved = borrowRequestRepository.remove(entities);
        Response response = ServiceUtils.makeResponse(isRemoved, Operation.DELETE, BorrowRequest.class);
        ResponseEntity<Response> responseEntity = new ResponseEntity<>(response, OK);
        return responseEntity;
    }
}
