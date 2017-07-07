package com.thesis.config.core.cookie;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by mehdi on 10/4/14.
 */
@Component
public class HPCookieLocaleResolver extends CookieLocaleResolver {

    @Override
    public void addCookie(HttpServletResponse response, String cookieValue) {
        Assert.notNull(response, "HttpServletResponse must not be null");

        if(!(cookieValue.equals("en")) || !(cookieValue.equals("fa")))
            return;

        Cookie cookie = createCookie(cookieValue);
        Integer maxAge = getCookieMaxAge();
        if (maxAge != null) {
            cookie.setMaxAge(maxAge);
        }
        if (isCookieSecure()) {
            cookie.setSecure(true);
        }
        if (isCookieHttpOnly()) {
            cookie.setHttpOnly(true);
        }
        response.addCookie(cookie);
        if (logger.isDebugEnabled()) {
            logger.debug("Added cookie with name [" + getCookieName() + "] and value [" + cookieValue + "]");
        }
    }


}
