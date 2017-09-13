package com.thesis.service.requests;

import com.thesis.model.items.semigoods.Item;
import com.thesis.model.requests.Request;

import java.util.List;

public interface RequestService {

    Request requestItems(List<Item> listOfRequestingItems);

    List<Item> editRequestItems(Long requestId);

    boolean deleteRequest(Long requestId);

}
