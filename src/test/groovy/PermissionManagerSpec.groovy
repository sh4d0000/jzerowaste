package test.groovy;

import spock.lang.*

import com.zerowaste.JZeroWaste
import com.zerowaste.model.Permission
import com.zerowaste.model.User

class PermissionManagerSpec extends ModelManagerSpec {
	
	@Override
	def newModelManager() {
		return new JZeroWaste().getPermissionManager()
	}
	
	@Override
	def createFakeModel() {
		def fakeModel = new Permission(
				name: 'fake'
			)
	}
	
	@Override
	def createNewModel() {
		return new Permission(
				name: 'test Permission',
			)
	}
	
	@Override
	def updateModel(model) {
		model.with {
			name = 'test Updated'
		}
	}

}

