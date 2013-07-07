package test.groovy;

import spock.lang.*

import com.zerowaste.JZeroWaste
import com.zerowaste.model.Local
import com.zerowaste.model.Role

class LocalManagerSpec extends ModelManagerSpec {
	
	@Override
	def newModelManager() {
		new JZeroWaste().getLocalManager()
	}
	
	@Override
	def createFakeModel() {
		new Local(
				name:		'fake',
				address:	'fake adress',
				phone:		'01099918',
				website:	'fake www.test.it',
				latitude:	'20',	
				longitude:	'83',
				userId: 	1
			)
	}
	
	@Override
	def createNewModel() {
		new Local(
				name:		'local1',
				address:	'adress',
				phone:		'01099918',
				website:	'www.test.it',
				latitude:	'20',	
				longitude:	'83',
				userId: 	1
			)
	}
	
	@Override
	def updateModel(model) {
		model.with {
			name		= 'local1 updated'
			address 	= 'adress updated'
			phone		= '01099918000'
			website 	= 'www.testupdated.it'
			latitude	= '22'
			longitude	= '85'
			userId		= 1
		}
	}

}

