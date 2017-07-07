package com.thesis.controller.center;

import com.thesis.model.Personnel;
import com.thesis.service.UserService;
import net.tanesha.recaptcha.ReCaptchaImpl;
import net.tanesha.recaptcha.ReCaptchaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class MainPageController {

    private static org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(MainPageController.class.getName());


    @RequestMapping(value = {"home", "", "main"}, method = RequestMethod.GET)
    public String mainPageRender() {
        return "redirect:/signup";
    }

    @RequestMapping(value = {"/signup", "/home/signup"}, method = RequestMethod.GET)
    public String signupPage(@ModelAttribute("personnel") Personnel personnel, Model model) {
        model.addAttribute("signup", true);
        return "public/home";
    }

    private static final String RECAPTCHA_PRIVATE_KEY = "6LffLPoSAAAAAJ5as9XGebSdcd0xJqJgd4w6gHHC";

    @Autowired
    private UserService userService;
    @RequestMapping(value = {"/signup", "/home/signup"}, method = RequestMethod.POST)
    public String signup(@Valid @ModelAttribute("personnel") Personnel personnel, BindingResult result, RedirectAttributes redirect, HttpServletRequest request, Model model, HttpSession session) {
        final String USER_ALREADY_REGISTERED_MESSAGE = "this user has been registered already, choose another username !";

//        String remoteAddr = request.getRemoteAddr();
//        ReCaptchaImpl reCaptcha = new ReCaptchaImpl();
//        reCaptcha.setPrivateKey(RECAPTCHA_PRIVATE_KEY);
//
//        String challenge = request.getParameter("recaptcha_challenge_field");
//        String uresponse = request.getParameter("recaptcha_response_field");
//        ReCaptchaResponse reCaptchaResponse = reCaptcha.checkAnswer(remoteAddr, challenge, uresponse);
//
//        if (!reCaptchaResponse.isValid()) {
//            model.addAttribute(personnel);
//            result.addError(new ObjectError("captcha", "the security code you entered did not match, please try again."));
//        }


        int x = 90;
        x |= 3;

        if(userService.isPersonnelAlreadyExist(personnel)){
            result.addError(new ObjectError("userAlreadyRegistered", USER_ALREADY_REGISTERED_MESSAGE));
        }

        if (result.hasErrors()) {
            return "redirect:/signup";
        }



        logger.debug("captcha had no problem");
        Personnel createdPersonnel = userService.createPersonnel(personnel);


        session.setAttribute("personnel", createdPersonnel);
        session.setAttribute("signup", true);
        model.addAttribute("home", true);

        return "redirect:/info";

    }

    @RequestMapping(value = {"info"}, method = RequestMethod.GET)
    public String InfoPageRender() {
        return "public/congrat";
    }

}
