#Model to Model Transformation

This sample model-to-model transformation projects provides you the basic project structure for a mmt project, together with some examples.

##Things you need to take care of

### Models
The two (or more) .ecore models you need for the transformation can be put in the folder ./models, where now the two example models are located. 

### Settings
In the ``.settings`` folder, you need to modify the file ``urimap`` with the sourceURI and targetURI of your models.

### Transformations
In the ``transforms`` folder you will find an example of QVT transformation file, together with a library example, in which an additional map and a query are defined. In both of them, you have to take care to substitute the information concerning the two example models with the ones of your models. 