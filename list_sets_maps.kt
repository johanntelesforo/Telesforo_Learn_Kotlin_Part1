// lists 
//immutable
fun main() {
    // Write your code below 🏊‍♀️
    val waterSports = listOf("Wind Surfing","Sailing","Swimming","Jet Skiing","Water Skiing")
    println(waterSports)
}


//accessing the indexes in the list 
fun main() {
    // Write your code below 🏃‍♀️
    var unitedStatesMarathons = listOf("Boston Marathon","Bank of America Chicago Marathon","TCS NYC Marathon","Marine Corps Marathon")
    unitedStatesMarathons[1]
    print(unitedStatesMarathons[1])

}


//mutable list
fun main() {
    // Write your code below 🎭
    var openBroadwayShows = mutableListOf("The Lion King","Chicago","The Cher Show","Les Miserables")
    openBroadwayShows[2] = "Wicked"
    print(openBroadwayShows)
}


//mutable list with size 
fun main() {
    // Write your code below 🍎
  
    var fruitTrees = mutableListOf("Apple", "Plum", "Pear", "Cherry")
  
    println("I am growing ${fruitTrees.size} different types of fruit in my garden.")
}
/*"I am growing ${listName.size} different types of fruit in my garden." */


/*  Mutable and Immutable list functions:
    The contains() function accepts a single value within its parentheses and returns a Boolean true or false depending on whether or not that value exists within a list.
    The random() function also only requires read-only access and returns a random element from the list: 

    for the MUTABLE list only Functions:
    The add() function accepts a single value within its parentheses and appends that value to the end of a list:
    the remove() function, also only used on mutable lists, accepts a single value within its parentheses and removes it from the list:
    */

    fun main() {

        val planets = mutableListOf("Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
      
        // Write your code below 🪐
        planets.remove("Pluto")
        planets.add("Earth")
      
        println(planets.random())
      }


//set
fun main() {
    // Write your code below 💾
    var obsoleteTech = setOf("Rolodex","Phonograph","Videocassette recorder"
  ,"Video projector","Rolodex")
    
    println(obsoleteTech)
  }

/*  Accessing an element in a Set
    The elementAt() function accepts an Integer value and returns the element at that position. This function is useful for collections that do not possess index access.

    listName.elementAt(integer)  */


    fun main() {
        // Write your code below 
        var islandsOfHawaii = setOf("Maui","Lanai","Oahu","Kauai")
      
        println(islandsOfHawaii.elementAt(2))
        println(islandsOfHawaii.elementAtOrNull(6))
      }
 /*the elementAtOrNull() function, a safer variation of elementAt() to return null as opposed to an error when an element does not exist in the set: */   


/*To initialize an empty mutable set, we’d use the following syntax:

    var/val setName = mutableSetOf<Type>() 
    
    for int of number values is ((var/val setName<value Type> = mutableSetOf(value1, value2, value3))*/


    fun main() {
        // Write your code below 👩‍🚀
      
        var apolloLandingSites = mutableSetOf("Mare Tranquillitatis", "Fra Mauro", "Hadley/Apennines", "Descartes", "Taurus-Littrow", "Oceanus Procellarum")
      
        println(apolloLandingSites)
      
      }


/*To add a single element to a set, we’d use the add() function as we did in the lists lesson; however, if we were interested in adding many elements to a set at once, 
the addAll() function would be more appropriate. Note that in contrast to lists, we cannot add an element that already exists in the set. */

fun main() {

    var uniqueParticipants = mutableSetOf<String>() 
    var participants = listOf("elePHPant", "Gopher", "Lenny", "Moby Dock", "Codey", "Gopher")
  
    // Write your code below 🎤
  
    uniqueParticipants.addAll(participants)
    println("The talent show has ${uniqueParticipants.size} unique participants.")
    uniqueParticipants.clear()
    print(uniqueParticipants)
  }
//clear() is to clear the set or the list


/*  To retrieve, the first element of any set, we can use the first() function:
    To retrieve the last element of any set, we can use the last() function: 
    To sum up all of the elements in a set, we can use the sum() function:*/

    fun main() {
        // Write your code below 📝
      
        var testGrades = mutableSetOf(65, 50, 72, 80, 53, 84)
        var sum = testGrades.sum()
        var numStudents = testGrades.size
        var average = sum/numStudents
      
        if (average < 65){
          println("Failed")
        } else {
          print("Passed")
        }
      }


/*A set is an unordered Kotlin collection that stores unique elements.
An immutable set is declared with the setOf keyword and indicates a set whose values cannot change throughout a program.
A mutable set is declared with the mutableSetOf keyword and indicates a set whose values can be altered.
Elements within a set can be accessed using the elementAt() or elementAtOrNull() functions.
The addAll() and add() functions are used to add elements to a collection.
The first() and last() functions return the first and last elements of a collection.
The clear() function removes all elements from a collection. */

//maps 
//val/var mapName = mapOf(key1 to val1, key2 to val2, key3 to val3)

fun main() {
    // Write your code below 🏞
    var codeysMap = mutableMapOf("valley" to "scorpions", "creek" to "snakes", "forest" to "bears")
  
    println(codeysMap)
  }


/*we can gather all keys at once using the keys property:
a set of all map values can be returned using the values property: */

fun main() {
    var uniqueTransport = mapOf("India" to "Tuktuk", "Egypt" to "Felucca", "Peru" to "Totora Boat", "Hong Kong" to "Junk Boat")
  
    // Write your code below 🚜
    println("A unique mode of transportation that exists in Peru is ${uniqueTransport["Peru"]}.")
  
    println(uniqueTransport.keys)
    println(uniqueTransport.values)
  }


/*To declare a mutable map, use the term, mutableMapOf in a map declaration:
var/val mapName = mutableMapOf(key1 to val1, key2 to val2, key3 to val2) */

//mutable map
fun main() {
    // Write your code below 📺
   var tvShows = mutableMapOf("The Big Bang Theory" to 278, "Modern Family" to 250, "Bewitched" to 254, "That '70s Show" to 200)
  
  tvShows["The Big Bang Theory"] = 279
  
  print(tvShows)
  }

/*We can utilize Kotlin’s built-in put() function to add a new entry to the mutable map: */

fun main() {
    // Write your code below 🖼
  
    var momaPaintings = mutableMapOf("Les Demoiselles d'avignon" to "Pablo Picasso", "The Starry Night" to "Vincent Van Gogh", "Mona Lisa" to "Leonardo Da Vinci", "The Persistance of Memory" to "Salvador Dali")
  
    if (!momaPaintings.containsValue("Claude Monet")) {
      // Write your code for Step 1 here 
        momaPaintings.put("Water Lillies", "Claude Monet")
    }
  
      // Write your code for Step 2 here
    
      momaPaintings.remove("Mona Lisa")
      print(momaPaintings)
  }

/*A map is a collection that stores key-value pairs of data.
The keys within a map must be unique, however, the values can duplicate.
An immutable map is declared with the mapOf keyword and indicates a map whose entries cannot change throughout a program.
A mutable map is declared with the mutableMapOf keyword and indicates a Map whose entries can be altered.
Values within a map can be accessed using shorthand [key] syntax.
To return all the values in a map, use the values property. To return all the keys in a map, use the keys property.
The put() function accepts a key and a value to add to a map.
The remove() function accepts a key and removes the entry associated with that key. */