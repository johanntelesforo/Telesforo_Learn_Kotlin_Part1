//Data types and Variables 

fun main() {
    // Write your code below ☀️
    var todaysDate : String = "08/26/2022"
    println(todaysDate)
  
    var currentWeather : String
    currentWeather = "Sunny"
    println(currentWeather)
}

fun main() {
    // Write your code below
    val pi: Double = 3.14
    pi = 5.5
}


fun main() {
    var typeTest = "6"
    // Declare your variable above ⬆️
    print("${typeTest::class.simpleName}")    
}

// var if for string val if contains number


fun main() {
    val dog = "Toto"
    val state = "Kansas"
    val movie = "The Wizard of Oz"
    // Write your code below 🧙
    println(dog + ", I've a feeling we're not in " + state + " anymore. - " + movie + ", 1939")
}

/*val userGreeting = firstName + " " + lastName + ", how are you doing today?" 
 
println(userGreeting) = String concatenation */
//$variablename

fun main() {
    val plant = "orchid"
    val potSize = 6 // in inches 
    val dayNum = 7 
  
    // Write your code below 🌱
  
    println("An $plant in a $potSize inch pot must be watered every $dayNum days.")
}


fun main() {
    println("Please type your name and hit Enter.")
    // Write your code below
    
    val myName = readLine()
    println("Your name is $myName!")
}
/*kotlinc myCode.kt -include-runtime -d myCode.jar
java -jar myCode.jar */

//built in functions like .capitalize() .length
fun main() {
    var word = "supercalifragilisticexpialidocious"
    
    // Write your code below ☂️
    word = word.capitalize()
    val wordSize = word.length
    println("$word has $wordSize letters")
}


/*\n Inserts a new line
\t Inserts a tab
\r Inserts a carriage return
\' Inserts a single quote
\" Inserts a double quote
\\ Inserts a backslash
\$ Inserts the dollar symbol */

fun main() {

    // Add the correct escape sequences to the text below to achieve the output shown in the instructions 
  
    print("Dear Learner 👋, \nI hope you're enjoying the Learn Kotlin course. You've made tremendous progress. Keep going! And remember, \"Knowledge is power.\" (Frances Beacon). \nWith love, \nCodey")
}


/*+ addition
- subtraction
* multiplication
/ division
% modulus (divides and gives the remainder) */

fun main() {

    // Appetizer 
    val caesarSalad = 8.50
  
    //  Entree 
    val beefStroganoff = 18
  
    // Dessert 
    val cheesecake = 6
  
    // Add your code below ⬇️
    val total = caesarSalad + beefStroganoff + cheesecake
    val tip = 0.15  
    val finalAmount = total * tip + total
  
    println(finalAmount)
  }
  

/*order of operations = pemdas
Parentheses
Multiplication
Division
Modulus
Addition
Subtraction */

fun main() {
    var answer1 = 7 - 5 + 4 * 3 
    var answer2 = (9 - 3) / 2 
    var answer3 = (6 + 8) + (4 - 7) 
  
    println(answer1)
    println(answer2)
    println(answer3)
}

/*
Operation	Long Syntax	Short Syntax
Add	        a = a + b	a += b
Subtract	a = a - b	a -= b
Multiply	a = a * b	a *= b
Divide	    a = a / b	a /= b
Mod	        a = a % b	a %= b */


fun main() {
    var speedOfLight = 186_000
    // Write your code here 
    speedOfLight += 282
    var perfectSquare = 32
    // Write your code here 
    perfectSquare *= 2
    var sheldonsFavoriteNum = 219
    // Write your code here 
    sheldonsFavoriteNum /= 3
    var emergency = 920 
    // Write your code here 
    emergency -= 9
    var firstCountingNum = 10 
    // Write your code here 
    firstCountingNum %= 5
  
    println("The speed of light is ${speedOfLight}.")
    println("A perfect square is ${perfectSquare}.")
    println("Sheldon's favorite number is ${sheldonsFavoriteNum}.")
    println("The emergency number in the United States is ${emergency}.")
    println("The first counting number in programming is ${firstCountingNum}.")
  
}

fun main() {

    var a = 5 
    a += 6 // a: 11
  
    var b = a * 9 
    var c = b / 3 
    c++ // c: 34
    
    var d = c + 8 
    d %= 4 
    d-- // d: 1
  
}


/*math library
math.pow() =  returns the first value raised to the power of the second value. It accepts and returns Double values.
math.min() =  returns the minimum value from two given numbers. 
Math.max() determines the maximum value.
Math.random() returns a randomly generated number between 0 and 1.
Math.round() accepts a single Double value and returns the result of rounding that value to the nearest Integer.*/


fun main() {

    var ceil = Math.ceil(3.5)
    println(ceil)
    // Add your notes below
    // return highest value
    var sqrt = Math.sqrt(25.0) 
    println(sqrt)
    // Add your notes below
    // returns the square root of the number
    var abs = Math.abs(-20) 
    println(abs)
    // Add your notes below 
    // returns the absolute value 
    var floor = Math.floor(6.9)
    println(floor)
    // Add your notes below 
    // returns the lowest value of the number 
}