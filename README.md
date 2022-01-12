# HAut - K!ode-a-thon - Sigmoids
A skin disease classification Android App integrated with TensorFlow Lite CNN model. <br>
- YT Video Link - https://youtu.be/AywpniHHkow 
- PPT Link - https://docs.google.com/presentation/d/1f2KsHHPzNQ4EWbhxK4AXtEhiBynJodBSxrFBUnSnml8/edit?usp=sharing
- UI/UX Link - https://www.figma.com/file/DEGMQdK2Zh2Hi8CKgXYcV7/Sigmoids?node-id=0%3A1

## Problem Statement and Solution
As we all know that the world is permanently moving in online mode by all possible ways and after the end of this pandemic people will prefer 'Go online' in every walk of life but this new era comes with many problems which need to be solved. 

In the upcoming scenario of 'sustainable new normal', everything is about to get digitalized. We would like you to propose a solution to the medical industry for promoting touchless diagnosis.

For this, we planned to build an Android Application with an integrated Deep Learning Convolutional Neural Network trained on an image dataset of Skin Cancer images.

Any user having a doubt of any skin related issue do not have to directly go to Doctor in this pandemic period, instead he/she can get an idea of what the issue may be.

## Novelty
In the current era, we do have apps like Practo which recommend you doctors on the basis of symptoms you tell the app by clicking options.

But the new thing in this app is it works on the image of the skin rather than the experience by the user as the experience may be different in perspective of different beings. 

So, this project uses a diversity of images, around 10000+ images to predict the disease with a good accuracy on real-world data.

## ML Model + App

### Tech Stack 
- Python
- Tensorflow
- Numpy
- Pandas
- Matplotlib
- Seaborn
- Sklearn
- Keras
- Tensorflow Lite
- Java
- XML
- Figma

### ML Model
We chose a dataset with the following skin disease labels -

- Melanocytic nevi
- Melanoma
- Benign keratosis-like lesions
- Basal cell carcinoma
- Actinic keratoses and intraepithelial carcinoma / Bowen's disease
- Vascular lesions
- Dermatofibroma

We then trained the dataset with image pixels as the input features and disease labels as output over 10000+ images.

The model we are using is Convolutional Neural Network with 
- Input shape 28 x 28 x 3
- Conv 2D layer 32, filter size 3 x 3, ReLu, padding same, followed by MaxPool layer
- Conv 2D layer 64, filter size 3 x 3, ReLu, padding same, followed by MaxPool layer
- Conv 2D layer 128, filter size 3 x 3, ReLu, padding same, followed by MaxPool layer
- Conv 2D layer 256, filter size 3 x 3, ReLu, padding same
- Flatten layer 
- Dense layer 128
- Dense layer 64
- Dense layer 32
- Softmax prediction layer with 7 output nodes

### App
We made an Android App using Android Studio (JAVA and XML).

- A user friendly app which takes an image as an input and tells the user what kind of skin disease they are suffering from
- App will also suggest some good doctors who can treat that specific disease.
- App will use a tflite model (Tensorflow Lite model) developed by us. An image provided by the user will be analysed by tflite model to make predictions, and those predictions will be produced by tflite model in a form of float array.
- This float array will be used to by the app to find the disease the user is suffering from and will suggest good doctors to the user using this data.

### Our process
1. Click or Upload Image
2. Predict disease using tflite model
3. Display probability of skin disease
4. Recommend Skin Specialists

## UI/UX Mockup
- Link https://www.figma.com/file/DEGMQdK2Zh2Hi8CKgXYcV7/Sigmoids?node-id=0%3A1
<img src="https://user-images.githubusercontent.com/72293452/148665429-300a03b2-3ac8-4b06-97bf-714b53bc81d5.png" width="600">
<div>
<img src="https://user-images.githubusercontent.com/72293452/148665431-b7e92476-ca98-4db3-bd98-0bd87365c3a2.jpeg" width="200">
<img src="https://user-images.githubusercontent.com/72293452/148665386-9a205400-f022-4cdc-9a25-46344e5e829b.png" width="200">
<img src="https://user-images.githubusercontent.com/72293452/148665389-b7841957-c153-464b-828f-9d0d5866abb0.png" width="200">
</div>
<div>
<img src="https://user-images.githubusercontent.com/72293452/148665392-b6ec6fef-be35-4dc4-9fae-d7d7c86d9a51.png" width="200">
<img src="https://user-images.githubusercontent.com/72293452/148665398-d4398dcd-adfd-425f-936d-e643a9c45189.png" width="200">
<img src="https://user-images.githubusercontent.com/72293452/148665401-3c6190ff-bea4-4c66-9286-a40c149ab3b6.png" width="200">
</div>
<img src="https://user-images.githubusercontent.com/72293452/148665403-d10ef9af-c53c-488c-a137-9a5fc8e516fb.png" width="200">



## Demo

- YT Video Link - https://youtu.be/AywpniHHkow 
- PPT Link - https://docs.google.com/presentation/d/1f2KsHHPzNQ4EWbhxK4AXtEhiBynJodBSxrFBUnSnml8/edit?usp=sharing

## Developers

- Hrithik Purwar - https://github.com/hrithikpurwar/
- Raehat Singh Nanda - https://github.com/raehat/




