package com.example.application.views;


import com.example.application.components.appnav.AppNav;
import com.example.application.components.appnav.AppNavItem;
import com.example.application.views.about.AboutView;
import com.example.application.views.addressform.AddressFormView;
import com.example.application.views.cardlist.CardListView;
import com.example.application.views.chat.ChatView;
import com.example.application.views.checkoutform.CheckoutFormView;
import com.example.application.views.collaborativemasterdetail.CollaborativeMasterDetailView;
import com.example.application.views.creditcardform.CreditCardFormView;
import com.example.application.views.helloworld.HelloWorldView;
import com.example.application.views.imagelist.ImageListView;
import com.example.application.views.masterdetail.MasterDetailView;
import com.example.application.views.personform.PersonFormView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.router.PageTitle;

/**
 * The main view is a top-level placeholder for other views.
 */
public class MainLayout extends AppLayout {

    private H1 viewTitle;

    public MainLayout() {
        setPrimarySection(Section.DRAWER);
        addToNavbar(true, createHeaderContent());
        addToDrawer(createDrawerContent());
    }

    private Component createHeaderContent() {
        DrawerToggle toggle = new DrawerToggle();
        toggle.addClassNames("view-toggle");
        toggle.addThemeVariants(ButtonVariant.LUMO_CONTRAST);
        toggle.getElement().setAttribute("aria-label", "Menu toggle");

        viewTitle = new H1();
        viewTitle.addClassNames("view-title");

        Header header = new Header(toggle, viewTitle);
        header.addClassNames("view-header");
        return header;
    }

    private Component createDrawerContent() {
        H2 appName = new H2("My App");
        appName.addClassNames("app-name");

        com.vaadin.flow.component.html.Section section = new com.vaadin.flow.component.html.Section(appName,
                createNavigation(), createFooter());
        section.addClassNames("drawer-section");
        return section;
    }

    private AppNav createNavigation() {
        // AppNav is not yet an official component.
        // For documentation, visit https://github.com/vaadin/vcf-nav#readme
        AppNav nav = new AppNav();
        nav.addClassNames("app-nav");

        nav.addItem(new AppNavItem("Hello World", HelloWorldView.class, "la la-globe"));
        nav.addItem(new AppNavItem("About", AboutView.class, "la la-file"));
        nav.addItem(new AppNavItem("Master-Detail", MasterDetailView.class, "la la-columns"));
        nav.addItem(new AppNavItem("Card List", CardListView.class, "la la-list"));
        nav.addItem(
                new AppNavItem("Collaborative Master-Detail", CollaborativeMasterDetailView.class, "la la-columns"));
        nav.addItem(new AppNavItem("Person Form", PersonFormView.class, "la la-user"));
        nav.addItem(new AppNavItem("Address Form", AddressFormView.class, "la la-map-marker"));
        nav.addItem(new AppNavItem("Credit Card Form", CreditCardFormView.class, "la la-credit-card"));
        nav.addItem(new AppNavItem("Chat", ChatView.class, "la la-comments"));
        nav.addItem(new AppNavItem("Image List", ImageListView.class, "la la-th-list"));
        nav.addItem(new AppNavItem("Checkout Form", CheckoutFormView.class, "la la-credit-card"));

        return nav;
    }

    private Footer createFooter() {
        Footer layout = new Footer();
        layout.addClassNames("app-nav-footer");

        return layout;
    }

    @Override
    protected void afterNavigation() {
        super.afterNavigation();
        viewTitle.setText(getCurrentPageTitle());
    }

    private String getCurrentPageTitle() {
        PageTitle title = getContent().getClass().getAnnotation(PageTitle.class);
        return title == null ? "" : title.value();
    }
}
