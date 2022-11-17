package sk.javacocktails.app.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "t_cocktails", schema = "co")
public class TCocktail implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cocktail_id", nullable = false)
	@GeneratedValue(generator = "cocktailgen", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "cocktailgen", sequenceName = "co.t_cocktails_cocktail_id_seq", allocationSize = 1, initialValue = 0)
	private Long cocktailId;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "url", nullable = false)
	private String url;

	public TCocktail() {
	}

	public Long getCocktailId() {
		return cocktailId;
	}

	public void setCocktailId(Long cocktailId) {
		this.cocktailId = cocktailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cocktailId, name, url);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TCocktail other = (TCocktail) obj;
		return Objects.equals(cocktailId, other.cocktailId) && Objects.equals(name, other.name)
				&& Objects.equals(url, other.url);
	}
	
	
}
