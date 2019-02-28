# Coding-Assigment
Can you implement the sing() method for the bird?

1 .How did you unit test it?
	Implemented unit tests for methods in Bird class.
	Refactored code to return String instead of printing the results in order to test easily.
	
	How did you optimize the code for maintainability?
	changed Animal class to an interface as there are no common methods needs to be abstracted and there is no current requirement to instantiate an object of class Animal.
	
2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you implement them to make their own special sound?

	a. A duck says: “Quack, quack”
	b. A duck can swim
	c. A chicken says: “Cluck, cluck”
	d. A chicken cannot fly (assumption: its wings are clipped but ignore that)
	Added two new classes - Duck and Chicken
    Overrode sing method to make sounds specific to these birds.
	
	create interface called SoundGenreate() with abstracted method soundGenerate this can be usefull for duck ,chicken and rooster classes
	Added swim method to Duck.
	Added fly method to Duck. if we want we use otherwise just ignore
	not added fly method chickek 
	Fly and swim method is only for Duck. since these not common  No need to created into a separate interface.
	Bird will not have Fly and swim method as these are not common for duck and chicken
	Added unit tests for Chicken and Duck.

3. Now how would you model a rooster?

	a. A rooster says: “Cock-a-doodle-doo”
	b. How is the rooster related to the chicken?
	c. Can you think of other ways to model a rooster without using inheritance?
	
	Created a new Rooster class by extending Chicken class.
	Assume that the	Rooster is a specific type of Chicken.
	
	created Rooster_withoutInheritance class with extrac methoed of  all properties generate sound ,walk..etc
	
4. Can you model a parrot? We are specifically interested in three parrots, one that lived in a house with dogs one in a house with cats, the other lived on a farm next to the rooster.

	a.A parrot living with dogs says: “Woof, woof”
	b. A parrot living with cats says: “Meow”
	c. A parrot living near the rooster says: “Cock-a-doodle-doo”
	d. How do you keep the parrot maintainable? What if we need another parrot lives near a Duck? Or near a phone that rings frequently?
	
	Created a Parrot with private constructors and  which accepts any class that implements GenerateSound interface.

5. In addition to the birds, can you model a fish?

	a. Fishes don’t sing
	b. Fishes don’t walk
	c. Fishes can swim
	Created a new interface for SwimmingAnimals. with common method swim()
	create Fish class with swim() no methods for walk and sing.
	Created a Fish class with unit tests.
	
6. Can you specialize the fish as a Shark and as a Clownfish?

	a.Sharks are large and grey
	b. Clownfish are small and colourful (orange)
	c. Clownfish make jokes
	d. Sharks eat other fish
Implemented Shark and Clownfish class as a sub-class of Fish.
Sharks has two properites color and size (large and grey) with getter and setter and method eat , this method is defined clowfish only becoz its specific to shark
clowfish has two properites color and size (small and organg) with getter and setter and method makeJokes , this method is defined clowfish only becoz its specific to clowfish
Implemented unit tests.

8. Dolphins are not exactly fish, yet, they are good swimmers

	a. Can you model a dolphin that swims without inheriting from a fish class?
	b. How do you avoid duplicating code or introducing unneeded overhead
	Implemented Dolphin class by  implementing SwimmingAnimal Interface instead of extending from Fish. and implementing the swim method
	

9. Can you model a butterfly?

	a. A butterfly can fly
	b. A butterfly does not make a sound
Implemented Butterfly class by  implementing FlyingAnimal Interface nd implementing the fly method
with simple unit tests.

10. Can you optimize your model to account for the metamorphosis from caterpillar to butterfly?

	a. A caterpillar cannot fly
	b. A caterpillar can walk (crawl)
	Implemented a Caterpillar Class by implementing Walkinganimal with simple unit tests.
	Implemented metamorphize method which returns a Butterfly. and no method for fly()
	

11. Can you share the code to count:

how many of these animals can fly?
how many of these animals can walk?
how many of these animals can sing?
how many of these animals can swim?
Implemented in Solution class.

refer the CountAnimals class which is implemented  to count fly ,walk,sing,swim animals

12 .Can you add a second language (if you know a language other than English) Use the rooster as a PoC for demonstrating this. For example, this is how the Rooster sounds differently depending on language. Please add the rooster sound in your native tongue.

Implemented a simple SoundTranslator class that can translate a Rooster Sound based on the launguage.


