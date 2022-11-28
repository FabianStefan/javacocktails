/**
 * 
 */
package sk.javacocktails.app.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Štefan
 *
 * Class represents composite primary key for cross table TCocktailXIngredient
 */

@Embeddable
public class CocktailIngredientId implements Serializable {

	private static final long serialVersionUID = -4434050613813914569L;

	@Column(name = "cocktail_id")
	private Long cocktailId;
	
	@Column(name = "ingredient_id")
	private Long ingredientId;
	
	public CocktailIngredientId() {}

	public CocktailIngredientId(Long cocktailId, Long ingredientId) {
		this.cocktailId = cocktailId;
		this.ingredientId = ingredientId;
	}

	public Long getCocktailId() {
		return cocktailId;
	}

	public void setCocktailId(Long cocktailId) {
		this.cocktailId = cocktailId;
	}

	public Long getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(Long ingredientId) {
		this.ingredientId = ingredientId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cocktailId, ingredientId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CocktailIngredientId other = (CocktailIngredientId) obj;
		return Objects.equals(cocktailId, other.cocktailId) && Objects.equals(ingredientId, other.ingredientId);
	}

	@Override
	public String toString() {
		return "CocktailIngredientId [cocktailId=" + cocktailId + ", ingredientId=" + ingredientId + "]";
	}
	
}
