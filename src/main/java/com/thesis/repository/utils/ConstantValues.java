package com.thesis.repository.utils;

public interface ConstantValues {
    //NamedQueries
    String FETCH_ALL_ITEMS = "fetchAllItems";
    String FETCH_ALL_USERS = "findAllUsers";
    String FETCH_ALL_DEPARTMENTS = "fetchAllDepartments";
    String FETCH_ALL_DEPARTMENT_RANGES = "fetchDepartments";
    String FETCH_ALL_BRANDS = "fetchBrands";
    String FETCH_ALL_BRAND_RANGES = "fetchBrandsByRange";
    String FETCH_ALL_EQUIPMENTS = "fetchEquipments";
    String FETCH_ALL_EQUIPMENTS_RANGE = "fetchEquipmentsByRange";
    String FETCH_ALL_EQUIPMENT_INFO = "fetchEquipmentInfo";
    String FETCH_ALL_EQUIPMENT_INFO_RANGE = "fetchEquipmentInfoByRange";
    String FETCH_ALL_PACKS = "fetchPacks";
    String FETCH_ALL_PACKS_RANGE = "fetchPacksByRange";
    String FETCH_ALL_CATEGORY = "fetchCategories";
    String FETCH_ALL_CATEGORY_RANGE = "fetchCategoriesByRange";


    //Tables and TableId Name
    String USER_TABLE = "user";
    String USER_TABLE_ID = "user_id";
    String DEPARTMENT_TABLE = "department";
    String DEPARTMENT_TABLE_ID = "department_id";
    String BRAND_TABLE = "brand";
    String BRAND_TABLE_ID = "brand_id";
    String EQUIPMENTS_TABLE = "equipment";
    String EQUIPMENTS_TABLE_ID = "equipment_id";
    String EQUIPMENT_INFO_TABLE = "equipment_info";
    String EQUIPMENT_INFO_TABLE_ID = "equipment_info_id";
    String PACK_TABLE = "pack";
    String PACK_TABLE_ID = "pack_id";
    String CATEGORY_TABLE = "category";
    String CATEGORY_TABLE_ID = "category_id";
}
