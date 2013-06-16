package com.github.highchart.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;



import com.github.highchart.api.base.BaseObject;
import com.github.highchart.api.label.LabelsItems;
import com.github.highchart.api.utils.JsonArray;

@XmlAccessorType( XmlAccessType.NONE )
@XmlType( namespace = "chart-options" )
public class Labels extends BaseObject {

    @XmlTransient
    private JsonArray<LabelsItems> items;

    public Labels() {
    }

    @XmlTransient
    public JsonArray<LabelsItems> getItems() {
        if ( items == null ) {
            items = new JsonArray<LabelsItems>();
        }

        return items;
    }

}
