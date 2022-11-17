/**
 * 
 */
package sk.javacocktails.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Štefan
 *
 * Class represents composite primary key for cross table TCocktailXIngredient
 */

@Embeddable
public class CocktailIngredientId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "cocktail_id")
	private Long cocktailId;
	
	@Column(name = "ingredient_id")
	private Long ingredientId;
	
	public CocktailIngredientId() {}

	public CocktailIngredientId(Long cocktailId, Long ingredientId) {
		this.cocktailId = cocktailId;
		this.ingredientId = ingredientId;
	}
}
