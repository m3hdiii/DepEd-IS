package com.deped.controller;

public interface ConstantController {

    String URL_SEPARATOR = "/";
    String CREATE_PATTERN = URL_SEPARATOR + "create";
    String UPDATE_PATTERN = URL_SEPARATOR + "update";
    String FETCH_PATTERN = URL_SEPARATOR + "fetch-all";
    String RANGE_PATTERN = URL_SEPARATOR + "{from}" + URL_SEPARATOR + "{to}";
    String FETCH_BY_ID_PATTERN = URL_SEPARATOR + "{id}";
    String REMOVE_PATTERN = URL_SEPARATOR + "remove";
    String SHOW_PREFIX = URL_SEPARATOR + "show-all";

    String FROM_STRING_LITERAL = "from";
    String TO_STRING_LITERAL = "to";
    String ID_STRING_LITERAL = "id";

    String CREATE_SUCCESSFUL_MESSAGE = "%s successfully created";
    String CREATE_FAILURE_MESSAGE = "%s failed to creat";

//    private static final String READ_SUCCESSFUL_MESSAGE = "";
//    private static final String READ_FAILURE_MESSAGE = "";

    String UPDATE_SUCCESSFUL_MESSAGE = "%s successfully updated";
    String UPDATE_FAILURE_MESSAGE = "% failed to update";

    String DELETE_SUCCESSFUL_MESSAGE = "%s/s successfully removed";
    String DELETE_FAILURE_MESSAGE = "%s/s failed to removed";
}
