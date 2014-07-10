package nl.pvanassen.highchart;

import java.util.Calendar;
import java.util.TimeZone;

import nl.pvanassen.highchart.api.ChartOptions;
import nl.pvanassen.highchart.api.Point;
import nl.pvanassen.highchart.api.Series;
import nl.pvanassen.highchart.api.format.DateTimeLabelFormats.TimeUnit;
import nl.pvanassen.highchart.api.shared.SeriesType;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Ignore;

public class TestSplineIrregularTime {
    private static final String splineJson = "{\"chart\":{\"width\":800,\"height\":600,\"defaultSeriesType\":\"spline\",\"marginLeft\":70,\"marginTop\":80},\"plotOptions\":{\"pie\":{\"dataLabels\":{\"color\":\"#000000\",\"enabled\":true,\"formatter\":\"function() {return \\u0027\\u003cb\\u003e\\u0027+ this.point.name +\\u0027\\u003c/b\\u003e: \\u0027+ this.y +\\u0027 %\\u0027;}\",\"align\":\"center\",\"rotation\":\"0.0\"},\"allowPointSelect\":true}},\"series\":[{\"data\":[{\"x\":\"25873200000\",\"y\":\"0.0\"},{\"x\":\"27082800000\",\"y\":\"0.6\"},{\"x\":\"27774000000\",\"y\":\"0.7\"},{\"x\":\"28983600000\",\"y\":\"0.8\"},{\"x\":\"29588400000\",\"y\":\"0.6\"},{\"x\":\"30193200000\",\"y\":\"0.6\"},{\"x\":\"31230000000\",\"y\":\"0.67\"},{\"x\":\"31575600000\",\"y\":\"0.81\"},{\"x\":\"32180400000\",\"y\":\"0.78\"},{\"x\":\"32526000000\",\"y\":\"0.98\"},{\"x\":\"33822000000\",\"y\":\"1.84\"},{\"x\":\"35031600000\",\"y\":\"1.8\"},{\"x\":\"35722800000\",\"y\":\"1.8\"},{\"x\":\"36241200000\",\"y\":\"1.92\"},{\"x\":\"36932400000\",\"y\":\"2.49\"},{\"x\":\"37537200000\",\"y\":\"2.79\"},{\"x\":\"37882800000\",\"y\":\"2.73\"},{\"x\":\"38746800000\",\"y\":\"2.61\"},{\"x\":\"39438000000\",\"y\":\"2.76\"},{\"x\":\"39783600000\",\"y\":\"2.82\"},{\"x\":\"40388400000\",\"y\":\"2.8\"},{\"x\":\"42116400000\",\"y\":\"2.1\"},{\"x\":\"44103600000\",\"y\":\"1.1\"},{\"x\":\"45313200000\",\"y\":\"0.25\"},{\"x\":\"45572400000\",\"y\":\"0.0\"}],\"name\":\"Winter 2007-2008\"},{\"data\":[{\"x\":\"25095600000\",\"y\":\"0.0\"},{\"x\":\"25786800000\",\"y\":\"0.2\"},{\"x\":\"28897200000\",\"y\":\"0.47\"},{\"x\":\"29761200000\",\"y\":\"0.55\"},{\"x\":\"30970800000\",\"y\":\"1.38\"},{\"x\":\"32180400000\",\"y\":\"1.38\"},{\"x\":\"32785200000\",\"y\":\"1.38\"},{\"x\":\"34254000000\",\"y\":\"1.38\"},{\"x\":\"34858800000\",\"y\":\"1.48\"},{\"x\":\"35982000000\",\"y\":\"1.5\"},{\"x\":\"37623600000\",\"y\":\"1.89\"},{\"x\":\"38746800000\",\"y\":\"2.0\"},{\"x\":\"39610800000\",\"y\":\"1.94\"},{\"x\":\"40042800000\",\"y\":\"1.91\"},{\"x\":\"40388400000\",\"y\":\"1.75\"},{\"x\":\"40906800000\",\"y\":\"1.6\"},{\"x\":\"44017200000\",\"y\":\"0.6\"},{\"x\":\"44535600000\",\"y\":\"0.35\"},{\"x\":\"45140400000\",\"y\":\"0.0\"}],\"name\":\"Winter 2008-2009\"},{\"data\":[{\"x\":\"24318000000\",\"y\":\"0.0\"},{\"x\":\"24750000000\",\"y\":\"0.15\"},{\"x\":\"28638000000\",\"y\":\"0.35\"},{\"x\":\"29847600000\",\"y\":\"0.46\"},{\"x\":\"31575600000\",\"y\":\"0.59\"},{\"x\":\"33562800000\",\"y\":\"0.58\"},{\"x\":\"34254000000\",\"y\":\"0.62\"},{\"x\":\"34772400000\",\"y\":\"0.65\"},{\"x\":\"36154800000\",\"y\":\"0.77\"},{\"x\":\"37278000000\",\"y\":\"0.77\"},{\"x\":\"37796400000\",\"y\":\"0.79\"},{\"x\":\"38660400000\",\"y\":\"0.86\"},{\"x\":\"39610800000\",\"y\":\"0.8\"},{\"x\":\"40820400000\",\"y\":\"0.94\"},{\"x\":\"41338800000\",\"y\":\"0.9\"},{\"x\":\"43239600000\",\"y\":\"0.39\"},{\"x\":\"43671600000\",\"y\":\"0.0\"}],\"name\":\"Winter 2009-2010\"}],\"title\":{\"text\":\"Snow depth in the Vikjafjellet mountain, Norway\"},\"subtitle\":{\"text\":\"An example of irregular time data in Highcharts JS\"},\"xAxis\":{\"type\":\"datetime\",\"dateTimeLabelFormats\":{\"month\":\"%e. %b\",\"year\":\"%b\"}},\"yAxis\":{\"min\":\"0.0\",\"title\":{\"text\":\"Snow depth (m)\"}}}";

