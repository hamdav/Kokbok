public class Recipe{
    public String title;
    public List<Ingredient> ingredients;
    public String description;
    public double timeToCook;
    public int portions; 

    public Recipe () {}

    public void AddIngredient (Ingredient ingredient) {
        ingredients.add(ingredient)
    }
}


