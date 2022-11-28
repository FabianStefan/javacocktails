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
@Table(name = "t_ingredients", schema = "co")
public class TIngredient implements Serializable {

	private static final long serialVersionUID = 5948148356783022313L;

	@Id
	@Column(name = "ingredient_id", nullable = false)
	@GeneratedValue(generator = "ingredientGen", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "ingredientGen", sequenceName = "co.t_ingredients_ingredient_id_seq", allocationSize = 1, initialValue = 0)
	private Long ingredientId;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	public TIngredient() {}

	public Long getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(Long ingredientId) {
		this.ingredientId = ingredientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ingredientId, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TIngredient other = (TIngredient) obj;
		return Objects.equals(ingredientId, other.ingredientId) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "TIngredient [ingredientId=" + ingredientId + ", name=" + name + "]";
	}
	
}