    @Test
    public void testSplineIrregularTime() {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+1"));
        // http://highcharts.com/demo/spline-irregular-time
        ChartOptions chartOptions = new ChartOptions();
        chartOptions.getChart().setWidth( 800 ).setHeight( 600 ).setDefaultSeriesType( SeriesType.SPLINE ).setMarginLeft( 70 ).setMarginTop( 80 );

        // titles
        chartOptions.getTitle().setText( "Snow depth in the Vikjafjellet mountain, Norway" );
        chartOptions.getSubtitle().setText( "An example of irregular time data in Highcharts JS" );

        // axis
        chartOptions.getXAxis().setType( "datetime" ).getDateTimeLabelFormats().set( TimeUnit.MONTH, "%e. %b" ).set( TimeUnit.YEAR, "%b" );
        chartOptions.getYAxis().setMin( 0 ).getTitle().setText( "Snow depth (m)" );

        // plotOptions
        chartOptions.getPlotOptions().getPie().setAllowPointSelect( true ).getDataLabels().setEnabled( true ).setColor( "#000000" ).setFormatter( "function() {return '<b>'+ this.point.name +'</b>: '+ this.y +' %';}" );

        Series newSeries = new Series().setName( "Winter 2007-2008" );
        chartOptions.getSeries().pushElement( newSeries );
        newSeries.getData().pushElement( new Point().setX( getDateUTC( 1970, 9, 27 ) ).setY( 0 ) ).pushElement( new Point().setX( getDateUTC( 1970, 10, 10 ) ).setY( 0.6 ) ).pushElement( new Point().setX( getDateUTC( 1970, 10, 18 ) ).setY( 0.7 ) ).pushElement( new Point().setX( getDateUTC( 1970, 11, 2 ) ).setY( 0.8 ) ).pushElement( new Point().setX( getDateUTC( 1970, 11, 9 ) ).setY( 0.6 ) ).pushElement( new Point().setX( getDateUTC( 1970, 11, 16 ) ).setY( 0.6 ) ).pushElement( new Point().setX( getDateUTC( 1970, 11, 28 ) ).setY( 0.67 ) ).pushElement( new Point().setX( getDateUTC( 1971, 0, 1 ) ).setY( 0.81 ) ).pushElement( new Point().setX( getDateUTC( 1971, 0, 8 ) ).setY( 0.78 ) ).pushElement( new Point().setX( getDateUTC( 1971, 0, 12 ) ).setY( 0.98 ) ).pushElement( new Point().setX( getDateUTC( 1971, 0, 27 ) ).setY( 1.84 ) ).pushElement( new Point().setX( getDateUTC( 1971, 1, 10 ) ).setY( 1.8 ) ).pushElement( new Point().setX( getDateUTC( 1971, 1, 18 ) ).setY( 1.8 ) ).pushElement( new Point().setX( getDateUTC( 1971, 1, 24 ) ).setY( 1.92 ) ).pushElement( new Point().setX( getDateUTC( 1971, 2, 4 ) ).setY( 2.49 ) ).pushElement( new Point().setX( getDateUTC( 1971, 2, 11 ) ).setY( 2.79 ) ).pushElement( new Point().setX( getDateUTC( 1971, 2, 15 ) ).setY( 2.73 ) ).pushElement( new Point().setX( getDateUTC( 1971, 2, 25 ) ).setY( 2.61 ) ).pushElement( new Point().setX( getDateUTC( 1971, 3, 2 ) ).setY( 2.76 ) ).pushElement( new Point().setX( getDateUTC( 1971, 3, 6 ) ).setY( 2.82 ) ).pushElement( new Point().setX( getDateUTC( 1971, 3, 13 ) ).setY( 2.8 ) ).pushElement( new Point().setX( getDateUTC( 1971, 4, 3 ) ).setY( 2.1 ) ).pushElement( new Point().setX( getDateUTC( 1971, 4, 26 ) ).setY( 1.1 ) ).pushElement( new Point().setX( getDateUTC( 1971, 5, 9 ) ).setY( 0.25 ) ).pushElement( new Point().setX( getDateUTC( 1971, 5, 12 ) ).setY( 0 ) );

        newSeries = new Series().setName( "Winter 2008-2009" );
        chartOptions.getSeries().pushElement( newSeries );
        newSeries.getData().pushElement( new Point().setX( getDateUTC( 1970, 9, 18 ) ).setY( 0 ) ).pushElement( new Point().setX( getDateUTC( 1970, 9, 26 ) ).setY( 0.2 ) ).pushElement( new Point().setX( getDateUTC( 1970, 11, 1 ) ).setY( 0.47 ) ).pushElement( new Point().setX( getDateUTC( 1970, 11, 11 ) ).setY( 0.55 ) ).pushElement( new Point().setX( getDateUTC( 1970, 11, 25 ) ).setY( 1.38 ) ).pushElement( new Point().setX( getDateUTC( 1971, 0, 8 ) ).setY( 1.38 ) ).pushElement( new Point().setX( getDateUTC( 1971, 0, 15 ) ).setY( 1.38 ) ).pushElement( new Point().setX( getDateUTC( 1971, 1, 1 ) ).setY( 1.38 ) ).pushElement( new Point().setX( getDateUTC( 1971, 1, 8 ) ).setY( 1.48 ) ).pushElement( new Point().setX( getDateUTC( 1971, 1, 21 ) ).setY( 1.5 ) ).pushElement( new Point().setX( getDateUTC( 1971, 2, 12 ) ).setY( 1.89 ) ).pushElement( new Point().setX( getDateUTC( 1971, 2, 25 ) ).setY( 2.0 ) ).pushElement( new Point().setX( getDateUTC( 1971, 3, 4 ) ).setY( 1.94 ) ).pushElement( new Point().setX( getDateUTC( 1971, 3, 9 ) ).setY( 1.91 ) ).pushElement( new Point().setX( getDateUTC( 1971, 3, 13 ) ).setY( 1.75 ) ).pushElement( new Point().setX( getDateUTC( 1971, 3, 19 ) ).setY( 1.6 ) ).pushElement( new Point().setX( getDateUTC( 1971, 4, 25 ) ).setY( 0.6 ) ).pushElement( new Point().setX( getDateUTC( 1971, 4, 31 ) ).setY( 0.35 ) ).pushElement( new Point().setX( getDateUTC( 1971, 5, 7 ) ).setY( 0 ) );

        newSeries = new Series().setName( "Winter 2009-2010" );
        chartOptions.getSeries().pushElement( newSeries );
        newSeries.getData().pushElement( new Point().setX( getDateUTC( 1970, 9, 9 ) ).setY( 0 ) ).pushElement( new Point().setX( getDateUTC( 1970, 9, 14 ) ).setY( 0.15 ) ).pushElement( new Point().setX( getDateUTC( 1970, 10, 28 ) ).setY( 0.35 ) ).pushElement( new Point().setX( getDateUTC( 1970, 11, 12 ) ).setY( 0.46 ) ).pushElement( new Point().setX( getDateUTC( 1971, 0, 1 ) ).setY( 0.59 ) ).pushElement( new Point().setX( getDateUTC( 1971, 0, 24 ) ).setY( 0.58 ) ).pushElement( new Point().setX( getDateUTC( 1971, 1, 1 ) ).setY( 0.62 ) ).pushElement( new Point().setX( getDateUTC( 1971, 1, 7 ) ).setY( 0.65 ) ).pushElement( new Point().setX( getDateUTC( 1971, 1, 23 ) ).setY( 0.77 ) ).pushElement( new Point().setX( getDateUTC( 1971, 2, 8 ) ).setY( 0.77 ) ).pushElement( new Point().setX( getDateUTC( 1971, 2, 14 ) ).setY( 0.79 ) ).pushElement( new Point().setX( getDateUTC( 1971, 2, 24 ) ).setY( 0.86 ) ).pushElement( new Point().setX( getDateUTC( 1971, 3, 4 ) ).setY( 0.8 ) ).pushElement( new Point().setX( getDateUTC( 1971, 3, 18 ) ).setY( 0.94 ) ).pushElement( new Point().setX( getDateUTC( 1971, 3, 24 ) ).setY( 0.9 ) ).pushElement( new Point().setX( getDateUTC( 1971, 4, 16 ) ).setY( 0.39 ) ).pushElement( new Point().setX( getDateUTC( 1971, 4, 21 ) ).setY( 0 ) );

        String json = chartOptions.toJson();

        Assert.assertEquals( "Expected spline json", splineJson, json );
    }

    private static long getDateUTC( int year, int month, int day ) {
        Calendar cal = Calendar.getInstance();
        cal.set( Calendar.YEAR, year );
        cal.set( Calendar.MONTH, month );
        cal.set( Calendar.DAY_OF_MONTH, day );
        cal.set( Calendar.HOUR, 0 );
        cal.set( Calendar.MINUTE, 0 );
        cal.set( Calendar.SECOND, 0 );
        cal.set( Calendar.MILLISECOND, 0 );
        return cal.getTimeInMillis();
    }
}
