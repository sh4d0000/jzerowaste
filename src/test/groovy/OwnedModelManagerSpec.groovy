package test.groovy;

import spock.lang.*

import com.google.api.client.json.Json
import com.zerowaste.manager.OwnedModelManager;

abstract class OwnedModelManagerSpec extends spock.lang.Specification {
	
	@Shared
	OwnedModelManager modelManager
	@Shared
	def model
	@Shared
	def modelCreated
	
	def setup() {
		model = createNewModel()
		modelManager = newModelManager()
	}
	
	def "When created should accept JSON content type"() {
		expect: 
		modelManager.restClient.acceptType == Json.MEDIA_TYPE 
	}
	
	def "When created should have JSON content type"() {
		expect:
		modelManager.restClient.contentType == Json.MEDIA_TYPE
	}
	
	def "should save a model"() {
		when:
		modelCreated = modelManager.save(model)
		
		then:
		afterSaveExpectations(model, modelCreated)
	}

	def "should list the model created"() {
		when:
		def models = modelManager.getAll(modelCreated.ownerId)
		
		then:
		models.contains(modelCreated) 
	}
	
	def "should not list a model not saved"() {
		given:
		def fakeModel = createFakeModel()
		
		when:
		def models = modelManager.getAll(modelCreated.ownerId)
		
		then:
		models.contains(fakeModel) == false
	}
	
	def "should delete the model"() {
		when:
		def modelDeleted = modelManager.delete( modelCreated )
		
		then:
		modelDeleted.equals(modelCreated)
		
		def models = modelManager.getAll(modelCreated.ownerId)
		models.contains(modelDeleted) == false
	}
	
	protected afterSaveExpectations(model, modelCreated) {
		modelCreated.id != 0
		model.id = modelCreated.id
		model.equals(modelCreated)
	}
	
	abstract protected newModelManager() 
	
	abstract protected createFakeModel() 
	
	abstract protected createNewModel() 
	
}

