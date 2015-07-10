

package nl.pvanassen.highchart.api;

import nl.pvanassen.highchart.api.base.BaseObject;
import nl.pvanassen.highchart.api.utils.JsonArray;

public class DrillDown extends BaseObject {

    private JsonArray<Series> series;

    public JsonArray<Series> getSeries() {
        if (series == null) {
            series = new JsonArray<>();
        }
        return series;
    }

}
