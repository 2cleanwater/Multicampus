package sample9;

public class MyFoodMgr {
	private Food favoriteFood;
	private Food unfavoriteFood;
	public MyFoodMgr() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MyFoodMgr(Food favoriteFood, Food unfavoriteFood) {
		super();
		this.favoriteFood = favoriteFood;
		this.unfavoriteFood = unfavoriteFood;
	}

	public void setFavoriteFood(Food favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	public void setUnfavoriteFood(Food unfavoriteFood) {
		this.unfavoriteFood = unfavoriteFood;
	}
	@Override
	public String toString() {
		return "MyFoodMgr [favoriteFood=" + favoriteFood + ", unfavoriteFood=" + unfavoriteFood + "]";
	}
	
}
