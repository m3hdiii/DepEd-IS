package com.thesis.controller.center;

import com.thesis.model.Department;
import com.thesis.model.Gender;
import com.thesis.model.User;
import com.thesis.service.DepartmentService;
import com.thesis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.beans.PropertyEditorSupport;
import java.util.List;

/**
 * Created by mehdi on 7/7/17.
 */
@Controller
@RequestMapping(value="/")
public class Signup {

    @Autowired
    private UserService userService;
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value="signup", method = RequestMethod.POST)
    public String signup(@Valid @ModelAttribute("user1") User user, BindingResult result, HttpSession sesison) {

        return null;
    }

    @RequestMapping(value="signup", method = RequestMethod.GET)
    public String renderSignup(@Valid @ModelAttribute("user1") User user, Model model) {
        model.addAttribute("genderList", Gender.values());
        model.addAttribute("departmentList", departmentService.fetchDepartments());
        return "center/signup";
    }


    @InitBinder
    public void genderBinder(WebDataBinder dataBinder) {
        dataBinder.registerCustomEditor(Gender.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String value) throws IllegalArgumentException {
                if(value == null || "".equals(value))
                    return;

                setValue(Gender.valueOf(value));
            }

            @Override
            public String getAsText() {
                if(getValue() == null)
                    return "";
                return ((Gender) getValue()).name();
            }
        });
    }

    public void departmentBinder(WebDataBinder dataBinder) {
        dataBinder.registerCustomEditor(Department.class, new PropertyEditorSupport(){
            @Override
            public void setSource(Object source) {
                List<Department> departments = departmentService.fetchDepartments();
                super.setSource(departments);
            }

            @Override
            public Object getSource() {
                return super.getSource();
            }
        });
    }
}
