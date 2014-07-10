package nl.pvanassen.highchart.api.axis;

import javax.xml.bind.annotation.*;

import nl.pvanassen.highchart.api.base.BaseObject;

@XmlAccessorType( XmlAccessType.NONE )
@XmlType( namespace = "axis" )
public class AxisLabels extends BaseObject {

    @XmlElement
    private Double rotation;

    @XmlElement
    private String align;

    public String getAlign() {
        return align;
    }

    public Double getRotation() {
        return rotation;
    }

    public AxisLabels setAlign( String align ) {
        this.align = align;
        return this;
    }

    public AxisLabels setRotation( double rotation ) {
        this.rotation = rotation;
        return this;
    }

}