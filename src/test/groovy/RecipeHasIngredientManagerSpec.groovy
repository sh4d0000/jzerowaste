package test.groovy;

import spock.lang.*

import com.zerowaste.JZeroWaste
import com.zerowaste.model.RecipeHasIngredient


class RecipeHasIngredientManagerSpec extends OwnedModelManagerSpec {
	
	@Override
	def newModelManager() {
		return new JZeroWaste().getRecipeHasIngredientManager()
	}
	
	@Override
	def createFakeModel() {
		def fakeModel = new RecipeHasIngredient(
				recipeId: 100,
				ingredientId: 100,
				quota: '23s d'
			)
	}
	
	@Override
	def createNewModel() {
		return new RecipeHasIngredient(
				recipeId: 1,
				ingredientId: 1,
				quota: '6kmsa'
			)
	}
	
	def "should update the model"() {
		given:
		def modelCreated = this.modelManager.save( createNewModel() )
		
		when:
		def modelUpdated = modelManager.update(modelCreated)
		
		then:
		modelUpdated.equals(modelCreated)
		this.modelManager.delete( modelUpdated )
	}
	
	@Override
	def updateModel(model) {
		model.with {
			recipeId = '1'
			ingredientId = '1'
			quota = 'updated'
		}
	}
	
}

