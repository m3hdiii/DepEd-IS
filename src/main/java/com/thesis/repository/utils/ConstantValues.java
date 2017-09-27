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

    //Tables
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
}
