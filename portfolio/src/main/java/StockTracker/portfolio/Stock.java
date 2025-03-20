package StockTracker.portfolio;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
class Stock {

  private @Id
  @GeneratedValue Long id;
  private String name;
  private String NASDAQid;
  private String value;

  Stock() {}

  Stock(String name, String NASDAQid, String value) {

    this.name = name;
    this.NASDAQid = NASDAQid;
    this.value = value;
  }

  public Long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getNASDAQid() {
    return this.NASDAQid;
  }

  public String getValue() {
    return this.value;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNASDAQid(String NASDAQid) {
    this.NASDAQid = NASDAQid;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Stock))
      return false;
    Stock stock = (Stock) o;
    return Objects.equals(this.id, stock.id) && Objects.equals(this.name, stock.name)
        && Objects.equals(this.NASDAQid, stock.NASDAQid) && Objects.equals(this.value, stock.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.name, this.NASDAQid, this.value);
  }

  @Override
  public String toString() {
    return "Stock{" + "id=" + this.id + ", name='" + this.name + '\'' + ", NASDAQ='" + this.NASDAQid + '\'' + ", value='" + this.value + '\'' + '}';
  }
}