package com.sist.recipe;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.vo.FavoriteVO;
import com.sist.vo.IngrRecipeVO;
import com.sist.vo.IngredientVO;
import com.sist.vo.RecipeVO;
import com.sist.vo.RecipeContentVO;
import com.sist.vo.RecipeTagVO;

@Repository
public class RecipeDAO {

	@Autowired
	private RecipeMapper recipeMapper;

	public int recipeTotal() {
		return recipeMapper.recipeTotal();
	}
	
	public List<RecipeVO> recipeList(Map map) {
		return recipeMapper.recipeList(map);
	}
	
	public int recipeSubCatTotal(int cat_sub_id) {
		return recipeMapper.recipeCatSubTotal(cat_sub_id);
	}
	
	public List<RecipeVO> catSubRecipeListData(Map map) {
		return recipeMapper.catSubRecipeListData(map);
	};

	public int catSubRecipeListTotalPage(int cat_sub_id) {
		return recipeMapper.catSubRecipeListTotalPage(cat_sub_id);
	};

	public RecipeVO recipeDetail(int id) {
		return recipeMapper.recipeDetail(id);
	};

	public List<RecipeContentVO> recipeDetailContent(int recipe_id) {
		return recipeMapper.recipeDetailContent(recipe_id);
	};

	public List<IngredientVO> IngrRecipeJoin(int recipe_id) {
		return recipeMapper.IngrRecipeJoin(recipe_id);
	};

	public List<RecipeTagVO> recipeTagSelectListByRecipeId(int recipe_id) {
		return recipeMapper.recipeTagSelectListByRecipeId(recipe_id);
	};

	public List<RecipeTagVO> recipeTagSelectList3ByName(String name) {
		return recipeMapper.recipeTagSelectList3ByName(name);
	};
	/*///////////////////////////////////////////////////////////////////////////////////////////////////*/
	public int getuserId(int user_id){
		return recipeMapper.getuserId(user_id);
	}
	public void favoriteInsert(FavoriteVO vo){;
	
	recipeMapper.favoriteInsert(vo);
	}
	//스크랩 유무여부
	public int countFavorite(Map map){

		return recipeMapper.countFavorite(map);
	}
	//스크랩 리스트 뿌리기
	public List<RecipeVO> favoriteList(Map map){
		
		return recipeMapper.favoriteList(map);
	}
	//스크랩 총페이지 구하기
	public int totalFavoritepage(int user_id){
		
		return recipeMapper.totalFavoritepage(user_id);
	}
	//스크랩 삭제
	public int favoriteDelete(int id){
		
		return recipeMapper.favoriteDelete(id);
	}
	
}
