
package com.example.weatherapi.pojo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "time_epoch",
    "time",
    "temp_c",
    "temp_f",
    "is_day",
    "condition",
    "wind_mph",
    "wind_kph",
    "wind_degree",
    "wind_dir",
    "pressure_mb",
    "pressure_in",
    "precip_mm",
    "precip_in",
    "humidity",
    "cloud",
    "feelslike_c",
    "feelslike_f",
    "windchill_c",
    "windchill_f",
    "heatindex_c",
    "heatindex_f",
    "dewpoint_c",
    "dewpoint_f",
    "will_it_rain",
    "chance_of_rain",
    "will_it_snow",
    "chance_of_snow",
    "vis_km",
    "vis_miles",
    "gust_mph",
    "gust_kph",
    "uv"
})
@Generated("jsonschema2pojo")
public class Hour implements Serializable
{

    @JsonProperty("time_epoch")
    private Integer timeEpoch;
    @JsonProperty("time")
    private String time;
    @JsonProperty("temp_c")
    private Double tempC;
    @JsonProperty("temp_f")
    private Double tempF;
    @JsonProperty("is_day")
    private Integer isDay;
    @JsonProperty("condition")
    private Condition__2 condition;
    @JsonProperty("wind_mph")
    private Double windMph;
    @JsonProperty("wind_kph")
    private Double windKph;
    @JsonProperty("wind_degree")
    private Integer windDegree;
    @JsonProperty("wind_dir")
    private String windDir;
    @JsonProperty("pressure_mb")
    private Double pressureMb;
    @JsonProperty("pressure_in")
    private Double pressureIn;
    @JsonProperty("precip_mm")
    private Double precipMm;
    @JsonProperty("precip_in")
    private Double precipIn;
    @JsonProperty("humidity")
    private Integer humidity;
    @JsonProperty("cloud")
    private Integer cloud;
    @JsonProperty("feelslike_c")
    private Double feelslikeC;
    @JsonProperty("feelslike_f")
    private Double feelslikeF;
    @JsonProperty("windchill_c")
    private Double windchillC;
    @JsonProperty("windchill_f")
    private Double windchillF;
    @JsonProperty("heatindex_c")
    private Double heatindexC;
    @JsonProperty("heatindex_f")
    private Double heatindexF;
    @JsonProperty("dewpoint_c")
    private Double dewpointC;
    @JsonProperty("dewpoint_f")
    private Double dewpointF;
    @JsonProperty("will_it_rain")
    private Integer willItRain;
    @JsonProperty("chance_of_rain")
    private Integer chanceOfRain;
    @JsonProperty("will_it_snow")
    private Integer willItSnow;
    @JsonProperty("chance_of_snow")
    private Integer chanceOfSnow;
    @JsonProperty("vis_km")
    private Double visKm;
    @JsonProperty("vis_miles")
    private Double visMiles;
    @JsonProperty("gust_mph")
    private Double gustMph;
    @JsonProperty("gust_kph")
    private Double gustKph;
    @JsonProperty("uv")
    private Double uv;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 6468380651807211964L;

    @JsonProperty("time_epoch")
    public Integer getTimeEpoch() {
        return timeEpoch;
    }

    @JsonProperty("time_epoch")
    public void setTimeEpoch(Integer timeEpoch) {
        this.timeEpoch = timeEpoch;
    }

