package com.deped.controller;

public interface ConstantController {

    String URL_SEPARATOR = "/";
    String REST_CONTEXT_NAME = "rest";
    String ID_PATTERN = "{id}";
    String ID_STRING_LITERAL = "id";
    String FROM_STRING_LITERAL = "from";
    String TO_STRING_LITERAL = "to";
    String CREATE_PATTERN = URL_SEPARATOR + "create";
    String UPDATE_PATTERN = URL_SEPARATOR + "update";
    String RENDER_UPDATE_PATTERN = URL_SEPARATOR + "update" + URL_SEPARATOR + ID_PATTERN;
    String FETCH_PATTERN = URL_SEPARATOR + "fetch-all";
    String RANGE_PATTERN = URL_SEPARATOR + "{from}" + URL_SEPARATOR + "{to}";
    String FETCH_BY_ID_PATTERN = URL_SEPARATOR + ID_PATTERN;
    String REMOVE_PATTERN = URL_SEPARATOR + "remove";
    String SHOW_PREFIX = URL_SEPARATOR + "show-all";

    String JSP_PAGES = "pages";

}
