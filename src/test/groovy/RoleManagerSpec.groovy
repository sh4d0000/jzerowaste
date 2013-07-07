package test.groovy;

import spock.lang.*

import com.zerowaste.JZeroWaste
import com.zerowaste.model.Role
import com.zerowaste.model.User

class RoleManagerSpec extends ModelManagerSpec {
	
	@Override
	def newModelManager() {
		return new JZeroWaste().getRoleManager()
	}
	
	@Override
	def createFakeModel() {
		def fakeModel = new Role(
				name: 'fake'
			)
	}
	
	@Override
	def createNewModel() {
		return new Role(
				name: 'test role',
			)
	}
	
	@Override
	def updateModel(model) {
		model.with {
			name = 'test Updated'
		}
	}

}

