
package test.groovy;

import spock.lang.*

import com.zerowaste.JZeroWaste
import com.zerowaste.model.LocalReview


class LocalReviewManagerSpec extends OwnedModelManagerSpec {

	@Override
	def newModelManager() {
		return new JZeroWaste().getLocalReviewManager()
	}

	@Override
	def createFakeModel() {
		def fakeModel = new LocalReview(
			briefReview: 			'fake brief desc',
			review: 				'fake long desc safafasf',
			localId: 				1,
			userId: 				1,
			overallRating:			24,
			bakingRating:			4,
			beerWineRating:			2,
			bodyCareRating:			9,
			cleaningRating:			2,
			condimentsRating:		56,
			grainsLegumesRating:	12,
			oliveSaladRating:		3,
			pastaRating:			7,
			petRating:				98,
			snacksRating:			52,
			spicesTeasRating:		62,
			reusableContainers:		1
		)
	}

	@Override
	def createNewModel() {
		return new LocalReview(
			briefReview: 			'brief desc',
			review: 				'long desc safafasf',
			localId: 				1,
			userId: 				1,
			overallRating:			5,
			bakingRating:			76,
			beerWineRating:			32,
			bodyCareRating:			1,
			cleaningRating:			23,
			condimentsRating:		78,
			grainsLegumesRating:	58,
			oliveSaladRating:		35,
			pastaRating:			81,
			petRating:				53,
			snacksRating:			2,
			spicesTeasRating:		6,
			reusableContainers:		1
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
			briefReview				=	'brief desc updated'
			review					=	'long desc safafasf updated'
			localId					= 	1
			userId					=	1
			overallRating			=   54
			bakingRating			=	7
			beerWineRating			=	22
			bodyCareRating			=	13
			cleaningRating			=	3
			condimentsRating		=	8
			grainsLegumesRating		=	18
			oliveSaladRating		=	33
			pastaRating				=	8
			petRating				=	3
			snacksRating			=	27
			spicesTeasRating		=	63
			reusableContainers		=	0
		}
	}
}

