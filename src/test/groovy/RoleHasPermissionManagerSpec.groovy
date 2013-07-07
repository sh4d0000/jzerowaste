package test.groovy;

import spock.lang.*

import com.zerowaste.JZeroWaste
import com.zerowaste.model.RoleHasPermission


class RoleHasPermissionManagerSpec extends OwnedModelManagerSpec {
	
	// TODO duplicated keys in rolehaspermission e User
	
	@Override
	def newModelManager() {
		return new JZeroWaste().getRoleHasPermissionManager()
	}
	
	@Override
	def createFakeModel() {
		def fakeModel = new RoleHasPermission(
				permissionId: 100,
				roleId: 100
			)
	}
	
	@Override
	def createNewModel() {
		return new RoleHasPermission(
				permissionId: 1,
				roleId: 1
			)
	}
	
}

