package com.example.application.views.about;

import com.example.application.views.MainLayout;
import com.example.application.views.imagelist.ImageListViewCard;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.charts.model.Select;
import com.vaadin.flow.component.html.Aside;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.html.OrderedList;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.html.UnorderedList;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("About")
@Route(value = "about", layout = MainLayout.class)
public class AboutView extends VerticalLayout {

    private OrderedList imageContainer;

    public AboutView() {
        Main content = new Main();
        content.addClassNames("image-list-view", "max-w-screen-lg", "mx-auto", "pb-l", "px-l");
        content.add(createAside());
        add(content);

    }
    private Aside createAside() {
        
        constructUI();
        HorizontalLayout layout = new HorizontalLayout();
        
        Aside aside = new Aside();
        aside.addClassNames("bg-contrast-5", "box-border", "p-l", "rounded-l");        
        Header headerSection = new Header();
        headerSection.addClassNames("flex", "items-center", "justify-between", "mb-m");
        /*H3 header = new H3("Order");
        header.addClassNames("m-0");
        Button edit = new Button("Edit");
        edit.addThemeVariants(ButtonVariant.LUMO_TERTIARY_INLINE);
        headerSection.add(header, edit);*/
        
        Image image = new Image("https://static.wixstatic.com/media/efa504_35ac2b2c0a0d4b69b0ae7b612b0521dc~mv2.jpg/v1/crop/x_22,y_0,w_346,h_346/fill/w_240,h_240,al_c,q_80,usm_0.66_1.00_0.01,enc_auto/Emmanuel_edited.jpg","");
        Image image2 = new Image("https://static.wixstatic.com/media/b64983_4e0cd380d09544cb903afae9310680d8~mv2.jpeg/v1/fill/w_240,h_240,al_c,q_80,usm_0.66_1.00_0.01,enc_auto/WhatsApp%20Image%202021-07-26%20at%2012_49_16.jpeg","");
        Image image3 = new Image("https://static.wixstatic.com/media/b64983_1c37ff2360b9498f92f427e7fab9d03a~mv2.jpg/v1/fill/w_240,h_240,al_c,q_80,usm_0.66_1.00_0.01,enc_auto/78660946_2563656200531325_5877597104590815232_n.jpg","");
        OrderedList ul = new OrderedList();
        ul.addClassNames("list-none", "m-0", "p-0", "flex", "flex-col", "gap-m","justify-between");
        
        imageContainer.add(new ImageListViewCard("Snow mountains under stars",
        "https://static.wixstatic.com/media/efa504_35ac2b2c0a0d4b69b0ae7b612b0521dc~mv2.jpg/v1/crop/x_22,y_0,w_346,h_346/fill/w_240,h_240,al_c,q_80,usm_0.66_1.00_0.01,enc_auto/Emmanuel_edited.jpg"));
        UnorderedList u2 = new UnorderedList();
        u2.addClassNames("list-none", "m-0", "p-0", "flex", "flex-col", "gap-m","ustify-between");
        u2.add(image2,createListItem("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.", "", ""));
        UnorderedList u3 = new UnorderedList();
        u3.addClassNames("list-none", "m-0", "p-0", "flex", "flex-col", "gap-m","ustify-between");
        u3.add(image3,createListItem("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.", "", ""));
        
        imageContainer = new OrderedList();
        imageContainer.addClassNames("gap-m", "grid", "list-none", "m-0", "p-0");

        layout.setPadding(false);
        layout.add(imageContainer);

        aside.add(layout);
        
        
        
        return aside;
    }

    private ListItem createListItem(String primary, String secondary, String price) {
        ListItem item = new ListItem();
        item.addClassNames("flex", "justify-between");

        Div subSection = new Div();
        subSection.addClassNames("flex", "flex-col");

        subSection.add(new Span(primary));
        Span secondarySpan = new Span(secondary);
        secondarySpan.addClassNames("text-s text-secondary");
        subSection.add(secondarySpan);

        Span priceSpan = new Span(price);

        item.add(subSection, priceSpan);
        return item;
    }
 
 public void constructUI(){
    addClassNames("image-list-view", "max-w-screen-lg", "mx-auto", "pb-l", "px-l");

        HorizontalLayout container = new HorizontalLayout();
        container.addClassNames("items-center", "justify-between");
        /*MainLayout gg =new MainLayout();
        gg.addClassNames("items-center","justify-between");
        gg.addToNavbar (new Button("Logout",event->UI.getCurrent().navigate("hello")));*/
        
        VerticalLayout headerContainer = new VerticalLayout();
        H2 header = new H2("Your Publicationas");
        header.addClassNames("mb-0", "mt-xl", "text-3xl");
        Paragraph description = new Paragraph("Royalty free photos and pictures, courtesy of Unsplash");
        description.addClassNames("mb-xl", "mt-0", "text-secondary");
        headerContainer.add(header, description);

        

        imageContainer = new OrderedList();
        imageContainer.addClassNames("gap-m", "grid", "list-none", "m-0", "p-0");
        
        
        
        container.add(header);
       

       
        add(container, imageContainer);

 }

}
