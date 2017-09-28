package com.thesis.controller;

public enum MappingEnum {

    DYNAMIC_ENUM_EXAMPLE {
        @Override
        public String setGetValue(String yourValue, Operation operation) {
            return "prefix " + yourValue + " postfix";
        }
    };

    public abstract String setGetValue(String value, Operation operation);
}