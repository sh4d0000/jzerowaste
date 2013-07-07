package test.groovy;

import spock.lang.*

import com.google.api.client.util.Key;
import com.zerowaste.JZeroWaste
import com.zerowaste.model.Recipe
import com.zerowaste.model.Role

class RecipeManagerSpec extends ModelManagerSpec {
	
	@Override
	def newModelManager() {
		new JZeroWaste().getRecipeManager()
	}
	
	@Override
	def createFakeModel() {
		new Recipe(
				name:			'fake',
				preparation:	'fake prep',
				notes:			'fake notes',
				difficulty:		6,
				cookingTime:	10,	
				preparationTime:15,
				localId: 		1,
				dosageFor: 		2
			)
	}
	
	@Override
	def createNewModel() {
		new Recipe(
				name:			'recipe',
				preparation:	'preparation',
				notes:			'notes',
				difficulty:		5,
				cookingTime:	60,	
				preparationTime:18,
				localId: 		1,
				dosageFor: 		4
			)
	}
	
	@Override
	def updateModel(model) {
		model.with {
			name 			=	'recipe up'
			preparation		= 	'preparation up'
			notes			= 	'notes up'
			difficulty		=	2
			cookingTime		=	23	
			preparationTime	=	7
			localId 		= 	1
			dosageFor 		= 	6
		}
	}

}

