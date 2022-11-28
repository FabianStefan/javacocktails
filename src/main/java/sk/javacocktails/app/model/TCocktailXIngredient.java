package sk.javacocktails.app.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "t_cocktails_x_ingredients", schema = "co")
public class TCocktailXIngredient implements Serializable {

	private static final long serialVersionUID = 7073190694787824711L;

	@EmbeddedId
	private CocktailIngredientId id;
	
	@ManyToOne
	@MapsId("cocktailId")
	@JoinColumn(name = "cocktail_id", nullable = false)
	private TCocktail cocktail;
	
	@ManyToOne
	@MapsId("ingredientId")
	@JoinColumn(name = "ingredient_id", nullable = false)
	private TIngredient ingredient;
	
	public TCocktailXIngredient() {}

	
	
	public CocktailIngredientId getId() {
		return id;
	}



	public void setId(CocktailIngredientId id) {
		this.id = id;
	}



	public TCocktail getCocktail() {
		return cocktail;
	}



	public void setCocktail(TCocktail cocktail) {
		this.cocktail = cocktail;
	}



	public TIngredient getIngredient() {
		return ingredient;
	}



	public void setIngredient(TIngredient ingredient) {
		this.ingredient = ingredient;
	}



	@Override
	public int hashCode() {
		return Objects.hash(cocktail, id, ingredient);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TCocktailXIngredient other = (TCocktailXIngredient) obj;
		return Objects.equals(cocktail, other.cocktail) && Objects.equals(id, other.id)
				&& Objects.equals(ingredient, other.ingredient);
	}

	@Override
	public String toString() {
		return "TCocktailXIngredient [id=" + id + ", cocktail=" + cocktail + ", ingredient=" + ingredient + "]";
	}
	
	
}