    public Hour withTimeEpoch(Integer timeEpoch) {
        this.timeEpoch = timeEpoch;
        return this;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    public Hour withTime(String time) {
        this.time = time;
        return this;
    }

    @JsonProperty("temp_c")
    public Double getTempC() {
        return tempC;
    }

    @JsonProperty("temp_c")
    public void setTempC(Double tempC) {
        this.tempC = tempC;
    }

    public Hour withTempC(Double tempC) {
        this.tempC = tempC;
        return this;
    }

    @JsonProperty("temp_f")
    public Double getTempF() {
        return tempF;
    }

    @JsonProperty("temp_f")
    public void setTempF(Double tempF) {
        this.tempF = tempF;
    }

    public Hour withTempF(Double tempF) {
        this.tempF = tempF;
        return this;
    }

    @JsonProperty("is_day")
    public Integer getIsDay() {
        return isDay;
    }

    @JsonProperty("is_day")
    public void setIsDay(Integer isDay) {
        this.isDay = isDay;
    }

    public Hour withIsDay(Integer isDay) {
        this.isDay = isDay;
        return this;
    }

    @JsonProperty("condition")
    public Condition__2 getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(Condition__2 condition) {
        this.condition = condition;
    }

    public Hour withCondition(Condition__2 condition) {
        this.condition = condition;
        return this;
    }

    @JsonProperty("wind_mph")
    public Double getWindMph() {
        return windMph;
    }

    @JsonProperty("wind_mph")
    public void setWindMph(Double windMph) {
        this.windMph = windMph;
    }

    public Hour withWindMph(Double windMph) {
        this.windMph = windMph;
        return this;
    }

    @JsonProperty("wind_kph")
    public Double getWindKph() {
        return windKph;
    }

    @JsonProperty("wind_kph")
    public void setWindKph(Double windKph) {
        this.windKph = windKph;
    }

    public Hour withWindKph(Double windKph) {
        this.windKph = windKph;
        return this;
    }

    @JsonProperty("wind_degree")
    public Integer getWindDegree() {
        return windDegree;
    }

    @JsonProperty("wind_degree")
    public void setWindDegree(Integer windDegree) {
        this.windDegree = windDegree;
    }

    public Hour withWindDegree(Integer windDegree) {
        this.windDegree = windDegree;
        return this;
    }

    @JsonProperty("wind_dir")
    public String getWindDir() {
        return windDir;
    }

    @JsonProperty("wind_dir")
    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Hour withWindDir(String windDir) {
        this.windDir = windDir;
        return this;
    }

    @JsonProperty("pressure_mb")
    public Double getPressureMb() {
        return pressureMb;
    }

    @JsonProperty("pressure_mb")
    public void setPressureMb(Double pressureMb) {
        this.pressureMb = pressureMb;
    }

    public Hour withPressureMb(Double pressureMb) {
        this.pressureMb = pressureMb;
        return this;
    }

    @JsonProperty("pressure_in")
    public Double getPressureIn() {
        return pressureIn;
    }

    @JsonProperty("pressure_in")
    public void setPressureIn(Double pressureIn) {
        this.pressureIn = pressureIn;
    }

    public Hour withPressureIn(Double pressureIn) {
        this.pressureIn = pressureIn;
        return this;
    }

    @JsonProperty("precip_mm")
    public Double getPrecipMm() {
        return precipMm;
    }

    @JsonProperty("precip_mm")
    public void setPrecipMm(Double precipMm) {
        this.precipMm = precipMm;
    }

    public Hour withPrecipMm(Double precipMm) {
        this.precipMm = precipMm;
        return this;
    }

    @JsonProperty("precip_in")
    public Double getPrecipIn() {
        return precipIn;
    }

    @JsonProperty("precip_in")
    public void setPrecipIn(Double precipIn) {
        this.precipIn = precipIn;
    }

    public Hour withPrecipIn(Double precipIn) {
        this.precipIn = precipIn;
        return this;
    }

    @JsonProperty("humidity")
    public Integer getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Hour withHumidity(Integer humidity) {
        this.humidity = humidity;
        return this;
    }

    @JsonProperty("cloud")
    public Integer getCloud() {
        return cloud;
    }

    @JsonProperty("cloud")
    public void setCloud(Integer cloud) {
        this.cloud = cloud;
    }

    public Hour withCloud(Integer cloud) {
        this.cloud = cloud;
        return this;
    }

    @JsonProperty("feelslike_c")
    public Double getFeelslikeC() {
        return feelslikeC;
    }

    @JsonProperty("feelslike_c")
    public void setFeelslikeC(Double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public Hour withFeelslikeC(Double feelslikeC) {
        this.feelslikeC = feelslikeC;
        return this;
    }

    @JsonProperty("feelslike_f")
    public Double getFeelslikeF() {
        return feelslikeF;
    }

    @JsonProperty("feelslike_f")
    public void setFeelslikeF(Double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public Hour withFeelslikeF(Double feelslikeF) {
        this.feelslikeF = feelslikeF;
        return this;
    }

    @JsonProperty("windchill_c")
    public Double getWindchillC() {
        return windchillC;
    }

    @JsonProperty("windchill_c")
    public void setWindchillC(Double windchillC) {
        this.windchillC = windchillC;
    }

    public Hour withWindchillC(Double windchillC) {
        this.windchillC = windchillC;
        return this;
    }

    @JsonProperty("windchill_f")
    public Double getWindchillF() {
        return windchillF;
    }

    @JsonProperty("windchill_f")
    public void setWindchillF(Double windchillF) {
        this.windchillF = windchillF;
    }

    public Hour withWindchillF(Double windchillF) {
        this.windchillF = windchillF;
        return this;
    }

    @JsonProperty("heatindex_c")
    public Double getHeatindexC() {
        return heatindexC;
    }

    @JsonProperty("heatindex_c")
    public void setHeatindexC(Double heatindexC) {
        this.heatindexC = heatindexC;
    }

    public Hour withHeatindexC(Double heatindexC) {
        this.heatindexC = heatindexC;
        return this;
    }

    @JsonProperty("heatindex_f")
    public Double getHeatindexF() {
        return heatindexF;
    }

    @JsonProperty("heatindex_f")
    public void setHeatindexF(Double heatindexF) {
        this.heatindexF = heatindexF;
    }

    public Hour withHeatindexF(Double heatindexF) {
        this.heatindexF = heatindexF;
        return this;
    }

    @JsonProperty("dewpoint_c")
    public Double getDewpointC() {
        return dewpointC;
    }

    @JsonProperty("dewpoint_c")
    public void setDewpointC(Double dewpointC) {
        this.dewpointC = dewpointC;
    }

    public Hour withDewpointC(Double dewpointC) {
        this.dewpointC = dewpointC;
        return this;
    }

    @JsonProperty("dewpoint_f")
    public Double getDewpointF() {
        return dewpointF;
    }

    @JsonProperty("dewpoint_f")
    public void setDewpointF(Double dewpointF) {
        this.dewpointF = dewpointF;
    }

    public Hour withDewpointF(Double dewpointF) {
        this.dewpointF = dewpointF;
        return this;
    }

    @JsonProperty("will_it_rain")
    public Integer getWillItRain() {
        return willItRain;
    }

    @JsonProperty("will_it_rain")
    public void setWillItRain(Integer willItRain) {
        this.willItRain = willItRain;
    }

    public Hour withWillItRain(Integer willItRain) {
        this.willItRain = willItRain;
        return this;
    }

    @JsonProperty("chance_of_rain")
    public Integer getChanceOfRain() {
        return chanceOfRain;
    }

    @JsonProperty("chance_of_rain")
    public void setChanceOfRain(Integer chanceOfRain) {
        this.chanceOfRain = chanceOfRain;
    }

    public Hour withChanceOfRain(Integer chanceOfRain) {
        this.chanceOfRain = chanceOfRain;
        return this;
    }

    @JsonProperty("will_it_snow")
    public Integer getWillItSnow() {
        return willItSnow;
    }

    @JsonProperty("will_it_snow")
    public void setWillItSnow(Integer willItSnow) {
        this.willItSnow = willItSnow;
    }

    public Hour withWillItSnow(Integer willItSnow) {
        this.willItSnow = willItSnow;
        return this;
    }

    @JsonProperty("chance_of_snow")
    public Integer getChanceOfSnow() {
        return chanceOfSnow;
    }

    @JsonProperty("chance_of_snow")
    public void setChanceOfSnow(Integer chanceOfSnow) {
        this.chanceOfSnow = chanceOfSnow;
    }

    public Hour withChanceOfSnow(Integer chanceOfSnow) {
        this.chanceOfSnow = chanceOfSnow;
        return this;
    }

    @JsonProperty("vis_km")
    public Double getVisKm() {
        return visKm;
    }

    @JsonProperty("vis_km")
    public void setVisKm(Double visKm) {
        this.visKm = visKm;
    }

    public Hour withVisKm(Double visKm) {
        this.visKm = visKm;
        return this;
    }

    @JsonProperty("vis_miles")
    public Double getVisMiles() {
        return visMiles;
    }

    @JsonProperty("vis_miles")
    public void setVisMiles(Double visMiles) {
        this.visMiles = visMiles;
    }

    public Hour withVisMiles(Double visMiles) {
        this.visMiles = visMiles;
        return this;
    }

    @JsonProperty("gust_mph")
    public Double getGustMph() {
        return gustMph;
    }

    @JsonProperty("gust_mph")
    public void setGustMph(Double gustMph) {
        this.gustMph = gustMph;
    }

    public Hour withGustMph(Double gustMph) {
        this.gustMph = gustMph;
        return this;
    }

    @JsonProperty("gust_kph")
    public Double getGustKph() {
        return gustKph;
    }

    @JsonProperty("gust_kph")
    public void setGustKph(Double gustKph) {
        this.gustKph = gustKph;
    }

    public Hour withGustKph(Double gustKph) {
        this.gustKph = gustKph;
        return this;
    }

    @JsonProperty("uv")
    public Double getUv() {
        return uv;
    }

    @JsonProperty("uv")
    public void setUv(Double uv) {
        this.uv = uv;
    }

    public Hour withUv(Double uv) {
        this.uv = uv;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Hour withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Hour.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timeEpoch");
        sb.append('=');
        sb.append(((this.timeEpoch == null)?"<null>":this.timeEpoch));
        sb.append(',');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
        sb.append(',');
        sb.append("tempC");
        sb.append('=');
        sb.append(((this.tempC == null)?"<null>":this.tempC));
        sb.append(',');
        sb.append("tempF");
        sb.append('=');
        sb.append(((this.tempF == null)?"<null>":this.tempF));
        sb.append(',');
        sb.append("isDay");
        sb.append('=');
        sb.append(((this.isDay == null)?"<null>":this.isDay));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("windMph");
        sb.append('=');
        sb.append(((this.windMph == null)?"<null>":this.windMph));
        sb.append(',');
        sb.append("windKph");
        sb.append('=');
        sb.append(((this.windKph == null)?"<null>":this.windKph));
        sb.append(',');
        sb.append("windDegree");
        sb.append('=');
        sb.append(((this.windDegree == null)?"<null>":this.windDegree));
        sb.append(',');
        sb.append("windDir");
        sb.append('=');
        sb.append(((this.windDir == null)?"<null>":this.windDir));
        sb.append(',');
        sb.append("pressureMb");
        sb.append('=');
        sb.append(((this.pressureMb == null)?"<null>":this.pressureMb));
        sb.append(',');
        sb.append("pressureIn");
        sb.append('=');
        sb.append(((this.pressureIn == null)?"<null>":this.pressureIn));
        sb.append(',');
        sb.append("precipMm");
        sb.append('=');
        sb.append(((this.precipMm == null)?"<null>":this.precipMm));
        sb.append(',');
        sb.append("precipIn");
        sb.append('=');
        sb.append(((this.precipIn == null)?"<null>":this.precipIn));
        sb.append(',');
        sb.append("humidity");
        sb.append('=');
        sb.append(((this.humidity == null)?"<null>":this.humidity));
        sb.append(',');
        sb.append("cloud");
        sb.append('=');
        sb.append(((this.cloud == null)?"<null>":this.cloud));
        sb.append(',');
        sb.append("feelslikeC");
        sb.append('=');
        sb.append(((this.feelslikeC == null)?"<null>":this.feelslikeC));
        sb.append(',');
        sb.append("feelslikeF");
        sb.append('=');
        sb.append(((this.feelslikeF == null)?"<null>":this.feelslikeF));
        sb.append(',');
        sb.append("windchillC");
        sb.append('=');
        sb.append(((this.windchillC == null)?"<null>":this.windchillC));
        sb.append(',');
        sb.append("windchillF");
        sb.append('=');
        sb.append(((this.windchillF == null)?"<null>":this.windchillF));
        sb.append(',');
        sb.append("heatindexC");
        sb.append('=');
        sb.append(((this.heatindexC == null)?"<null>":this.heatindexC));
        sb.append(',');
        sb.append("heatindexF");
        sb.append('=');
        sb.append(((this.heatindexF == null)?"<null>":this.heatindexF));
        sb.append(',');
        sb.append("dewpointC");
        sb.append('=');
        sb.append(((this.dewpointC == null)?"<null>":this.dewpointC));
        sb.append(',');
        sb.append("dewpointF");
        sb.append('=');
        sb.append(((this.dewpointF == null)?"<null>":this.dewpointF));
        sb.append(',');
        sb.append("willItRain");
        sb.append('=');
        sb.append(((this.willItRain == null)?"<null>":this.willItRain));
        sb.append(',');
        sb.append("chanceOfRain");
        sb.append('=');
        sb.append(((this.chanceOfRain == null)?"<null>":this.chanceOfRain));
        sb.append(',');
        sb.append("willItSnow");
        sb.append('=');
        sb.append(((this.willItSnow == null)?"<null>":this.willItSnow));
        sb.append(',');
        sb.append("chanceOfSnow");
        sb.append('=');
        sb.append(((this.chanceOfSnow == null)?"<null>":this.chanceOfSnow));
        sb.append(',');
        sb.append("visKm");
        sb.append('=');
        sb.append(((this.visKm == null)?"<null>":this.visKm));
        sb.append(',');
        sb.append("visMiles");
        sb.append('=');
        sb.append(((this.visMiles == null)?"<null>":this.visMiles));
        sb.append(',');
        sb.append("gustMph");
        sb.append('=');
        sb.append(((this.gustMph == null)?"<null>":this.gustMph));
        sb.append(',');
        sb.append("gustKph");
        sb.append('=');
        sb.append(((this.gustKph == null)?"<null>":this.gustKph));
        sb.append(',');
        sb.append("uv");
        sb.append('=');
        sb.append(((this.uv == null)?"<null>":this.uv));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
