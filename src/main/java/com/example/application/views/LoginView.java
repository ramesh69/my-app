package com.example.application.views;

import com.example.application.views.RegisterView.RegisterView;
import com.example.application.views.personform.PersonFormView;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;

import java.lang.annotation.Retention;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

import antlr.debug.Event;

@Route(value = "Login")
@PageTitle("Login | Motives International")
public class LoginView extends VerticalLayout implements BeforeEnterObserver {


    LoginI18n i18n = LoginI18n.createDefault();


    public LoginView(){
		addClassName("login-view");
		setSizeFull(); 
		setAlignItems(Alignment.CENTER);
		setJustifyContentMode(JustifyContentMode.CENTER);
       
        LoginI18n.Form i18nForm = i18n.getForm();
        i18nForm.setTitle("Log In");
        i18nForm.setUsername("Username");
        i18nForm.setPassword("Password");
        i18nForm.setForgotPassword("");      
        var Register = new RouterLink("Register",PersonFormView.class);
        Register.addClassNames("margin-top","500px");
        i18n.setForm(i18nForm); 
      
        LoginForm loginForm = new LoginForm();        
        loginForm.setI18n(i18n);
        
        
		loginForm.setAction("Home"); 
        
		add(new H1("Motives International"),loginForm,Register);
        
	}
    @Override
	public void beforeEnter(BeforeEnterEvent beforeEnterEvent) {
		
	}

}

