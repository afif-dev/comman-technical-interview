<?php
// Run code with PHP
// php -S localhost:8080 -t ../fizzbuzz
// or 
// online-ide (https://www.online-ide.com/1vlgjX4Kno)

for ($i=1; $i <= 100; $i++) { 
    if($i % 15 == 0) {
        echo "FizzBuzz ";
    } else if ($i % 3 == 0) {
        echo "Fizz ";  
    } else if ($i % 5 == 0) {
        echo "Buzz ";  
    } else {
        echo $i ." ";
    }
}

?>