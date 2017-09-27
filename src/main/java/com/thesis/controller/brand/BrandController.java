package com.thesis.controller.brand;

import com.thesis.controller.AbstractMainController;
import com.thesis.model.Response;
import com.thesis.model.items.Brand;
import com.thesis.repository.utils.Range;
import com.thesis.service.brand.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BrandController extends AbstractMainController<Brand, Long> {


    @Autowired
    private BrandService brandService;

    @Override
    @RequestMapping(value = "create-brand", method = RequestMethod.POST)
    public @ResponseBody
    Brand create(@RequestBody Brand entity) {
        Brand savedBrand = brandService.create(entity);
        return savedBrand;
    }

    @Override
    @RequestMapping(value = "update-Brand", method = RequestMethod.POST)
    public Response update(@RequestBody Brand entity) {
        Boolean isUpdated = brandService.update(entity);
        return makeResponse(isUpdated, "your brand successfully updated", "your brand failed to update");
    }

    @Override
    @RequestMapping(value = "all-brands", method = RequestMethod.GET)
    public @ResponseBody
    List<Brand> fetchAll() {
        List<Brand> brands = brandService.fetchAll();
        return brands;
    }

    @Override
    @RequestMapping(value = "all-brands/{from}/{to}")
    public List<Brand> fetchByRange(@PathVariable("from") int from, @PathVariable("to") int to) {
        List<Brand> brands = brandService.fetchByRange(new Range(from, to));
        return brands;
    }

    @Override
    @RequestMapping(value = "brand/{brand-id}")
    public @ResponseBody
    Brand fetchById(@PathVariable("brand-id") Long aLong) {
        Brand brand = brandService.fetchById(aLong);
        return brand;
    }

    @Override
    public @ResponseBody
    Response remove(@RequestBody Brand... entities) {
        Boolean isRemoved = brandService.remove(entities);
        return makeResponse(isRemoved, "brands successfully removed", "brands failed to remove");
    }

    @Override
    @RequestMapping(value = "create-brand", method = RequestMethod.GET)
    public String renderCreatePage(Brand entity, Model model) {
        return "";
    }

    @Override
    @RequestMapping(value = "show-brands", method = RequestMethod.GET)
    public String renderListPage(Model model) {
        return "";
    }

    @Override
    @RequestMapping(value = "brand-update", method = RequestMethod.GET)
    public String renderUpdatePage() {
        return "";
    }
}
