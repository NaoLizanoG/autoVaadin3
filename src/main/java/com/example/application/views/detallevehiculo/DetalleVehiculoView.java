package com.example.application.views.detallevehiculo;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Detalle Vehiculo")
@Route(value = "Detalle-Vehiculo", layout = MainLayout.class)
@Uses(Icon.class)
public class DetalleVehiculoView extends Composite<VerticalLayout> {

    public DetalleVehiculoView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        H2 h2 = new H2();
        Paragraph textLarge = new Paragraph();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        H2 h22 = new H2();
        Paragraph textMedium = new Paragraph();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        h2.setText("Placa");
        h2.setWidth("max-content");
        textLarge.setText("AFN2165");
        textLarge.setWidth("100%");
        textLarge.getStyle().set("font-size", "var(--lumo-font-size-xl)");
        layoutRow2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        h22.setText("Marca");
        h22.setWidth("max-content");
        textMedium.setText("Renault");
        textMedium.setWidth("100%");
        textMedium.getStyle().set("font-size", "var(--lumo-font-size-m)");
        layoutRow3.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.getStyle().set("flex-grow", "1");
        getContent().add(layoutRow);
        layoutRow.add(h2);
        layoutRow.add(textLarge);
        getContent().add(layoutRow2);
        layoutRow2.add(h22);
        layoutRow2.add(textMedium);
        getContent().add(layoutRow3);
    }
}
