package nl.pvanassen.highchart;

import nl.pvanassen.highchart.api.Axis;
import nl.pvanassen.highchart.api.ChartOptions;
import nl.pvanassen.highchart.api.Point;
import nl.pvanassen.highchart.api.Series;
import nl.pvanassen.highchart.api.Tooltip;
import nl.pvanassen.highchart.api.Legend.LegendLayoutType;
import nl.pvanassen.highchart.api.shared.AlignType;
import nl.pvanassen.highchart.api.shared.SeriesType;
import nl.pvanassen.highchart.api.shared.VerticalAlignType;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author vidyasagar.parupati
 *
 * Testing the API for Column and Spline combination chart
 * @see http://www.highcharts.com/demo/combo-dual-axes
 */
public class TestColumnSplineChart {
	
	private static final String columnSplineJson = "{\"chart\":{\"zoomType\":\"xy\"},\"legend\":{\"align\":\"left\",\"floating\":true,\"layout\":\"vertical\",\"verticalAlign\":\"top\",\"x\":120,\"y\":100},\"series\":[{\"data\":[{\"y\":49.9},{\"y\":71.5},{\"y\":106.4},{\"y\":129.2},{\"y\":144.0},{\"y\":176.0},{\"y\":135.6},{\"y\":148.5},{\"y\":216.4},{\"y\":194.1},{\"y\":95.6},{\"y\":54.4}],\"name\":\"Rainfall\",\"type\":\"column\",\"yAxis\":1,\"tooltip\":{\"valueSuffix\":\" mm\"}},{\"data\":[{\"y\":7.0},{\"y\":6.9},{\"y\":9.5},{\"y\":14.5},{\"y\":18.2},{\"y\":21.5},{\"y\":25.2},{\"y\":26.5},{\"y\":23.3},{\"y\":18.3},{\"y\":13.9},{\"y\":9.6}],\"name\":\"Temperature\",\"type\":\"spline\",\"tooltip\":{\"valueSuffix\":\"°C\"}}],\"title\":{\"text\":\"Average Monthly Temperature and Rainfall in Tokyo\"},\"subtitle\":{\"text\":\"Source: WorldClimate.com\"},\"tooltip\":{\"shared\":true},\"xAxis\":[{\"categories\":[\"Jan\",\"Feb\",\"Mar\",\"Apr\",\"May\",\"Jun\",\"Jul\",\"Aug\",\"Sep\",\"Oct\",\"Nov\",\"Dec\"]}],\"yAxis\":[{\"labels\":{\"format\":\"{value}°C\"},\"title\":{\"text\":\"Temperature\"}},{\"labels\":{\"format\":\"{value} mm\"},\"opposite\":true,\"title\":{\"text\":\"Rainfall\"}}]}";
	
	@Test
	public void columSplineChartCreateTest() {
		
		ChartOptions options = new ChartOptions();
		
		options.getChart().setZoomType("xy");
		
		//titles
		options.getTitle().setText("Average Monthly Temperature and Rainfall in Tokyo");
		options.getSubtitle().setText("Source: WorldClimate.com");
		
		//xAxis
		Axis xaAxis = new Axis();
		xaAxis.getCategories().pushString("Jan").pushString("Feb").pushString("Mar").pushString("Apr").pushString("May").pushString("Jun")
		  .pushString("Jul").pushString("Aug").pushString("Sep").pushString("Oct").pushString("Nov").pushString("Dec");
		options.getXAxis().pushItem(xaAxis);
		
		//yAxis primary
		Axis yAxisPrime = new Axis();
		yAxisPrime.getTitle().setText("Temperature");
		yAxisPrime.getLabels().setFormat("{value}°C");
		options.getYAxis().pushItem(yAxisPrime);
		
		//yAxis secondary
		Axis yAxisSecondary = new Axis();
		yAxisSecondary.getTitle().setText("Rainfall");
		yAxisSecondary.getLabels().setFormat("{value} mm");
		yAxisSecondary.setOpposite(true);
		options.getYAxis().pushItem(yAxisSecondary);
		
		options.getTooltip().setShared(true);
		options.getLegend().setLayout(LegendLayoutType.vertical).setAlign(AlignType.left).setX(120).setY(100).setVerticalAlign(VerticalAlignType.top).setFloating(true);
		
		Tooltip rToolTip = new Tooltip().setValueSuffix(" mm");
		options.getSeries().pushElement(buildSeries("Rainfall", SeriesType.COLUMN, rToolTip, 1, 49.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4));
		
		Tooltip tToolTip = new Tooltip().setValueSuffix("\u00b0C");
		options.getSeries().pushElement(buildSeries("Temperature", SeriesType.SPLINE, tToolTip, null, 7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6));
		
		 String json = options.toJson();

	     Assert.assertEquals( "Expected Column and Spline combination json", columnSplineJson, json );
	}

	private Series buildSeries(String name,SeriesType type,Tooltip tooltip, Integer yAxis, Double ... data) {
		Series series = new Series().setName(name).setType(type).setTooltip(tooltip).setYAxis(yAxis);
		for (Double y : data) {
			series.getData().pushElement(new Point().setY(y));
		}
		return series;
	}
}
