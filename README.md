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
	Created a new interface for Swimming Animals. with common method swim()
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