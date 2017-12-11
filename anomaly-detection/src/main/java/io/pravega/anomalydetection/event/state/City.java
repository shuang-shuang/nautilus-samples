package io.pravega.anomalydetection.event.state;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class City {
    public final static Map<String, Event.LatLon> CITIES = Collections.unmodifiableMap(new HashMap<String, Event.LatLon>() {
        {
            put("Tokyo", new Event.LatLon(35.68501691, 139.7514074));
            put("Mumbai", new Event.LatLon(19.01699038, 72.8569893));
            put("Mexico City", new Event.LatLon(19.44244244, -99.1309882));
            put("Shanghai", new Event.LatLon(31.21645245, 121.4365047));
            put("Sao Paulo", new Event.LatLon(-23.55867959, -46.62501998));
            put("New York", new Event.LatLon(40.74997906, -73.98001693));
            put("Karachi", new Event.LatLon(24.86999229, 66.99000891));
            put("Buenos Aires", new Event.LatLon(-34.60250161, -58.39753137));
            put("Delhi", new Event.LatLon(28.6699929, 77.23000403));
            put("Moscow", new Event.LatLon(55.75216412, 37.61552283));
            put("Istanbul", new Event.LatLon(41.10499615, 29.01000159));
            put("Dhaka", new Event.LatLon(23.72305971, 90.40857947));
            put("Cairo", new Event.LatLon(30.04996035, 31.24996822));
            put("Seoul", new Event.LatLon(37.5663491, 126.999731));
            put("Kolkata", new Event.LatLon(22.4949693, 88.32467566));
            put("Beijing", new Event.LatLon(39.92889223, 116.3882857));
            put("Jakarta", new Event.LatLon(-6.174417705, 106.8294376));
            put("Los Angeles", new Event.LatLon(33.98997825, -118.1799805));
            put("London", new Event.LatLon(51.49999473, -0.116721844));
            put("Tehran", new Event.LatLon(35.67194277, 51.42434403));
            put("Lima", new Event.LatLon(-12.04801268, -77.05006209));
            put("Manila", new Event.LatLon(14.60415895, 120.9822172));
            put("Bogota", new Event.LatLon(4.596423563, -74.08334396));
            put("Osaka", new Event.LatLon(34.75003522, 135.4601448));
            put("Rio de Janeiro", new Event.LatLon(-22.92502317, -43.22502079));
            put("Kinshasa", new Event.LatLon(-4.329724102, 15.31497188));
            put("Lahore", new Event.LatLon(31.55997154, 74.35002478));
            put("Guangzhou", new Event.LatLon(23.1449813, 113.3250101));
            put("Bangalore", new Event.LatLon(12.96999514, 77.56000972));
            put("Chicago", new Event.LatLon(41.82999066, -87.75005497));
            put("Bangkok", new Event.LatLon(13.74999921, 100.5166447));
            put("Hong Kong", new Event.LatLon(22.3049809, 114.1850093));
            put("Chennai", new Event.LatLon(13.08998781, 80.27999874));
            put("Wuhan", new Event.LatLon(30.58003135, 114.270017));
            put("Tianjin", new Event.LatLon(39.13002626, 117.2000191));
            put("Chongqing", new Event.LatLon(29.56497703, 106.5949816));
            put("Baghdad", new Event.LatLon(33.3386485, 44.39386877));
            put("Hyderabad", new Event.LatLon(17.39998313, 78.47995357));
            put("Paris", new Event.LatLon(48.86669293, 2.333335326));
            put("Taipei", new Event.LatLon(25.03583333, 121.5683333));
            put("Lagos", new Event.LatLon(6.443261653, 3.391531071));
            put("Toronto", new Event.LatLon(43.69997988, -79.42002079));
            put("Ahmedabad", new Event.LatLon(23.03005292, 72.58000362));
            put("Dongguan", new Event.LatLon(23.0488889, 113.7447222));
            put("Ho Chi Minh City", new Event.LatLon(10.78002545, 106.6950272));
            put("Riyadh", new Event.LatLon(24.64083315, 46.77274166));
            put("Shenzhen", new Event.LatLon(22.55237051, 114.1221231));
            put("Singapore", new Event.LatLon(1.293033466, 103.8558207));
            put("Chittagong", new Event.LatLon(22.32999229, 91.79996741));
            put("Shenyeng", new Event.LatLon(41.80497927, 123.4499735));
        }});
}
