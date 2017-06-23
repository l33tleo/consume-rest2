package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
 
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Coins {
 
       public String id;
       public String name;
       public String symbol;
       public String rank;
       public String price_usd;
       public String price_btc;
       public String market_cap_usd;
       public String available_supply;
       public String total_supply;
       public String percent_change_1h;
       public String percent_change_24h;
       public String last_updated;
 
    public Coins(
       @JsonProperty("id") final String id,
             @JsonProperty("name") final String name,
             @JsonProperty("symbol") final String symbol,
             @JsonProperty("rank") final String rank,
             @JsonProperty("price_usd") final String price_usd,
             @JsonProperty("price_btc") final String price_btc,
             @JsonProperty("market_cap_usd") final String market_cap_usd,
             @JsonProperty("available_supply") final String available_supply,
             @JsonProperty("total_supply") final String total_supply,
             @JsonProperty("percent_change_1h") final String percent_change_1h,
             @JsonProperty("percent_change_24h") final String percent_change_24h,
             @JsonProperty("last_updated") final String last_updated) 
    
    {
      
             this.id = id;
             this.name =name;
             this.symbol = symbol;
             this.rank = rank;
             this.price_usd =price_usd;
             this.price_btc = price_btc;
             this.market_cap_usd = market_cap_usd;
             this.available_supply = available_supply ;
             this.total_supply = total_supply;
             this.percent_change_1h = percent_change_1h;
             this.percent_change_24h = percent_change_24h;
             this.last_updated = last_updated;
    }
 
   
    public String getId() {
             return id;
       }
 
       public void setId(String id) {
             this.id = id;
       }
 
 
       public String getName() {
             return name;
       }
 
 
 
       public void setName(String name) {
             this.name = name;
       }
 
 
 
       public String getSymbol() {
             return symbol;
       }
 
 
 
       public void setSymbol(String symbol) {
             this.symbol = symbol;
       }
 
 
 
       public String getRank() {
             return rank;
       }
 
 
 
       public void setRank(String rank) {
             this.rank = rank;
       }
 
 
 
       public String getPrice_usd() {
             return price_usd;
       }
 
 
 
       public void setPrice_usd(String price_usd) {
             this.price_usd = price_usd;
       }
 
 
 
       public String getPrice_btc() {
             return price_btc;
       }
 
 
 
       public void setPrice_btc(String price_btc) {
             this.price_btc = price_btc;
       }
 
 
 
       public String getMarket_cap_usd() {
             return market_cap_usd;
       }
 
 
 
       public void setMarket_cap_usd(String market_cap_usd) {
             this.market_cap_usd = market_cap_usd;
       }
 
 
 
       public String getAvailable_supply() {
             return available_supply;
       }
 
 
 
       public void setAvailable_supply(String available_supply) {
             this.available_supply = available_supply;
       }
 
 
 
       public String getTotal_supply() {
             return total_supply;
       }
 
 
 
       public void setTotal_supply(String total_supply) {
             this.total_supply = total_supply;
       }
 
 
 
       public String getPercent_change_1h() {
             return percent_change_1h;
       }
 
 
 
       public void setPercent_change_1h(String percent_change_1h) {
             this.percent_change_1h = percent_change_1h;
       }
 
 
 
       public String getPercent_change_24h() {
             return percent_change_24h;
       }
 
 
 
       public void setPercent_change_24h(String percent_change_24h) {
             this.percent_change_24h = percent_change_24h;
       }
 
 
 
       public String getLast_updated() {
             return last_updated;
       }
 
 
 
       public void setLast_updated(String last_updated) {
             this.last_updated = last_updated;
       }
 
 
 
       @Override
    public String toString() {
        return "Coins{" +
                "id='" + id + '\'' +
                ", name=" + name +
                ", symbol=" + symbol +
                ", rank=" + rank +
                ", price_usd=" + price_usd +
                ", price_btc=" + price_btc +
                ", market_cap_usd=" + market_cap_usd +
                ", available_supply=" + available_supply +
                ", total_supply=" + total_supply +
                ", percent_change_1h=" + percent_change_1h +
                ", percent_change_24h=" + percent_change_24h +
                ", last_updated=" + last_updated +
                '}';
    }
}
 
