package test.groovy;

import java.lang.reflect.Array

import spock.lang.*

import com.google.api.client.json.Json
import com.zerowaste.JZeroWaste
import com.zerowaste.model.User

class UserManagerSpec extends ModelManagerSpec {
	
	@Override
	def newModelManager() {
		return new JZeroWaste().getUserManager()
	}
	
	@Override
	def createFakeModel() {
		def fakeModel = new User(
				name:		'fake',
				surname:	'fake',
				email:		'fake@gmail.com',
				nickname:	'fake',
				password:	'provaprova'
			)
	}
	
	@Override
	def createNewModel() {
		return new User(
				name:		'Antonio',
				surname:	'Antonelli',
				email:		'sh4d0000@gmail.com',
				nickname:	'sh4d0000',
				password:	'provaprova'
			)
	}
	
	@Override
	def updateModel(model) {
		model.with {
			name	 = 'Antonio Updated'
			surname  = 'Antonelli Updated'
			email	 = 'sh4d0000updated@gmail.com'
			nickname = 'sh4d0000updated'
			password = 'provaprovaup'
		}
	}
	
	def "should exist or not user with email"(email, result) {
		expect:
		modelManager.existsUserWithEmail(email) == result
		
		where:
		email 				| result
		"exist@gmail.com"	| true 
		"notexist@no.com"	| false
	}

	def "should exist or not user with nickname"(nickname, result) {
		expect:
		modelManager.existsUserWithNickname(nickname) == result
		
		where:
		nickname 	| result
		"b"			| true
		"notb"		| false
	}

}

