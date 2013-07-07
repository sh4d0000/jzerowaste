package test.groovy;

import java.lang.reflect.Array

import spock.lang.*

import com.google.api.client.json.Json
import com.zerowaste.JZeroWaste
import com.zerowaste.model.User

abstract class ModelManagerSpec extends spock.lang.Specification {
	
	@Shared
	def modelManager
	@Shared
	def model
	@Shared
	def modelCreated
	@Shared
	def modelUpdated
	
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
		def models = modelManager.all
		
		then:
		models.contains(modelCreated) 
	}
	
	def "should not list a model not saved"() {
		given:
		def fakeModel = createFakeModel()
		
		when:
		def models = modelManager.all
		
		then:
		models.contains(fakeModel) == false
	}
	
	def "should update the model"() {
		given:
		updateModel(modelCreated)
		
		when:
		modelUpdated = modelManager.update(modelCreated)
		
		then:
		modelUpdated.equals(modelCreated)
	}
	
	def "should delete the model"() {
		when:
		def modelDeleted = modelManager.delete( modelUpdated )
		
		then:
		modelDeleted.equals(modelUpdated)
		
		def models = modelManager.all
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
	
	abstract protected updateModel(model) 

}

