## Explianation

There so many design pattern to be applied to create media player. I choose each design pattern from creational pattern, structural pattern and behavior pattern.
So, I create 3 solutions for this question.

### Adaptor Pattern
There are several kinds of media to be played with the player. Each of them may not be handled in the same way but they have commmon actions "Play", "Forward" and "Rewind". The player uses the adapter AdapterPlayer passing it the desired audio type without knowing the actual class which can play the desired format. Main, thedemo class will use AudioPlayer class to play various formats.

### Factory Pattern
It uses the almost same idea with Adaptor pattern but the Adaptor pattern, we use adpater player to play any kind of media while Factory uses to return instance of specific player instead.

### State Pattern
In case we already have VideoContext that can handle any kind of media file except "Play", "Forward" and "Rewind" functionalities. We can choose state pattern to handles it by create classes to handle these functionalities one by one. The benefits of this pattern are it not limit us the add more state into the player and it allows us to change behavior of any state at runtime but both of them I think it not necessary for media player. 
