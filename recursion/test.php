<?php
// Run code with PHP
// php -S localhost:8080 -t ../recursion
// or 
// online-ide (https://www.online-ide.com/T2J4WoXmDc)

function tri_recursion($k) {
    if($k > 0) {
      $result = $k + tri_recursion($k - 1);
      echo $k." : ".$result."<br/>";
    } else {
      $result = 0;
    }
    return $result;  
}
  
function printFun(int $test) {
    if($test < 1) {
        return;
    }
    echo $test." ";
    printFun($test - 1);
    echo $test." ";

    return;
}
  
$test = 5;
echo "tri_recursion<br/>";
tri_recursion($test);
echo "<br/>printFun<br/>";
printFun($test);

?>