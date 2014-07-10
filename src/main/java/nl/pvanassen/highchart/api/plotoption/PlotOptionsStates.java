package nl.pvanassen.highchart.api.plotoption;

import javax.xml.bind.annotation.XmlElement;

import nl.pvanassen.highchart.api.base.BaseObject;

public class PlotOptionsStates extends BaseObject {

    @XmlElement(type = PlotStatesSelect.class)
    private PlotStatesSelect select;

    public PlotStatesSelect getSelect() {
        if (select == null) {
            select = new PlotStatesSelect();
        }
        return select;
    }
}