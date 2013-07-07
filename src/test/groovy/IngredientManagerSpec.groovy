package test.groovy;

import spock.lang.*

import com.zerowaste.JZeroWaste
import com.zerowaste.model.Ingredient
import com.zerowaste.model.User

class IngredientManagerSpec extends ModelManagerSpec {
	
	@Override
	def newModelManager() {
		return new JZeroWaste().getIngredientManager()
	}
	
	@Override
	def createFakeModel() {
		def fakeModel = new Ingredient(
				name: 'fake'
			)
	}
	
	@Override
	def createNewModel() {
		return new Ingredient(
				name: 'test Ingredient',
			)
	}
	
	@Override
	def updateModel(model) {
		model.with {
			name = 'test Updated'
		}
	}

}

