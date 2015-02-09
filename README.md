# FizzBuzz Kata
## Exercise #1
Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".
## Exercise #2
Many of the above rules are the same. In this case, the number 3 becomes Fizz, 5 becomes Buzz, and 7 becomes Woof. The main rules in this game are that any number that contains the number or is divisible by that number is replaced by an occurrence of the word. If the number has 2 instances of that number (i.e. 33 or 55) and is divisible by that number, then the word is said three times in this example. The additional rule is that the words (if more than one occur) must be said in the order given in the title.
## Exercise #3
Retry the previous exercises in a functional manner, using the following rules:

* Only use `val`and immutable implementations. `var`are prohibited.
* Avoid, as far as possible, imperative statements like `if/else`.
* All your recursive methods must be tail-recursives (i.e. annotated with `@tailrec`) leveraging  the compiler optimisation.