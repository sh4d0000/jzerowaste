package test.groovy;

import spock.lang.*

import com.zerowaste.JZeroWaste
import com.zerowaste.model.UserHasRole


class UserHasRoleManagerSpec extends OwnedModelManagerSpec {
	
	@Override
	def newModelManager() {
		return new JZeroWaste().getUserHasRoleManager()
	}
	
	@Override
	def createFakeModel() {
		def fakeModel = new UserHasRole(
				userId: 100,
				roleId: 100
			)
	}
	
	@Override
	def createNewModel() {
		return new UserHasRole(
				userId: 1,
				roleId: 1
			)
	}
	
}

