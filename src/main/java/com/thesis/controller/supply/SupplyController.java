package com.thesis.controller.supply;

import com.thesis.controller.AbstractMainController;
import com.thesis.model.Response;
import com.thesis.model.location.office.Section;
import com.thesis.model.supplys.Supply;
import com.thesis.repository.utils.Range;
import com.thesis.service.supply.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SupplyController extends AbstractMainController <Supply, Long>{

    @Autowired
    private SupplyService supplyService;

    @Override
    @RequestMapping(value = "create-supply", method = RequestMethod.POST)
    public @ResponseBody Supply create(@RequestBody Supply entity) {
        Supply supply = supplyService.create(entity);
        return supply;
    }

    @Override
    @RequestMapping(value = "update-supply", method = RequestMethod.POST)
    public @ResponseBody Response update(@RequestBody Supply entity) {
        Boolean isUpdated = supplyService.update(entity);
        return makeResponse(isUpdated, "your supply successfully updated", "your supply failed to update");
    }

    @Override
    @RequestMapping(value = "fetch-all-supplies", method = RequestMethod.GET)
    public @ResponseBody List<Supply> fetchAll() {
        return supplyService.fetchAll();
    }

    @Override
    @RequestMapping(value = "fetch-by-range/{from}/{to}", method = RequestMethod.GET)
    //localhost:8080/fetch-by-range/1/10
    public List<Supply> fetchByRange(@PathVariable("from") int from,@PathVariable("to") int to) {
        return supplyService.fetchByRange(new Range(from, to));
    }

    @Override
    @RequestMapping(value = "fetch-by-id/{id}", method = RequestMethod.GET)
    public Supply fetchById(@PathVariable("id") Long aLong) {
        return supplyService.fetchById(aLong);
    }

    @Override
    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public @ResponseBody Response remove(@RequestBody Supply... entities) {
        Boolean isRemoved =  supplyService.remove(entities);
        return makeResponse(isRemoved, "your entities successfully removed", "something went wrong and it didn't remove");
    }

    @Override
    @RequestMapping(value = "render-create-page", method = RequestMethod.GET)
    public String renderCreatePage(Supply entity, Model model) {
        return null;
    }

    @Override
    @RequestMapping(value = "render-supply-list", method = RequestMethod.GET)
    public String renderListPage(Model model) {
        return null;
    }

    @Override
    @RequestMapping(value = "update-page", method = RequestMethod.GET)
    public String renderUpdatePage() {
        return null;
    }
}
