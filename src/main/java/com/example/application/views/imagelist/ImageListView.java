package com.example.application.views.imagelist;

import java.io.InputStream;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.html.OrderedList;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MultiFileMemoryBuffer;
@PageTitle("Home")
@Route(value ="Home", layout = MainLayout.class)
public class ImageListView extends Main implements HasComponents, HasStyle {

    private OrderedList imageContainer;
       
    public ImageListView() {
        
        constructUI();
        
        
        imageContainer.add(new ImageListViewCard("Snow mountains under stars",""));
                
        
        
        
    }

    private void constructUI() {
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
        
        var button = new Button("Logout",event-> UI.getCurrent().navigate("hello"));
        
        container.add(header);
       

        MultiFileMemoryBuffer buffer = new MultiFileMemoryBuffer();
        Upload upload = new Upload(buffer);

        upload.addSucceededListener(event -> {
        String fileName = event.getFileName();
        InputStream inputStream = buffer.getInputStream(fileName);
                
            // Do something with the file data
            // processFile(inputStream, fileName);
        });
        Div div = new Div();
        div.addClassNames("bg-contrast 90%", "flex items-center", "justify-center", "mb-s", "overflow-hidden",
                "rounded-m w-full");
        div.setHeight("160px");        
        div.add(upload);
        add(upload,container, imageContainer,button);

    }
}